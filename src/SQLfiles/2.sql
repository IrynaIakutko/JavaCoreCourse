UPDATE `ddb1`.`developers` SET `salary`='200' WHERE `Id_developer`='1' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='300' WHERE `Id_developer`='2' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='340' WHERE `Id_developer`='3' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='325' WHERE `Id_developer`='4' and`projects_idproject`='2';
UPDATE `ddb1`.`developers` SET `salary`='324' WHERE `Id_developer`='5' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='334' WHERE `Id_developer`='6' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='111' WHERE `Id_developer`='7' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='123' WHERE `Id_developer`='8' and`projects_idproject`='1';
UPDATE `ddb1`.`developers` SET `salary`='345' WHERE `Id_developer`='9' and`projects_idproject`='2';
UPDATE `ddb1`.`developers` SET `salary`='123' WHERE `Id_developer`='10' and`projects_idproject`='1';

select max(mali) from
(select
 sum( b1.time*a1.salary) mali  ,b1.idProject
from ddb1.developers as a1 , ddb1.projects as b1 where
a1.projects_idproject= b1.idProject
  group by b1.idProject)
  --- РёР»Рё---
  SELECT max(mycount) as al from (select
 sum(b1.time*a1.salary) mycount
from ddb1.developers as a1 inner join ddb1.projects  as b1
on a1.projects_idproject=b1.idProject
 group by b1.idProject)
