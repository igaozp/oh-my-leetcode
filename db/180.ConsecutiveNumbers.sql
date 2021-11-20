SELECT num AS ConsecutiveNums
FROM (
         SELECT num,
                IF(@current_num = num, @count := @count + 1, @count := 1) AS count,
                @current_num := num
         FROM Logs,
              (SELECT @count := 0, @current_num := (SELECT num FROM Logs ORDER BY id LIMIT 1)) AS T
         ORDER BY id) AS T
WHERE count >= 3
GROUP BY num;
