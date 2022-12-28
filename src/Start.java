import entities.*;
import enumerations.*;
import enumerations.booleane.DolciBooleaneEnum;

public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 8", "Via Roma 1", TypeEnum.CARNE);

        System.out.println("MENU' DEL RISTORANTE");
       // ristorante.addPortata(new Bevanda("Nastro Azzurro", 1.20, "", TypeEnum.CARNE, TipoDiBevandaEnum.BIRRA));
        //ristorante.addPortata(new Bevanda("Solopaca", 4.54, "", TypeEnum.CARNE, TipoDiBevandaEnum.VINO));
       // ristorante.addPortata(new Bevanda("Coca-cola", 1.49, "", TypeEnum.CARNE, TipoDiBevandaEnum.COLA));
       // ristorante.addPortata(new PrimoPiatto("Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi", TypeEnum.CARNE));
       // ristorante.addPortata(new PrimoPiatto("Amatriciana", 16.5, "Pasta,sugo,pancetta,pecorino", TypeEnum.CARNE));//ristorante.addPortata(new SecondoPiatto("Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure", TypeEnum.CARNE, "Patate al Forno", CotturaTypeEnum.MEDIA));
       // ristorante.addPortata(new SecondoPiatto("Bistecca", 16.5, "Carne di Manzo, Limone, Aromi", TypeEnum.CARNE, "Patate Fritte", CotturaTypeEnum.AL_SANGUE));/ristorante.addPortata(new Dolci("Tiramisu'", 10.55, "Uova,Mascarpone,Zucchero,Caffè,Rum", TypeEnum.CARNE, DolciTypeEnum.TORTE));
        ristorante.addPortata(new Dolci("Sorbetto al limone", 5.25, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi", TypeEnum.CARNE, DolciTypeEnum.SEMIFREDDO,120.00,DolciBooleaneEnum.fresco));
        ristorante.addPortata(new Dolci("Pan di Spagna",12.5,"Uova ,burro ,zuchero ",TypeEnum.CARNE,DolciTypeEnum.TORTA,120.00, DolciBooleaneEnum.per_Allergici_congelato));
        ristorante.printMenuRistorante();

        System.out.println("-------------------------------------------------------");

        ristorante.addTavoli(new Tavolo(7, 4, TavoloPositionEnum.ESTERNO, TavoloStatusEnum.PRENOTATO));
        ristorante.addTavoli(new Tavolo(1, 2, TavoloPositionEnum.INTERNO, TavoloStatusEnum.NON_PRENOTATO));
        ristorante.addTavoli(new Tavolo(2, 6, TavoloPositionEnum.ESTERNO, TavoloStatusEnum.PRENOTATO));

        ristorante.printRestaurantsDetails();
        ristorante.printDettagliTavoli();
        ristorante.printMenuRistorante();
    }
}




