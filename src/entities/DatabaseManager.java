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
        String password = "";
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
        String password = "";
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
        String password = "";
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
        String password = "";
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
        String password = "";
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
        String password = "";
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
        String password = "";
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
        String password = "";
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
        String password = "";
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
                    + "  `tipo_primo_piatto` ENUM('Carne', 'Pesce', 'Vegano', 'Misto') NOT NULL, "
                    + "  `portata_id_portata` INT,"
                    + "  PRIMARY KEY (`id_primo_piatto`),"
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

    public void insertValuesPrimoPiatto() {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password = "";
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


