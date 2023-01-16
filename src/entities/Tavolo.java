package entities;

import enumerations.TavoloPositionEnum;

/**
 * @author Marco Setaro
 */
public class Tavolo {

    private Integer numeroDelTavolo;
    private TavoloPositionEnum posizioneEnum;

    /**
     * Constructor method for the tavolo object
     * @param numeroDelTavolo the number of the table
     * @param posizioneEnum the position of the table
     */
    public Tavolo(Integer numeroDelTavolo,TavoloPositionEnum posizioneEnum){
        this.numeroDelTavolo = numeroDelTavolo;
        this.posizioneEnum = posizioneEnum;
    }

    public TavoloPositionEnum getPosizioneEnum() {
        return posizioneEnum;
    }

    public void setPosizioneEnum(TavoloPositionEnum posizioneEnum) {
        this.posizioneEnum = posizioneEnum;
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
        System.out.printf("Numero del tavolo: %d Posizione: %s%n",
                numeroDelTavolo,
                posizioneEnum);
    }
}
