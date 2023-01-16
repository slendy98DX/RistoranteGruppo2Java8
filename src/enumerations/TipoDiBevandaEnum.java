package enumerations;

/**
 * @author Marco Setaro
 * The enumeration of the type of the beverage
 */
public enum TipoDiBevandaEnum {
    VINO(75.0, 12.0),
    BIRRA(66.0, 5.1),
    LIQUORE(0.4, 17.0),
    COLA(100.0, 0.0);
    private Double gradazioneAlcolica;
    private Double quantità;

    TipoDiBevandaEnum(Double quantità, Double gradazioneAlcolica) {
        this.quantità = quantità;
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public Double getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(Double gradazioneAlcolica) {
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public Double getQuantità() {
        return quantità;
    }

    public void setQuantità(Double quantità) {
        this.quantità = quantità;
    }

    @Override
    public String toString() {
        return "TipoDiBevandaEnum{" +
                "gradazioneAlcolica=" + gradazioneAlcolica + "%" +
                ", quantità=" + quantità + "cl" +
                '}';
    }
}
