public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 9", "Via Roma 1", TypeEnum.CARNE);
        Ristorante ristorante1 = new Ristorante("Palla 8", "Via Italia 2", TypeEnum.PESCE);
        Ristorante ristorante2 = new Ristorante("Palla 7", "Via Vittoria 3", TypeEnum.VEGANO);

        ristorante.printRestaurantsDetails();
        ristorante.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante1.printRestaurantsDetails();
        ristorante1.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante2.printRestaurantsDetails();
        ristorante2.printMenuRistorante();

        System.out.println("--------------------------------------------");

        //TODO noi abbiamo solo in ristorante, nel main simuliamo solo un ristorante
        Ristorante ristorante3 = new Ristorante("Palla 6","Via Garibaldi 4" , TypeEnum.CARNE_PESCE);
        Ristorante ristorante4 = new Ristorante("Palla 5", "Via Genova 5", TypeEnum.PESCE_VEGANO);
        Ristorante ristorante5 = new Ristorante("Palla 4", "Via Bonaduce 6", TypeEnum.CARNE_VEGANO);
        Ristorante ristorante6 = new Ristorante("Palla 3", "Via Mascagna 7", TypeEnum.CARNE_PESCE_VEGANO);

        ristorante.addPortata(new Bevanda("Acqua",2.5,""));
        ristorante.addPortata(new Bevanda("Peroni",3.5,""));
        ristorante.addPortata(new Bevanda("Coca-cola",3.5,""));
        ristorante.addPortata(new PrimoPiatto("Spaghetti alle vongole",  20, "Pasta,vongole,olio,prezzemolo"));
        ristorante.addPortata(new PrimoPiatto("Paccheri allo scoglio",  19, "pasta,vongole,cozze,cannolicchi,"));
        ristorante.addPortata(new SecondoPiatto("Cheesecake al salmone", 19.5, "Biscotti, Crema di Formaggio","Patatine"));
        ristorante.addPortata(new SecondoPiatto("Salmone affumicato agli agrumi", 19.3, "Carpaccio di Salmone", "Pane e Burro"));
        ristorante.addPortata(new Dolci("Coppa al mascarpone", "Dessert", 8.50, "Uova,Mascarpone,Zucchero,Caffè,Marsala,Cioccolato fondente ,Meringhe"));
        ristorante.addPortata(new Dolci("Torta di mele e mascarpone", "Torta", 6.50, "Mele Golden,Mascarpone,Zucchero,Farina,Uova,Baccelo di vaniglia,lievito"));



        ristorante3.printRestaurantsDetails();
        ristorante3.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante4.printRestaurantsDetails();
        ristorante4.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante5.printRestaurantsDetails();
        ristorante5.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante6.printRestaurantsDetails();
        ristorante6.printMenuRistorante();

    }
}




