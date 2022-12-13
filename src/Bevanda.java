public class Bevanda extends Portata{

    private Boolean isAlcoholic;

    /**
     * Constructor method of the beverages
     * @param name name of the beverage
     * @param priceEuros price of the beverage
     * @param ingredients ingredients of the beverage
     * @param portataTypeEnum the type of the beverage
     * @param isAlcoholic true if the beverage is alcoholic, false if it's not alcoholic
     */
    public Bevanda(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, Boolean isAlcoholic) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.isAlcoholic = isAlcoholic;
    }


    public Boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcolic(Boolean alcolic) {
        isAlcoholic = alcolic;
    }

    /**
     * Prints the beverage's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        System.out.printf(" E' alcolico? %b%n",isAlcoholic());
    }
}
