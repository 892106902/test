-- Database: testdb

-- DROP DATABASE testdb;

CREATE DATABASE testdb
WITH OWNER = admin
ENCODING = 'UTF8'
TABLESPACE = pg_default
LC_COLLATE = 'Chinese (Simplified)_China.936'
LC_CTYPE = 'Chinese (Simplified)_China.936'
CONNECTION LIMIT = -1;
CREATE TABLE USERINFO (
  ID   SERIAL PRIMARY KEY,
  CODE VARCHAR(10) UNIQUE,
  NAME VARCHAR(255)
);

CREATE INDEX index_name ON userinfo (name);
INSERT INTO userinfo VALUES (1, '001', 'admin');
INSERT INTO userinfo VALUES (2, '002', 'test');
SELECT *
FROM bc_identity_actor
LIMIT 10;

