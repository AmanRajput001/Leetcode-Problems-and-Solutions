# Write your MySQL query statement below
select name from Customer where id Not In (select id from Customer Where referee_id = 2) ; 