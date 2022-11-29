public class Portata{

    private String name;
    private double priceEuros;
    private String ingridients;

    public Portata(String name, double priceEuros, String ingridients){
        this.name = name;
        this.priceEuros = priceEuros;
        this.ingridients = ingridients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceEuros() {
        return priceEuros;
    }

    public void setPriceEuros(double priceEuros) {
        this.priceEuros = priceEuros;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public String printPortataDetails(){
        return "Print portata details";
    };
}
