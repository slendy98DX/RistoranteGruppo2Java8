public class Dolci extends Portata {

    public String type;

    public Dolci(String name,String type,double priceEuros, String ingridients) {
        super(name, priceEuros, ingridients);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String printPortataDetails() {
        return String.format("Nome: %s Prezzo: %.2f € Tipo di dolce: %s  Ingredienti: %s", getName(), getPriceEuros(),getType(), getIngridients());
    }
}


