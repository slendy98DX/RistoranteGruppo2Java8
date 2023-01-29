package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {

    public DatabaseManager() {}

    /**
     * This method creates a schema to the server if not exists
     */
    public void createSchema() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE SCHEMA IF NOT EXISTS `ristorante_progetto` DEFAULT CHARACTER SET utf8 ;";
            statement.executeUpdate(varname1);
            System.out.println("Schema creato correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`ristorante` ( "
                    + "  `id_ristorante` INT NOT NULL, "
                    + "  `nome_ristorante` VARCHAR(64) NOT NULL, "
                    + "  `indirizzo` VARCHAR(64) NOT NULL, "
                    + "  `tipi_di_menu` ENUM('carne', 'pesce', 'vegano', 'misto') NOT NULL, "
                    + "  PRIMARY KEY (`id_ristorante`))";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesRistorante() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.ristorante "
                    + "(id_ristorante, nome_ristorante, indirizzo, tipi_di_menu) "
                    + "VALUES(1, 'Palla 8', 'Via Roma 1', 'carne');";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`ristorante`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String varname1 = ""
                    + "CREATE TABLE `cliente` ( "
                    + "  `id_cliente` int NOT NULL AUTO_INCREMENT, "
                    + "  `nome_cliente` varchar(45) NOT NULL, "
                    + "  `surname_cliente` varchar(64) NOT NULL, "
                    + "  `email` varchar(64) NOT NULL, "
                    + "  `prenotazione_id_prenotazione` int NOT NULL, "
                    + "  `tavolo_numero_tavolo` int NOT NULL, "
                    + "  PRIMARY KEY (`id_cliente`), "
                    + "  KEY `fk_cliente_tavolo1_idx` (`tavolo_numero_tavolo`), "
                    + "  CONSTRAINT `fk_cliente_tavolo1` FOREIGN KEY (`tavolo_numero_tavolo`) REFERENCES `tavolo` (`numero_tavolo`) "
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;";

            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */

    public void insertTableCliente() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO `ristorante_progetto`.`cliente` "
                    + "(`id_cliente`, "
                    + "`nome_cliente`, "
                    + "`surname_cliente`, "
                    + "`email`, "
                    + "`prenotazione_id_prenotazione`, "
                    + "`tavolo_numero_tavolo`) "
                    + "VALUES "
                    + "(<{id_cliente: }>, "
                    + "<{nome_cliente: }>, "
                    + "<{surname_cliente: }>, "
                    + "<{email: }>, "
                    + "<{prenotazione_id_prenotazione: }>, "
                    + "<{tavolo_numero_tavolo: }>);";

            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DELETE * FROM `ristorante_progetto`.`cliente` ";
                        statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    /**
     * This method creates a table into the schema if not exists
     */
    public void createTablePortata() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`portata` ( "
                    + "  `id_portata` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome` VARCHAR(64) NOT NULL, "
                    + "  `prezzo` DECIMAL NOT NULL, "
                    + "  `ingredienti` VARCHAR(64) NOT NULL, "
                    + "  `tipo_portata` ENUM('Carne', 'Pesce', 'Vegano', 'Misto') NOT NULL, "
                    + "  PRIMARY KEY (`id_portata`))";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesPortata() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.portata "
                    + "(id_portata, nome, prezzo, ingredienti, tipo_portata) "
                    + "VALUES();";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`portata`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`bevanda` ( "
                    + "  `id_bevanda` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_bevanda` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_bevanda` DECIMAL NOT NULL, "
                    + "  `ingredienti` VARCHAR(45) NOT NULL, "
                    + "  `tipo_bevanda_menu` ENUM('CARNE', 'PESCE', 'VEGANO', 'MISTO') NOT NULL, "
                    + "  `tipo_bevanda` ENUM('COLA', 'LIQUORE', 'ACQUA', 'BIRRA') NOT NULL, "
                    + "  `portata_id_portata` INT NOT NULL, "
                    + "  PRIMARY KEY (`id_bevanda`), "
                    + "  INDEX `fk_bevanda_portata1_idx` (`portata_id_portata` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_bevanda_portata1` "
                    + "    FOREIGN KEY (`portata_id_portata`) "
                    + "    REFERENCES `ristorante_progetto`.`portata` (`id_portata`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesBevanda() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.bevanda "
                    + "(id_ristorante, nome_ristorante, indirizzo, tipi_di_menu) "
                    + "VALUES(1, 'Palla 8', 'Via Roma 1', 'carne');";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`ristorante`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createTablePrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""

                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`primo_piatto` ( "
                    + "  `id_primo_piatto` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_primo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_primo_piatto` DECIMAL NOT NULL, "
                    + "  `ingredienti_primo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `tipo_primo_piatto` ENUM('Carne', 'Pesce', 'Vegano', 'Misto') NOT NULL, "
                    + "  `portata_id_portata` INT,"
                    + "  PRIMARY KEY (`id_primo_piatto`),"
                    + "  INDEX `fk_primo_piatto_portata1_idx` (`portata_id_portata` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_primo_piatto_portata1` "
                    + "    FOREIGN KEY (`portata_id_portata`) "
                    + "    REFERENCES `ristorante_progetto`.`portata` (`id_portata`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertValuesPrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.primo_piatto "
                    + "(id_primo_piatto, nome_primo_piatto, prezzo_primo_piatto, ingredienti_primo_piatto,tipo_primo_piatto) "
                    + "VALUES(1, 'Risotto Funghi e Salsiccia', '13.3', 'riso,salsiccia,funghi','carne');";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTablePrimoPiatto() {
        String url = "";
        String user = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`primoPiatto`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readTablePrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`secondo_piatto` ( "
                    + "  `id_secondo_piatto` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_secondo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_secondo_piatto` DECIMAL NOT NULL, "
                    + "  `ingredienti_secondo_piatto` VARCHAR(64) NOT NULL, "
                    + "  `tipo_secondo_piatto` ENUM('carne', 'pesce', 'vegano', 'misto') NOT NULL, "
                    + "  `contorno` VARCHAR(64) NOT NULL, "
                    + "  `cottura` ENUM('al_sangue', 'media', 'ben_cotta') NOT NULL, "
                    + "  `portata_id_portata` INT, "
                    + "  PRIMARY KEY (`id_secondo_piatto`), "
                    + "  INDEX `fk_secondo_piatto_portata1_idx` (`portata_id_portata` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_secondo_piatto_portata1` "
                    + "    FOREIGN KEY (`portata_id_portata`) "
                    + "    REFERENCES `ristorante_progetto`.`portata` (`id_portata`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesSecondoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.secondo_piatto "
                    + "(id_secondo_piatto, nome_secondo_piatto, prezzo_secondo_piatto, ingredienti_secondo_piatto," +
                    " tipo_secondo_piatto, contorno, cottura) "
                    + "VALUES();";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`secondo_piatto`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`dolce` ( "
                    + "  `id_dolce` INT NOT NULL AUTO_INCREMENT, "
                    + "  `nome_dolce` VARCHAR(64) NOT NULL, "
                    + "  `prezzo_dolce` DECIMAL NOT NULL, "
                    + "  `ingredienti` VARCHAR(64) NOT NULL, "
                    + "  `tipo_dolce` ENUM('CARNE', 'PESCE', 'VEGANO', 'MISTO') NOT NULL, "
                    + "  `portata_id_portata` INT, "
                    + "  PRIMARY KEY (`id_dolce`), "
                    + "  INDEX `fk_dolce_portata1_idx` (`portata_id_portata` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_dolce_portata1` "
                    + "    FOREIGN KEY (`portata_id_portata`) "
                    + "    REFERENCES `ristorante_progetto`.`portata` (`id_portata`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesDolce() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.dolce"
                    + "(id_dolce, nome_dolce, prezzo_dolce, ingredienti, tipo_dolce)"
                    + "VALUES(1, 'Sorbetto al limone', '5.25', 'Succo di limone,Aqua,Zucchero,Limoncello,Albumi', 'carne');";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`dolce`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE IF NOT EXISTS `ristorante_progetto`.`tavolo` ( "
                    + "  `numero_tavolo` INT NOT NULL AUTO_INCREMENT, "
                    + "  `posizione_tavolo` ENUM('Esterno_Terrazzo', 'Esterno_Vista_Mare', 'Esterno_Giardino', 'Interno') NOT NULL, "
                    + "  `ristorante_id_ristorante` INT NOT NULL, "
                    + "  PRIMARY KEY (`numero_tavolo`), "
                    + "  INDEX `fk_tavolo_ristorante1_idx` (`ristorante_id_ristorante` ASC) VISIBLE, "
                    + "  CONSTRAINT `fk_tavolo_ristorante1` "
                    + "    FOREIGN KEY (`ristorante_id_ristorante`) "
                    + "    REFERENCES `ristorante_progetto`.`ristorante` (`id_ristorante`) "
                    + "    ON DELETE NO ACTION "
                    + "    ON UPDATE NO ACTION)";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method inserts values into the rows of the table
     */
    public void insertValuesTavolo() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO ristorante_progetto.tavolo"
                    + "(numero_tavolo, posizione_tavolo)"
                    + "VALUES(1, 'interno');";
            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`tavolo`;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT * "
                    + "FROM ristorante_progetto.tavolo;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ingredienti"));
            }
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String varname1 = ""
                    + "CREATE TABLE `prenotazione` ( "
                    + "  `id_prenotazione` int NOT NULL, "
                    + "  `data_prenotazione` datetime NOT NULL, "
                    + "  `data_prenotata_` datetime NOT NULL, "
                    + "  `cliente_id_cliente` int NOT NULL, "
                    + "  `ristorante_id_ristorante` int NOT NULL, "
                    + "  PRIMARY KEY (`id_prenotazione`), "
                    + "  KEY `fk_prenotazione_cliente1_idx` (`cliente_id_cliente`), "
                    + "  KEY `fk_prenotazione_ristorante1_idx` (`ristorante_id_ristorante`), "
                    + "  CONSTRAINT `fk_prenotazione_cliente1` FOREIGN KEY (`cliente_id_cliente`) REFERENCES `cliente` (`id_cliente`), "
                    + "  CONSTRAINT `fk_prenotazione_ristorante1` FOREIGN KEY (`ristorante_id_ristorante`) REFERENCES `ristorante` (`id_ristorante`) "
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;";
            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method inserts values into the rows of the table
     */


    public void insertTablePrenotazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "INSERT INTO `ristorante_progetto`.`prenotazione` "
                    + "(`id_prenotazione`, "
                    + "`data_prenotazione`, "
                    + "`data_prenotata_`, "
                    + "`cliente_id_cliente`, "
                    + "`ristorante_id_ristorante`) "
                    + "VALUES "
                    + "(<{id_prenotazione: }>, "
                    + "<{data_prenotazione: }>, "
                    + "<{data_prenotata_: }>, "
                    + "<{cliente_id_cliente: }>, "
                    + "<{ristorante_id_ristorante: }>);";

            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
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
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DROP TABLE `ristorante_progetto`.`prenotazione` ";
            statement.executeUpdate(varname1);
            System.out.println("Tabella cancellata correttamente");
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
        String password = "Rudy32?%";
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method creates a table into the schema if not exists
     */


    public void createTableOrdinazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "CREATE TABLE `ordinazione` ( "
                    + "  `id_ordinazione` int NOT NULL AUTO_INCREMENT, "
                    + "  `tipo_portata` varchar(64) NOT NULL, "
                    + "  `numero_portata` int NOT NULL, "
                    + "  `tavolo_numero_tavolo` int NOT NULL, "
                    + "  PRIMARY KEY (`id_ordinazione`), "
                    + "  UNIQUE KEY `id_ordinazione_UNIQUE` (`id_ordinazione`), "
                    + "  KEY `fk_ordinazione_tavolo1_idx` (`tavolo_numero_tavolo`), "
                    + "  CONSTRAINT `fk_ordinazione_tavolo1` FOREIGN KEY (`tavolo_numero_tavolo`) REFERENCES `tavolo` (`numero_tavolo`) "
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;";

            statement.executeUpdate(varname1);
            System.out.println("Tabella creata correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This method inserts values into the rows of the table
     */

    public void insertTableOrdinazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
    String varname1 = ""
            + "INSERT INTO `ristorante_progetto`.`ordinazione` "
            + "(`id_ordinazione`, "
            + "`tipo_portata`, "
            + "`numero_portata`, "
            + "`tavolo_numero_tavolo`) "
            + "VALUES "
            + "(<{id_ordinazione: }>, "
            + "<{tipo_portata: }>, "
            + "<{numero_portata: }>, "
            + "<{tavolo_numero_tavolo: }>);";

            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method delete data in the table
     */


    public void deleteTableOrdinazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "DELETE * FROM `ristorante_progetto`.`ordinazione` ";
                    //+ "WHERE <{where_expression}>;";

            statement.executeUpdate(varname1);
            System.out.println("Dati inseriti correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method lets the user read in console the values from the table
     */
    public void readTableOrdinazione() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "Rudy32?%";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String varname1 = ""
                    + "SELECT `ordinazione`.`id_ordinazione`, "
                    + "    `ordinazione`.`tipo_portata`, "
                    + "    `ordinazione`.`numero_portata`, "
                    + "    `ordinazione`.`tavolo_numero_tavolo` "
                    + "FROM `ristorante_progetto`.`ordinazione`;";
            ResultSet resultSet = statement.executeQuery(varname1);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


