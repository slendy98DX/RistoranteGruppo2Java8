import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.printRestaurantDetails();

        System.out.println("BEVANDE");

        List<Bevanda> listaBevande = new ArrayList<>();
        listaBevande.add(new Bevanda("Ferrarelle",2.5));
        listaBevande.add(new Bevanda("Tavernello",5.6));
        listaBevande.add(new Bevanda("Coca-cola",3.5));

        listaBevande.forEach(bevanda -> {
            System.out.println(bevanda.printPortataDetails());
        });

        System.out.println("PRIMI PIATTI");

        PrimoPiatto pasta = new PrimoPiatto("Amatriciana",  16, "Pasta,sugo,pancetta,pecorino");
        PrimoPiatto riso = new PrimoPiatto("Risotto funghi e salsiccia",  20, "riso,salsiccia,funghi");

        pasta.printPortataDetails();
        riso.printPortataDetails();

        SecondoPiatto bistecca = new SecondoPiatto("Bistecca", 18.5, "Patate Fritte","Carne di Manzo, Limone, Aromi");
        SecondoPiatto polloAllaCacciatora = new SecondoPiatto("Pollo alla Cacciatora", 15.3, "Patate al Forno", "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure");

        System.out.println("SECONDI PIATTI");

        bistecca.printPortataDetails();
        polloAllaCacciatora.printPortataDetails();

        System.out.println("DOLCI");

        Dolci dolci1 = new Dolci("Sorbetto al limone'-", "Sorbetti-", 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi");
        Dolci dolci2 = new Dolci("Tiramisu'", "Dessert", 10, "Uova,Mascarpone,Zucchero,Caffè,Rum");

        dolci1.printPortataDetails();
        dolci2.printPortataDetails();

    }
}



