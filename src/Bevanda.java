public class Bevanda extends Portata{

    private TipoDiBevandaEnum tipoDiBevandaEnum;

    /**
     * Constructor method of the beverages
     * @param name name of the beverage
     * @param priceEuros price of the beverage
     * @param ingredients ingredients of the beverage
     * @param portataTypeEnum the type of the beverage
     * @param tipoDiBevandaEnum it's the type of the beverage
     */
    public Bevanda(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, TipoDiBevandaEnum tipoDiBevandaEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.tipoDiBevandaEnum = tipoDiBevandaEnum;
    }

    public TipoDiBevandaEnum getTipoDiBevandaEnum() {
        return tipoDiBevandaEnum;
    }

    public void setTipoDiBevandaEnum(TipoDiBevandaEnum tipoDiBevandaEnum) {
        this.tipoDiBevandaEnum = tipoDiBevandaEnum;
    }

    /**
     * Prints the beverage's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        System.out.printf(" E' alcolico? %s%n",getTipoDiBevandaEnum());
    }
}
