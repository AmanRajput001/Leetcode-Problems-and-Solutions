# Write your MySQL query statement below
SELECT q.query_name, round(AVG(rating/position), 2) as quality, COALESCE(round((i/COUNT(q.query_name))*100,2), 0) as poor_query_percentage FROM Queries as q LEFT JOIN 
(SELECT query_name, COUNT(query_name) as i FROM Queries WHERE rating < 3 GROUP BY query_name) as t
ON q.query_name = t.query_name WHERE q.query_name IS NOT null
GROUP BY query_name 
