package entities;

import enumerations.TavoloPositionEnum;

/**
 * @author Marco Setaro
 */
public class Tavolo {

    private Integer numeroDiPostiASedere;
    private TavoloPositionEnum posizioneEnum;
    private Boolean èPrenotato;

    /**
     * Constructor method of the table
     * @param numeroDiPostiASedere the number of seats of the table
     * @param posizioneEnum the position of the table
     * @param èPrenotato the status of the ordination of the table
     */
    public Tavolo(Integer numeroDiPostiASedere, TavoloPositionEnum posizioneEnum, Boolean èPrenotato){
        this.numeroDiPostiASedere = numeroDiPostiASedere;
        this.posizioneEnum = posizioneEnum;
        this.èPrenotato = èPrenotato;
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

    public Boolean getèPrenotato() {
        return èPrenotato;
    }

    public void setèPrenotato(Boolean èPrenotato) {
        this.èPrenotato = èPrenotato;
    }

    /**
     * Prints the details of the table
     */

    public void printTavoloDetails(){
        System.out.printf("Numero di posti a sedere:" +
                            " %d Posizione: " +
                            "%s Stato della prenotazione: %s%n",
                            numeroDiPostiASedere,
                            posizioneEnum,
                èPrenotato);
    }
}
