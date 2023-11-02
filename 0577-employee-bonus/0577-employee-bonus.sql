# Write your MySQL query statement below
SELECT Employee.name , Bonus.bonus from Employee left join Bonus on Employee.empID=Bonus.empId
where Bonus.bonus is null || Bonus.bonus<1000;