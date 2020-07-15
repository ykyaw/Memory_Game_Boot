/*
 Navicat Premium Data Transfer

 Source Server         : vm
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 192.168.1.100:3306
 Source Schema         : memory_game

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 15/07/2020 12:36:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `uid` int(0) NOT NULL AUTO_INCREMENT,
  `userId` int(0) NULL DEFAULT NULL,
  `time` bigint(0) NULL DEFAULT NULL,
  `score` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE,
  INDEX `userId`(`userId`) USING BTREE,
  CONSTRAINT `score_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, 1, 1594787450440, 60);
INSERT INTO `score` VALUES (2, 1, 1594787450440, 54);
INSERT INTO `score` VALUES (3, 1, 1594787450440, 76);
INSERT INTO `score` VALUES (4, 2, 1594787450440, 34);
INSERT INTO `score` VALUES (5, 2, 1594787450440, 24);
INSERT INTO `score` VALUES (6, 2, 1594787450440, 45);
INSERT INTO `score` VALUES (7, 3, 1594787450440, 34);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'WUYUDING');
INSERT INTO `user` VALUES (2, 'Teck Kian');
INSERT INTO `user` VALUES (3, 'YuanChange');
INSERT INTO `user` VALUES (4, 'Thatoe');
INSERT INTO `user` VALUES (5, 'Jade');
INSERT INTO `user` VALUES (6, 'Jane');
INSERT INTO `user` VALUES (7, 'Xiujuan');
INSERT INTO `user` VALUES (8, 'Sein');
INSERT INTO `user` VALUES (9, 'Sone');

SET FOREIGN_KEY_CHECKS = 1;
