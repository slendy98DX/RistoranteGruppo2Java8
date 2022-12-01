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
        panino
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
        if(menuType != null) switch(menuType){

            case CARNE:
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,""));
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
                listaVegano.add(new Bevanda("Gin tonic",8.0,"gin,acqua tonica"));
                listaVegano.add(new Bevanda("Mojito",10.0,"rum, zucchero di canna, lime, soda e menta"));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Spaghetti di riso e verdure",  13, "Pasta,carote,zucchine,melenzane,olio"));
                listaVegano.add(new PrimoPiatto("Riso con tofu e seitan",  15, "riso,tofu,seitan"));
                listaVegano.add(new SecondoPiatto("Patatine di polenta", 14.5, "Farina di mais, acqua, olio, sale grosso","Patatine"));
                listaVegano.add(new SecondoPiatto("Cipollotti caramellati", 13.3, "Cipollotti, Aceto Balsamico, Miele, Sale, Olio d'Oliva", "Patatine, Verdure varie"));
                listaVegano.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaVegano.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case PESCE:
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,""));
                listaPesce.add(new Bevanda("Peroni",3.5,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Spaghetti alle vongole",  20, "Pasta,vongole,olio,prezzemolo"));
                listaPesce.add(new PrimoPiatto("Paccheri allo scoglio",  19, "pasta,vongole,cozze,cannolicchi,"));
                listaPesce.add(new SecondoPiatto("Cheesecake al salmone", 19.5, "Biscotti, Crema di Formaggio","Patatine"));
                listaPesce.add(new SecondoPiatto("Salmone affumicato agli agrumi", 19.3, "Carpaccio di Salmone", "Pane e Burro"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case CARNE_PESCE:
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,""));
                listaPesce.add(new Bevanda("Peroni",3.5,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Spaghetti alle vongole",  20, "Pasta,vongole,olio,prezzemolo"));
                listaPesce.add(new PrimoPiatto("Paccheri allo scoglio",  19, "pasta,vongole,cozze,cannolicchi,"));
                listaPesce.add(new SecondoPiatto("Cheesecake al salmone", 19.5, "Biscotti, Crema di Formaggio","Patatine"));
                listaPesce.add(new SecondoPiatto("Salmone affumicato agli agrumi", 19.3, "Carpaccio di Salmone", "Pane e Burro"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,""));
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
                listaCarne.add(new Bevanda("Acqua",2.5,""));
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
                listaVegano.add(new Bevanda("Gin tonic",8.0,"gin,acqua tonica"));
                listaVegano.add(new Bevanda("Mojito",10.0,"rum, zucchero di canna, lime, soda e menta"));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Spaghetti di riso e verdure",  13, "Pasta,carote,zucchine,melenzane,olio"));
                listaVegano.add(new PrimoPiatto("Riso con tofu e seitan",  15, "riso,tofu,seitan"));
                listaVegano.add(new SecondoPiatto("Patatine di polenta", 14.5, "Farina di mais, acqua, olio, sale grosso","Patatine"));
                listaVegano.add(new SecondoPiatto("Cipollotti caramellati", 13.3, "Cipollotti, Aceto Balsamico, Miele, Sale, Olio d'Oliva", "Patatine, Verdure varie"));
                listaVegano.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaVegano.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case PESCE_VEGANO:
                System.out.println("MENU' DI PESCE");
                listaPesce.add(new Bevanda("Acqua",2.5,""));
                listaPesce.add(new Bevanda("Peroni",3.5,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Spaghetti alle vongole",  20, "Pasta,vongole,olio,prezzemolo"));
                listaPesce.add(new PrimoPiatto("Paccheri allo scoglio",  19, "pasta,vongole,cozze,cannolicchi,"));
                listaPesce.add(new SecondoPiatto("Cheesecake al salmone", 19.5, "Biscotti, Crema di Formaggio","Patatine"));
                listaPesce.add(new SecondoPiatto("Salmone affumicato agli agrumi", 19.3, "Carpaccio di Salmone", "Pane e Burro"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' VEGANO");
                listaVegano.add(new Bevanda("Gin tonic",8.0,"gin,acqua tonica"));
                listaVegano.add(new Bevanda("Mojito",10.0,"rum, zucchero di canna, lime, soda e menta"));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Spaghetti di riso e verdure",  13, "Pasta,carote,zucchine,melenzane,olio"));
                listaVegano.add(new PrimoPiatto("Riso con tofu e seitan",  15, "riso,tofu,seitan"));
                listaVegano.add(new SecondoPiatto("Patatine di polenta", 14.5, "Farina di mais, acqua, olio, sale grosso","Patatine"));
                listaVegano.add(new SecondoPiatto("Cipollotti caramellati", 13.3, "Cipollotti, Aceto Balsamico, Miele, Sale, Olio d'Oliva", "Patatine, Verdure varie"));
                listaVegano.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaVegano.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaVegano.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                break;

            case CARNE_PESCE_VEGANO:
                System.out.println("MENU' DI CARNE");
                listaCarne.add(new Bevanda("Acqua",2.5,""));
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
                listaPesce.add(new Bevanda("Acqua",2.5,""));
                listaPesce.add(new Bevanda("Peroni",3.5,""));
                listaPesce.add(new Bevanda("Coca-cola",3.5,""));
                listaPesce.add(new PrimoPiatto("Spaghetti alle vongole",  20, "Pasta,vongole,olio,prezzemolo"));
                listaPesce.add(new PrimoPiatto("Paccheri allo scoglio",  19, "pasta,vongole,cozze,cannolicchi,"));
                listaPesce.add(new SecondoPiatto("Cheesecake al salmone", 19.5, "Biscotti, Crema di Formaggio","Patatine"));
                listaPesce.add(new SecondoPiatto("Salmone affumicato agli agrumi", 19.3, "Carpaccio di Salmone", "Pane e Burro"));
                listaPesce.add(new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum"));
                listaPesce.add(new Dolci("Sorbetto al limone", "Sorbetti", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi"));
                listaPesce.forEach(portata -> {
                    System.out.println(portata.printPortataDetails());
                });
                System.out.println("MENU' VEGANO");
                listaVegano.add(new Bevanda("Gin tonic",8.0,"gin,acqua tonica"));
                listaVegano.add(new Bevanda("Mojito",10.0,"rum, zucchero di canna, lime, soda e menta"));
                listaVegano.add(new Bevanda("Coca-cola",3.5,""));
                listaVegano.add(new PrimoPiatto("Spaghetti di riso e verdure",  13, "Pasta,carote,zucchine,melenzane,olio"));
                listaVegano.add(new PrimoPiatto("Riso con tofu e seitan",  15, "riso,tofu,seitan"));
                listaVegano.add(new SecondoPiatto("Patatine di polenta", 14.5, "Farina di mais, acqua, olio, sale grosso","Patatine"));
                listaVegano.add(new SecondoPiatto("Cipollotti caramellati", 13.3, "Cipollotti, Aceto Balsamico, Miele, Sale, Olio d'Oliva", "Patatine, Verdure varie"));
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
