SELECT e.Name AS Employee
FROM Employee e
         INNER JOIN Employee t ON e.ManagerId = t.Id
WHERE e.Salary > t.Salary;