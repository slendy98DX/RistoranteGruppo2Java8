public class Bevanda extends Portata{

    public Bevanda(String name, double priceEuros) {
        super(name, priceEuros);
    }

    @Override
    public String printPortataDetails() {
        return String.format("Nome: %s Prezzo: %.2f€", getName(), getPriceEuros());
    }
}
