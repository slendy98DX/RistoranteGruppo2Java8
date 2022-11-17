public class SecondoPiatto extends Portata implements ISecondoPiatto{

    String sideDish;
    String ingredientsSecond;



    public SecondoPiatto(String name, boolean isHot, double priceEuros, String sideDish, String ingredients) {
        super(name, isHot, priceEuros);
        this.sideDish = sideDish;
        this.ingredientsSecond = ingredients;

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
    public String printIngredientsSecond() {
        return ingredientsSecond;
    }


    @Override
    public String printSideDish() {
        return sideDish;
    }
}
