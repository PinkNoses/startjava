DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
	id SERIAL PRIMARY KEY, 
	modelName TEXT, 
	mark TEXT, 
	height FLOAT8, 
	weight FLOAT8, 
	status CHAR(11),
	origin TEXT,
	launch DATE,
	kaijuKill INT)
	;

\ir init_db.sql;
\ir queries.sql;




