package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gruppo 2
 */
public class Ristorante {

    private String restaurantName;

    private String address;
    private TypeEnum menuType;
    private List<Portata> portataList = new ArrayList<>();
    private List<Tavolo> tavoliList = new ArrayList<>();

    /**
     * The constructor method of the Restaurant
     * @param restaurantName the name of the restaurant
     * @param address the address of the restaurant
     * @param menuType the avaiable menù of the restaurant
     */
    public Ristorante(String restaurantName, String address, TypeEnum menuType){
        this.restaurantName = restaurantName;
        this.address = address;
        this.menuType = menuType;
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
        System.out.printf("Nome del ristorante: %s%nIndirizzo: %s%nMenù disponibili: %s%nNumero di tavoli: %d%n", getRestaurantName(), getAddress(), getMenuType(), getNumeroTavoli());
    }

    /**
     * Adds entities.Portata object to the list portataList
     * @param portata an object of type entities.Portata
     */
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    /**
     * Adds entities.Tavolo objects to the list of tavoliList
     * @param tavolo an object of type entities.Tavolo
     */
    public void addTavoli(Tavolo tavolo){
        tavoliList.add(tavolo);
    }

    /**
     * Gets the size of the list tavoliList
     * @return the number of tables in tavoliList
     */
    public Integer getNumeroTavoli(){
        return tavoliList.size();
    }

    /**
     * Prints the details of each entities.Tavolo object
     */
    public void printDettagliTavoli() {
        for (Tavolo tavolo : tavoliList) {
            tavolo.printTavoloDetails();
        }
    }
}
