package entities;

import enumerations.TypeEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gruppo 2
 */
public class Ristorante {

    private String restaurantName;
    private String address;
    private TypeEnum menuType;
    private List<Portata> portataList = new ArrayList<>();

    private List<Prenotazione> prenotazioneList = new ArrayList<>();

    private Map<Client, Tavolo> tavoloClientMap = new HashMap<>();

    private Integer capienzaTavoliMassima;

    /**
     * The constructor method for the restaurant object
     *
     * @param restaurantName  the name of the restaurant
     * @param address         the address of the restaurant
     * @param menuType        the avaible menus of the restaurant
     * @param numeroTavoliMax the max number of tables of the restaurant
     */
    public Ristorante(String restaurantName, String address, TypeEnum menuType, Integer numeroTavoliMax) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menuType = menuType;
        this.capienzaTavoliMassima = numeroTavoliMax;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public TypeEnum getMenuType() {
        return menuType;
    }

    public void setMenuType(TypeEnum menuType) {
        this.menuType = menuType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCapienzaTavoliMassima() {
        return capienzaTavoliMassima;
    }

    public void setCapienzaTavoliMassima(Integer capienzaTavoliMassima) {
        this.capienzaTavoliMassima = capienzaTavoliMassima;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }

    public void setPrenotazioneList(List<Prenotazione> prenotazioneList) {
        this.prenotazioneList = prenotazioneList;
    }

    public Map<Client, Tavolo> getTavoloClientMap() {
        return tavoloClientMap;
    }

    public void setTavoloClientMap(Map<Client, Tavolo> tavoloClientMap) {
        this.tavoloClientMap = tavoloClientMap;
    }

    public List<Prenotazione> getPrenotazioneList() {
        return prenotazioneList;
    }


    /**
     * Prints the whole menu of the restaurant
     */
    public void printMenuRistorante() {
        for (Portata portata : portataList) {
            portata.printPortataDetails();
        }
    }

    /**
     * Prints the details of the restaurant
     */
    public void printRestaurantsDetails() {
        System.out.printf("Nome del ristorante: %s%n" +
                        "Indirizzo: %s%n" +
                        "Menù disponibili: %s%n" +
                        "Numero di tavoli: %d%n" +
                        "Costo del menù: %.2f€%n"
                , restaurantName
                , address
                , menuType
                , getNumeroTotaleTavoli()
                , calculatePrezzoMenu());
    }

    /**
     * Adds Portata object to the list portataList
     *
     * @param portata an object of type Portata
     */
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    /**
     * This method add the couple client-tavolo to the map tavoloClientMap
     *
     * @param cliente a client object
     * @param tavolo  a table object
     */
    public void putTavoli(Client cliente, Tavolo tavolo) {
        if (tavoloClientMap.size() < capienzaTavoliMassima) {
            tavoloClientMap.putIfAbsent(cliente, tavolo);
        } else {
            System.out.println("Capienza massima dei tavoli raggiunta");
        }
    }


    /**
     * This method returns the size of the tavoloMap
     *
     * @return tavoloMap size
     */
    public Integer getNumeroTotaleTavoli() {
        return tavoloClientMap.size();
    }

    /**
     * Method that calculates menu price
     *
     * @return menu price of type Double
     */
    public Double calculatePrezzoMenu() {
        double somma = 0;
        for (Portata portata : portataList) {
            somma += portata.getPriceEuros();
        }
        return somma;
    }

    /**
     * This method adds a couple client-tavolo till the capienzaTavoliMassima is more than
     * tavoloClientMap size and creates a new Prenotazione object and adds it to the prenotazioneList
     * and prints an informative message that inform the user that a Prenotazione object is created,
     * else prints an informative message that alerts the user that the Ristorante object is full.
     *
     * @param client a client object
     * @param tavolo a tavolo object
     */
    public void prenotaPosti(Client client, Tavolo tavolo) {
        if (tavoloClientMap.size() < capienzaTavoliMassima) {
            putTavoli(client, tavolo);
            Prenotazione prenotazione = new Prenotazione(client.getName(), client.getEmail());
            prenotazioneList.add(prenotazione);
            client.printClientDetails();
            tavolo.printTavoloDetails();
            prenotazione.printPrenotazioneDetails();
        } else {
            System.out.println("Ristorante pieno,riprovare tra un pò di tempo");
        }
    }

    /**
     * This method completes a checkout operation given a client object
     * @param client the client that completed his booking
     */
    public void checkout(Client client) {
        tavoloClientMap.remove(client);
        System.out.printf("Cliente %s lascia il ristorante%n", client.getName());
    }


    /**
     * This method creates a schema to the server if not exists
     */
    public void createSchema(){
        String url = "";
        String user = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE SCHEMA IF NOT EXISTS `ristorante_progetto` DEFAULT CHARACTER SET utf8 ;";
            statement.executeUpdate(varname1);
            System.out.println("Schema creato correttamente");
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableRistorante() {
        String url = "";
        String user = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`ristorante` ( "
                    + "  `id_ristorante` INT NOT NULL, "
                    + "  `nome_ristorante` VARCHAR(64) NOT NULL, "
                    + "  `indirizzo` VARCHAR(64) NOT NULL, "
                    + "  `tipi_di_menu` ENUM('carne', 'pesce', 'vegano', 'misto') NOT NULL, "
                    + "  PRIMARY KEY (`id_ristorante`))";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesRistorante(){
        String url = "";
        String user = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.ristorante "
                    + "(id_ristorante, nome_ristorante, indirizzo, tipi_di_menu) "
                    + "VALUES(1, 'Palla 8', 'Via Roma 1', 'carne');";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * This method drops the table
     */
    public void deleteTableRistorante() {
        String url = "";
        String user = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`ristorante`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableRistorante(){
        String url = "";
        String user = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.ristorante;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()){
                System.out.println(resultSet.getString("nome_ristorante"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
