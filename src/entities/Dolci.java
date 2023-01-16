package entities;

import enumerations.DolciTypeEnum;
import enumerations.TypeEnum;


/**
 * @author Maria Coman
 */
public class Dolci extends Portata {
    /**
     * internal attributes
     */
    private Double quantita;
    private DolciTypeEnum dolciTypeEnum;
    private DolciBooleaneEnum dolciBooleaneEnum;

    /**
     * @param name              name of the dish,
     * @param priceEuros        price of the dish,
     * @param ingredients       ingredients of the dish,
     * @param portataTypeEnum   associated type of menu,
     * @param dolciTypeEnum     type of cake,
     * @param quantita          total mass of the ingredients ,
     * @param dolciBooleaneEnum special characteristics
     */

    public Dolci(String name, Double priceEuros,
                 String ingredients, TypeEnum portataTypeEnum,
                 DolciTypeEnum dolciTypeEnum, Double quantita,
                 DolciBooleaneEnum dolciBooleaneEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.dolciTypeEnum = dolciTypeEnum;
        this.quantita = quantita;
        this.dolciBooleaneEnum = dolciBooleaneEnum;
    }


    /**
     * Print the Sweet's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();

        System.out.printf(" Tipo di desert: %s" +
                        "indicazioni: %s " +
                        "quantità porzione(gr) : %s%n",
                dolciTypeEnum,
                dolciBooleaneEnum,
                quantita
        );
    }
    /**
     * @author Maria Coman
     * specifiche per dolci
     */
    public enum DolciBooleaneEnum {
        PER_CELIACI_CONGELATO,
        PER_ALLERGICI_CONGELATO,
        PER_Celiaci_FRESCO,
        PER_Allergici_FRESCO,
        FRESCO,
        CONGELATO,
        PER_ALLERGICI_E_CELIACI_FRESCO,
        PER_ALLERGICI_E_CELIACI_CONGELATO,
    }

}