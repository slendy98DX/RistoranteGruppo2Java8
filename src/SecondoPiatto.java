
public class SecondoPiatto extends Portata {
    String sideDish;
    String ingredients;


    public SecondoPiatto(String name, double priceEuros, String sideDish, String ingredients) {
        super(name, priceEuros);
        this.sideDish = sideDish;
        this.ingredients = ingredients;

    }



        public String getSideDish() {
            return sideDish;
        }

        public void setSideDish(String sideDish) {
            this.sideDish = sideDish;
        }


        public String getIngredients() {
        return ingredients;
    }
    public void setIngredientsSecond(String ingredients) {
        this.ingredients = ingredients;
    }
    @Override
    public void printPortataDetails() {
        System.out.printf("Nome: %s Prezzo: %.2f€ Contorno: %s Ingredienti: %s%n", getName(), getPriceEuros(), getSideDish(), getIngredients());
    }
}



