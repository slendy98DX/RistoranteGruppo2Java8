public class Menu {

    private String restaurantName;
    private String type;


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printRestaurantDetails(){
        System.out.printf("Nome ristorante: %s%nTipo di menù: %s%n",getRestaurantName(),getType());
    }
}
