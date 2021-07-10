DROP TABLE IF EXISTS invoice_item;

CREATE TABLE invoice_item(
	id_item INT PRIMARY KEY AUTO_INCREMENT,
    id_invoice INT,
    quantity INT,
    tax_percentage DOUBLE,
    product_code VARCHAR(13),
    FOREIGN KEY (id_invoice) REFERENCES invoice(id_invoice)
);

INSERT INTO invoice_item VALUES(1, 1, 1, 0.10, 7501055311453);
INSERT INTO invoice_item VALUES(2, 1, 3, 0.10, 7501008496152);
INSERT INTO invoice_item VALUES(3, 2, 2, 0.16, 7898917592649);

SELECT * FROM invoice_item;
