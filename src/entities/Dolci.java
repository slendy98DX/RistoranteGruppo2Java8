package entities;

import enumerations.DolciTypeEnum;
import enumerations.TypeEnum;

/**
 * @author Maria Coman
 */
public class Dolci extends Portata {

    private Double quantita;
    private Boolean isPerCeliaci;
    private Boolean isPerAlergici;
    private Boolean isCongelato;

    public Dolci(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, Double quantita) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.quantita = quantita;
    }

    private DolciTypeEnum dolciTypeEnum;

    /**
     *
     * @param name name of the Sweets
     * @param priceEuros price of the Sweets
     * @param ingredients ingredients of the Sweets
     * @param portataTypeEnum the type of the Sweets
     * @param dolciTypeEnum the type of the Sweets
     * @param isCongelato the type of the Sweets
     * @param isPerCeliaci the type of the Sweets
     * @param quantita the quantity of the Sweets
     * @param isPerAlergici   the type of the Sweets
     *
     */
    public Dolci(DolciTypeEnum dolciTypeEnum,
                 String name,
                 Double priceEuros,
                 String ingredients,
                 TypeEnum portataTypeEnum,
                 Boolean isPerCeliaci,
                 Boolean isPerAlergici ,
                 Boolean isCongelato,
                 Double quantita) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.isCongelato=isCongelato;
        this.isPerAlergici=isPerAlergici;
        this.isPerCeliaci=isPerCeliaci;
        this.quantita=quantita;
        this.dolciTypeEnum=dolciTypeEnum;
    }

    public DolciTypeEnum getDolciTypeEnum() {
        return dolciTypeEnum;
    }

    public void setDolciTypeEnum(DolciTypeEnum dolciTypeEnum) {
        this.dolciTypeEnum = dolciTypeEnum;
    }

    /**
     * Print the Sweet's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        //System.out.printf(" Tipo di dolce: %s%n",dolciTypeEnum);
        System.out.printf(" Tipo di desert: %s" +
                        " E un congelato: %s" +
                        "E per alergenici: %s"+
                        "e per celiaci: %s "+
                "quantita :%s ",
                dolciTypeEnum,
                isCongelato,
                isPerAlergici,
                isPerCeliaci,
                quantita

                );

    }

    public Double getQuantita() {
        return quantita;
    }

    public void setQuantita(Double quantita) {
        this.quantita = quantita;
    }
}