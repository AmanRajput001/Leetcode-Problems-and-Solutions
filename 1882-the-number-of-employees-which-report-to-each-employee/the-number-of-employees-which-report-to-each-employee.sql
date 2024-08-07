# Write your MySQL query statement below
select employee_id, name, reports_count, ROUND(average_age) as average_age 
from Employees as e JOIN
(   select reports_to, COUNT(reports_to) as reports_count, AVG(age) as average_age 
    from Employees 
    where reports_to is not null 
    group by reports_to
) as t
ON t.reports_to = e.employee_id
order by employee_id
