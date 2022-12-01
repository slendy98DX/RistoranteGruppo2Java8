import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    private String restaurantName;

    public enum MenuType{
        CARNE,
        PESCE,
        VEGANO,
        CARNE_PESCE,
        CARNE_VEGANO,
        PESCE_VEGANO,
        CARNE_PESCE_VEGANO,
    }

    public MenuType menuType;

    List<Portata> listaCarne = new ArrayList<>();
    List<Portata> listaVegano = new ArrayList<>();
    List<Portata> listaPesce = new ArrayList<>();

    public Ristorante(String restaurantName, MenuType menuType){
        this.restaurantName = restaurantName;
        this.menuType = menuType;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public void printMenuRistorante(){
        switch(menuType){

            case CARNE:
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,"&"));
                listaCarne.add(new Bevanda("Tavernello",5.6,""));
                listaCarne.add(new Bevanda("Coca-cola",3.5,""));
                listaCarne.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaCarne.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaCarne.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaCarne.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaCarne.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaCarne.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaCarne.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case VEGANO:
                System.out.println("MENU' VEGANO");
                listaVegano.add(new Bevanda("Acqua",2.5,"$"));
                listaVegano.add(new Bevanda("Tavernello",5.6,""));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaVegano.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaVegano.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaVegano.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaVegano.add(new Dolci("Torta vegana al cioccolato e nocciole ", "Torta", 5.50, "Biscotti vegani,Panna vegetale,Nocciolata vegana,Caffè,Latte di soia"));
                listaVegano.add(new Dolci("Torta fredda al limone", "Torta gelato", 5.5, "Yogurt di soia al limone,Zucchero,Panna vegana ,Biscotti vegani,Succo di Limone"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case PESCE:
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,"%"));
                listaPesce.add(new Bevanda("Tavernello",5.6,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaPesce.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaPesce.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaPesce.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaPesce.add(new Dolci("Coppa al mascarpone", "Dessert", 8.50, "Uova,Mascarpone,Zucchero,Caffè,Marsala,Cioccolato fondente ,Meringhe"));
                listaPesce.add(new Dolci("Torta di mele e mascarpone", "Torta", 6.50, "Mele Golden,Mascarpone,Zucchero,Farina,Uova,Baccelo di vaniglia,lievito "));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case CARNE_PESCE:
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,"%"));
                listaPesce.add(new Bevanda("Tavernello",5.6,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaPesce.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaPesce.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaPesce.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,"&"));
                listaCarne.add(new Bevanda("Tavernello",5.6,""));
                listaCarne.add(new Bevanda("Coca-cola",3.5,""));
                listaCarne.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaCarne.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaCarne.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaCarne.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaCarne.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaCarne.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaCarne.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case CARNE_VEGANO:
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,"&"));
                listaCarne.add(new Bevanda("Tavernello",5.6,""));
                listaCarne.add(new Bevanda("Coca-cola",3.5,""));
                listaCarne.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaCarne.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaCarne.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaCarne.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaCarne.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaCarne.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaCarne.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' VEGANO");
                listaVegano.add(new Bevanda("Acqua",2.5,"$"));
                listaVegano.add(new Bevanda("Tavernello",5.6,""));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaVegano.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaVegano.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaVegano.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaVegano.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaVegano.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case PESCE_VEGANO:
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,"%"));
                listaPesce.add(new Bevanda("Tavernello",5.6,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaPesce.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaPesce.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaPesce.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' VEGANO");
                listaVegano.add(new Bevanda("Acqua",2.5,"$"));
                listaVegano.add(new Bevanda("Tavernello",5.6,""));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaVegano.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaVegano.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaVegano.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaVegano.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaVegano.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case CARNE_PESCE_VEGANO:
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,"&"));
                listaCarne.add(new Bevanda("Tavernello",5.6,""));
                listaCarne.add(new Bevanda("Coca-cola",3.5,""));
                listaCarne.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaCarne.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaCarne.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaCarne.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaCarne.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaCarne.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaCarne.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,"%"));
                listaPesce.add(new Bevanda("Tavernello",5.6,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaPesce.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaPesce.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaPesce.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' VEGANO");
                listaVegano.add(new Bevanda("Acqua",2.5,"$"));
                listaVegano.add(new Bevanda("Tavernello",5.6,""));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino"));
                listaVegano.add(new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi"));
                listaVegano.add(new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi"));
                listaVegano.add(new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure"));
                listaVegano.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaVegano.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            default:
                System.out.println("No menu available");

        }
    }

    public void printRestaurantsDetails(){
        System.out.printf("Nome: %s%nTipo di menù: %s%n",getRestaurantName(),getMenuType());
    }
}
