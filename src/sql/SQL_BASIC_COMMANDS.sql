INSERT INTO ORDERS
VALUES(1001,'too123',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1002,'too1234',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1003,'too1235',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1003,'too12FDGH35',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

--SELECT
SELECT * FROM ORDERS;
SELECT * FROM ORDERS WHERE PRODACT_NAME='too123';

--DELETE
DELETE FROM ORDERS WHERE prodact_name='too123';

--UPDATE
UPDATE ORDERS SET PRICE = 230 WHERE ID=1001;
UPDATE ORDERS SET PRICE=250;
UPDATE ORDERS SET PRICE = NULL WHERE PRICE = 250;


--HOMEWORK---------------------------------------------

INSERT INTO ORDERS
VALUES(1005,'test1',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1006,'test2',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1007,'test3',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1008,'test4',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1009,'test5',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1010,'test6',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1011,'test7',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1022,'test8',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1023,'test9',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1024,'test10',140,TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'),TO_DATE('2019/05/10 15:00:00','yyyy/mm/dd hh24:mi:ss'));
