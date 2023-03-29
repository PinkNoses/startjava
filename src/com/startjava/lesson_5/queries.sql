COMMENT ON TABLE Jaegers IS 'Output TABLE Jaegers';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers;

COMMENT ON TABLE Jaegers IS 'Output only undestroyed Jaegers';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers WHERE status NOT IN ('destroyed');

COMMENT ON TABLE Jaegers IS 'Output Jaegers of Mark-1 and Mark-4';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

COMMENT ON TABLE Jaegers IS 'Output all Jaegers except Mark-1 and Mark-4';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

COMMENT ON TABLE Jaegers IS 'Sort Table descending order by column mark';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers ORDER BY mark DESC;

COMMENT ON TABLE Jaegers IS 'Output the oldest robot';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

COMMENT ON TABLE Jaegers IS 'Output Jaegers that destroyed the most kaiju';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

COMMENT ON TABLE Jaegers IS 'Output the average weight of Jaegers';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
SELECT AVG(weight) FROM Jaegers;

COMMENT ON TABLE Jaegers IS 'Increase +1 of kaiju for Jaegers that is undestroyed';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
UPDATE Jaegers SET kaijukill  = kaijukill + 1 WHERE status NOT IN ('destroyed');

COMMENT ON TABLE Jaegers IS 'Delete destroyed Jaegers';
SELECT obj_description('Jaegers'::regclass, 'pg_class');
DELETE FROM Jaegers WHERE status = ('destroyed');