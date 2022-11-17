public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.printRestaurantDetails();

        Bevanda acqua = new Bevanda("Ferrarelle", false, 2.5, false);
        Bevanda vino = new Bevanda("Tavernello", false, 5.6, true);
        Bevanda analcolico = new Bevanda("Coca-cola", false, 3.5, false);

        System.out.println("Lista bevande:\n" + acqua.printName() + " Prezzo: " + acqua.printPrice() + " €" + "\n" + vino.printName() + " Prezzo: " + vino.printPrice() + " €" + "\n" + analcolico.printName() + " Prezzo: " + analcolico.printPrice() + " €");

        PrimoPiatto pasta = new PrimoPiatto("Amatriciana", true, 16, "Pasta,sugo,pancetta,pecorino");
        PrimoPiatto riso = new PrimoPiatto("Risotto funghi e salsiccia", true, 20, "riso,salsiccia,funghi");


        System.out.println("Primi Piatti:\n" + pasta.printName() + " Prezzo: " + pasta.printPrice() + " € Ingredienti: " + pasta.printIngredientsFirst() + "\n" + riso.printName() + " Prezzo: " + riso.printPrice() + " € Ingredienti: " + riso.printIngredientsFirst());

        SecondoPiatto bistecca = new SecondoPiatto("Bistecca", true, 18.5, "Patatine", "Carne di Manzo");
        SecondoPiatto polpette = new SecondoPiatto("Polpette al Sugo", true, 14, "", "Carne di Vitello, Passata di Pomodoro, Pinoli");

        System.out.println("Secondi Piatti:\n"+ bistecca.printName()+ " Prezzo: "+bistecca.printPrice()+" € Ingredienti: "+bistecca.printIngredientsSecond()+ " contorni: " + bistecca.printSideDish() + "\n"+polpette.printName()+ " Prezzo: "+polpette.printPrice()+" € Ingredienti: "+polpette.printIngredientsSecond());
        
        Dolci dolci1 = new Dolci("Sorbetto al limone'-", "Sorbetti-", true, 5, "Succo di limone,Aqua,Zucchero,Limoncello,Albumi");
        Dolci dolci2 = new Dolci("Tiramisu'", "Dessert", false, 10, "Uova,Mascarpone,Zucchero,Caffè,Rum");
        
        System.out.println("Lista Dolci: \n" + dolci1.printName()+" Prezzo "+dolci1.printPrice()+" €"+" -Tipo di dolce: "+dolci1.printType()+"- Ingredienti: "+dolci1.printIngredientsDolci()+"\n"+ dolci2.printName()+" -Prezzo "+dolci2.printPrice()+" €"+" -Tipo di dolce "+dolci2.printType()+" -Ingredienti: "+dolci2.printIngredientsDolci());
        
    }
}



