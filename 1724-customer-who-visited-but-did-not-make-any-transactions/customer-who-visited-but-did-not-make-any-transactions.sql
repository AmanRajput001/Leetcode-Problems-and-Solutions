# Write your MySQL query statement below

select customer_id, count(*) as count_no_trans from (select customer_id, COUNT(transaction_id) as count_no_trans from Visits as v LEFT JOIN Transactions as t ON v.visit_id = t.visit_id  group by v.visit_id having count_no_trans = 0) as t group by customer_id