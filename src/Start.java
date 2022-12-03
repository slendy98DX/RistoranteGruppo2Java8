public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 9", "Via Roma 1",MenuType.CARNE);
        Ristorante ristorante1 = new Ristorante("Palla 8", "Via Italia 2",MenuType.PESCE);
        Ristorante ristorante2 = new Ristorante("Palla 7", "Via Vittoria 3",MenuType.VEGANO);

        ristorante.printRestaurantsDetails();
        ristorante.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante1.printRestaurantsDetails();
        ristorante1.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante2.printRestaurantsDetails();
        ristorante2.printMenuRistorante();

        System.out.println("--------------------------------------------");

        Ristorante ristorante3 = new Ristorante("Palla 6","Via Garibaldi 4" ,MenuType.CARNE_PESCE);
        Ristorante ristorante4 = new Ristorante("Palla 5", "Via Genova 5",MenuType.PESCE_VEGANO);
        Ristorante ristorante5 = new Ristorante("Palla 4", "Via Bonaduce 6",MenuType.CARNE_VEGANO);
        Ristorante ristorante6 = new Ristorante("Palla 3", "Via Mascagna 7",MenuType.CARNE_PESCE_VEGANO);

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




