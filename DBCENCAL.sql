-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DBCENCAL
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DBCENCAL
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DBCENCAL` DEFAULT CHARACTER SET utf8 ;
USE `DBCENCAL` ;

-- -----------------------------------------------------
-- Table `DBCENCAL`.`Utilizador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBCENCAL`.`Utilizador` (
  `idUtilizador` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  `morada` VARCHAR(80) NOT NULL,
  `telefone` DECIMAL(9) NOT NULL,
  `nif` DECIMAL(9) NOT NULL,
  `login` VARCHAR(30) NOT NULL,
  `password` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`idUtilizador`),
  UNIQUE INDEX `idUtilizador_UNIQUE` (`idUtilizador` ASC) VISIBLE,
  UNIQUE INDEX `login_UNIQUE` (`login` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
