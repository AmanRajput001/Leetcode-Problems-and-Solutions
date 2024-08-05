# Write your MySQL query statement below
SELECT class from Courses group by class having COUNT(student) >= 5