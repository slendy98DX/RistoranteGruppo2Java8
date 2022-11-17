public class PrimoPiatto extends Portata implements IPrimoPiatto{

    String ingredientsFirst;


    public PrimoPiatto(String name, boolean isHot, double priceEuros,String ingredients) {
        super(name, isHot, priceEuros);
        this.ingredientsFirst = ingredients;

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
    public String printIngredientsFirst() {
        return ingredientsFirst;
    }
}

