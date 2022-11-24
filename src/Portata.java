public abstract class Portata {

    private String name;
    private double priceEuros;

    public Portata(String name, double priceEuros){
        this.setName(name);
        this.setPriceEuros(priceEuros);
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

    public abstract String printPortataDetails();
}
