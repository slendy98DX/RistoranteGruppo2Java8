public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.printRestaurantDetails();

        Bevanda acqua = new Bevanda("Ferrarelle", false, 2.5, false);
        Bevanda vino = new Bevanda("Tavernello", false, 5.6, true);
        Bevanda analcolico = new Bevanda("Coca-cola", false, 3.5, false);

        acqua.printPortataDetail();
        PrimoPiatto pasta = new PrimoPiatto("Amatriciana", true, 16, "Pasta,sugo,pancetta,pecorino");
        PrimoPiatto riso = new PrimoPiatto("Risotto funghi e salsiccia", true, 20, "riso,salsiccia,funghi");



        SecondoPiatto bistecca = new SecondoPiatto("Bistecca", true, 18.5, "Patatine", "Carne di Manzo");
        SecondoPiatto polpette = new SecondoPiatto("Polpette al Sugo", true, 14, "", "Carne di Vitello, Passata di Pomodoro, Pinoli");


        Dolci dolci1 = new Dolci("Sorbetto al limone'-", "Sorbetti-", true, 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi");
        Dolci dolci2 = new Dolci("Tiramisu'", "Dessert", false, 10, "Uova,Mascarpone,Zucchero,Caffè,Rum");
        

    }
}



