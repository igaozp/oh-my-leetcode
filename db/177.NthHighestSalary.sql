CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare i int;
    set i = N - 1;
    RETURN (
        SELECT (SELECT DISTINCT salary FROM Employee ORDER BY salary DESC LIMIT i, 1)
    );
END