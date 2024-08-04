# Write your MySQL query statement below
SELECT MAX(num) as num from 
(SELECT num, COUNT(num) as cnt FROM MyNumbers GROUP BY num) as t 
WHERE cnt = 1