public class Dolci extends Portata implements IDolci {

String type;
String ingredientsDolci;
    public Dolci(String name, String type,boolean isHot , double priceEuros,String ingredientsDolci) {
        super(name,isHot, priceEuros);
        this.ingredientsDolci=ingredientsDolci;
        this.type=type;
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
    public String printIngredientsDolci() {
        return ingredientsDolci;
    }

    @Override
    public String printType() {
        return type;
    }
}

