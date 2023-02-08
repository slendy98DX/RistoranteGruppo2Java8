package entities;

import enumerations.TypeEnum;

public class Menu {
    private String chefName;
    private double averagePrice;
    private TypeEnum typeEnum;

    public Menu(String chefName, double averagePrice, TypeEnum typeEnum) {
        this.chefName = chefName;
        this.averagePrice = averagePrice;
        this.typeEnum = typeEnum;
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }
}
