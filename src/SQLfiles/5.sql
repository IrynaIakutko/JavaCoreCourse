select ddb1.customers.name ,min(projects.costProject) from projects,customers
where ddb1.customers.idCustomer=projects.customers_IntCustomer