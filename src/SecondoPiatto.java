public class SecondoPiatto extends Portata {
    private String sideDish;
    private String isHotOrCold;

    public SecondoPiatto(TypeEnum typeEnum, String name, double priceEuros, String ingridients, String sideDish, String isHotOrCold) {
        super(typeEnum, name, priceEuros, ingridients);
        this.sideDish = sideDish;
        this.isHotOrCold = isHotOrCold;
    }


    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }
    public String getIsHotOrCold() {
        return isHotOrCold;
    }

    public void setIsHotOrCold(String isHotOrCold) {
        this.isHotOrCold = isHotOrCold;
    }

    @Override
    public void printPortataDetails() {
        System.out.printf("Tipo di portata: %s Nome: %s Prezzo: %.2f € Ingredienti: %s Contorno: %s Caldo o Freddo?: %s%n", getTypeEnum(),getName(),getPriceEuros(),getIngridients(), getSideDish(), getIsHotOrCold());
    }
}



