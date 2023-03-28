SELECT CONCAT ('Output Table "Jaegers":');
SELECT * FROM Jaegers;

SELECT CONCAT ('Output only undestroyed Jaegers:');
SELECT * FROM Jaegers WHERE status NOT IN ('destroyed');

SELECT CONCAT ('Output Jaegers of Mark-1 and Mark-4:');
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

SELECT CONCAT ('Output all Jaegers except Mark-1 and Mark-4:');
SELECT * FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

SELECT CONCAT ('Sort Table descending order by column mark:');
SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT CONCAT ('Output the oldest robot:');
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT CONCAT ('Output Jaegers that destroyed the most kaiju:');
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

SELECT CONCAT ('Output the average weight of Jaegers:');
SELECT AVG(weight) FROM Jaegers;

SELECT CONCAT ('Increase +1 of kaiju for Jaegers that is undestroyed:');
UPDATE Jaegers SET kaijukill  = kaijukill + 1 WHERE status NOT IN ('destroyed');

SELECT CONCAT ('Delete destroyed Jaegers:');
DELETE FROM Jaegers WHERE status = ('destroyed');
