
CREATE TABLE TEAMDELTACARS.Cars
(
	SerialNumber INT PRIMARY KEY NOT NULL,
	Make VARCHAR(255) NOT NULL,
	Model VARCHAR(255) NOT NULL,
	Year INT NOT NULL,
	Price INT NOT NULL,
);

CREATE TABLE TDELTACARS.Summary
(
	ID INT PRIMARY KEY NOT NULL,
	SubTotal DECIMAL(19,2) NOT NULL
	SalesTax DECIMAL(19,2) NOT NULL
	GrandTotal DECIMAL(19,2) NOT NULL
);

INSERT INTO TEAMDELTACARS.Cars (ID, Make, Model, Year) VALUES
		(1, 'Ferrari', 'Laferrari', '2018','7000000'),
		(2, 'Ferrari', 'F12', '2018','319995'),
		(3, 'Ferrari', 'California', '2018','202723'),
		(4, 'Ferrari', '488 Spider', '2018','280900'),
		(5, 'Ferrari', '599 GTB', '2018','450000'),
		(6, 'Lamborghini', 'Aventador', '2018','417650'),
		(7, 'Lamborghini', 'Urus', '2018','200000'),
		(8, 'Lamborghini', 'Veneno', '2018','4250000'),
		(9, 'Lamborghini', 'Centenario', '2018','1900000'),
		(10, 'Lamborghini', 'Hurracan', '2018','199800'),
		(11, 'Mercedes', 'C63 AMG', '2018','41400'),
		(12, 'Mercedes', 'G-Wagon', '2018','124500'),
		(13, 'Mercedes', 'CLS', '2018','75150'),
		(14, 'Mercedes', 'AMG GT', '2018','157000'),
		(15, 'Mercedes', 'A-Class', '2018','35000'),
		(16, 'Audi', 'R8', '2018','138700');
		(17, 'Audi', 'S4', '2018','50200'),
		(18, 'Audi', 'TTRS', '2018','64900'),
		(19, 'Audi', 'A6 ', '2018','58900'),
		(20, 'Audi', 'RS5 Quattro', '2018','85000');
