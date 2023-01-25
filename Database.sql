-- MySQL Script generated by MySQL Workbench
-- Wed Jan 25 17:23:22 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`portata`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`portata` (
  `id_portata` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(64) NOT NULL,
  `prezzo` DECIMAL NOT NULL,
  `ingredienti` VARCHAR(64) NOT NULL,
  `tipo_portata` ENUM('Carne', 'Pesce', 'Vegano', 'Misto') NOT NULL,
  PRIMARY KEY (`id_portata`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`primo_piatto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`primo_piatto` (
  `id_primo_piatto` INT NOT NULL AUTO_INCREMENT,
  `nome_primo_piatto` VARCHAR(64) NOT NULL,
  `prezzo_primo_piatto` DECIMAL NOT NULL,
  `ingredienti_primo_piatto` VARCHAR(64) NOT NULL,
  `tipo_primo_piatto` ENUM('Carne', 'Pesce', 'Vegano', 'Misto') NOT NULL,
  PRIMARY KEY (`id_primo_piatto`),
  INDEX `fk_primo_piatto_portata_idx` (`portata_id_portata` ASC) VISIBLE,
    CONSTRAINT `fk_primo_piatto_portata`
      FOREIGN KEY (`portata_id_portata`)
      REFERENCES `mydb`.`portata` (`id_portata`)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION)
  ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`secondo_piatto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`secondo_piatto` (
  `id_secondo_piatto` INT NOT NULL AUTO_INCREMENT,
  `nome_secondo_piatto` VARCHAR(64) NOT NULL,
  `prezzo_secondo_piatto` DECIMAL NOT NULL,
  `ingredienti_secondo_piatto` VARCHAR(64) NOT NULL,
  `tipo_secondo_piatto` ENUM('carne', 'pesce', 'vegano', 'misto') NOT NULL,
  `contorno` VARCHAR(64) NOT NULL,
  `cottura` ENUM('al_sangue', 'media', 'ben_cotta') NOT NULL,
  `portata_id_portata` INT NOT NULL,
  PRIMARY KEY (`id_secondo_piatto`),
  INDEX `fk_secondo_piatto_portata1_idx` (`portata_id_portata` ASC) VISIBLE,
  CONSTRAINT `fk_secondo_piatto_portata1`
    FOREIGN KEY (`portata_id_portata`)
    REFERENCES `mydb`.`portata` (`id_portata`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
