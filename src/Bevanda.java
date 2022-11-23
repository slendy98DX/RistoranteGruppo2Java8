public class Bevanda extends Portata{

    public Bevanda(String name, double priceEuros) {
        super(name, priceEuros);
    }

    @Override
    public void printPortataDetails() {
        System.out.printf("Nome: %s Prezzo: %.2f€%n", getName(), getPriceEuros());
    }
}
