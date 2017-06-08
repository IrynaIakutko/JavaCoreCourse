
START TRANSACTION;
USE `ddb1`;
INSERT INTO `ddb1`.`companies` ( `nameCompany`, `address`, `phone`, `email`) VALUES ( 'GG3', 'London', '3322', 'llk');
INSERT INTO `ddb1`.`companies` ( `nameCompany`, `address`, `phone`, `email`) VALUES ( 'Com5', ' Antalya', '11227', 'erj');
INSERT INTO `ddb1`.`companies` ( `nameCompany`, `address`, `phone`, `email`) VALUES ( 'GG4', 'London', '3367822', 'llkhj');
INSERT INTO `ddb1`.`companies` ( `nameCompany`, `address`, `phone`, `email`) VALUES ( 'Com6', ' Baku', '11787', 'eroopj');


INSERT INTO `ddb1`.`customers` (`name`, `address`, `phone`, `email`) VALUES ('cust1', 'China', '55677665', 'ghtyj@ee');
INSERT INTO `ddb1`.`customers` (`name`, `address`, `phone`, `email`) VALUES ('cust2', ' Antalya', '4445655', 'g5@ehhje');
INSERT INTO `ddb1`.`customers` (`name`, `address`, `phone`, `email`) VALUES ('cust3', ' Baghdad', '33655444', 'g5@jjee');
INSERT INTO `ddb1`.`customers` (`name`, `address`, `phone`, `email`) VALUES ('cust4', 'China', '5566665', 'ghj@egghe');
INSERT INTO `ddb1`.`customers` (`name`, `address`, `phone`, `email`) VALUES ('cust5', ' Batumi', '4488455', 'g5@ejje');
INSERT INTO `ddb1`.`customers` (`name`, `address`, `phone`, `email`) VALUES ('cust6', ' Dnipropetrovsk', '334hh4', 'g5jjjk@ee');

INSERT INTO `ddb1`.`projects` (`projectName`, `time`, `countDev`, `costProject`, `type`, `companies_IdCompanies`, `customers_IntCustomer`) VALUES ('pr1', '50', '5', '500', '3', '1', '2');
INSERT INTO `ddb1`.`projects` (`projectName`, `time`, `countDev`, `costProject`, `type`, `companies_IdCompanies`, `customers_IntCustomer`) VALUES ('pr2', '51', '3', '600', '4', '1', '3');
INSERT INTO `ddb1`.`projects` (`projectName`, `time`, `countDev`, `costProject`, `type`, `companies_IdCompanies`, `customers_IntCustomer`) VALUES ('pr3', '20', '4', '700', '3', '3', '2');
INSERT INTO `ddb1`.`projects` (`projectName`, `time`, `countDev`, `costProject`, `type`, `companies_IdCompanies`, `customers_IntCustomer`) VALUES ('pr4', '10', '3', '100', '6', '1', '1');



INSERT INTO `ddb1`.`developers` (`name`, `surName`, `sex`, `dateOfBirtch`, `address`, `e-mail`, `phone`, `projects_idproject`) VALUES ('Mary', 'Popins', 'f', '1988-01-01', '	Dublin', 'tttt', '7777', '1');
INSERT INTO `ddb1`.`developers` (`name`, `surName`, `sex`, `dateOfBirtch`, `address`, `e-mail`, `phone`, `projects_idproject`) VALUES ('Tom', 'Soyer', 'm', '1990-02-01', '	Yokohama', 'ttyittt', '567777', '1');
INSERT INTO `ddb1`.`developers` (`name`, `surName`, `sex`, `dateOfBirtch`, `address`, `e-mail`, `phone`, `projects_idproject`) VALUES ('Mary', 'Kris', 'f', '1972-11-05', '	Lisbon', 'yytttt', '788977', '1');
INSERT INTO `ddb1`.`developers` (`name`, `surName`, `sex`, `dateOfBirtch`, `address`, `e-mail`, `phone`, `projects_idproject`) VALUES ('Lola', 'Pop', 'f', '1980-04-07', '	Dublin', 'tnbvttt', '788777', '2');
INSERT INTO `ddb1`.`developers` (`name`, `surName`, `sex`, `dateOfBirtch`, `address`, `e-mail`, `phone`, `projects_idproject`) VALUES ('Mark', 'Robens', 'm', '1989-09-09', '	Lisbon ', 'tttret', '799777', '1');


INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('Basic');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('Fornran');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('Mercury');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ( 'Prolog');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('C++');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('Delphi');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('JavaScript');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ( 'Perl');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ( 'PHP');
INSERT INTO `ddb1`.`skills` (`skill`) VALUES ('Java');

INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('2', '2');
INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('1', '3');
INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('4', '5');
INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('2', '3');
INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('6', '3');
INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('1', '4');
INSERT INTO `ddb1`.`skills_has_developers` (`skills_idskills`, `developers_Id_developer`) VALUES ('1', '4');



COMMIT;


