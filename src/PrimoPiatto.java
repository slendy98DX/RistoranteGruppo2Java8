public class PrimoPiatto extends Portata{
    public String ingredients;
    public PrimoPiatto(String name, double priceEuros,String ingredients) {
        super(name, priceEuros);
        this.ingredients = ingredients;

    }
    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    @Override
    public void printPortataDetails() {
        System.out.printf("Nome: %s Prezzo: %.2f€ Ingredienti: %s%n", getName(), getPriceEuros(), getIngredients());
    }
}


