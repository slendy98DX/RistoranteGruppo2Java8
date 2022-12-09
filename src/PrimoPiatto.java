public class PrimoPiatto extends Portata{

    private String isHotOrCold;

    public PrimoPiatto(PortataTypeEnum portataTypeEnum, String name, double priceEuros, String ingridients, String isHotOrCold) {
        super(portataTypeEnum, name, priceEuros, ingridients);
        this.isHotOrCold = isHotOrCold;
    }


    public String getIsHotOrCold() {
        return isHotOrCold;
    }

    public void setIsHotOrCold(String isHotOrCold) {
        this.isHotOrCold = isHotOrCold;
    }

    @Override
    public void printPortataDetails() {
        System.out.printf("Tipo di portata: %s Nome: %s Prezzo: %.2f € Ingredienti: %s Caldo o Freddo?: %s%n", getPortataTypeEnum(),getName(),getPriceEuros(),getIngridients(),getIsHotOrCold());
    }
}


