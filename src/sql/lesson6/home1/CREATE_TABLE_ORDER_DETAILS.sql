CREATE TABLE ORDER_DETAILS(
    ORDER_ID NUMBER NOT NULL,
    PRODUCT_ID NUMBER NOT NULL,
    --нужен ли тут PK
    
    UNIT_PRICE NUMBER,
    QUANTITY NUMBER,
    DISCOUNT NUMBER
)