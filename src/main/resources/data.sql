DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;

CREATE TABLE `customer` (
  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile_number` varchar(20) NOT NULL,
  `create_date` date DEFAULT NULL
);

CREATE TABLE `accounts` (
  `customer_id` int NOT NULL,
   `account_number` Long AUTO_INCREMENT  PRIMARY KEY,
  `account_type` varchar(100) NOT NULL,
  `branch_locale` varchar(200) NOT NULL,
  `create_date` date DEFAULT NULL
);

INSERT INTO `accounts` (`customer_id`, `account_number`, `account_type`, `branch_locale`, `create_date`)
VALUES (1, 4229003255, 'Savings', '224 Russell Street, New York', CURDATE());

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_date`)
 VALUES ('John Roberts','jr@dbsolutions.com','9876548337',CURDATE());

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_date`)
 VALUES ('Nancy Grays','ng@dbsolutions.com','3524441901',CURDATE());

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_date`)
 VALUES ('Mariam Hart','mh@dbsolutions.com','3522271833',CURDATE());