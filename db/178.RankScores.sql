SELECT R.Score, `Rank`
FROM (SELECT Score,
             CONVERT(IF(@current_score = Score, @rank, @rank := @rank + 1), UNSIGNED INTEGER) AS `Rank`,
             @current_score := Scores.Score
      FROM Scores,
           (SELECT @rank := 1, @current_score := (SELECT MAX(Score) FROM Scores)) AS T
      ORDER BY Score
              DESC) AS R
