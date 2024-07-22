# Write your MySQL query statement below
#select Person.email from Person where(select count(email)>1 from Person);
select email from person group by email having (count(email)>1);