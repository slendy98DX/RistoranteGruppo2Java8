package entities;

import enumerations.TemperaturaPiattoEnum;
import enumerations.TypeEnum;

/**
 * @author Michele Cioffo
 */
public class PrimoPiatto extends Portata{
    private TemperaturaPiattoEnum temperaturaPiattoEnum;

    /**
     * Costructor method for FirstPlate
     * @param name the name of the dish
     * @param priceEuros price of the dish
     * @param ingredients of the dish
     * @param portataTypeEnum the type of the dish
     * @param temperaturaPiattoEnum the temperature of the dish
     */
    public PrimoPiatto(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum, TemperaturaPiattoEnum temperaturaPiattoEnum) {
        super(name, priceEuros, ingredients, portataTypeEnum);
        this.temperaturaPiattoEnum = temperaturaPiattoEnum;
    }
    public TemperaturaPiattoEnum getTemperaturaPiattoEnum() {
        return temperaturaPiattoEnum;
    }

    public void setTemperaturaPiattoEnum(TemperaturaPiattoEnum temperaturaPiattoEnum) {
        this.temperaturaPiattoEnum = temperaturaPiattoEnum;
    }

    /**
     * Prints the First Plate's details
     */
    @Override
    public void printPortataDetails() {
        super.printPortataDetails();
        System.out.printf(" Temperatura del piatto: %s%n",getTemperaturaPiattoEnum());
    }
}


