CREATE TABLE USERS(
    ID NUMBER,
    CONSTRAINT USERS_PK PRIMARY KEY(ID),
    
    NICK NVARCHAR2(16),
    PASSWORDs NVARCHAR2(128),
    EMAIL NVARCHAR2(128),
    DATEs TIMESTAMP,
    KARMA DECIMAL(9,2),    
    IP NVARCHAR2(20)
)