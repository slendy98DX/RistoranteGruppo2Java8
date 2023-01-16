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

    private Map<Integer, Tavolo> tavoloMap = new HashMap<>();

    private Integer numeroTavoliMax;

    private Integer numeroDiPosti;

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
        this.numeroTavoliMax = numeroTavoliMax;
        this.numeroDiPosti = numeroDiPosti;
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

    public Integer getNumeroTavoliMax() {
        return numeroTavoliMax;
    }

    public void setNumeroTavoliMax(Integer numeroTavoliMax) {
        this.numeroTavoliMax = numeroTavoliMax;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }

    public Map<Integer, Tavolo> getTavoloMap() {
        return tavoloMap;
    }

    public void setTavoloMap(Map<Integer, Tavolo> tavoloMap) {
        this.tavoloMap = tavoloMap;
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
                , calculatePrezzoMenu()
                , this.numeroDiPosti);
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
    public void putTavoli(Tavolo tavolo) throws Exception {
        if (tavoloMap.size() < numeroTavoliMax) {
            tavoloMap.putIfAbsent(tavolo.getNumeroDelTavolo(), tavolo);
        } else {
            throw new Exception("Numero di tavoli max raggiunto");
        }
    }


    /**
     * This method returns the size of the tavoloMap
     * @return tavoloMap size
     */
    public Integer getNumeroTotaleTavoli() {
        return tavoloMap.size();
    }

    /**
     * This method prints the details of all tavolo objects in tavoloMap
     */
    public void printDettagliTavoli() {
        tavoloMap.forEach((integer, tavolo) -> {
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
    public void prenotaPosti(Prenotazione prenotazione,Integer numeroPersone) throws Exception{
        if(numeroPersone <= this.numeroDiPosti) {
            this.numeroDiPosti -= numeroPersone;
            System.out.printf("Prenotazione a nome di %s per %d persone%n", prenotazione.getNominativo(), numeroPersone);
        } else {
            throw new Exception("Posti a sedere esauriti");
        }
    }
}
