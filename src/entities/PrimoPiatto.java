package entities;

import enumerations.CotturaTypeEnum;
import enumerations.TypeEnum;

/**
 * @author Michele Cioffo
 */
public class PrimoPiatto extends Portata {

    /**
     * Costructor method for FirstPlate
     *
     * @param name            the name of the dish
     * @param priceEuros      price of the dish
     * @param ingredients     of the dish
     * @param portataTypeEnum the type of the dish
     */
    public PrimoPiatto(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
    }

    /**
     * Prints the First Plate's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
    }
}


