import java.util.ArrayList;
import java.util.List;

public class Ristorante {

    private String restaurantName;

    private String address;
    private MenuTypeEnum menuType;

    private List<Portata> portataList = new ArrayList<>();

    public Ristorante(String restaurantName, String address, MenuTypeEnum menuType){
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

    public MenuTypeEnum getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuTypeEnum menuType) {
        this.menuType = menuType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printMenuRistorante() {
        for (Portata portata : portataList) {
            portata.printPortataDetails();
        }
    }

    public void printRestaurantsDetails() {
        System.out.printf("Nome del ristorante: %s%nIndirizzo: %s%nMenù disponibili: %s%n", getRestaurantName(), getAddress(), getMenuType());
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }
}
