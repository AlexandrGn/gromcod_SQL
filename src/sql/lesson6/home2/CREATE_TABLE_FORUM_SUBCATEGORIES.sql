CREATE TABLE FORUM_SUBCATEGORIES(
    ID NUMBER,
    CONSTRAINT FORUM_SUBCATEGORIES_PK PRIMARY KEY(ID),
    
    ID_FORUM_CATEGORIES NUMBER,
    CONSTRAINT FORUM_CATEGORIES_FK FOREIGN KEY(ID_FORUM_CATEGORIES) REFERENCES FORUM_CATEGORIES(ID),
    
    TITLE NVARCHAR2(50),
    DESCRIPTIONs NVARCHAR2(1000),
    DATEs TIMESTAMP,
    IP NVARCHAR2(20)
)