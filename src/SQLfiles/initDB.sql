
-- Sat Jun  3 21:55:59 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ddb1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ddb1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ddb1` DEFAULT CHARACTER SET utf8 ;
USE `ddb1` ;

-- -----------------------------------------------------
-- Table `ddb1`.`companies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ddb1`.`companies` (
  `idCompanies` INT NOT NULL AUTO_INCREMENT,
  `nameCompany` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idCompanies`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ddb1`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ddb1`.`customers` (
  `name` VARCHAR(45) NULL,
  `idCustomer` INT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (`idCustomer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ddb1`.`projects`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ddb1`.`projects` (
  `idProject` INT NOT NULL AUTO_INCREMENT,
  `projectName` VARCHAR(45) NULL DEFAULT NULL,
  `time` VARCHAR(45) NULL DEFAULT NULL,
  `countDev` VARCHAR(45) NULL DEFAULT NULL,
  `costProject` VARCHAR(45) NULL DEFAULT NULL,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  `companies_IdCompanies` INT NOT NULL,
  `customers_IntCustomer` INT NOT NULL,
  PRIMARY KEY (`idProject`, `companies_IdCompanies`, `customers_IntCustomer`),
  CONSTRAINT `fk_projects_companies1`
    FOREIGN KEY (`companies_IdCompanies`)
    REFERENCES `ddb1`.`companies` (`idCompanies`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_projects_customers1`
    FOREIGN KEY (`customers_IntCustomer`)
    REFERENCES `ddb1`.`customers` (`idCustomer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_projects_companies1_idx` ON `ddb1`.`projects` (`companies_IdCompanies` ASC);

CREATE INDEX `fk_projects_customers1_idx` ON `ddb1`.`projects` (`customers_IntCustomer` ASC);


-- -----------------------------------------------------
-- Table `ddb1`.`developers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ddb1`.`developers` (
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surName` VARCHAR(45) NULL DEFAULT NULL,
  `sex` VARCHAR(45) NULL DEFAULT NULL,
  `dateOfBirtch` DATE NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `e-mail` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(10) NULL DEFAULT NULL,
  `Id_developer` INT NOT NULL AUTO_INCREMENT,
  `projects_idproject` INT NOT NULL,
  PRIMARY KEY (`Id_developer`, `projects_idproject`),
  CONSTRAINT `fk_developers_projects1`
    FOREIGN KEY (`projects_idproject`)
    REFERENCES `ddb1`.`projects` (`idProject`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_developers_projects1_idx` ON `ddb1`.`developers` (`projects_idproject` ASC);


-- -----------------------------------------------------
-- Table `ddb1`.`skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ddb1`.`skills` (
  `idSkills` INT NOT NULL AUTO_INCREMENT,
  `skill` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idSkills`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ddb1`.`skills_has_developers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ddb1`.`skills_has_developers` (
  `skills_idskills` INT NOT NULL,
  `developers_Id_developer` INT NOT NULL,
  PRIMARY KEY (`skills_idskills`, `developers_Id_developer`),
  CONSTRAINT `fk_skills_has_developers_skills1`
    FOREIGN KEY (`skills_idskills`)
    REFERENCES `ddb1`.`skills` (`idSkills`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_skills_has_developers_developers1`
    FOREIGN KEY (`developers_Id_developer`)
    REFERENCES `ddb1`.`developers` (`Id_developer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_skills_has_developers_developers1_idx` ON `ddb1`.`skills_has_developers` (`developers_Id_developer` ASC);

CREATE INDEX `fk_skills_has_developers_skills1_idx` ON `ddb1`.`skills_has_developers` (`skills_idskills` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

