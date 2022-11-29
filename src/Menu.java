import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String restaurantName;

    private String menuType;

    public Menu(String restaurantName, String menuType){
        this.restaurantName = restaurantName;
        this.menuType = menuType;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    private List<Portata> listaPortate = new ArrayList<>();

    public void printMenu(){
        listaPortate.add(new Bevanda("Acqua",2.5,""));
        listaPortate.add(new Bevanda("Tavernello",5.6,""));
        listaPortate.add(new Bevanda("Coca-cola",3.5,""));
        listaPortate.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
        listaPortate.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
        listaPortate.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
        listaPortate.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
        listaPortate.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
        listaPortate.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
        listaPortate.forEach(portata -> {
            System.out.println(portata.printPortataDetails());
        });
    }

    public void printRestaurantsDetails(){
        System.out.printf("Nome ristorante: %s%nTipo di menù: %s%n",getRestaurantName(),getMenuType());
    }
}