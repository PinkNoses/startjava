\echo 'Output TABLE Jaegers';
SELECT * FROM Jaegers;

\echo 'Output only undestroyed Jaegers';
SELECT * 
  FROM Jaegers 
 WHERE status NOT IN ('destroyed');

\echo 'Output Jaegers of Mark-1 and Mark-4';
SELECT * 
  FROM Jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'Output all Jaegers except Mark-1 and Mark-4';
SELECT *
  FROM Jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'Sort Table descending order by column mark';
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\echo 'Output the oldest robot';
SELECT *
  FROM Jaegers
 WHERE launch = (SELECT MIN(launch) 
                   FROM Jaegers);

\echo 'Output Jaegers that destroyed the most kaiju';
SELECT *
  FROM Jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
                       FROM Jaegers);

\echo 'Output the average weight of Jaegers';
SELECT
   AVG(weight)
  FROM Jaegers;

\echo 'Increase +1 of kaiju for Jaegers that is undestroyed';
UPDATE Jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status NOT IN ('destroyed');

\echo 'Delete destroyed Jaegers';
DELETE
  FROM Jaegers
 WHERE status = 'destroyed';