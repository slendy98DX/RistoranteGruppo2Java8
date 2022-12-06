public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 9", "Via Roma 1", TypeEnum.CARNE);


        ristorante.printRestaurantsDetails();

        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Acqua",2.5,"",false));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Tavernello", 5.6, "",true));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new PrimoPiatto(TypeEnum.PRIMO_PIATTO, "Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi","Caldo"));
        ristorante.addPortata(new PrimoPiatto(TypeEnum.PRIMO_PIATTO, "Amatriciana", 16, "Pasta,sugo,pancetta,pecorino", "Caldo"));
        ristorante.addPortata(new SecondoPiatto(TypeEnum.SECONDO_PIATTO, "Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure", "Patate al Forno", "Caldo"));
        ristorante.addPortata(new SecondoPiatto(TypeEnum.SECONDO_PIATTO, "Bistecca", 16.5, "Carne di Manzo, Limone, Aromi", "Patate Fritte", "Caldo"));
        ristorante.addPortata(new Dolci(TypeEnum.DOLCE,"Tiramisu'",10,"Uova,Mascarpone,Zucchero,Caffè,Rum","Dessert"));
        ristorante.addPortata(new Dolci(TypeEnum.DOLCE, "Sorbetto al limone",5,"Succo di limone,Aqua,Zucchero,Limoncello,Albumi","Sorbetti"));
        ristorante.printMenuRistorante();

    }
}




