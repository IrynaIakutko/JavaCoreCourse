UPDATE `ddb1`.`developers` SET `Id_developer`='8' WHERE `Id_developer`='8' and`projects_idproject`='8';
UPDATE `ddb1`.`developers` SET `projects_idproject`='8' WHERE `Id_developer`='3' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `projects_idproject`='8' WHERE `Id_developer`='4' and`projects_idproject`='2';
UPDATE `ddb1`.`developers` SET `projects_idproject`='8' WHERE `Id_developer`='6' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `projects_idproject`='8' WHERE `Id_developer`='9' and`projects_idproject`='2';

select avg(developers.salary)
from developers,
projects where  projects.idProject=developers.projects_idproject
and projects.costProject in(
Select min(projects.costProject) from projects)