-- MySQL dump 10.13  Distrib 5.5.23, for Win32 (x86)
--
-- Host: localhost    Database: abc
-- ------------------------------------------------------
-- Server version	5.5.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `master`
--

DROP TABLE IF EXISTS `master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `master` (
  `it_code` varchar(20) NOT NULL DEFAULT '',
  `it_name` varchar(20) DEFAULT NULL,
  `it_price` varchar(20) DEFAULT NULL,
  `quantity` int(6) DEFAULT NULL,
  PRIMARY KEY (`it_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `master`
--

LOCK TABLES `master` WRITE;
/*!40000 ALTER TABLE `master` DISABLE KEYS */;
INSERT INTO `master` VALUES ('it0001','samsung s7 edge','57000',500),('it0002','samsung s8','60000',495),('it0003','xolo q1010i','10000',500),('it0004','redmi note 3','12598',500),('it0005','iphone 7s ','100000',490),('it0006','nokia 8','40000',500);
/*!40000 ALTER TABLE `master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesreport`
--

DROP TABLE IF EXISTS `salesreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesreport` (
  `tran_id` int(20) NOT NULL AUTO_INCREMENT,
  `adhaar` varchar(16) DEFAULT NULL,
  `zone` varchar(20) DEFAULT NULL,
  `pro_sold` varchar(20) DEFAULT NULL,
  `qty_sold` int(6) DEFAULT NULL,
  `date_sold` date DEFAULT NULL,
  `price` int(20) DEFAULT NULL,
  `total_amt` int(20) DEFAULT NULL,
  `cust_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tran_id`),
  KEY `adhaar` (`adhaar`),
  CONSTRAINT `salesreport_ibfk_1` FOREIGN KEY (`adhaar`) REFERENCES `user` (`adhaar`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesreport`
--

LOCK TABLES `salesreport` WRITE;
/*!40000 ALTER TABLE `salesreport` DISABLE KEYS */;
INSERT INTO `salesreport` VALUES (1,'1231231231231231','East','iphone 7s ',10,'2017-07-18',78000,780000,'Atul'),(2,'1231231231231231','South','samsung s8',5,'2017-07-27',60000,300000,'Aahel');
/*!40000 ALTER TABLE `salesreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `adhaar` varchar(16) NOT NULL DEFAULT '',
  `uname` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `addr` varchar(100) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `c_no` varchar(14) DEFAULT NULL,
  `landline` varchar(16) DEFAULT NULL,
  `prof` varchar(20) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `doc` date DEFAULT NULL,
  PRIMARY KEY (`adhaar`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1231231231231231','ashish','ashish','jamshedpur','Jharkhand','India','831013','07979 756576','06572332847','student','Male','ashish@gmail.com','2017-07-25','2017-07-18'),('1452145214521452','atul','atul','adityapur','jharkhand','india','831013','08877503322','06572332847','student','Male','atul@gmail.com','2017-07-16','2017-07-24');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-19 21:06:59
