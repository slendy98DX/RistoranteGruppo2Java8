package entities;

/**
 * @author Marco Setaro
 */
public class Tavolo {
    public Integer numeroDelTavolo;
    private Integer numeroDiPostiASedere;
    private TavoloPositionEnum posizioneEnum;
    private TavoloStatusEnum statoDellaPrenotazioneEnum;

    /**
     * Constructor method of the table
     * @param numeroDelTavolo the number of the table
     * @param numeroDiPostiASedere the number of seats of the table
     * @param posizioneEnum the position of the table
     * @param statoDellaPrenotazioneEnum the status of the ordination of the table
     */
    public Tavolo(Integer numeroDelTavolo, Integer numeroDiPostiASedere, TavoloPositionEnum posizioneEnum, TavoloStatusEnum statoDellaPrenotazioneEnum){
        this.numeroDelTavolo = numeroDelTavolo;
        this.numeroDiPostiASedere = numeroDiPostiASedere;
        this.posizioneEnum = posizioneEnum;
        this.statoDellaPrenotazioneEnum = statoDellaPrenotazioneEnum;
    }

    public Integer getNumeroDelTavolo() {
        return numeroDelTavolo;
    }

    public void setNumeroDelTavolo(Integer numeroDelTavolo) {
        this.numeroDelTavolo = numeroDelTavolo;
    }

    public Integer getNumeroDiPostiASedere() {
        return numeroDiPostiASedere;
    }

    public void setNumeroDiPostiASedere(Integer numeroDiPostiASedere) {
        this.numeroDiPostiASedere = numeroDiPostiASedere;
    }

    public TavoloPositionEnum getPosizioneEnum() {
        return posizioneEnum;
    }

    public void setPosizioneEnum(TavoloPositionEnum posizioneEnum) {
        this.posizioneEnum = posizioneEnum;
    }

    public TavoloStatusEnum getStatoDellaPrenotazioneEnum() {
        return statoDellaPrenotazioneEnum;
    }

    public void setStatoDellaPrenotazioneEnum(TavoloStatusEnum statoDellaPrenotazioneEnum) {
        this.statoDellaPrenotazioneEnum = statoDellaPrenotazioneEnum;
    }

    /**
     * Prints the details of the table
     */
    public void printTavoloDetails(){
        System.out.printf("Numero di entities.Tavolo: %d Numero di posti a sedere: %d Posizione: %s Stato della prenotazione: %s%n",getNumeroDelTavolo(),getNumeroDiPostiASedere(),getPosizioneEnum(),getStatoDellaPrenotazioneEnum());
    }
}
