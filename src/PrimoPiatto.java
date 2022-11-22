public class PrimoPiatto extends Portata implements IPrimoPiatto{

    String ingredientsFirst;


    public PrimoPiatto(String name, boolean isHot, double priceEuros,String ingredients) {
        super(name, isHot, priceEuros);
        this.ingredientsFirst = ingredients;

    }

}

