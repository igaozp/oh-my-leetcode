SELECT T.Email
FROM (SELECT Email, COUNT(id) AS count FROM Person GROUP BY Email) AS T
WHERE T.count > 1