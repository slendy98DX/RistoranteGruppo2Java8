public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 9", Ristorante.MenuType.CARNE);
        Ristorante ristorante1 = new Ristorante("Palla 8", Ristorante.MenuType.PESCE);
        Ristorante ristorante2 = new Ristorante("Palla 7", Ristorante.MenuType.VEGANO);

        ristorante.printRestaurantsDetails();
        ristorante.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante1.printRestaurantsDetails();
        ristorante1.printMenuRistorante();

        System.out.println("--------------------------------------------");

        ristorante2.printRestaurantsDetails();
        ristorante2.printMenuRistorante();

        Ristorante ristorante3 = new Ristorante("Palla 6", Ristorante.MenuType.CARNE_PESCE);
        Ristorante ristorante4 = new Ristorante("Palla 5", Ristorante.MenuType.PESCE_VEGANO);
        Ristorante ristorante5 = new Ristorante("Palla 4", Ristorante.MenuType.CARNE_VEGANO);
        Ristorante ristorante6 = new Ristorante("Palla 3", Ristorante.MenuType.CARNE_PESCE_VEGANO);

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




