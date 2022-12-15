public class Start {

    public static void main(String[] args){

        Ristorante ristorante = new Ristorante("Palla 8","Via Roma 1", TypeEnum.CARNE);

        System.out.println("MENU' DEL RISTORANTE");
        ristorante.addPortata(new Bevanda("Acqua",2.5,"",TypeEnum.CARNE,TipoDiBevandaEnum.ANALCOLICO));
        ristorante.addPortata(new Bevanda("Tavernello", 5.6, "",TypeEnum.CARNE,TipoDiBevandaEnum.ALCOLICO));
        ristorante.addPortata(new Bevanda("Coca-cola",3.5, "",TypeEnum.CARNE,TipoDiBevandaEnum.ANALCOLICO));
        ristorante.addPortata(new PrimoPiatto("Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi",TypeEnum.CARNE, TemperaturaPiattoEnum.CALDO));
        ristorante.addPortata(new PrimoPiatto("Amatriciana", 16.5, "Pasta,sugo,pancetta,pecorino", TypeEnum.CARNE, TemperaturaPiattoEnum.CALDO));
        ristorante.addPortata(new SecondoPiatto("Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure",TypeEnum.CARNE ,"Patate al Forno", TemperaturaPiattoEnum.CALDO));
        ristorante.addPortata(new SecondoPiatto("Bistecca", 16.5, "Carne di Manzo, Limone, Aromi",TypeEnum.CARNE ,"Patate Fritte", TemperaturaPiattoEnum.CALDO));
        ristorante.addPortata(new Dolci( "Tiramisu'",10.55,"Uova,Mascarpone,Zucchero,Caffè,Rum",TypeEnum.CARNE,DolciTypeEnum.TORTE));
        ristorante.addPortata(new Dolci( "Sorbetto al limone",5.25,"Succo di limone,Aqua,Zucchero,Limoncello,Albumi",TypeEnum.CARNE,DolciTypeEnum.SEMIFREDDO));

        ristorante.printMenuRistorante();

        System.out.println("-------------------------------------------------------");

        ristorante.addTavoli(new Tavolo(7,4, TavoloPositionEnum.ESTERNO,TavoloStatusEnum.PRENOTATO));
        ristorante.addTavoli(new Tavolo(1,2, TavoloPositionEnum.INTERNO,TavoloStatusEnum.NON_PRENOTATO));
        ristorante.addTavoli(new Tavolo(2,6, TavoloPositionEnum.ESTERNO,TavoloStatusEnum.PRENOTATO));

        ristorante.printRestaurantsDetails();
        ristorante.printDettagliTavoli();
    }
}




