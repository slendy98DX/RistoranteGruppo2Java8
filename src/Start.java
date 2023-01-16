import entities.*;
import enumerations.*;

public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 8", "Via Roma 1", TypeEnum.CARNE,10, 10);

        System.out.println("MENU' DEL RISTORANTE");
        ristorante.addPortata(new Bevanda("Nastro Azzurro", 1.20, "", TypeEnum.CARNE, TipoDiBevandaEnum.BIRRA));
        ristorante.addPortata(new Bevanda("Solopaca", 4.54, "", TypeEnum.CARNE, TipoDiBevandaEnum.VINO));
        ristorante.addPortata(new Bevanda("Coca-cola", 1.49, "", TypeEnum.CARNE, TipoDiBevandaEnum.COLA));
        ristorante.addPortata(new PrimoPiatto("Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi", TypeEnum.CARNE));
        ristorante.addPortata(new PrimoPiatto("Amatriciana", 16.5, "Pasta,sugo,pancetta,pecorino", TypeEnum.CARNE));
        ristorante.addPortata(new SecondoPiatto("Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure", TypeEnum.CARNE, "Patate al Forno", CotturaTypeEnum.MEDIA));
        ristorante.addPortata(new SecondoPiatto("Bistecca", 16.5, "Carne di Manzo, Limone, Aromi", TypeEnum.CARNE, "Patate Fritte", CotturaTypeEnum.AL_SANGUE));
        ristorante.addPortata(new Dolci("Tiramisu'", 10.55, "Uova,Mascarpone,Zucchero,Caffè,Rum", TypeEnum.CARNE, DolciTypeEnum.TORTA,120.00, Dolci.DolciBooleaneEnum.CONGELATO));
        ristorante.addPortata(new Dolci("Sorbetto al limone", 5.25, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi", TypeEnum.CARNE, DolciTypeEnum.SEMIFREDDO,120.00, Dolci.DolciBooleaneEnum.FRESCO));
        ristorante.addPortata(new Dolci("Pan di Spagna",12.5,"Uova ,burro ,zuchero ",TypeEnum.CARNE,DolciTypeEnum.TORTA,120.00, Dolci.DolciBooleaneEnum.PER_ALLERGICI_E_CELIACI_CONGELATO));

        try{
            ristorante.putTavoli(new Tavolo(1,TavoloPositionEnum.ESTERNO_GIARDINO));
            ristorante.putTavoli(new Tavolo(2,TavoloPositionEnum.ESTERNO_TERRAZZO));
            ristorante.putTavoli(new Tavolo(3,TavoloPositionEnum.INTERNO));
            ristorante.putTavoli(new Tavolo(4,TavoloPositionEnum.ESTERNO_VISTA_MARE));
            ristorante.putTavoli(new Tavolo(5,TavoloPositionEnum.ESTERNO_TERRAZZO));
            ristorante.putTavoli(new Tavolo(6,TavoloPositionEnum.INTERNO));
            ristorante.putTavoli(new Tavolo(7,TavoloPositionEnum.ESTERNO_GIARDINO));
            ristorante.putTavoli(new Tavolo(8,TavoloPositionEnum.ESTERNO_VISTA_MARE));
            ristorante.putTavoli(new Tavolo(9,TavoloPositionEnum.INTERNO));
            ristorante.putTavoli(new Tavolo(10,TavoloPositionEnum.ESTERNO_GIARDINO));
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

        prenotazione.printPrenotazioneDetails();
        prenotazione2.printPrenotazioneDetails();
        prenotazione3.printPrenotazioneDetails();

        try {
            ristorante.prenotaPosti(prenotazione, 2);
            ristorante.prenotaPosti(prenotazione2, 2);
            ristorante.prenotaPosti(prenotazione3, 7);
        } catch(Exception e){
            e.printStackTrace();
        }

        ristorante.printRestaurantsDetails();
    }
}




