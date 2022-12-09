public class Portata{

    private String name;
    private double priceEuros;
    private String ingridients;

    private PortataTypeEnum portataTypeEnum;

    public Portata(PortataTypeEnum portataTypeEnum, String name, double priceEuros, String ingridients){
        this.portataTypeEnum = portataTypeEnum;
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

    public PortataTypeEnum getPortataTypeEnum() {
        return portataTypeEnum;
    }

    public void setPortataTypeEnum(PortataTypeEnum portataTypeEnum) {
        this.portataTypeEnum = portataTypeEnum;
    }

    public void printPortataDetails(){
        System.out.printf("Tipo di portata: %s Nome: %s Prezzo: %.2f € Ingredienti: %s%n", getPortataTypeEnum(),getName(),getPriceEuros(),getIngridients());
    }
}
