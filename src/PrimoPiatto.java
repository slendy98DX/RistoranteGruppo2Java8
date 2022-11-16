public class PrimoPiatto extends Portata implements IPrimoPiatto{

    String ingredients;


    public PrimoPiatto(String name, boolean isHot, double priceEuros,String ingredients) {
        super(name, isHot, priceEuros);
        this.ingredients = ingredients;

    }

    @Override
    public String printName() {
        return name;
    }

    @Override
    public double printPrice() {
        return priceEuros;
    }

    @Override
    public String printIngredients() {
        return ingredients;
    }
}

