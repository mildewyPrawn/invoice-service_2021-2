DROP TABLE IF EXISTS invoice;

CREATE TABLE invoice(
	id_invoice INT PRIMARY KEY AUTO_INCREMENT,
        customer_code VARCHAR(100),
        created_at DATE,
        status TINYINT
);

INSERT INTO invoice VALUES(1, '143BUZZGAME1', '2021-05-18',1);
INSERT INTO invoice VALUES(2, '143BUZZGAME2', '2021-05-18',1);

SELECT * FROM invoice;
