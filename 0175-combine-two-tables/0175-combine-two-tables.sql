# Write your MySQL query statement below
#using aliases  
SELECT `P`.`firstName` , `P`.`lastName` , `t`.`city` , `t`.`state` from 
`Person` as `P` left join `Address` as `t` on 
`P`.`personId`=`t`.`personId`; 