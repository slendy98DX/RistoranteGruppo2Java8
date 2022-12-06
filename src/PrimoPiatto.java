public class PrimoPiatto extends Portata{


    public PrimoPiatto(String name, double priceEuros, String ingridients) {
        super(name, priceEuros, ingridients);
    }

    @Override
    public  printPortataDetails() {
        return String.format("Nome: %s Prezzo: %.2f€ Ingredienti: %s", getName(), getPriceEuros(), getIngridients());
    }
}


