# Write your MySQL query statement below
SELECT eu.unique_id as unique_id,e.name as name from employees as e left join employeeuni eu on e.id=eu.id; 
