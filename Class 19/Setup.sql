CREATE TABLE BOOKS
(ID INT PRIMARY KEY,
PAGES INT,
YEAR INT,
AUTHOR VARCHAR2(255),
TITLE VARCHAR2(255));

INSERT ALL
INTO BOOKS VALUES (1,50,1850,'Frederic Bastiat','The Law')
INTO BOOKS VALUES (2,120,1949,'George Orwell','1984')
INTO BOOKS VALUES (3,240,1945,'George Orwell','Animal Farm')
INTO BOOKS VALUES (4,240,1603,'William Shakespeare','Hamlet')
SELECT * FROM DUAL;

SELECT * FROM BOOKS;

