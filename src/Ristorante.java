import java.util.ArrayList;
import java.util.List;

public class Ristorante {

    private String restaurantName;

    private String address;
    private TypeEnum menuType;

    private List<Portata> portataList = new ArrayList<>();

    public Ristorante(String restaurantName, String address, TypeEnum menuType) {
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

    public void printMenuRistorante() {
        for (Portata portata : portataList) {
            portata.printPortataDetails();
        }
    }

    public void printRestaurantsDetails() {
        System.out.printf("Nome: %s%nIndirizzo: %s%nMenù disponibili: %s%n", getRestaurantName(), getAddress(), getMenuType());
    }

    private List<Portata> getPortataList() {
        return portataList;
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

}
