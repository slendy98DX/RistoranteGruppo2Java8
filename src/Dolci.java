public class Dolci extends Portata {

    private String type;

    public Dolci(TypeEnum typeEnum, String name, double priceEuros, String ingridients, String type) {
        super(typeEnum, name, priceEuros, ingridients);
        this.type=type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void printPortataDetails() {
        System.out.printf("Tipo di portata: %s Tipo di Dolce: %s Nome: %s Prezzo: %.2f € Ingredienti: %s ", getTypeEnum(),getType(),getName(),getPriceEuros(),getIngridients());
    }
}


