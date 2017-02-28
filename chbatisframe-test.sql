/*
Navicat MySQL Data Transfer

Source Server         : 阿里云
Source Server Version : 50716
Source Host           : 121.40.178.131:3306
Source Database       : chbatisframe-test

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-02-28 18:12:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `ID` varchar(32) NOT NULL,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `MOBILE` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `MODIFY_DATE` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `user_name` (`USER_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1d95058cffcb4d389eb8df90ffeb3ef5', 'a314170122', '111111', '13321185508', null, '2017-02-07 16:51:09', '2017-02-07 16:51:09');
