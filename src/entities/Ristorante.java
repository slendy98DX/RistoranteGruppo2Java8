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

    private Map<Integer,Tavolo> tavoloMap = new HashMap<>();

    private Integer numeroTavoliMax;

    /**
     * The constructor method of the Restaurant
     * @param restaurantName the name of the restaurant
     * @param address the address of the restaurant
     * @param menuType the avaiable menù of the restaurant
     */
    public Ristorante(String restaurantName, String address, TypeEnum menuType, Integer numeroTavoliMax){
        this.restaurantName = restaurantName;
        this.address = address;
        this.menuType = menuType;
        this.numeroTavoliMax = numeroTavoliMax;
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
                , getNumeroTavoli()
                , getPrezzoMenu());
    }

    /**
     * Adds entities.Portata object to the list portataList
     * @param portata an object of type entities.Portata
     */
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    /**
     * This method add couple numeroDelTavolo,tavolo objects to the tavoloMap
     * @param numeroDelTavolo the identifier of the tables
     * @param tavolo the table
     * @throws Exception if the map size reaches the max number of tables
     */
    public void putTavoli(Integer numeroDelTavolo,Tavolo tavolo) throws Exception{
        if(tavoloMap.size() < numeroTavoliMax){
            tavoloMap.putIfAbsent(numeroDelTavolo,tavolo);
        } else {
            throw new Exception("Numero di tavoli max raggiunto");
        }
    }

    /**
     * This method returns the size of the tavoloMap
     * @return tavoloMap size
     */
    public Integer getNumeroTavoli(){
        return tavoloMap.size();
    }

    /**
     * This method prints the details of all tavolo objects in tavoloMap
     */
    public void printDettagliTavoli(){
        tavoloMap.forEach((integer, tavolo) -> {
            tavolo.printTavoloDetails();
        });
    }

    /**
     * Method that calculates menu price
     * @return menu price of type Double
     */
    public Double getPrezzoMenu(){
        double somma = 0;
        for (int i = 0; i <portataList.size() ; i++) {
            somma += portataList.get(i).getPriceEuros();
        }
        return somma;
    }
}
