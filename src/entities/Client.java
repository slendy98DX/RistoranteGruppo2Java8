package entities;

import enumerations.TypeEnum;

/**
 * @author Alessio Pollina
 */
public class Client {

    private String name;
    private String surname;
    private TypeEnum typeEnum;
    private String email;

    /**
     * Constructor method customer class
     *
     * @param name     customer name
     * @param surname  customer family name
     * @param typeEnum customer preferred menu
     * @param email    customer e-mail
     */
    public Client(String name, String surname, TypeEnum typeEnum, String email) {
        this.name = name;
        this.surname = surname;
        this.typeEnum = typeEnum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printClientDetails() {
        System.out.printf("Nome: %s" +
                        " Cognome: %s" +
                        " Email: %s%n"
                , name
                , surname
                , email);
    }
}

