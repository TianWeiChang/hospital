/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2022-10-17 19:10:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `area`
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `areaId` int NOT NULL AUTO_INCREMENT,
  `areaName` varchar(50) NOT NULL,
  PRIMARY KEY (`areaId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of area
-- ----------------------------
INSERT INTO `area` VALUES ('4', '河南省a有限公司 ');

-- ----------------------------
-- Table structure for `ban`
-- ----------------------------
DROP TABLE IF EXISTS `ban`;
CREATE TABLE `ban` (
  `bid` int NOT NULL AUTO_INCREMENT,
  `bname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ban
-- ----------------------------
INSERT INTO `ban` VALUES ('1', '有班');
INSERT INTO `ban` VALUES ('2', '无班');

-- ----------------------------
-- Table structure for `baoque`
-- ----------------------------
DROP TABLE IF EXISTS `baoque`;
CREATE TABLE `baoque` (
  `baoqueid` int NOT NULL AUTO_INCREMENT,
  `baoqueName` varchar(100) DEFAULT NULL,
  `baoqueNum` int DEFAULT NULL,
  PRIMARY KEY (`baoqueid`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of baoque
-- ----------------------------

-- ----------------------------
-- Table structure for `bed`
-- ----------------------------
DROP TABLE IF EXISTS `bed`;
CREATE TABLE `bed` (
  `bedId` int NOT NULL AUTO_INCREMENT,
  `bedname` varchar(300) NOT NULL,
  `departmentId` int NOT NULL,
  `state` int DEFAULT NULL,
  `Price` double DEFAULT NULL,
  PRIMARY KEY (`bedId`),
  KEY `fk_bedDepartmentid` (`departmentId`),
  CONSTRAINT `fk_bedDepartmentid` FOREIGN KEY (`departmentId`) REFERENCES `departments` (`departmentid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bed
-- ----------------------------
INSERT INTO `bed` VALUES ('8', '外科1', '8', '0', '10');
INSERT INTO `bed` VALUES ('9', '内科一', '7', '1', '10');

-- ----------------------------
-- Table structure for `caigou`
-- ----------------------------
DROP TABLE IF EXISTS `caigou`;
CREATE TABLE `caigou` (
  `caigouid` int NOT NULL AUTO_INCREMENT,
  `caigouname` varchar(50) DEFAULT NULL,
  `gonghuoshang` varchar(50) DEFAULT NULL,
  `danwei` varchar(10) DEFAULT NULL,
  `candi` varchar(100) DEFAULT NULL,
  `leixing` varchar(20) DEFAULT NULL,
  `shuliang` int DEFAULT NULL,
  PRIMARY KEY (`caigouid`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of caigou
-- ----------------------------
INSERT INTO `caigou` VALUES ('16', '阿莫西林', '春天大药房 ', '盒', '河南省a有限公司 ', '西药', '20');

-- ----------------------------
-- Table structure for `cashier`
-- ----------------------------
DROP TABLE IF EXISTS `cashier`;
CREATE TABLE `cashier` (
  `cashier` int NOT NULL AUTO_INCREMENT,
  `reportId` int NOT NULL,
  `durgname` varchar(500) NOT NULL,
  `durgnum` int NOT NULL,
  `repiceprice` double NOT NULL,
  `repicetotal` double NOT NULL,
  `state` int DEFAULT NULL,
  `ctime` date DEFAULT NULL,
  `ostate` int DEFAULT NULL,
  `jie` varchar(500) DEFAULT NULL,
  `mstate` int DEFAULT NULL,
  PRIMARY KEY (`cashier`),
  KEY `fk_reportId` (`reportId`),
  CONSTRAINT `fk_reportId` FOREIGN KEY (`reportId`) REFERENCES `report` (`reportid`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cashier
-- ----------------------------
INSERT INTO `cashier` VALUES ('34', '28', '板蓝根', '1', '30', '30', '0', '2019-11-21', null, null, null);
INSERT INTO `cashier` VALUES ('35', '28', '阿莫西林', '1', '30', '30', '0', '2019-11-21', null, null, null);
INSERT INTO `cashier` VALUES ('36', '28', '挂号费', '1', '30', '30', '2', '2019-11-21', null, null, null);
INSERT INTO `cashier` VALUES ('37', '29', 'ct', '1', '100', '100', '1', '2019-11-21', '1', '脑部肿瘤', '1');
INSERT INTO `cashier` VALUES ('38', '29', '打针', '1', '20', '20', '1', '2019-11-21', '0', null, '1');
INSERT INTO `cashier` VALUES ('39', '30', '阿莫西林', '1', '30', '30', '0', '2019-11-21', null, null, null);
INSERT INTO `cashier` VALUES ('40', '30', 'ct', '1', '100', '100', '1', '2019-11-21', '1', '良好', '1');
INSERT INTO `cashier` VALUES ('41', '30', '挂号费', '1', '30', '30', '2', '2019-11-21', null, null, null);
INSERT INTO `cashier` VALUES ('43', '31', 'ct', '1', '100', '100', '1', '2019-11-26', '1', '良好', '1');
INSERT INTO `cashier` VALUES ('44', '31', '打针', '1', '20', '20', '1', '2019-11-26', '0', null, '1');
INSERT INTO `cashier` VALUES ('45', '33', '板蓝根', '10', '30', '300', '0', '2022-10-14', null, null, null);
INSERT INTO `cashier` VALUES ('46', '33', 'ct', '1', '100', '100', '1', '2022-10-14', '1', null, '1');
INSERT INTO `cashier` VALUES ('47', '33', '挂号费', '1', '20', '20', '2', '2022-10-14', null, null, null);

-- ----------------------------
-- Table structure for `checkup`
-- ----------------------------
DROP TABLE IF EXISTS `checkup`;
CREATE TABLE `checkup` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `registerid` int DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `ctime` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `fk_rid` (`registerid`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checkup
-- ----------------------------

-- ----------------------------
-- Table structure for `departments`
-- ----------------------------
DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `departmentId` int NOT NULL AUTO_INCREMENT,
  `department` varchar(300) NOT NULL,
  PRIMARY KEY (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of departments
-- ----------------------------
INSERT INTO `departments` VALUES ('7', '内科');
INSERT INTO `departments` VALUES ('8', '外科');
INSERT INTO `departments` VALUES ('9', '儿科');
INSERT INTO `departments` VALUES ('10', '妇科');

-- ----------------------------
-- Table structure for `doctor`
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `doctorId` int NOT NULL AUTO_INCREMENT,
  `doctorName` varchar(300) NOT NULL,
  `departmentId` int NOT NULL,
  `registeredId` int NOT NULL,
  `dstate` int DEFAULT NULL,
  `amStartTime` varchar(10) DEFAULT '8:00',
  `amEndTime` varchar(10) DEFAULT '12:00',
  `pmStartTime` varchar(10) DEFAULT '14:00',
  `pmEndTime` varchar(10) DEFAULT '18:00',
  PRIMARY KEY (`doctorId`),
  KEY `fk_department` (`departmentId`),
  KEY `fk_registeredtype` (`registeredId`),
  CONSTRAINT `fk_department` FOREIGN KEY (`departmentId`) REFERENCES `departments` (`departmentId`),
  CONSTRAINT `fk_registeredtype` FOREIGN KEY (`registeredId`) REFERENCES `registeredtype` (`registeredid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('13', '华佗', '7', '5', '0', '8:00', '12:00', '14:00', '18:00');
INSERT INTO `doctor` VALUES ('14', '扁鹊', '7', '6', '0', '8:00', '12:00', '14:00', '18:00');
INSERT INTO `doctor` VALUES ('15', '张春明', '7', '5', '1', '8:00', '12:00', '14:00', '18:00');
INSERT INTO `doctor` VALUES ('16', '王二', '8', '5', '1', '8:00', '12:00', '14:00', '18:00');
INSERT INTO `doctor` VALUES ('17', '外壳大佬', '8', '6', '0', '8:00', '12:00', '14:00', '18:00');
INSERT INTO `doctor` VALUES ('18', '内科1', '7', '6', '0', '8:00', '12:00', '14:00', '18:00');

-- ----------------------------
-- Table structure for `drugdictionary`
-- ----------------------------
DROP TABLE IF EXISTS `drugdictionary`;
CREATE TABLE `drugdictionary` (
  `drugId` int NOT NULL AUTO_INCREMENT,
  `drugName` varchar(50) NOT NULL,
  `unitId` int NOT NULL,
  `sellingPrice` double NOT NULL,
  `areaId` int NOT NULL,
  `typeId` int NOT NULL,
  PRIMARY KEY (`drugId`),
  KEY `fk_unitid` (`unitId`),
  KEY `fk_areaId` (`areaId`),
  KEY `fk_typeId` (`typeId`),
  CONSTRAINT `fk_areaId` FOREIGN KEY (`areaId`) REFERENCES `area` (`areaId`),
  CONSTRAINT `fk_typeId` FOREIGN KEY (`typeId`) REFERENCES `type` (`typeid`),
  CONSTRAINT `fk_unitid` FOREIGN KEY (`unitId`) REFERENCES `unit` (`unitid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugdictionary
-- ----------------------------
INSERT INTO `drugdictionary` VALUES ('9', '阿莫西林', '7', '30', '4', '5');
INSERT INTO `drugdictionary` VALUES ('10', '板蓝根', '9', '30', '4', '5');

-- ----------------------------
-- Table structure for `drugstore`
-- ----------------------------
DROP TABLE IF EXISTS `drugstore`;
CREATE TABLE `drugstore` (
  `rugstoreId` int NOT NULL AUTO_INCREMENT,
  `drugstoreName` varchar(100) NOT NULL,
  `supplierId` int DEFAULT NULL,
  `skullId` int DEFAULT NULL,
  `warehouseId` int DEFAULT NULL,
  `unit` int NOT NULL,
  `tradePrice` double NOT NULL,
  `sellingPrice` double NOT NULL,
  `area` int NOT NULL,
  `type` int NOT NULL,
  `produceDate` date NOT NULL,
  `validDate` date NOT NULL,
  `drugstorenum` int NOT NULL,
  `batch` varchar(200) NOT NULL,
  PRIMARY KEY (`rugstoreId`),
  KEY `fk_supplierId` (`supplierId`),
  KEY `fk_skullId` (`skullId`),
  KEY `fk_warehouseId` (`warehouseId`),
  KEY `fk_dgarea` (`area`),
  KEY `fk_dgunit` (`unit`),
  KEY `fk_dtype` (`type`),
  CONSTRAINT `fk_dgarea` FOREIGN KEY (`area`) REFERENCES `area` (`areaId`),
  CONSTRAINT `fk_dgunit` FOREIGN KEY (`unit`) REFERENCES `unit` (`unitid`),
  CONSTRAINT `fk_dtype` FOREIGN KEY (`type`) REFERENCES `type` (`typeid`),
  CONSTRAINT `fk_skullId` FOREIGN KEY (`skullId`) REFERENCES `skull` (`skullid`),
  CONSTRAINT `fk_supplierId` FOREIGN KEY (`supplierId`) REFERENCES `upplier` (`supplierid`),
  CONSTRAINT `fk_warehouseId` FOREIGN KEY (`warehouseId`) REFERENCES `warehuose` (`warehouseid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugstore
-- ----------------------------
INSERT INTO `drugstore` VALUES ('12', '板蓝根', '5', '4', '2', '9', '10', '30', '4', '5', '2019-10-30', '2020-01-04', '40', '20191121');
INSERT INTO `drugstore` VALUES ('14', '板蓝根', '5', '4', '2', '9', '9.9', '30', '4', '5', '2022-09-01', '2023-06-29', '22', '2022929');

-- ----------------------------
-- Table structure for `home`
-- ----------------------------
DROP TABLE IF EXISTS `home`;
CREATE TABLE `home` (
  `homeId` int NOT NULL AUTO_INCREMENT,
  `homeName` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `carId` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`homeId`)
) ENGINE=MyISAM AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of home
-- ----------------------------
INSERT INTO `home` VALUES ('73', '敲门', '男', '19', null, null);
INSERT INTO `home` VALUES ('74', '魏坚', '男', '19', '412823199912242414', '17634525258');

-- ----------------------------
-- Table structure for `hospitalprice`
-- ----------------------------
DROP TABLE IF EXISTS `hospitalprice`;
CREATE TABLE `hospitalprice` (
  `hospitalpriceid` int NOT NULL AUTO_INCREMENT,
  `registerId` int NOT NULL,
  `durgname` varchar(500) NOT NULL,
  `durgnum` int NOT NULL,
  `repiceprice` double NOT NULL,
  `repicetotal` double NOT NULL,
  `htime` datetime DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`hospitalpriceid`),
  KEY `fk_registerId` (`registerId`)
) ENGINE=MyISAM AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospitalprice
-- ----------------------------
INSERT INTO `hospitalprice` VALUES ('104', '12', '开颅手术', '1', '500', '500', '2019-11-21 15:12:26', '1');
INSERT INTO `hospitalprice` VALUES ('105', '12', '阿莫西林', '2', '30', '60', '2019-11-21 15:13:47', '2');
INSERT INTO `hospitalprice` VALUES ('106', '13', '板蓝根', '1', '30', '30', '2019-11-26 19:11:44', '0');

-- ----------------------------
-- Table structure for `huishou`
-- ----------------------------
DROP TABLE IF EXISTS `huishou`;
CREATE TABLE `huishou` (
  `huishouid` int NOT NULL AUTO_INCREMENT,
  `huishouname` varchar(50) NOT NULL,
  `huishounumber` int NOT NULL,
  `huishoupihao` varchar(50) DEFAULT NULL,
  `jbr` varchar(10) DEFAULT NULL,
  `beizhu` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`huishouid`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of huishou
-- ----------------------------
INSERT INTO `huishou` VALUES ('5', '阿莫西林', '17', '20191121', '门诊', '有问题，请更换 20盒');

-- ----------------------------
-- Table structure for `inhospitaltype`
-- ----------------------------
DROP TABLE IF EXISTS `inhospitaltype`;
CREATE TABLE `inhospitaltype` (
  `inhospitalId` int NOT NULL AUTO_INCREMENT,
  `projectName` varchar(300) NOT NULL,
  `unit` int NOT NULL,
  `price` double NOT NULL,
  `bigprojectId` int NOT NULL,
  PRIMARY KEY (`inhospitalId`),
  KEY `fk_inhospitaltype` (`bigprojectId`),
  KEY `fk_inhunit` (`unit`),
  CONSTRAINT `fk_inhospitaltype` FOREIGN KEY (`bigprojectId`) REFERENCES `projecttype` (`projectid`),
  CONSTRAINT `fk_inhunit` FOREIGN KEY (`unit`) REFERENCES `unit` (`unitid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inhospitaltype
-- ----------------------------

-- ----------------------------
-- Table structure for `inoutpatienttype`
-- ----------------------------
DROP TABLE IF EXISTS `inoutpatienttype`;
CREATE TABLE `inoutpatienttype` (
  `inoutpatientId` int NOT NULL AUTO_INCREMENT,
  `projectName` varchar(300) NOT NULL,
  `unit` int NOT NULL,
  `bigproJectId` int NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`inoutpatientId`),
  KEY `fk_inoutpatienttype` (`bigproJectId`),
  KEY `fk_intunit` (`unit`),
  CONSTRAINT `fk_inoutpatienttype` FOREIGN KEY (`bigproJectId`) REFERENCES `projecttype` (`projectid`),
  CONSTRAINT `fk_intunit` FOREIGN KEY (`unit`) REFERENCES `unit` (`unitid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inoutpatienttype
-- ----------------------------
INSERT INTO `inoutpatienttype` VALUES ('5', '开颅手术', '8', '1', '500');

-- ----------------------------
-- Table structure for `jilu`
-- ----------------------------
DROP TABLE IF EXISTS `jilu`;
CREATE TABLE `jilu` (
  `jiluid` int NOT NULL AUTO_INCREMENT,
  `jiluname` varchar(50) NOT NULL,
  `jilutime` datetime NOT NULL,
  `jilutype` varchar(50) NOT NULL,
  `jilupeople` varchar(20) NOT NULL,
  `jilunumber` int DEFAULT NULL,
  `jilupihao` varchar(50) NOT NULL,
  PRIMARY KEY (`jiluid`)
) ENGINE=MyISAM AUTO_INCREMENT=194 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jilu
-- ----------------------------
INSERT INTO `jilu` VALUES ('187', '板蓝根', '2019-11-21 14:58:00', '常规入库', '门诊', '100', '20191121');
INSERT INTO `jilu` VALUES ('188', '阿莫西林', '2019-11-21 14:58:46', '常规入库', '门诊', '30', '20191121');
INSERT INTO `jilu` VALUES ('189', '阿莫西林', '2019-11-21 14:59:42', '正常出库', '门诊', '20', '20191121');
INSERT INTO `jilu` VALUES ('190', '板蓝根', '2019-11-21 14:59:49', '正常出库', '门诊', '50', '20191121');
INSERT INTO `jilu` VALUES ('191', '板蓝根', '2019-11-21 15:17:48', '紧急补给药房', '门诊', '10', '20191121');
INSERT INTO `jilu` VALUES ('192', '阿莫西林', '2019-11-21 15:24:55', '正常出库', '门诊', '10', '20191121');
INSERT INTO `jilu` VALUES ('193', '板蓝根', '2022-09-29 10:17:07', '常规入库', 'tian', '22', '2022929');

-- ----------------------------
-- Table structure for `moneytype`
-- ----------------------------
DROP TABLE IF EXISTS `moneytype`;
CREATE TABLE `moneytype` (
  `MoneyId` int NOT NULL AUTO_INCREMENT,
  `Moneytype` varchar(300) NOT NULL,
  `Percent` varchar(30) NOT NULL,
  PRIMARY KEY (`MoneyId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of moneytype
-- ----------------------------
INSERT INTO `moneytype` VALUES ('10', '无', '0%');
INSERT INTO `moneytype` VALUES ('11', '城镇社保', '30%');
INSERT INTO `moneytype` VALUES ('12', '农村医疗合作社', '35%');

-- ----------------------------
-- Table structure for `outpatienttype`
-- ----------------------------
DROP TABLE IF EXISTS `outpatienttype`;
CREATE TABLE `outpatienttype` (
  `outpatientId` int NOT NULL AUTO_INCREMENT,
  `projectName` varchar(300) NOT NULL,
  `unit` int NOT NULL,
  `bigprojectId` int NOT NULL,
  `price` double NOT NULL,
  `ostate` int DEFAULT NULL,
  PRIMARY KEY (`outpatientId`),
  KEY `fk_outpatienttype` (`bigprojectId`),
  KEY `fk_outunit` (`unit`),
  CONSTRAINT `fk_outpatienttype` FOREIGN KEY (`bigprojectId`) REFERENCES `projecttype` (`projectid`),
  CONSTRAINT `fk_outunit` FOREIGN KEY (`unit`) REFERENCES `unit` (`unitid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outpatienttype
-- ----------------------------
INSERT INTO `outpatienttype` VALUES ('7', 'ct', '8', '2', '100', '1');
INSERT INTO `outpatienttype` VALUES ('8', '打针', '8', '2', '20', '0');

-- ----------------------------
-- Table structure for `paiban`
-- ----------------------------
DROP TABLE IF EXISTS `paiban`;
CREATE TABLE `paiban` (
  `paiId` int NOT NULL AUTO_INCREMENT,
  `one` varchar(50) DEFAULT '无班',
  `two` varchar(50) DEFAULT '无班',
  `three` varchar(50) DEFAULT '无班',
  `four` varchar(50) DEFAULT '无班',
  `five` varchar(50) DEFAULT '无班',
  `six` varchar(50) DEFAULT '无班',
  `seven` varchar(50) DEFAULT '无班',
  `doctorId` int DEFAULT NULL,
  PRIMARY KEY (`paiId`),
  KEY `fk_paiId` (`doctorId`),
  CONSTRAINT `fk_paiId` FOREIGN KEY (`doctorId`) REFERENCES `doctor` (`doctorId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paiban
-- ----------------------------
INSERT INTO `paiban` VALUES ('12', '有班', '有班', '有班', '有班', '有班', '有班', '有班', '16');
INSERT INTO `paiban` VALUES ('13', '有班', '有班', '有班', '有班', '有班', '有班', '有班', '15');
INSERT INTO `paiban` VALUES ('14', '有班', '有班', '有班', '有班', '有班', '有班', '有班', '14');
INSERT INTO `paiban` VALUES ('15', '有班', '有班', '有班', '无班', '有班', '有班', '有班', '13');

-- ----------------------------
-- Table structure for `pay`
-- ----------------------------
DROP TABLE IF EXISTS `pay`;
CREATE TABLE `pay` (
  `payid` int NOT NULL AUTO_INCREMENT,
  `registerid` int DEFAULT NULL,
  `money` double DEFAULT NULL,
  `payDate` datetime DEFAULT NULL,
  PRIMARY KEY (`payid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pay
-- ----------------------------
INSERT INTO `pay` VALUES ('9', '12', '10', '2019-11-21 15:13:09');
INSERT INTO `pay` VALUES ('10', '13', '10', '2019-11-26 09:44:56');

-- ----------------------------
-- Table structure for `pharmacy`
-- ----------------------------
DROP TABLE IF EXISTS `pharmacy`;
CREATE TABLE `pharmacy` (
  `pharmacyId` int NOT NULL AUTO_INCREMENT,
  `pharmacyName` varchar(50) NOT NULL,
  `drugstoreId` int DEFAULT NULL,
  `skullId` int DEFAULT NULL,
  `warehouseId` int DEFAULT NULL,
  `unit` int NOT NULL,
  `sellingPrice` double NOT NULL,
  `area` int NOT NULL,
  `type` int NOT NULL,
  `produceDate` date NOT NULL,
  `validDate` date NOT NULL,
  `drugstorenum` int NOT NULL,
  `skullbatch` varchar(200) NOT NULL,
  PRIMARY KEY (`pharmacyId`),
  KEY `fk_drugstoreIdp` (`drugstoreId`),
  KEY `fk_skullIdp` (`skullId`),
  KEY `fk_warehouseIdp` (`warehouseId`),
  KEY `fk_dgareap` (`area`),
  KEY `fk_unitp` (`unit`),
  KEY `fk_typep` (`type`),
  CONSTRAINT `fk_dgareap` FOREIGN KEY (`area`) REFERENCES `area` (`areaId`),
  CONSTRAINT `fk_drugstoreIdp` FOREIGN KEY (`drugstoreId`) REFERENCES `drugstore` (`rugstoreId`),
  CONSTRAINT `fk_skullIdp` FOREIGN KEY (`skullId`) REFERENCES `skull` (`skullid`),
  CONSTRAINT `fk_typep` FOREIGN KEY (`type`) REFERENCES `type` (`typeid`),
  CONSTRAINT `fk_unitp` FOREIGN KEY (`unit`) REFERENCES `unit` (`unitid`),
  CONSTRAINT `fk_warehouseIdp` FOREIGN KEY (`warehouseId`) REFERENCES `warehuose` (`warehouseid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pharmacy
-- ----------------------------
INSERT INTO `pharmacy` VALUES ('11', '板蓝根', null, '4', '2', '9', '30', '4', '5', '2019-10-30', '2020-01-04', '48', '20191121');
INSERT INTO `pharmacy` VALUES ('12', '阿莫西林', null, '4', '2', '7', '30', '4', '5', '2019-10-25', '2020-02-01', '9', '20191121');

-- ----------------------------
-- Table structure for `projecttype`
-- ----------------------------
DROP TABLE IF EXISTS `projecttype`;
CREATE TABLE `projecttype` (
  `projectId` int NOT NULL AUTO_INCREMENT,
  `projectName` varchar(300) NOT NULL,
  PRIMARY KEY (`projectId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projecttype
-- ----------------------------
INSERT INTO `projecttype` VALUES ('1', '住院医疗综合服务类');
INSERT INTO `projecttype` VALUES ('2', '门诊医疗综合服务类');

-- ----------------------------
-- Table structure for `register`
-- ----------------------------
DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `registerid` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(200) NOT NULL,
  `age` int NOT NULL,
  `sex` varchar(20) NOT NULL,
  `department` int NOT NULL,
  `doctor` int NOT NULL,
  `diagnose` varchar(500) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `Phone` varchar(30) DEFAULT NULL,
  `Idcard` varchar(60) DEFAULT NULL,
  `registerDate` datetime DEFAULT NULL,
  `bedNum` int DEFAULT NULL,
  `Operator` varchar(200) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `state` int DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `price` double unsigned DEFAULT NULL,
  `discount` varchar(10) DEFAULT NULL,
  `zhuan` datetime DEFAULT NULL,
  PRIMARY KEY (`registerid`),
  KEY `fk_regdepartment` (`department`),
  KEY `fk_regdoctor` (`doctor`),
  CONSTRAINT `fk_regdepartment` FOREIGN KEY (`department`) REFERENCES `departments` (`departmentId`),
  CONSTRAINT `fk_regdoctor` FOREIGN KEY (`doctor`) REFERENCES `doctor` (`doctorId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of register
-- ----------------------------
INSERT INTO `register` VALUES ('12', '李福州', '20', '男', '7', '15', '脑部肿瘤', '河南', '15565792390', '412827199605062586', '2019-11-21 15:11:17', '9', '门诊', '10010', '1', '2019-11-21 15:14:05', '392', '30%', null);
INSERT INTO `register` VALUES ('13', 'song', '12', '男', '7', '15', '良好', '河南', '13271678052', '412702199902080557', '2019-11-26 09:39:50', '9', '超级管理员', '1010', '0', null, null, '35%', null);

-- ----------------------------
-- Table structure for `registeredtype`
-- ----------------------------
DROP TABLE IF EXISTS `registeredtype`;
CREATE TABLE `registeredtype` (
  `registeredId` int NOT NULL AUTO_INCREMENT,
  `type` varchar(300) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`registeredId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registeredtype
-- ----------------------------
INSERT INTO `registeredtype` VALUES ('5', '普通挂号', '20');
INSERT INTO `registeredtype` VALUES ('6', '专家号', '30');

-- ----------------------------
-- Table structure for `report`
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `reportId` int NOT NULL AUTO_INCREMENT,
  `reportName` varchar(100) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `department` int DEFAULT NULL,
  `doctor` int DEFAULT NULL,
  `reportType` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `users` varchar(100) DEFAULT NULL,
  `state` int DEFAULT NULL,
  `phone` varchar(100) NOT NULL,
  `carid` varchar(100) NOT NULL,
  `zhuan` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`reportId`),
  KEY `fk_departmentr` (`department`),
  KEY `fk_doctor` (`doctor`),
  KEY `fk_reportType` (`reportType`),
  CONSTRAINT `fk_departmentr` FOREIGN KEY (`department`) REFERENCES `departments` (`departmentId`),
  CONSTRAINT `fk_doctor` FOREIGN KEY (`doctor`) REFERENCES `doctor` (`doctorId`),
  CONSTRAINT `fk_reportType` FOREIGN KEY (`reportType`) REFERENCES `registeredtype` (`registeredId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('28', '送高帅', '男', '20', '7', '14', '6', '30', '2019-11-21 14:00:00', null, '3', '13183380740', '412827199807156595', '头痛，发烧');
INSERT INTO `report` VALUES ('29', '李福州', '男', '20', '7', '14', '6', '30', '2019-11-21 15:04:50', '门诊', '5', '15565792390', '412827199605062586', '脑部肿瘤');
INSERT INTO `report` VALUES ('30', '杨帅', '男', '20', '7', '14', '6', '30', '2019-11-21 14:00:00', null, '3', '13183380740', '412369199512023695', '头痛');
INSERT INTO `report` VALUES ('31', 'song', '男', '12', '7', '13', '5', '20', '2019-11-26 09:16:47', '超级管理员', '5', '13271678052', '412702199902080557', '良好');
INSERT INTO `report` VALUES ('32', 'ss', '男', '21', '7', '13', '5', '20', '2022-09-16 15:30:57', 'tian', '3', '18257160325', '522228199601011528', null);
INSERT INTO `report` VALUES ('33', '小鱼儿', '男', '30', '7', '13', '5', '20', '2022-10-14 17:03:50', '超级管理员', '3', '18257160371', '423156199601012541', '穷病');
INSERT INTO `report` VALUES ('34', '张三', '男', '25', '7', '13', '5', '20', '2022-10-14 19:23:27', '超级管理员', '1', '18257160371', '432156199610151254', null);

-- ----------------------------
-- Table structure for `skull`
-- ----------------------------
DROP TABLE IF EXISTS `skull`;
CREATE TABLE `skull` (
  `skullId` int NOT NULL AUTO_INCREMENT,
  `skullName` varchar(300) NOT NULL,
  PRIMARY KEY (`skullId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of skull
-- ----------------------------
INSERT INTO `skull` VALUES ('4', '张山');

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pid` int DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `href` varchar(255) DEFAULT NULL,
  `spread` int DEFAULT NULL COMMENT '0不展开1展开',
  `target` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `available` int DEFAULT NULL COMMENT '0不可用1可用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '0', '医院管理系统', '', '1', null, '&#xe68e;', '1');
INSERT INTO `sys_menu` VALUES ('2', '1', '门诊管理', '', '0', null, '&#xe653;', '1');
INSERT INTO `sys_menu` VALUES ('3', '1', '住院管理', '', '0', null, '&#xe663;', '1');
INSERT INTO `sys_menu` VALUES ('4', '1', '系统管理', '', '0', '', '&#xe716;', '1');
INSERT INTO `sys_menu` VALUES ('5', '1', '统计管理', '', '0', null, '&#xe629;', '1');
INSERT INTO `sys_menu` VALUES ('6', '2', '用户挂号', '../cao/index', '0', null, '&#xe770;', '1');
INSERT INTO `sys_menu` VALUES ('7', '2', '处方划价', '../caocc/cc', '0', null, '&#xe657;', '1');
INSERT INTO `sys_menu` VALUES ('8', '3', '入院登记', '../liao/admin', '0', null, '&#xe65b;', '1');
INSERT INTO `sys_menu` VALUES ('9', '3', '缴费管理', '../liao/pay', '0', null, '&#xe6b2;', '1');
INSERT INTO `sys_menu` VALUES ('11', '3', '药品记账', '../liao/drug', '0', null, '&#xe705;', '1');
INSERT INTO `sys_menu` VALUES ('12', '4', '菜单管理', '../toMenuManager', '0', null, '&#xe60f;', '1');
INSERT INTO `sys_menu` VALUES ('13', '4', '角色管理', '../toLoadAllRole', '0', '', '&#xe66f;', '1');
INSERT INTO `sys_menu` VALUES ('14', '4', '用户管理', '../toLoadAllUser', '0', null, '&#xe770;', '1');
INSERT INTO `sys_menu` VALUES ('15', '4', '图标管理', '../icon', '0', null, '&#xe655;', '1');
INSERT INTO `sys_menu` VALUES ('17', '4', '数据源监控', '../druid', '0', null, '&#xe857;', '1');
INSERT INTO `sys_menu` VALUES ('18', '5', '门诊月度统计', '../toReportFinance', '0', null, '&#xe63c;', '1');
INSERT INTO `sys_menu` VALUES ('19', '5', '住院月度统计', '../toZhuYaunManage', '0', null, '&#xe62c;', '1');
INSERT INTO `sys_menu` VALUES ('20', '5', '门诊年度统计', '../toBingYear', '0', null, '&#xe62d;', '1');
INSERT INTO `sys_menu` VALUES ('27', '2', '项目划价', '../caoout/xiang', '0', null, '&#xe60a;', '1');
INSERT INTO `sys_menu` VALUES ('28', '2', '项目缴费', '../xpay/xiangpay', '0', null, '&#xe65e;', '1');
INSERT INTO `sys_menu` VALUES ('30', '1', '数据中心', '', '0', null, '&#xe60a;', '1');
INSERT INTO `sys_menu` VALUES ('31', '30', '科室中心', '../toDepartments', '0', null, '&#xe68e;', '1');
INSERT INTO `sys_menu` VALUES ('32', '30', '医生列表', '../toDoctor', '0', null, '&#xe66f;', '1');
INSERT INTO `sys_menu` VALUES ('33', '30', '药品产地', '../toArea', '0', null, '&#xe630;', '1');
INSERT INTO `sys_menu` VALUES ('36', '30', '项目大类', '../toProjectTypeManage', '0', null, '&#xe620;', '1');
INSERT INTO `sys_menu` VALUES ('37', '30', '挂号类型', '../toRegisteredType', '0', null, '&#xe672;', '1');
INSERT INTO `sys_menu` VALUES ('40', '30', '仓库', '../toWarehuose', '0', null, '&#xe60a;', '1');
INSERT INTO `sys_menu` VALUES ('41', '30', '经办人', '../toSkull', '0', null, '&#xe612;', '1');
INSERT INTO `sys_menu` VALUES ('42', '30', '计量单位', '../toUnit', '0', null, '&#xe62a;', '1');
INSERT INTO `sys_menu` VALUES ('43', '30', '供货商', '../toSupply', '0', null, '&#xe613;', '1');
INSERT INTO `sys_menu` VALUES ('44', '30', '药品分类', '../toType', '0', null, '&#xe656;', '1');
INSERT INTO `sys_menu` VALUES ('46', '1', '排班管理', '1', '0', null, '&#xe770;', '1');
INSERT INTO `sys_menu` VALUES ('47', '46', '医生排班', '../toPaiban', '0', null, '&#xe770;', '1');
INSERT INTO `sys_menu` VALUES ('48', '30', '药品字典', '../toDrugdictionary', '0', null, '&#xe64d;', '1');
INSERT INTO `sys_menu` VALUES ('49', '3', '项目记账', '../liao/item', '0', null, '&#xe705;', '1');
INSERT INTO `sys_menu` VALUES ('52', '5', '住院年度统计', '../toBing2', '0', null, '&#xe630;', '1');
INSERT INTO `sys_menu` VALUES ('53', '2', '项目检查', '../xpay/seljian', '0', null, '&#xe674;', '1');
INSERT INTO `sys_menu` VALUES ('54', '1', '仓库管理', '', '0', null, '&#xe61c;', '1');
INSERT INTO `sys_menu` VALUES ('55', '54', '入库单', '../dsnavigation/beputinstorage', '0', null, '&#xe657;', '1');
INSERT INTO `sys_menu` VALUES ('56', '5', '医生统计对比', '../toDoctorDuibi', '0', null, '&#xe770;', '1');
INSERT INTO `sys_menu` VALUES ('57', '54', '库存查询', '../dsnavigation/selectdurg', '0', null, '&#xe62a;', '1');
INSERT INTO `sys_menu` VALUES ('58', '54', '出库单', '../dsnavigation/selectchuku', '0', null, '&#xe621;', '1');
INSERT INTO `sys_menu` VALUES ('59', '54', '库存不足', '../dsnavigation/selectless', '0', null, '&#xe6b2;', '1');
INSERT INTO `sys_menu` VALUES ('60', '54', '过期提醒', '../dsnavigation/seldrugDate', '0', null, '&#xe702;', '1');
INSERT INTO `sys_menu` VALUES ('61', '1', '药房管理', '', '0', null, '&#xe705;', '1');
INSERT INTO `sys_menu` VALUES ('62', '61', '药房详情', '../dsnavigation/pharymacyhtml', '0', null, '&#xe632;', '1');
INSERT INTO `sys_menu` VALUES ('64', '2', '药品缴费', '../caoout/out', '0', null, '&#xe65e;', '1');
INSERT INTO `sys_menu` VALUES ('65', '5', '门诊当天统计', '../toCurrent', '0', null, '&#xe60e;', '1');
INSERT INTO `sys_menu` VALUES ('69', '2', '门诊患者库', '../caotake/haun', '0', null, '&#xe66f;', '1');
INSERT INTO `sys_menu` VALUES ('70', '54', '操作记录', '../dsnavigation/record', '0', null, '&#xe6b2;', '1');
INSERT INTO `sys_menu` VALUES ('71', '54', '药品回收', '../dsnavigation/recycle', '0', null, '&#xe669;', '1');
INSERT INTO `sys_menu` VALUES ('72', '61', '门诊取药', '../caotake/seltake', '0', null, '&#xe857;', '1');
INSERT INTO `sys_menu` VALUES ('73', '61', '住院取药', '../liao/pharmacy', '0', null, '&#xe63c;', '1');
INSERT INTO `sys_menu` VALUES ('86', '3', '出院结算', '../liao/leave', '0', null, '&#xe65a;', '1');
INSERT INTO `sys_menu` VALUES ('90', '2', 'test', '', '0', null, '&#xe678;', '1');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `roleid` int NOT NULL AUTO_INCREMENT,
  `rolename` varchar(255) DEFAULT NULL,
  `roledesc` varchar(255) DEFAULT NULL,
  `available` int DEFAULT NULL,
  PRIMARY KEY (`roleid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '超级管理员', '拥有所有菜单权限', '1');
INSERT INTO `sys_role` VALUES ('4', '门诊管理', '拥有门诊管理的权限', '1');
INSERT INTO `sys_role` VALUES ('5', '挂号', '挂号人员', '1');

-- ----------------------------
-- Table structure for `sys_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `rid` int NOT NULL,
  `mid` int NOT NULL,
  PRIMARY KEY (`rid`,`mid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1');
INSERT INTO `sys_role_menu` VALUES ('1', '2');
INSERT INTO `sys_role_menu` VALUES ('1', '3');
INSERT INTO `sys_role_menu` VALUES ('1', '4');
INSERT INTO `sys_role_menu` VALUES ('1', '5');
INSERT INTO `sys_role_menu` VALUES ('1', '6');
INSERT INTO `sys_role_menu` VALUES ('1', '7');
INSERT INTO `sys_role_menu` VALUES ('1', '8');
INSERT INTO `sys_role_menu` VALUES ('1', '9');
INSERT INTO `sys_role_menu` VALUES ('1', '10');
INSERT INTO `sys_role_menu` VALUES ('1', '11');
INSERT INTO `sys_role_menu` VALUES ('1', '12');
INSERT INTO `sys_role_menu` VALUES ('1', '13');
INSERT INTO `sys_role_menu` VALUES ('1', '14');
INSERT INTO `sys_role_menu` VALUES ('1', '15');
INSERT INTO `sys_role_menu` VALUES ('1', '17');
INSERT INTO `sys_role_menu` VALUES ('1', '18');
INSERT INTO `sys_role_menu` VALUES ('1', '19');
INSERT INTO `sys_role_menu` VALUES ('1', '20');
INSERT INTO `sys_role_menu` VALUES ('1', '27');
INSERT INTO `sys_role_menu` VALUES ('1', '28');
INSERT INTO `sys_role_menu` VALUES ('1', '30');
INSERT INTO `sys_role_menu` VALUES ('1', '31');
INSERT INTO `sys_role_menu` VALUES ('1', '32');
INSERT INTO `sys_role_menu` VALUES ('1', '33');
INSERT INTO `sys_role_menu` VALUES ('1', '36');
INSERT INTO `sys_role_menu` VALUES ('1', '37');
INSERT INTO `sys_role_menu` VALUES ('1', '40');
INSERT INTO `sys_role_menu` VALUES ('1', '41');
INSERT INTO `sys_role_menu` VALUES ('1', '42');
INSERT INTO `sys_role_menu` VALUES ('1', '43');
INSERT INTO `sys_role_menu` VALUES ('1', '44');
INSERT INTO `sys_role_menu` VALUES ('1', '46');
INSERT INTO `sys_role_menu` VALUES ('1', '47');
INSERT INTO `sys_role_menu` VALUES ('1', '48');
INSERT INTO `sys_role_menu` VALUES ('1', '49');
INSERT INTO `sys_role_menu` VALUES ('1', '52');
INSERT INTO `sys_role_menu` VALUES ('1', '53');
INSERT INTO `sys_role_menu` VALUES ('1', '54');
INSERT INTO `sys_role_menu` VALUES ('1', '55');
INSERT INTO `sys_role_menu` VALUES ('1', '56');
INSERT INTO `sys_role_menu` VALUES ('1', '57');
INSERT INTO `sys_role_menu` VALUES ('1', '58');
INSERT INTO `sys_role_menu` VALUES ('1', '59');
INSERT INTO `sys_role_menu` VALUES ('1', '60');
INSERT INTO `sys_role_menu` VALUES ('1', '61');
INSERT INTO `sys_role_menu` VALUES ('1', '62');
INSERT INTO `sys_role_menu` VALUES ('1', '64');
INSERT INTO `sys_role_menu` VALUES ('1', '65');
INSERT INTO `sys_role_menu` VALUES ('1', '69');
INSERT INTO `sys_role_menu` VALUES ('1', '70');
INSERT INTO `sys_role_menu` VALUES ('1', '71');
INSERT INTO `sys_role_menu` VALUES ('1', '72');
INSERT INTO `sys_role_menu` VALUES ('1', '73');
INSERT INTO `sys_role_menu` VALUES ('1', '86');
INSERT INTO `sys_role_menu` VALUES ('1', '88');
INSERT INTO `sys_role_menu` VALUES ('4', '1');
INSERT INTO `sys_role_menu` VALUES ('4', '2');
INSERT INTO `sys_role_menu` VALUES ('4', '6');
INSERT INTO `sys_role_menu` VALUES ('4', '7');
INSERT INTO `sys_role_menu` VALUES ('4', '27');
INSERT INTO `sys_role_menu` VALUES ('4', '28');
INSERT INTO `sys_role_menu` VALUES ('4', '53');
INSERT INTO `sys_role_menu` VALUES ('4', '64');
INSERT INTO `sys_role_menu` VALUES ('4', '69');
INSERT INTO `sys_role_menu` VALUES ('4', '90');
INSERT INTO `sys_role_menu` VALUES ('5', '1');
INSERT INTO `sys_role_menu` VALUES ('5', '2');
INSERT INTO `sys_role_menu` VALUES ('5', '6');

-- ----------------------------
-- Table structure for `sys_role_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `uid` int NOT NULL,
  `rid` int NOT NULL,
  PRIMARY KEY (`uid`,`rid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES ('1', '1');
INSERT INTO `sys_role_user` VALUES ('9', '1');
INSERT INTO `sys_role_user` VALUES ('10', '1');
INSERT INTO `sys_role_user` VALUES ('11', '1');
INSERT INTO `sys_role_user` VALUES ('12', '1');
INSERT INTO `sys_role_user` VALUES ('13', '1');
INSERT INTO `sys_role_user` VALUES ('28', '4');
INSERT INTO `sys_role_user` VALUES ('29', '1');
INSERT INTO `sys_role_user` VALUES ('30', '5');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `userid` int NOT NULL AUTO_INCREMENT,
  `loginname` varchar(255) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `sex` int DEFAULT NULL COMMENT '0女1男',
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `type` int DEFAULT '2' COMMENT '1，超级管理员,2，系统用户',
  `available` int DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '412365199601236544', '超级管理员', '1', '武汉', '13183380740', '6af4d08340b548cbcce38353d9bcaab4', 'CEO', '1', '1', 'd21fd4');
INSERT INTO `sys_user` VALUES ('28', 'mz', '412827199807156565', '门诊', '1', '河南', '13183365365', '8bab0ae05712cd0d765415ee965d29cb', '门诊管理员', '2', '1', 'b16016');
INSERT INTO `sys_user` VALUES ('29', 'tian', '522228199101011256', 'tian', '1', '中国广东', '18257160372', 'd6d655ac49de205b951377f2a07cb656', '老大', '2', '1', '0a07a6');
INSERT INTO `sys_user` VALUES ('30', '挂号', '522228199001011526', '挂号', '0', '中国广东', '18257160372', '2358e8f429fd432054c66e663ac9eb2b', '挂号', '2', '1', 'e0158b');

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `typeId` int NOT NULL AUTO_INCREMENT,
  `typeName` varchar(50) NOT NULL,
  PRIMARY KEY (`typeId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('5', '西药');
INSERT INTO `type` VALUES ('6', '中药');

-- ----------------------------
-- Table structure for `unit`
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `unitId` int NOT NULL AUTO_INCREMENT,
  `unitName` varchar(50) NOT NULL,
  PRIMARY KEY (`unitId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of unit
-- ----------------------------
INSERT INTO `unit` VALUES ('7', '盒');
INSERT INTO `unit` VALUES ('8', '次');
INSERT INTO `unit` VALUES ('9', '袋');

-- ----------------------------
-- Table structure for `upplier`
-- ----------------------------
DROP TABLE IF EXISTS `upplier`;
CREATE TABLE `upplier` (
  `supplierId` int NOT NULL AUTO_INCREMENT,
  `supplierName` varchar(300) NOT NULL,
  `supplierPhone` varchar(100) DEFAULT NULL,
  `supplierAddress` varchar(300) DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`supplierId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of upplier
-- ----------------------------
INSERT INTO `upplier` VALUES ('5', '春天大药房 ', null, null, '0');

-- ----------------------------
-- Table structure for `warehuose`
-- ----------------------------
DROP TABLE IF EXISTS `warehuose`;
CREATE TABLE `warehuose` (
  `warehouseId` int NOT NULL AUTO_INCREMENT,
  `supplierName` varchar(300) NOT NULL,
  PRIMARY KEY (`warehouseId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of warehuose
-- ----------------------------
INSERT INTO `warehuose` VALUES ('2', '仓库');
