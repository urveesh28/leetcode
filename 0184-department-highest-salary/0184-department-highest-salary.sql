# Write your MySQL query statement below
select D.name as Department , E.name as Employee , E.salary as Salary 
from Department as D inner join Employee as E on D.id=E.departmentId
where E.salary = (select max(salary) from Employee where departmentId=D.id);
