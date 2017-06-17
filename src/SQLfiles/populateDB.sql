-- -----------------------------------------------------
-- Data for table `mydb`.`customers`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (1, 'GG3', 'London', '3322', 'llk');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (2, 'Com5', 'Antalya', '11227', 'erj');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (3, 'GG4', 'London', '3367822', 'llkhj');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (4, 'Com6', 'Baku', '11787', 'eroopj');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (5, 'GG3', 'London', '3322', 'llk');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (6, 'Com5', 'Antalya', '11227', 'erj');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (7, 'GG4', 'London', '3367822', 'llkhj');
INSERT INTO `mydb`.`customers` (`id_costomers`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (8, 'Com6', 'Baku', '11787', 'eroopj');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`developers`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (1, 'mary', 'f', '	Lisbon', '6667778', NULL, '1999-08-01', 300, 'Kris');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (2, 'kate', 'f', '	Dublin', '44455', NULL, '1988-12-03', 500, 'logs');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (3, 'mark', 'm', '	Yokohama', '344445', NULL, '1979-11-09', 600, 'natyr');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (4, 'slavik', 'm', '	Lisbon', '2333444', NULL, '1999-01-01', 1000, 'wiron');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (5, 'lili', 'f', '	Yokohama', '2333444', NULL, '1993-06-09', 2000, 'nikol');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (6, 'vasiya', 'm', '	Lisbon', '122233', NULL, '1985-08-10', 3000, 'nett');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (7, 'ruslan', 'm', '	Dublin', '223334', NULL, '1999-08-01', 44400, 'yuth');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (8, 'kolya', 'm', '	Dublin', '344556', NULL, '1973-12-09', 4560, 'naro');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (9, 'roma', 'm', '	Lisbon', '22334332', NULL, '1999-08-01', 3400, 'nife');
INSERT INTO `mydb`.`developers` (`id_developers`, `name_dv`, `sex_dv`, `address_dv`, `phone_dv`, `progects_idprogect`, `dateOfBirtch`, `salary`, `sur_name_dv`) VALUES (DEFAULT, NULL, NULL, NULL, NULL, NULL, '1972-11-05', NULL, 'gward');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`progects`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (1, 'pr1', 20, 400, '1', 1);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (2, 'pr2', 34, 900, '2', 2);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (3, 'pr4', 51, 2000, '3', 3);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (4, 'pr6', 23, 3000, '3', 6);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (5, 'pr7', 44, 4000, '4', 7);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (6, 'pr9', 23, 2200, '2', 1);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (7, 'pr10', 23, 4400, '2', 3);
INSERT INTO `mydb`.`progects` (`id_progects`, `name_pr`, `time_pr`, `cost_pr`, `type_pr`, `customers_idcostomer`) VALUES (DEFAULT, NULL, NULL, NULL, NULL, 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`skills`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (1, 'Java');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (2, 'Fornran');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (3, 'Mercury');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (4, 'Prolog');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (5, 'C++');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (6, 'Delphi');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (7, 'JavaScript');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (8, 'Perl');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (9, 'PHP');
INSERT INTO `mydb`.`skills` (`id_skills`, `skill`) VALUES (10, 'Python');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`companies`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (1, 'cust1', 'Odessa', '3636', NULL);
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (2, 'cust2', 'Kiyv', '14353446', 'adghh');
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (3, 'Zfjkk', 'Rybniza', '135356', 'xxnxgn');
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (4, 'cust3', 'Tatarbunary', '123412', 'aradfhs');
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (5, 'cust4', 'Kiyv', '123', 'xcvnxc');
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (6, 'cust5', 'Rybniza', '235643', 'aergadfhc');
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (7, 'fhjjj', 'Kiyv', '12354', 'zdfhsfn');
INSERT INTO `mydb`.`companies` (`id_companies`, `name_cm`, `address_cm`, `phone_cm`, `email_cm`) VALUES (8, 'mmmkj', 'Rybniza', '1234545', 'arah');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`developers_has_skills`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (1, 3);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (2, 4);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (3, 7);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (4, 6);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (5, 5);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (6, 4);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (7, 3);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (8, 2);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (2, 1);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (3, 4);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (4, 3);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (5, 2);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (2, 7);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (3, 6);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (4, 5);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (4, 4);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id_developers`, `skills_id_skills`) VALUES (6, 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`developers_has_progects`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (1, 2);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (1, 4);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (2, 4);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (3, 3);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (4, 2);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (2, 5);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (5, 3);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (6, 6);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (7, 5);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (7, 8);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (8, 7);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (2, 6);
INSERT INTO `mydb`.`developers_has_progects` (`developers_id_developers`, `progects_id_progects`) VALUES (3, 5);

COMMIT;



START TRANSACTION;







INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('1', '4');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('1', '5');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('1', '6');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('2', '5');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('3', '4');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('4', '3');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('4', '2');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('4', '1');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('5', '1');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('6', '2');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('7', '3');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('7', '4');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('5', '6');
INSERT INTO `mydb`.`companies_has_developers` (`companies_id_companies`, `developers_id_developers`) VALUES ('5', '5');


INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('1', '1');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('1', '2');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('1', '3');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('1', '4');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('2', '3');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('2', '4');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('2', '5');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('2', '6');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('3', '4');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('3', '5');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('3', '6');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('3', '7');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('4', '5');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('4', '6');
INSERT INTO `mydb`.`companies_has_progects` (`companies_id_companies`, `progects_id_progects`) VALUES ('4', '7');

INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('1', '1');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('1', '2');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('1', '3');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('1', '4');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('1', '5');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('1', '6');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('2', '7');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('2', '3');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('2', '4');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('2', '5');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('4', '6');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('4', '7');
INSERT INTO `mydb`.`customers_has_progects` (`costomers_id_costomers`, `progects_id_progects`) VALUES ('4', '3');
 COMMIT;