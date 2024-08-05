# Write your MySQL query statement below
select machine_id, round(AVG(processing_time), 3) as processing_time from
(select start.machine_id, start.process_id,(end.timestamp - start.timestamp) as processing_time from 
(select machine_id, process_id, timestamp from Activity where activity_type = "start" group by machine_id, process_id) as   start JOIN
(select machine_id, process_id, timestamp from Activity where activity_type = "end" group by machine_id, process_id) as end
on start.machine_id = end.machine_id and start.process_id = end.process_id) 
as t group by machine_id