/* Write your T-SQL query statement below */
SELECT name from Customer where 
--id <> 2 OR 
referee_id <> 2 OR referee_id is null
