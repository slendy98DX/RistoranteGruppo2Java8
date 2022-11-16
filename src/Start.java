public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.printRestaurantDetails();

        Bevanda acqua = new Bevanda("Ferrarelle",false,2.5,false);
        Bevanda vino = new Bevanda("Tavernello", false, 5.6, true);
        Bevanda analcolico = new Bevanda("Coca-cola", false,3.5, false);

        System.out.println("Lista bevande:\n"+acqua.printName()+" "+acqua.printPrice()+" €"+"\n"+vino.printName()+" "+vino.printPrice()+" €"+"\n"+analcolico.printName()+" "+ analcolico.printPrice()+" €");
    }
}
