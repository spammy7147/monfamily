DROP TABLE monfamily_user;
DROP TABLE monfamily_board;
commit;

CREATE TABLE monfamily_user(
    id NUMBER PRIMARY KEY,
    user_id VARCHAR2(255) UNIQUE NOT NULL,
    user_pw VARCHAR2(255) NOT NULL,
    user_name VARCHAR2(255) NOT NULL,
    user_mail VARCHAR2(255) NOT NULL,
    user_contact NUMBER(20,0) NOT NULL,
    auto_login NUMBER(1,0) DEFAULT 0,
    last_login TIMESTAMP,
    reg_date TIMESTAMP NOT NULL,
    modified_date TIMESTAMP
    
);

CREATE TABLE monfamily_board(
    id NUMBER PRIMARY KEY,
    writer VARCHAR2(255) NOT NULL,
    title VARCHAR2(1000) NOT NULL,
    content VARCHAR2(4000) NOT NULL,
    reg_date TIMESTAMP NOT NULL,
    modified_date TIMESTAMP,
    CONSTRAINT FK_writer FOREIGN KEY (writer) 
    REFERENCES monfamily_user(user_id)
);


SELECT * FROM monfamily_user;
SELECT * FROM monfamily_board;