select p.id_progects,p.name_pr,sum(d.salary*p.time_pr)as cost_pr
from progects p
inner join developers_has_progects dp on p.id_progects=dp.progects_id_progects
inner join developers d on dp.developers_id_developers=d.id_developers
group by p.id_progects,p.name_pr
order by cost_pr desc
limit 1
