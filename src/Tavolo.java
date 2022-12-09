public class Tavolo {
    private int numeroDelTavolo;
    private int numeroDiPostiASedere;
    private TavoloTypeEnum posizione;
    private TavoloTypeEnum statoDellaPrenotazione;

    public Tavolo(int numeroDelTavolo, int numeroDiPostiASedere, TavoloTypeEnum posizione, TavoloTypeEnum statoDellaPrenotazione){
        this.numeroDelTavolo = numeroDelTavolo;
        this.numeroDiPostiASedere = numeroDiPostiASedere;
        this.posizione = posizione;
        this.statoDellaPrenotazione = statoDellaPrenotazione;
    }

    public int getNumeroDelTavolo() {
        return numeroDelTavolo;
    }

    public void setNumeroDelTavolo(int numeroDelTavolo) {
        this.numeroDelTavolo = numeroDelTavolo;
    }

    public int getNumeroDiPostiASedere() {
        return numeroDiPostiASedere;
    }

    public void setNumeroDiPostiASedere(int numeroDiPostiASedere) {
        this.numeroDiPostiASedere = numeroDiPostiASedere;
    }

    public TavoloTypeEnum getPosizione() {
        return posizione;
    }

    public void setPosizione(TavoloTypeEnum posizione) {
        this.posizione = posizione;
    }

    public TavoloTypeEnum getStatoDellaPrenotazione() {
        return statoDellaPrenotazione;
    }

    public void setStatoDellaPrenotazione(TavoloTypeEnum statoDellaPrenotazione) {
        this.statoDellaPrenotazione = statoDellaPrenotazione;
    }

    public void printTavoloDetails(){
        System.out.printf("Numero di Tavolo: %d Numero di posti a sedere: %d Posizione: %s Stato della prenotazione: %s",getNumeroDelTavolo(),getNumeroDiPostiASedere(),getPosizione(),getStatoDellaPrenotazione());
    }
}
