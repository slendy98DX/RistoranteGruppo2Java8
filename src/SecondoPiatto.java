/**
 * @author Alessio Pollina
 */
public class SecondoPiatto extends Portata {
    private String sideDish;
    private Boolean isHot;

    /**
     * Constructor method of the Second Plate
     * @param name the name of the Second Plate
     * @param priceEuros the price of the Second Plate
     * @param ingredients the ingridients of the Second Plate
     * @param portataTypeEnum the type of the Second Plate
     * @param sideDish the sideDish of the Second Plate
     * @param isHot the temperature of the Second Plate
     */
    public SecondoPiatto(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, String sideDish, Boolean isHot) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.sideDish = sideDish;
        this.isHot = isHot;
    }


    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean ishot) {
        isHot = ishot;
    }

    /**
     * Prints the Second Plate's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        System.out.printf(" Contorni: %s E' caldo? %d%n", getIsHot());
    }
}



