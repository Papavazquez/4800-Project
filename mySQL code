USE CPP_PARKING_SYSTEM;
DROP TABLE PaymentMethod;
DROP TABLE Permit;
DROP TABLE Rate;
DROP TABLE Vehicle;
DROP TABLE Customer;

CREATE TABLE Customer (
	broncoID INT (9),
    firstName VARCHAR (20),
    lastName VARCHAR (50),
    emailAddress VARCHAR (50),
    address VARCHAR (50),
    checkStudent BOOLEAN,
    PRIMARY KEY (broncoID)
);

CREATE TABLE PaymentMethod (
    broncoID INT (9),
    cardNumber BIGINT (19),
    securityCode INT (3),
    expirationDateMonth INT (2),
    expirationDateYear INT (4),
    firstName VARCHAR (20),
    lastName VARCHAR (50),
    address VARCHAR (50),
    zip INT(5),
    FOREIGN KEY (broncoID) REFERENCES Customer (broncoID),
    PRIMARY KEY (cardNumber, broncoID)
);
CREATE TABLE Vehicle (
	vin VARCHAR (17),
    broncoID INT (9),
    licensePlate VARCHAR (7),
    vehicleType VARCHAR (20),
    vehicleMake VARCHAR (20),
    vehicleColor VARCHAR (15),
    vehicleYear INT (4),
    state VARCHAR (15),
    appears BOOLEAN,
    FOREIGN KEY (broncoID) REFERENCES Customer (broncoID),
    PRIMARY KEY (vin)
);

CREATE TABLE Rate (
	rateID INT (2),
    rate INT (3),
    rateDescription VARCHAR (50),
    studentcheck BOOLEAN,
    validDate VARCHAR (10),
    expirationDate VARCHAR (10),
    PRIMARY KEY (rateID)
);

CREATE TABLE Permit (
	permitID INT (9),
    rateID INT (2),
    vin VARCHAR (17),
    FOREIGN KEY (vin) REFERENCES Vehicle (vin),
    FOREIGN KEY (rateID) REFERENCES Rate (rateID),
    PRIMARY KEY (permitID)
);




INSERT INTO Customer VALUES ('111111111', 'Lynn', 'Takahashi','pizzahut@gmail.com','123 Sesame Street',TRUE),
('111111112','Professor','Poopypants','professorpoopy@gmail.com','246 Captain Underpants', FALSE),
('111111113','Ethan','Vazquez','evaq@gmail.com','541 Vazqueef Drive', TRUE);
INSERT INTO PaymentMethod VALUES ('111111111','123456789','123','11','25','Lynn','Takahashi','123 Sesame Street','12345');
INSERT INTO Vehicle VALUES ('12345678901234567','111111111','ABCDEFG','Corolla','Toyota','gray','2012', 'CA', true);
INSERT INTO Rate VALUES ('1', '150', 'STUDENT SPRING MO/WE/FRI', true, '01/16/2022','05/28/2022'),
('2', '150', 'STUDENT SPRING TU/TH', true, '01/16/2022','05/28/2022'),('3', '200', 'STUDENT SPRING WEEK', true, '01/16/2022','05/28/2022'),
('4', '125', 'STUDENT SRPRING MOTOR', true, '01/16/2022','05/28/2022'),('5', '100', 'FACULTY SPRING WEEK', false, '01/16/2022','05/28/2022');
INSERT INTO Permit values ('1', '1', '12345678901234567');




SELECT * FROM Rate;
SELECT firstName, lastName, emailAddress, address, checkStudent FROM Customer WHERE broncoID = 111111111;
SELECT * FROM Vehicle;
