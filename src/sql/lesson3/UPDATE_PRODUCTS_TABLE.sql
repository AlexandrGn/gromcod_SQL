INSERT INTO products VALUES (2001,'candy','test1',10);
INSERT INTO products VALUES (2002,'candy','test1',20);
INSERT INTO products VALUES (2003,'candy','test1',30);
INSERT INTO products VALUES (2004,'candy','test1',40);
INSERT INTO products VALUES (2005,'candy','test1',50);
INSERT INTO products VALUES (2006,'candy','test1',60);
INSERT INTO products VALUES (2007,'candy','test1',70);
INSERT INTO products VALUES (2008,'candy','test1',80);
INSERT INTO products VALUES (2009,'candy','test1',90);
INSERT INTO products VALUES (2010,'candy','test1', 100);

INSERT INTO products VALUES (1001,'candy','test1',50);
INSERT INTO products VALUES (1002,'t-stirt','china11',42);
INSERT INTO products VALUES (1003,'candy','test1',50);

UPDATE products SET manufacturer_name='china' WHERE name='t-stirt';

DELETE FROM products WHERE ID<1050;