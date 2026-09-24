# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers AS c
LEFT JOIN  Orders AS O
ON c.id = o.customerId
where o.customerId is null
