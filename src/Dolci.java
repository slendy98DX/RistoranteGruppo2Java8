/**
 * @author Maria Coman
 */
public class Dolci extends Portata {


    private DolciTypeEnum dolciTypeEnum;

    /**
     *
     * @param name name of the Sweets
     * @param priceEuros price of the Sweets
     * @param ingredients ingredients of the Sweets
     * @param portataTypeEnum the type of the Sweets
     * @param dolciTypeEnum the type of the Sweets
     */
    public Dolci(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum,DolciTypeEnum dolciTypeEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
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
        System.out.printf(" Tipo di dolce: %s%n",getDolciTypeEnum());
    }
}