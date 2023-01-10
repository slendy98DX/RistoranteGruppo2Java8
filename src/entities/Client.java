    package entities;
    import enumerations.TypeEnum;

    /**
     * @author Alessio Pollina
     *
     */

    public class Client {

            private String name;
            private String surname;
            private String phoneNumber;
            private TypeEnum typeEnum;
            private String email;

        /**
         * Constructor method customer class
         * @param name customer name
         * @param surname customer family name
         * @param phoneNumber customer telephone number
         * @param typeEnum customer preferred menu
         * @param email customer e-mail
         */
            public Client(String name, String surname, String phoneNumber, TypeEnum typeEnum,String email) {
                this.name = name;
                this.surname = surname;
                this.phoneNumber =phoneNumber;
                this.typeEnum = typeEnum;
                this.email=email;
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

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
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

        public void printClientDetails(){
            System.out.printf("Nome: %s" +
                            " Cognome: %s" +
                            " PhoneNumber: %s" +
                            " Email: %s%n"
                    ,name
                    ,surname
                    ,phoneNumber
                    ,email);
        }
}

