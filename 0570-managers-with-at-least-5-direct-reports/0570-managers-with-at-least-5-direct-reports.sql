-- Write your PostgreSQL query statement below
SELECT e1.name As name
FROM Employee e1
JOIN Employee e2
ON e1.id = e2.managerId
GROUP BY  e2.managerId,e1.name
HAVING COUNT(e2.managerId) >4;