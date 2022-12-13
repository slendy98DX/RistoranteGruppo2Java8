public class Start {

    public static void main(String[] args){

        Ristorante ristorante = new Ristorante("Palla 8","Via Roma 1", TypeEnum.CARNE);

        ristorante.printRestaurantsDetails();

        System.out.println("-------------------------------------------------------");
        ristorante.addPortata(new Bevanda("Acqua",2.5,"",TypeEnum.CARNE,false));
        ristorante.addPortata(new Bevanda("Tavernello", 5.6, "",TypeEnum.CARNE,true));
        ristorante.addPortata(new Bevanda("Coca-cola",3.5, "",TypeEnum.CARNE,false));
        /*ristorante.addPortata(new PrimoPiatto(TypeEnum.CARNE, "Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi","Caldo"));
        ristorante.addPortata(new PrimoPiatto(TypeEnum.CARNE, "Amatriciana", 16, "Pasta,sugo,pancetta,pecorino", "Caldo"));*/
        ristorante.addPortata(new SecondoPiatto("Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure",TypeEnum.CARNE ,"Patate al Forno", true));
        ristorante.addPortata(new SecondoPiatto("Bistecca", 16.5, "Carne di Manzo, Limone, Aromi",TypeEnum.CARNE ,"Patate Fritte", true));
        /*ristorante.addPortata(new Dolci(TypeEnum.CARNE,"Tiramisu'",10,"Uova,Mascarpone,Zucchero,Caffè,Rum","Dessert"));
        ristorante.addPortata(new Dolci(TypeEnum.CARNE, "Sorbetto al limone",5,"Succo di limone,Aqua,Zucchero,Limoncello,Albumi","Sorbetti"));*/

        ristorante.printMenuRistorante();

        System.out.println("-------------------------------------------------------");

        ristorante.addTavoli(new Tavolo(7,4,TavoloTypeEnum.ESTERNO,TavoloTypeEnum.PRENOTATO));
        ristorante.addTavoli(new Tavolo(1,2,TavoloTypeEnum.INTERNO,TavoloTypeEnum.NON_PRENOTATO));

        ristorante.printRestaurantsDetails();

        ristorante.printDettagliTavoliDisponibili();

        ristorante.printDettagliTavoliPrenotati();
    }
}




