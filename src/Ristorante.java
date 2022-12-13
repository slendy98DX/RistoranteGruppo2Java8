import java.util.ArrayList;
import java.util.List;

public class Ristorante {

    private String restaurantName;

    private String address;
    private TypeEnum menuType;

    private List<Portata> portataList = new ArrayList<>();

    //TODO fare un unica lista
    private List<Tavolo> tavoliDisponibili = new ArrayList<>();
    private List<Tavolo>  tavoliPrenotati = new ArrayList<>();

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

    public void printMenuRistorante() {
        for (Portata portata : portataList) {
            portata.printPortataDetails();
        }
    }

    public void printRestaurantsDetails() {
        System.out.printf("Nome del ristorante: %s%nIndirizzo: %s%nMenù disponibili: %s%nTavoli disponibili: %d%nTavoli prenotati: %d%n", getRestaurantName(), getAddress(), getMenuType(), getNumeroTavoliDisponibili(), getNumeroTavoliPrenotati());
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    public void addTavoli(Tavolo tavolo){
        if(tavolo.getStatoDellaPrenotazione() == TavoloTypeEnum.PRENOTATO){
            tavoliPrenotati.add(tavolo);
        } else {
            tavoliDisponibili.add(tavolo);
        }
    }

    public int getNumeroTavoliDisponibili(){
        return tavoliDisponibili.size();
    }

    public int getNumeroTavoliPrenotati(){
        return tavoliPrenotati.size();
    }

    public void printDettagliTavoliDisponibili() {
        for (Tavolo tavolo : tavoliDisponibili) {
            tavolo.printTavoloDetails();
        }
    }

    public void printDettagliTavoliPrenotati() {
        for (Tavolo tavolo : tavoliPrenotati) {
            tavolo.printTavoloDetails();
        }
    }
}
