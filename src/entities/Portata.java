package entities;

import enumerations.TypeEnum;

/**
 * @author Marco Setaro
 */
public class Portata {

    private String name;
    private Double priceEuros;
    private String ingredients;
    private TypeEnum portataTypeEnum;

    /**
     * Constructor method of the dish
     *
     * @param name            the name of the dish
     * @param priceEuros      the price of the dish
     * @param ingredients     the ingridients of dish
     * @param portataTypeEnum the type of the dish
     */
    public Portata(String name, Double priceEuros, String ingredients, TypeEnum portataTypeEnum) {
        this.name = name;
        this.priceEuros = priceEuros;
        this.ingredients = ingredients;
        this.portataTypeEnum = portataTypeEnum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceEuros() {
        return priceEuros;
    }

    public void setPriceEuros(Double priceEuros) {
        this.priceEuros = priceEuros;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public TypeEnum getPortataTypeEnum() {
        return portataTypeEnum;
    }

    public void setPortataTypeEnum(TypeEnum portataTypeEnum) {
        this.portataTypeEnum = portataTypeEnum;
    }


    /**
     * This method prints the dish's details
     */

    public void printPortataDetails() {
        System.out.printf("%n \u277D Nome: %s" +
                        " Prezzo: %.2f €" +
                        " Ingredienti: %s" +
                        " Tipo di menù: %s%n"
                , name
                , priceEuros
                , ingredients
                , portataTypeEnum);
    }
}
