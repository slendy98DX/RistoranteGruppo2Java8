import entities.*;
import enumerations.*;
import enumerations.booleane.DolciBooleaneEnum;

public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 8", "Via Roma 1", TypeEnum.CARNE,5);

        System.out.println("MENU' DEL RISTORANTE");
        ristorante.addPortata(new Bevanda("Nastro Azzurro", 1.20, "", TypeEnum.CARNE, TipoDiBevandaEnum.BIRRA));
        ristorante.addPortata(new Bevanda("Solopaca", 4.54, "", TypeEnum.CARNE, TipoDiBevandaEnum.VINO));
        ristorante.addPortata(new Bevanda("Coca-cola", 1.49, "", TypeEnum.CARNE, TipoDiBevandaEnum.COLA));
        ristorante.addPortata(new PrimoPiatto("Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi", TypeEnum.CARNE));
        ristorante.addPortata(new PrimoPiatto("Amatriciana", 16.5, "Pasta,sugo,pancetta,pecorino", TypeEnum.CARNE));
        ristorante.addPortata(new SecondoPiatto("Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure", TypeEnum.CARNE, "Patate al Forno", CotturaTypeEnum.MEDIA));
        ristorante.addPortata(new SecondoPiatto("Bistecca", 16.5, "Carne di Manzo, Limone, Aromi", TypeEnum.CARNE, "Patate Fritte", CotturaTypeEnum.AL_SANGUE));
        ristorante.addPortata(new Dolci("Tiramisu'", 10.55, "Uova,Mascarpone,Zucchero,Caffè,Rum", TypeEnum.CARNE, DolciTypeEnum.TORTA,120.00,DolciBooleaneEnum.CONGELATO));
        ristorante.addPortata(new Dolci("Sorbetto al limone", 5.25, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi", TypeEnum.CARNE, DolciTypeEnum.SEMIFREDDO,120.00,DolciBooleaneEnum.FRESCO));
        ristorante.addPortata(new Dolci("Pan di Spagna",12.5,"Uova ,burro ,zuchero ",TypeEnum.CARNE,DolciTypeEnum.TORTA,120.00, DolciBooleaneEnum.PER_ALLERGICI_E_CELIACI_CONGELATO));

        try{
            ristorante.putTavoli(new Tavolo(1,2,TavoloPositionEnum.ESTERNO_GIARDINO,false));
            ristorante.putTavoli(new Tavolo(2,2,TavoloPositionEnum.ESTERNO_TERRAZZO,false));
            ristorante.putTavoli(new Tavolo(3,4,TavoloPositionEnum.INTERNO,false));
            ristorante.putTavoli(new Tavolo(4,6,TavoloPositionEnum.INTERNO,false));
            ristorante.putTavoli(new Tavolo(5,2,TavoloPositionEnum.INTERNO,false));
        } catch (Exception e){
            e.printStackTrace();
        }

        ristorante.printRestaurantsDetails();
        ristorante.printMenuRistorante();
        ristorante.printDettagliTavoli();


        Client client = new Client("Marco","Setaro","+393501992311",TypeEnum.CARNE,"m_setaro@yahoo.it");
        Client client2 = new Client("Alessio","Pollina","+39489132",TypeEnum.CARNE,"m_37983624");
        Client client3 = new Client("Maria","Coman","+23476t74328",TypeEnum.CARNE,"324842");

        Prenotazione prenotazione = new Prenotazione(client);
        Prenotazione prenotazione2 = new Prenotazione(client2);
        Prenotazione prenotazione3 = new Prenotazione(client3);

        System.out.println(prenotazione);
        System.out.println(prenotazione2);
        System.out.println(prenotazione3);

        ristorante.prenotaTavolo(prenotazione,2);
        ristorante.prenotaTavolo(prenotazione2,2);
        ristorante.prenotaTavolo(prenotazione3,2);
    }
}




