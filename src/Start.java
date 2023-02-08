import entities.*;
import enumerations.*;

public class Start {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Palla 8", "Via Roma 1", TypeEnum.CARNE, 4, 50.00, "Messicano");

        System.out.println("MENU' DEL RISTORANTE");
        ristorante.addPortata(new Bevanda("Nastro Azzurro", 1.20, "", TypeEnum.CARNE, TipoDiBevandaEnum.BIRRA));
        ristorante.addPortata(new Bevanda("Solopaca", 4.54, "", TypeEnum.CARNE, TipoDiBevandaEnum.VINO));
        ristorante.addPortata(new Bevanda("Coca-cola", 1.49, "", TypeEnum.CARNE, TipoDiBevandaEnum.COLA));
        ristorante.addPortata(new PrimoPiatto("Risotto Funghi e Salsiccia", 13.3, "riso,salsiccia,funghi", TypeEnum.CARNE));
        ristorante.addPortata(new PrimoPiatto("Amatriciana", 16.5, "Pasta,sugo,pancetta,pecorino", TypeEnum.CARNE));
        ristorante.addPortata(new SecondoPiatto("Pollo alla Cacciatora", 17.4, "Pollo, Pomodoro, Spezie, Cipolla, Vino, Verdure", TypeEnum.CARNE, "Patate al Forno", CotturaTypeEnum.MEDIA));
        ristorante.addPortata(new SecondoPiatto("Bistecca", 16.5, "Carne di Manzo, Limone, Aromi", TypeEnum.CARNE, "Patate Fritte", CotturaTypeEnum.AL_SANGUE));
        ristorante.addPortata(new Dolci("Tiramisu'", 10.55, "Uova,Mascarpone,Zucchero,Caffè,Rum", TypeEnum.CARNE, DolciTypeEnum.TORTA, 120.00, Dolci.DolciBooleaneEnum.CONGELATO));
        ristorante.addPortata(new Dolci("Sorbetto al limone", 5.25, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi", TypeEnum.CARNE, DolciTypeEnum.SEMIFREDDO, 120.00, Dolci.DolciBooleaneEnum.FRESCO));
        ristorante.addPortata(new Dolci("Pan di Spagna", 12.5, "Uova ,burro ,zuchero ", TypeEnum.CARNE, DolciTypeEnum.TORTA, 120.00, Dolci.DolciBooleaneEnum.PER_ALLERGICI_E_CELIACI_CONGELATO));

        ristorante.printRestaurantsDetails();
        System.out.println("-----------------");
        ristorante.printMenuRistorante();
        System.out.println("-----------------");
        Client cliente = new Client("Giovanni", "Zaccuri", TypeEnum.CARNE, "lol_lel@libero.it");
        ristorante.prenotaPosti(
                new Client("Marco", "Setaro", TypeEnum.CARNE, "m_setaro@yahoo.it"),
                new Tavolo(1, TavoloPositionEnum.ESTERNO_GIARDINO));
        ristorante.prenotaPosti(
                new Client("Alessio", "Pollina", TypeEnum.CARNE, "abc_cba@yahoo.it"),
                new Tavolo(2, TavoloPositionEnum.ESTERNO_TERRAZZO));
        ristorante.prenotaPosti(
                new Client("Maria", "Coman", TypeEnum.CARNE, "dbc_cdb@libero.it"),
                new Tavolo(3, TavoloPositionEnum.INTERNO));
        ristorante.prenotaPosti(
                cliente,
                new Tavolo(4, TavoloPositionEnum.ESTERNO_VISTA_MARE));
        ristorante.checkout(cliente);
        ristorante.prenotaPosti(
                cliente,
                new Tavolo(4, TavoloPositionEnum.ESTERNO_VISTA_MARE));

        DatabaseManager databaseManager = new DatabaseManager();

        databaseManager.createSchema();
        databaseManager.createTableRistorante();
        databaseManager.createTableTavolo();
        databaseManager.createTableCliente();
        databaseManager.createTablePrenotazione();
        databaseManager.createTableMenu();
        databaseManager.createTableBevanda();
        databaseManager.createTablePrimoPiatto();
        databaseManager.createTableSecondoPiatto();
        databaseManager.createTableDolce();
        databaseManager.createTableSecondoPiatto();
        //databaseManager.insertValuesRistorante(ristorante);
    }
}




