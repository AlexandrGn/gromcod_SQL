CREATE TABLE EMPLOYEES(
    EMPLOYEE_ID NUMBER,
    CONSTRAINT EMPLOYEE_PK PRIMARY KEY(EMPLOYEE_ID),
    
    LAST_NAME NVARCHAR2(50),
    FIRST_NAME NVARCHAR2(50),
    TITLE NVARCHAR2(50),
    TITLE_OF_COURTESY NVARCHAR2(100),
    BIRTH_DATE TIMESTAMP,
    HIRE_DATE TIMESTAMP,
    ADDRESS NVARCHAR2(100),
    CITY NVARCHAR2(100),
    REGION NVARCHAR2(100),
    POSTAL_CODE NUMBER(20),
    COUNTRY NVARCHAR2(100),
    HOME_PHONE NUMBER(20),
    EXTENSION NVARCHAR2(100),
    PHOTO BFILE,
    NOTES NVARCHAR2(2000),
    REPORTS_TO NVARCHAR2(2000)
)
