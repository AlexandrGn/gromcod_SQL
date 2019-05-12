--SELECT -column1,column2- FROM table_name
--WHERE conditions
--GROUP BY column_name

SELECT PRODACT_NAME FROM ORDERS
GROUP BY PRODACT_NAME;

SELECT PRODACT_NAME, AVG(PRICE) FROM ORDERS
GROUP BY PRODACT_NAME;

SELECT PRICE FROM ORDERS
GROUP BY PRICE;

SELECT PRODACT_NAME, PRICE FROM ORDERS
ORDER BY PRICE ASC;

SELECT PRODACT_NAME, PRICE FROM ORDERS WHERE ID<1004 OR ID>=1025
ORDER BY PRODACT_NAME DESC, PRICE ASC;

SELECT COUNT(*) FROM ORDERS;
SELECT COUNT(*) FROM ORDERS;
SELECT COUNT(*) FROM ORDERS GROUP BY PRICE;
SELECT COUNT(*) FROM ORDERS WHERE ID<1004 OR ID>=1025;
SELECT prodact_name, COUNT(*) FROM ORDERS GROUP BY prodact_name;

--SELECT -column1,column2- FROM table_name
--WHERE conditions AND
--EXISTS (SELECT -column1,column2- FROM table_name
--WHERE conditions)

SELECT * FROM ORDERS
WHERE EXISTS(SELECT * FROM products WHERE NAME=ORDERS.PRODACT_NAME);

SELECT * FROM ORDERS
WHERE PRICE BETWEEN 6 AND 140;

SELECT PRICE,COUNT(*) FROM ORDERS WHERE PRICE BETWEEN 6 AND 140 GROUP BY PRICE ORDER BY PRICE ASC;

SELECT * FROM ORDERS WHERE prodact_name LIKE 'A%';

SELECT COUNT(*) FROM ORDERS WHERE prodact_name LIKE 'A%';

SELECT * FROM ORDERS WHERE prodact_name LIKE '%e%t%';


