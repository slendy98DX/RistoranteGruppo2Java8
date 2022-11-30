public class PrimoPiatto extends Portata{


    public PrimoPiatto(String name, double priceEuros, String ingridients) {
        super(name, priceEuros, ingridients);
    }

    @Override
    public String printPortataDetails() {
        return String.format("Nome: %s Prezzo: %.2f€ Ingredienti: %s", getName(), getPriceEuros(), getIngridients());
    }
}


