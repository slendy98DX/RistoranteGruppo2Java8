public abstract class Portata {

    //TODO questa classe non può essere abstract ----> perchè quando farete le liste lo capirete
    private String name;
    private double priceEuros;

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

    public abstract String printPortataDetails();
}
