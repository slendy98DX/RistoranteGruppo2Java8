public class Portata{

    private String name;
    private double priceEuros;
    private String ingridients;

    private TypeEnum typeEnum;

    public Portata(TypeEnum typeEnum,String name, double priceEuros, String ingridients){
        this.typeEnum = typeEnum;
        this.name = name;
        this.priceEuros = priceEuros;
        this.ingridients = ingridients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceEuros() {
        return priceEuros;
    }

    public void setPriceEuros(double priceEuros) {
        this.priceEuros = priceEuros;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }


    //TODO deve stampare già tutto e deve essere di tipo void e stampare tutto
    public void printPortataDetails(){
        System.out.printf("Tipo di portata: %s Nome: %s Prezzo: %.2f € Ingredienti: %s%n", getTypeEnum(),getName(),getPriceEuros(),getIngridients());
    }
}
