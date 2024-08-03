# Write your MySQL query statement below
select name, bonus from Employee LEFT JOIN Bonus 
on Bonus.empId = Employee.empId
Where bonus < 1000 || bonus is null;