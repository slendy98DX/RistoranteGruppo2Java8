package entities;

import entities.enumerations.TemperaturaPiattoEnum;
import entities.enumerations.TypeEnum;

/**
 * @author Alessio Pollina
 */
public class SecondoPiatto extends Portata {
    private String sideDish;


    private TemperaturaPiattoEnum temperaturaPiattoEnum;

    /**
     * Constructor method of the Second Plate
     * @param name the name of the Second Plate
     * @param priceEuros the price of the Second Plate
     * @param ingredients the ingridients of the Second Plate
     * @param portataTypeEnum the type of the Second Plate
     * @param sideDish the sideDish of the Second Plate
     * @param temperaturaPiattoEnum temperature of the Second Plate
     */
    public SecondoPiatto(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, String sideDish, TemperaturaPiattoEnum temperaturaPiattoEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.sideDish = sideDish;
        this.temperaturaPiattoEnum = temperaturaPiattoEnum;
    }


    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public TemperaturaPiattoEnum getTemperaturaPiattoEnum() {
        return temperaturaPiattoEnum;
    }

    public void setTemperaturaPiattoEnum(TemperaturaPiattoEnum temperaturaPiattoEnum) {
        this.temperaturaPiattoEnum = temperaturaPiattoEnum;
    }


    /**
     * Prints the Second Plate's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        System.out.printf(" Contorni: %s Temperatura del Piatto: %s%n", getSideDish(), getTemperaturaPiattoEnum());
    }
}



