# Write your MySQL query statement below
select t.name as Department,
        e.name as Employee,
        e.salary as Salary 
from Employee as e join Department as t on e.departmentId=t.id 
where (e.departmentId,e.salary )in 
    (select departmentid,MAX(salary) 
    from employee 
    group by departmentid);