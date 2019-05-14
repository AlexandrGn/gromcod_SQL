CREATE TABLE ORDERS(
    ORDER_ID NUMBER,
    CONSTRAINT ORDER_PK PRIMARY KEY(ORDER_ID),
    
    CUSTOMER_ID NUMBER,
    CONSTRAINT CUSTOMER_FK FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMERS(CUSTOMER_ID),
    
    EMPLOYEE_ID NUMBER,
    CONSTRAINT EMPLOYEE_FK FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID),
    
    --нужен ли SHIPPERS?
    
    ORDER_DATE TIMESTAMP,
    REQUIRED_DATE TIMESTAMP,
    SHIPPED_DATE TIMESTAMP,
    SHIP_VIA NVARCHAR2(50),
    FREIGHT NVARCHAR2(50),
    SHIP_NAME NVARCHAR2(50),
    SHIP_ADRESS NVARCHAR2(50),
    SHIP_CITY NVARCHAR2(50),
    SHIP_REGION NVARCHAR2(50),
    SHIP_POSTAL_CODE NUMBER(20),
    SHIP_COUNTRY NVARCHAR2(50)
)