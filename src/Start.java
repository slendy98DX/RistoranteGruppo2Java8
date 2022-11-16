public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.printRestaurantDetails();

        Bevanda acqua = new Bevanda("Ferrarelle",false,2.5,false);
        Bevanda vino = new Bevanda("Tavernello", false, 5.6, true);
        Bevanda analcolico = new Bevanda("Coca-cola", false,3.5, false);

        System.out.println("Lista bevande:\n"+acqua.printName()+" Prezzo: "+acqua.printPrice()+" €"+"\n"+vino.printName()+" Prezzo: "+vino.printPrice()+" €"+"\n"+analcolico.printName()+" Prezzo: "+ analcolico.printPrice()+" €");

        PrimoPiatto pasta = new PrimoPiatto("Amatriciana", true, 16,"Pasta,sugo,pancetta,pecorino" );
        PrimoPiatto riso = new PrimoPiatto("Risotto funghi e salsiccia",true,20,"riso,salsiccia,funghi");

        System.out.println("Primi Piatti:\n"+ pasta.printName()+ " Prezzo: "+pasta.printPrice()+" € Ingredienti: "+riso.printIngredients()+"\n"+riso.printName()+ " Prezzo: "+riso.printPrice()+" € Ingredienti: "+riso.printIngredients());

    }
}
