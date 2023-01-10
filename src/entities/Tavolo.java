package entities;

import enumerations.TavoloPositionEnum;

/**
 * @author Marco Setaro
 */
public class Tavolo {

    private Integer numeroDelTavolo;
    private Integer numeroDiPostiASedere;
    private TavoloPositionEnum posizioneEnum;
    private boolean isPrenotato;

    /**
     * Constructor method of the table
     * @param numeroDiPostiASedere the number of seats of the table
     * @param posizioneEnum the position of the table
     * @param isPrenotato the status of the ordination of the table
     */
    public Tavolo(Integer numeroDelTavolo,Integer numeroDiPostiASedere, TavoloPositionEnum posizioneEnum, boolean isPrenotato){
        this.numeroDelTavolo = numeroDelTavolo;
        this.numeroDiPostiASedere = numeroDiPostiASedere;
        this.posizioneEnum = posizioneEnum;
        this.isPrenotato = isPrenotato;
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

    public boolean isPrenotato() {
        return isPrenotato;
    }

    public void setPrenotato(boolean prenotato) {
        isPrenotato = prenotato;
    }

    public Integer getNumeroDelTavolo() {
        return numeroDelTavolo;
    }

    public void setNumeroDelTavolo(Integer numeroDelTavolo) {
        this.numeroDelTavolo = numeroDelTavolo;
    }

    /**
     * Prints the details of the table
     */

    public void printTavoloDetails(){
        System.out.printf("Numero del tavolo: %d Numero di posti a sedere: %d Posizione: %s Stato della prenotazione: %s%n",
                numeroDelTavolo,
                numeroDiPostiASedere,
                posizioneEnum,
                isPrenotato);
    }
}
