public class Dolci extends Portata {


    public String type;
    public String ingredients;
    public Dolci(String name, String type , double priceEuros,String ingredients) {
        super(name, priceEuros);
        this.ingredients=ingredients;
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String printPortataDetails() {
        return String.format("Nome: %s Prezzo: %.2f € Tipo di dolce: %s  Ingredienti: %s%n", getName(), getPriceEuros(),getType(), getIngredients());
    }
}


