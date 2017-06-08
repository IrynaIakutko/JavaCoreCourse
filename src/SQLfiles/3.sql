UPDATE `ddb1`.`skills_has_developers` SET `skills_idskills`='10' WHERE `skills_idskills`='2' and`developers_Id_developer`='2';
UPDATE `ddb1`.`skills_has_developers` SET `skills_idskills`='10' WHERE `skills_idskills`='2' and`developers_Id_developer`='3';
UPDATE `ddb1`.`skills_has_developers` SET `skills_idskills`='10' WHERE `skills_idskills`='4' and`developers_Id_developer`='5';

SELECT sum(ddb1.developers.salary)
 FROM ddb1.skills_has_developers,ddb1.skills,ddb1.developers where
ddb1.skills.idSkills=ddb1.skills_has_developers.skills_idskills and
ddb1.skills.skill='Java'
and ddb1.skills_has_developers.developers_Id_developer=ddb1.developers.Id_developer
