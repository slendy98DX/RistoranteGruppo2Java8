public class Bevanda extends Portata{

    private boolean isAlcolic;


    public Bevanda(TypeEnum typeEnum, String name, double priceEuros, String ingridients, boolean isAlcolic) {
        super(typeEnum, name, priceEuros, ingridients);
        this.isAlcolic = isAlcolic;
    }

    public boolean isAlcolic() {
        return isAlcolic;
    }

    public void setAlcolic(boolean alcolic) {
        isAlcolic = alcolic;
    }

    @Override
    public void printPortataDetails() {
        System.out.printf("Tipo di portata: %s Nome: %s Prezzo: %.2f € Ingredienti: %s E' alcolico?: %b", getTypeEnum(),getName(),getPriceEuros(),getIngridients(),isAlcolic());
    }
}
