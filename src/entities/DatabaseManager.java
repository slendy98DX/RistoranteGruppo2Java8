package entities;

import java.sql.*;

public class DatabaseManager {

    public DatabaseManager() {}

    /**
     * This method creates a schema to the server if not exists
     */
    public void createSchema() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE SCHEMA IF NOT EXISTS `ristorante_progetto` DEFAULT CHARACTER SET utf8 ;";
            statement.executeUpdate(varname1);
            System.out.println("Schema creato correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableRistorante() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`ristorante` ( "
                    + "  `id_ristorante` INT NULL DEFAULT NULL, "
                    + "  `nome_ristorante` VARCHAR(64) NOT NULL, "
                    + "  `indirizzo` VARCHAR(64) NOT NULL, "
                    + "  `tipi_di_menu` VARCHAR(64) NOT NULL, "
                    + "  `capienza_massima_tavoli` INT NOT NULL, "
                    + "  `prezzo_medio` DECIMAL NOT NULL, "
                    + "  `stile` VARCHAR(64) NOT NULL, "
                    + "  PRIMARY KEY (`id_ristorante`)) "
                    + "ENGINE = InnoDB;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesRistorante(Ristorante ristorante) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.ristorante "
                    + "(nome_ristorante, indirizzo, tipi_di_menu, capienza_massima_tavoli, prezzo_medio, stile) "
                    + "VALUES(?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,ristorante.getRestaurantName());
            preparedStatement.setString(2,ristorante.getAddress());
            preparedStatement.setString(3,ristorante.getMenuType().name());
            preparedStatement.setInt(4,ristorante.getCapienzaTavoliMassima());
            preparedStatement.setDouble(5,ristorante.getPrezzoMedio());
            preparedStatement.setString(6,ristorante.getStile());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method drops the table
     */
    public void deleteTableRistorante() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`ristorante`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableRistorante() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.ristorante;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nome_ristorante"));
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableCliente() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`cliente` ( "
                    + "  `id_cliente` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_cliente` VARCHAR(64) NOT NULL, "
                    + "  `cognome_cliente` VARCHAR(64) NOT NULL, "
                    + "  `email` VARCHAR(64) NOT NULL, "
                    + "  `preferred_menu` ENUM('CARNE', 'PESCE', 'VEGANO', 'MISTO') NOT NULL, "
                    + "  `tavolo_numero_tavolo` INT, "
                    + "  PRIMARY KEY (`id_cliente`), "
                    + "  INDEX `fk_cliente_tavolo1_idx` (`tavolo_numero_tavolo` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_cliente_tavolo1` "
                    + "    FOREIGN KEY (`tavolo_numero_tavolo`) "
                    + "    REFERENCES `ristorante_progetto`.`tavolo` (`numero_tavolo`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */

    public void insertValuesCliente(Client client) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO `ristorante_progetto`.`cliente` "
                    + "(nome_cliente, cognome_cliente, email, preferred_menu)"
                    + "VALUES(?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,client.getName());
            preparedStatement.setString(2,client.getSurname());
            preparedStatement.setString(3,client.getEmail());
            preparedStatement.setString(4,client.getTypeEnum().name());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method delete data in the table
     */


    public void deleteTableCliente() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DELETE * FROM `ristorante_progetto`.`cliente` ";
                        statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableCliente() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT `cliente`.`id_cliente`, "
                    + "    `cliente`.`nome_cliente`, "
                    + "    `cliente`.`surname_cliente`, "
                    + "    `cliente`.`email`, "
                    + "    `cliente`.`prenotazione_id_prenotazione`, "
                    + "    `cliente`.`tavolo_numero_tavolo` "
                    + "FROM `ristorante_progetto`.`cliente`;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(""));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableMenu() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`menu` ( "
                    + "  `id_menu` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_chef` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_medio` DECIMAL NOT NULL, "
                    + "  `tipo_portata` VARCHAR(64) NOT NULL, "
                    + "  PRIMARY KEY (`id_menu`)) "
                    + "ENGINE = InnoDB;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesMenu(Menu menu) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.menu "
                    + "(nome_chef, prezzo_medio, tipo_portata) "
                    + "VALUES(?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1, menu.getChefName());
            preparedStatement.setDouble(2, menu.getAveragePrice());
            preparedStatement.setString(3, menu.getTypeEnum().name());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method drops the table
     */
    public void deleteTablePortata() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`portata`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTablePortata() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.portata;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(""));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableBevanda() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`bevanda` ( "
                    + "  `id_bevanda` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_bevanda` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_bevanda` DECIMAL NOT NULL, "
                    + "  `ingredienti` VARCHAR(45) NOT NULL, "
                    + "  `tipo_bevanda_menu` VARCHAR(64) NOT NULL, "
                    + "  `tipo_bevanda` VARCHAR(64) NOT NULL, "
                    + "  `menu_id_menu` INT, "
                    + "  PRIMARY KEY (`id_bevanda`), "
                    + "  INDEX `fk_bevanda_menu1_idx` (`menu_id_menu` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_bevanda_menu1` "
                    + "    FOREIGN KEY (`menu_id_menu`) "
                    + "    REFERENCES `ristorante_progetto`.`menu` (`id_menu`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION) "
                    + "ENGINE = InnoDB;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesBevanda(Bevanda bevanda) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.bevanda "
                    + "(nome_bevanda,prezzo_bevanda,ingredienti,tipo_bevanda_menu,tipo_bevanda) "
                    + "VALUES(?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,bevanda.getName());
            preparedStatement.setDouble(2,bevanda.getPriceEuros());
            preparedStatement.setString(3,bevanda.getIngredients());
            preparedStatement.setString(4,bevanda.getPortataTypeEnum().name());
            preparedStatement.setString(5,bevanda.getTipoDiBevandaEnum().name());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method drops the table
     */
    public void deleteTableBevanda() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`ristorante`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableBevanda() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.ristorante;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nome_ristorante"));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createTablePrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`primo_piatto` ( "
                    + "  `id_primo_piatto` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_primo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_primo_piatto` DECIMAL NOT NULL, "
                    + "  `ingredienti_primo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `tipo_primo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `menu_id_menu` INT , "
                    + "  PRIMARY KEY (`id_primo_piatto`), "
                    + "  INDEX `fk_primo_piatto_portata1_idx` (`menu_id_menu` ASC) VISIBLE, "
                    + "  INDEX `fk_primo_piatto_menu1_idx` (`menu_id_menu` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_primo_piatto_menu1` "
                    + "    FOREIGN KEY (`menu_id_menu`) "
                    + "    REFERENCES `ristorante_progetto`.`menu` (`id_menu`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION) "
                    + "ENGINE = InnoDB;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertValuesPrimoPiatto(PrimoPiatto primoPiatto) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.primo_piatto "
                    + "(nome_primo_piatto, prezzo_primo_piatto, ingredienti_primo_piatto,tipo_primo_piatto) "
                    + "VALUES(?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,primoPiatto.getName());
            preparedStatement.setDouble(2,primoPiatto.getPriceEuros());
            preparedStatement.setString(3,primoPiatto.getIngredients());
            preparedStatement.setString(4,primoPiatto.getPortataTypeEnum().name());
            preparedStatement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTablePrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`primoPiatto`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readTablePrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.primo_piatto;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nome_primo_piatto"));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableSecondoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`secondo_piatto` ( "
                    + "  `id_secondo_piatto` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_secondo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_secondo_piatto` DECIMAL NOT NULL, "
                    + "  `ingredienti_secondo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `tipo_secondo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `contorno` VARCHAR(64) NOT NULL, "
                    + "  `cottura` VARCHAR(64) NOT NULL, "
                    + "  `menu_id_menu` INT, "
                    + "  PRIMARY KEY (`id_secondo_piatto`), "
                    + "  INDEX `fk_secondo_piatto_menu1_idx` (`menu_id_menu` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_secondo_piatto_menu1` "
                    + "    FOREIGN KEY (`menu_id_menu`) "
                    + "    REFERENCES `ristorante_progetto`.`menu` (`id_menu`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION) "
                    + "ENGINE = InnoDB;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesSecondoPiatto(SecondoPiatto secondoPiatto) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.secondo_piatto "
                    + "(nome_secondo_piatto, prezzo_secondo_piatto, ingredienti_secondo_piatto," +
                    " tipo_secondo_piatto, contorno, cottura) "
                    + "VALUES(?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,secondoPiatto.getName());
            preparedStatement.setDouble(2,secondoPiatto.getPriceEuros());
            preparedStatement.setString(3,secondoPiatto.getIngredients());
            preparedStatement.setString(4,secondoPiatto.getPortataTypeEnum().name());
            preparedStatement.setString(5,secondoPiatto.getSideDish());
            preparedStatement.setString(6,secondoPiatto.getCotturaTypeEnum().name());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method drops the table
     */
    public void deleteTableSecondoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`secondo_piatto`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableSecondoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.secondo_piatto;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(""));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableDolce() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`dolce` ( "
                    + "  `id_dolce` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_dolce` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_dolce` DECIMAL NOT NULL, "
                    + "  `ingredienti` VARCHAR(64) NOT NULL, "
                    + "  `tipo_dolce` VARCHAR(64) NOT NULL, "
                    + "  `menu_id_menu` INT, "
                    + "  PRIMARY KEY (`id_dolce`), "
                    + "  INDEX `fk_dolce_menu1_idx` (`menu_id_menu` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_dolce_menu1` "
                    + "    FOREIGN KEY (`menu_id_menu`) "
                    + "    REFERENCES `ristorante_progetto`.`menu` (`id_menu`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION) "
                    + "ENGINE = InnoDB;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesDolce(Dolci dolci) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.dolce"
                    + "(nome_dolce, prezzo_dolce, ingredienti, tipo_dolce)"
                    + "VALUES(?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,dolci.getName());
            preparedStatement.setDouble(2,dolci.getPriceEuros());
            preparedStatement.setString(3,dolci.getIngredients());
            preparedStatement.setString(4,dolci.getPortataTypeEnum().name());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method drops the table
     */
    public void deleteTableDolce() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`dolce`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableDolce() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.dolce;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ingredienti"));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a table into the schema if not exists
     */
    public void createTableTavolo() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`tavolo` ( "
                    + "  `id_tavolo` INT NOT NULL AUTO_INCREMENT, "
                    + "  `numero_tavolo` INT NOT NULL, "
                    + "  `posizione_tavolo` ENUM('Esterno_Terrazzo', 'Esterno_Vista_Mare', 'Esterno_Giardino', 'Interno') NOT NULL, "
                    + "  `ristorante_id_ristorante` INT, "
                    + "  PRIMARY KEY (`numero_tavolo`), "
                    + "  INDEX `fk_tavolo_ristorante1_idx` (`ristorante_id_ristorante` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_tavolo_ristorante1` "
                    + "    FOREIGN KEY (`ristorante_id_ristorante`) "
                    + "    REFERENCES `ristorante_progetto`.`ristorante` (`id_ristorante`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesTavolo(Tavolo tavolo) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.tavolo"
                    + "(numero_tavolo,posizione_tavolo)"
                    + "VALUES(?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setInt(1,tavolo.getNumeroDelTavolo());
            preparedStatement.setString(2,tavolo.getPosizioneEnum().name());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method drops the table
     */
    public void deleteTableTavolo() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`tavolo`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableTavolo() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.tavolo;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(""));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a table into the schema if not exists
     */
    public void createTablePrenotazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`prenotazione` ( "
                    + "  `id_prenotazione` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nominativo` VARCHAR(64) NOT NULL, "
                    + "  `contactinfo` VARCHAR(64) NOT NULL, "
                    + "  `data_prenotazione` DATE, "
                    + "  `ristorante_id_ristorante` INT, "
                    + "  `cliente_id_cliente` INT, "
                    + "  PRIMARY KEY (`id_prenotazione`), "
                    + "  INDEX `fk_prenotazione_ristorante1_idx` (`ristorante_id_ristorante` ASC) VISIBLE, "
                    + "  INDEX `fk_prenotazione_cliente1_idx` (`cliente_id_cliente` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_prenotazione_ristorante1` "
                    + "    FOREIGN KEY (`ristorante_id_ristorante`) "
                    + "    REFERENCES `ristorante_progetto`.`ristorante` (`id_ristorante`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION, "
                    + "  CONSTRAINT `fk_prenotazione_cliente1` "
                    + "    FOREIGN KEY (`cliente_id_cliente`) "
                    + "    REFERENCES `ristorante_progetto`.`cliente` (`id_cliente`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * This method inserts values into the rows of the table
     */


    public void insertValuesPrenotazione(Prenotazione prenotazione) {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String varname1 = ""
                    + "INSERT INTO `ristorante_progetto`.`prenotazione` "
                    + "(nominativo, contactinfo) "
                    + "VALUES(?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(varname1);
            preparedStatement.setString(1,prenotazione.getNominativo());
            preparedStatement.setString(2,prenotazione.getContactInfo());
            preparedStatement.executeUpdate();
            System.out.println("Dati inseriti correttamente");
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method delete data in the table
     */


    public void deleteTablePrenotazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`prenotazione` ";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTablePrenotazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT `prenotazione`.`id_prenotazione`, "
                    + "    `prenotazione`.`data_prenotazione`, "
                    + "    `prenotazione`.`data_prenotata_`, "
                    + "    `prenotazione`.`cliente_id_cliente`, "
                    + "    `prenotazione`.`ristorante_id_ristorante` "
                    + "FROM `ristorante_progetto`.`prenotazione`;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(""));
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


