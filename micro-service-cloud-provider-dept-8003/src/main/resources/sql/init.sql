DROP DATABASE IF EXISTS spring_cloud_db3;

CREATE DATABASE spring_cloud_db3 CHARACTER SET UTF8;

USE spring_cloud_db3;

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dept_no` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) DEFAULT NULL,
  `db_source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `dept` VALUES ('1', '开发部', DATABASE());
INSERT INTO `dept` VALUES ('2', '人事部', DATABASE());
INSERT INTO `dept` VALUES ('3', '财务部', DATABASE());
INSERT INTO `dept` VALUES ('4', '市场部', DATABASE());
INSERT INTO `dept` VALUES ('5', '运维部', DATABASE());