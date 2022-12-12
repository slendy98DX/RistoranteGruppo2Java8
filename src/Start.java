public class Start {

    public static void main(String[] args){

        Ristorante ristorante = new Ristorante("Palla 8","Via Roma 1", TypeEnum.CARNE);

        ristorante.printRestaurantsDetails();

        System.out.println("-------------------------------------------------------");
        ristorante.addPortata(new Bevanda(TypeEnum.CARNE,"Acqua",2.5,"",false));
        ristorante.addPortata(new Bevanda(TypeEnum.CARNE,"Tavernello", 5.6, "",true));
        ristorante.addPortata(new Bevanda(TypeEnum.CARNE,"Coca-cola",3.5, "",false));
        ristorante.addPortata(new PrimoPiatto(TypeEnum.CARNE, "Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi","Caldo"));
        ristorante.addPortata(new PrimoPiatto(TypeEnum.CARNE, "Amatriciana", 16, "Pasta,sugo,pancetta,pecorino", "Caldo"));
        ristorante.addPortata(new SecondoPiatto(TypeEnum.CARNE, "Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure", "Patate al Forno", "Caldo"));
        ristorante.addPortata(new SecondoPiatto(TypeEnum.CARNE, "Bistecca", 16.5, "Carne di Manzo, Limone, Aromi", "Patate Fritte", "Caldo"));
        ristorante.addPortata(new Dolci(TypeEnum.CARNE,"Tiramisu'",10,"Uova,Mascarpone,Zucchero,Caffè,Rum","Dessert"));
        ristorante.addPortata(new Dolci(TypeEnum.CARNE, "Sorbetto al limone",5,"Succo di limone,Aqua,Zucchero,Limoncello,Albumi","Sorbetti"));

        ristorante.printMenuRistorante();

        System.out.println("-------------------------------------------------------");

        ristorante.addTavoli(new Tavolo(7,4,TavoloTypeEnum.ESTERNO,TavoloTypeEnum.PRENOTATO));
        ristorante.addTavoli(new Tavolo(1,2,TavoloTypeEnum.INTERNO,TavoloTypeEnum.NON_PRENOTATO));

        ristorante.printRestaurantsDetails();

        ristorante.printDettagliTavoliDisponibili();

        ristorante.printDettagliTavoliPrenotati();
    }
}




