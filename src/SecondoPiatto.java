
public class SecondoPiatto extends Portata{
    String sideDish;

    public SecondoPiatto(String name, double priceEuros, String ingridients, String sideDish) {
        super(name, priceEuros, ingridients);
        this.sideDish = sideDish;
    }

    public String getSideDish() {
            return sideDish;
        }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }
    @Override
    public String printPortataDetails() {
        return String.format("Nome: %s Prezzo: %.2f€ Contorno: %s Ingredienti: %s", getName(), getPriceEuros(), getSideDish(), getIngridients());
    }
}



