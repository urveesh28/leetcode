# Write your MySQL query statement below
Select name as Employee from Employee e1 where 
salary > (select salary from Employee where id=e1.managerId)