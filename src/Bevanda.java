public class Bevanda extends Portata implements IBevanda {
    boolean isAlcoolic;

    public Bevanda(String name, boolean isHot, double priceEuros, boolean isAlcoolic) {
        super(name, isHot, priceEuros);
        this.isAlcoolic = isAlcoolic;
    }

    @Override
    public String printName() {
        return name;
    }

    @Override
    public double printPrice() {
        return priceEuros;
    }
}
