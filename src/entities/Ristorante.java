package entities;

import enumerations.TypeEnum;

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

    //private Integer numeroDiPosti;

    /**
     * The constructor method for the restaurant object
     * @param restaurantName the name of the restaurant
     * @param address the address of the restaurant
     * @param menuType the avaible menus of the restaurant
     * @param numeroTavoliMax the max number of tables of the restaurant
     * @param numeroDiPosti the max number of seats of the restaurant
     */
    public Ristorante(String restaurantName, String address, TypeEnum menuType, Integer numeroTavoliMax, Integer numeroDiPosti) {
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

    public Map<Integer, Tavolo> getTavoloClientMap() {
        return tavoloClientMap;
    }

    public void setTavoloClientMap(Map<Integer, Tavolo> tavoloClientMap) {
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
                        "Costo del menù: %.2f€%n" +
                        "Numero di posti a sedere disponibili: %d%n"
                , restaurantName
                , address
                , menuType
                , getNumeroTotaleTavoli()
                , calculatePrezzoMenu());
    }

    /**
     * Adds Portata object to the list portataList
     * @param portata an object of type Portata
     */
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    /**
     * This method add tavolo objects to the tavoloMap
     * @param tavolo the table
     * @throws Exception if the map size reaches the max number of tables
     */
    public void putTavoli(Client cliente,Tavolo tavolo) throws Exception {
        if (tavoloClientMap.size() < capienzaTavoliMassima) {
            tavoloClientMap.putIfAbsent(cliente, tavolo);
        }
    }


    /**
     * This method returns the size of the tavoloMap
     * @return tavoloMap size
     */
    public Integer getNumeroTotaleTavoli() {
        return tavoloClientMap.size();
    }

    /**
     * This method prints the details of all tavolo objects in tavoloMap
     */
    public void printDettagliTavoli() {
        tavoloClientMap.forEach((integer, tavolo) -> {
            tavolo.printTavoloDetails();
        });
    }

    /**
     * Method that calculates menu price
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
     * This method makes a booking taking in input a booking object and an integer number of people
     * @param prenotazione the booking from the client
     * @param numeroPersone the number of people that the clients books for
     * @throws Exception if the variable numeroDiPosti of the restaurant is less than the numeroPersone
     */
    public void prenotaPosti(Client client, Tavolo tavolo) throws Exception{
        //controllo overbook
        if(tavoloClientMap.size() < capienzaTavoliMassima) {
            putTavoli(client,tavolo);
            Prenotazione prenotazione = new Prenotazione(client.getName(),client.getEmail(),client.getPhoneNumber());
            prenotazioneList.add(prenotazione);
            System.out.printf("Prenotazione a nome di %s per %d persone%n");
            client.printClientDetails();
        } else {
            System.out.printf("Ristorante pieno riprovare tra un po di tempo");
        }
    }


    //TODO  dobbiamo fare un metodo che si chiama pagaConto che ogni volta che
    // si paga ci rimuove l'elemento dalla mappa
}
