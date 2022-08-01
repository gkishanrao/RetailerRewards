

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `CUSTOMER_ID` int DEFAULT NULL,
  `CUSTOMER_NAME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;




insert into customer(id, name) values (101, 'Kishan');
insert into customer(id, name) values (102, 'Jyodeep');
insert into customer(id, name) values (103, 'Viksah');



DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `TRANSACTION_ID` int DEFAULT NULL,
  `CUSTOMER_ID` int DEFAULT NULL,
  `TRANSACTION_DATE` date DEFAULT NULL,
  `AMOUNT` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


insert into my_transaction(id, description, total, save_date, customer_id) values (101, 'Purchase 1', 100, '2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (102, 'Purchase 2', 50, ‘2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (103, 'Purchase 3', 120, '2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (104, 'Purchase 10', 175.32, '2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (105, 'Purchase 20', 65.75, '2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (106, 'Purchase 30', 210.50, '2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (109, 'Purchase 31', 42.80, '2022-07-30 10:20:10', 2000);
insert into my_transaction(id, description, total, save_date, customer_id) values (100, 'Purchase 200', 25.60, '2022-07-30 10:20:10', 2002);
insert into my_transaction(id, description, total, save_date, customer_id) values (120, 'Purchase 201', 80.50, '2022-07-30 10:20:10', 2002);
insert into my_transaction(id, description, total, save_date, customer_id) values (122, 'Purchase 202', 116.14, '2022-07-30 10:20:10', 2002);
