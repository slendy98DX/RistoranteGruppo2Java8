public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 9", "Via Roma 1", TypeEnum.CARNE);


        ristorante.printRestaurantsDetails();

        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Acqua",2.5,"",false));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Tavernello", 5.6, "",true));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new Bevanda(TypeEnum.BEVANDA,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new Dolci(TypeEnum.DOLCE,"Tiramisu'",10,"Uova,Mascarpone,Zucchero,Caffè,Rum","Dessert"));
        ristorante.addPortata(new Dolci(TypeEnum.DOLCE, "Sorbetto al limone",5,"Succo di limone,Aqua,Zucchero,Limoncello,Albumi","Sorbetti"));

        ristorante.printMenuRistorante();

    }
}




