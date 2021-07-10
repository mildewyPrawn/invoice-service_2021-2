DROP TABLE IF EXISTS invoice;

CREATE TABLE invoice(
	id_invoice INT PRIMARY KEY AUTO_INCREMENT,
    customer_code INT,
    created_at DATE,
    status TINYINT
);

INSERT INTO invoice VALUES(1, 1, '2021-05-18',1);
INSERT INTO invoice VALUES(2, 1, '2021-05-18',1);

SELECT * FROM invoice;
