
package entities;

import java.util.Random;

/**
 * @author Marco Setaro
 */

public class Prenotazione {
    private String id;
    private String nominativo;
    private String contactInfo;

    /**
     * This constructor method builds the booking
     * @param client The data of the Client
     */

    public Prenotazione(Client client){
        this.nominativo = client.getName() + " " + client.getSurname();
        this.contactInfo = "Numero di telefono: "+client.getPhoneNumber()+" Email: "+client.getEmail();
        this.id = generateID();
    }

    /**
     * This method generate id for the booking
     * @return id for the booking
     */

    public String generateID(){
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] id = new char[7];
        Random rand = new Random();
        int index;
        for(int i = 0; i < 7; i++){
            index = rand.nextInt(s.length());
            id[i] = s.charAt(index);
        }
        return String.valueOf(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void printPrenotazioneDetails(){
        System.out.printf("Nominativo: %s" +
                        " Contact Info: %s" +
                        " Id: %s%n"
                ,nominativo
                ,contactInfo
                ,id);
    }
}
