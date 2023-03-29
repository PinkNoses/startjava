DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE jaegers (
    id         SERIAL PRIMARY KEY, 
    model_name TEXT, 
    mark       TEXT, 
    height     FLOAT8, 
    weight     FLOAT8, 
    status     CHAR(11),
    origin     TEXT,
    launch     DATE,
    kaiju_kill INT
);

\ir init_db.sql;
\ir queries.sql;