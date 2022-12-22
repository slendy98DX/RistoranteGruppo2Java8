package entities;

import enumerations.CotturaTypeEnum;
import enumerations.TypeEnum;

/**
 * @author Alessio Pollina
 */
public class SecondoPiatto extends Portata {
    private String sideDish;



    private CotturaTypeEnum cotturaTypeEnum;

    /**
     * Constructor method of the Second Plate
     * @param name the name of the Second Plate
     * @param priceEuros the price of the Second Plate
     * @param ingredients the ingridients of the Second Plate
     * @param portataTypeEnum the type of the Second Plate
     * @param sideDish the sideDish of the Second Plate
     * @param cotturaTypeEnum temperature of the baking
     */
    public SecondoPiatto(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, String sideDish, CotturaTypeEnum cotturaTypeEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.sideDish = sideDish;
        this.cotturaTypeEnum = cotturaTypeEnum;
    }


    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }


    public CotturaTypeEnum getCotturaTypeEnum() {
        return cotturaTypeEnum;
    }

    public void setCotturaTypeEnum(CotturaTypeEnum cotturaTypeEnum) {
        this.cotturaTypeEnum = cotturaTypeEnum;
    }

    /**
     * Prints the Second Plate's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        System.out.printf(" Contorni: %s" +
                " Cottura del Piatto: %s%n"
                , sideDish
                , cotturaTypeEnum);
    }
}



