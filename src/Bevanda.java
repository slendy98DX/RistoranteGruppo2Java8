public class Bevanda extends Portata{
    private boolean isAlcoolic;

    public Bevanda(String name, boolean isHot, double priceEuros, boolean isAlcoolic) {
        super(name, isHot, priceEuros);
        this.isAlcoolic = isAlcoolic;
    }



}
