/*
 Navicat Premium Data Transfer

 Source Server         : Lee
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : beauty_salon

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 20/05/2021 13:13:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'Lee', '134281');

-- ----------------------------
-- Table structure for balance
-- ----------------------------
DROP TABLE IF EXISTS `balance`;
CREATE TABLE `balance`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `payments` float(11, 2) NOT NULL COMMENT '支付金额',
  `type` int(1) NOT NULL COMMENT '0为收入，1为支出，2为退款',
  `create_date` datetime(0) NOT NULL COMMENT '创建时间',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '订单描述',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 270 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of balance
-- ----------------------------
INSERT INTO `balance` VALUES (1, 4050.00, 0, '2021-04-05 14:58:05', '来自充值', 32);
INSERT INTO `balance` VALUES (2, 666.00, 0, '2021-04-05 15:00:02', '来自充值', 32);
INSERT INTO `balance` VALUES (3, 50.00, 0, '2021-04-05 15:06:36', '来自充值', 32);
INSERT INTO `balance` VALUES (7, -154.00, 1, '2021-04-11 22:04:17', '来自预约支付', 32);
INSERT INTO `balance` VALUES (8, -145.00, 1, '2021-04-11 22:06:53', '来自预约支付', 32);
INSERT INTO `balance` VALUES (9, -25.00, 1, '2021-04-11 23:07:36', '来自预约支付', 32);
INSERT INTO `balance` VALUES (10, -25.00, 1, '2021-04-11 23:22:50', '来自预约支付', 32);
INSERT INTO `balance` VALUES (11, -25.00, 1, '2021-04-11 23:28:11', '来自预约支付', 32);
INSERT INTO `balance` VALUES (12, -25.00, 1, '2021-04-12 00:26:06', '来自预约支付', 32);
INSERT INTO `balance` VALUES (13, 25.00, 2, '2021-04-12 00:57:51', '来自预约退款', 32);
INSERT INTO `balance` VALUES (14, -152.00, 1, '2021-04-12 01:25:45', '来自预约支付', 32);
INSERT INTO `balance` VALUES (15, 152.00, 2, '2021-04-12 01:26:20', '来自预约退款', 32);
INSERT INTO `balance` VALUES (16, -304.00, 1, '2021-04-12 01:36:14', '来自预约支付', 32);
INSERT INTO `balance` VALUES (17, 304.00, 2, '2021-04-12 01:38:20', '来自预约退款', 32);
INSERT INTO `balance` VALUES (18, -228.00, 1, '2021-04-12 01:53:38', '来自预约支付', 32);
INSERT INTO `balance` VALUES (19, 228.00, 2, '2021-04-12 01:54:46', '来自预约退款', 32);
INSERT INTO `balance` VALUES (20, -304.00, 1, '2021-04-12 01:59:20', '来自预约支付', 32);
INSERT INTO `balance` VALUES (21, 304.00, 2, '2021-04-12 01:59:40', '来自预约退款', 32);
INSERT INTO `balance` VALUES (22, -256.00, 1, '2021-04-12 02:03:06', '来自预约支付', 32);
INSERT INTO `balance` VALUES (23, 256.00, 2, '2021-04-12 02:03:34', '来自预约退款', 32);
INSERT INTO `balance` VALUES (24, -116.00, 1, '2021-04-12 02:07:39', '来自预约支付', 32);
INSERT INTO `balance` VALUES (25, 116.00, 2, '2021-04-12 02:07:59', '来自预约退款', 32);
INSERT INTO `balance` VALUES (26, 25.00, 2, '2021-04-12 11:11:40', '来自预约退款', 32);
INSERT INTO `balance` VALUES (27, 25.00, 2, '2021-04-12 11:12:00', '来自预约退款', 32);
INSERT INTO `balance` VALUES (28, 145.00, 2, '2021-04-12 12:09:58', '来自预约退款', 32);
INSERT INTO `balance` VALUES (29, -120.00, 1, '2021-04-12 16:54:05', '来自预约支付', 32);
INSERT INTO `balance` VALUES (30, 120.00, 2, '2021-04-12 17:01:41', '来自预约退款', 32);
INSERT INTO `balance` VALUES (31, -5.00, 1, '2021-04-12 19:10:00', '来自预约支付', 32);
INSERT INTO `balance` VALUES (32, 5.00, 2, '2021-04-12 23:29:49', '来自预约退款', 32);
INSERT INTO `balance` VALUES (33, -72.00, 1, '2021-04-12 23:56:47', '来自预约支付', 32);
INSERT INTO `balance` VALUES (34, 72.00, 2, '2021-04-13 00:35:34', '来自预约退款', 32);
INSERT INTO `balance` VALUES (35, -380.00, 1, '2021-04-14 02:32:39', '来自预约支付', 32);
INSERT INTO `balance` VALUES (36, 380.00, 2, '2021-04-14 02:33:01', '来自预约退款', 32);
INSERT INTO `balance` VALUES (37, -215.00, 1, '2021-04-14 02:47:17', '来自预约支付', 37);
INSERT INTO `balance` VALUES (38, -125.00, 1, '2021-04-14 15:54:16', '来自预约支付', 32);
INSERT INTO `balance` VALUES (39, -10.00, 1, '2021-04-15 22:37:38', '来自预约支付', 32);
INSERT INTO `balance` VALUES (40, -145.00, 1, '2021-04-17 20:56:42', '来自预约支付', 32);
INSERT INTO `balance` VALUES (41, 145.00, 2, '2021-04-17 21:05:14', '来自预约退款', 32);
INSERT INTO `balance` VALUES (42, -18.00, 1, '2021-04-18 21:16:41', '来自预约支付', 32);
INSERT INTO `balance` VALUES (43, -380.00, 1, '2021-05-08 14:18:06', '来自预约支付', 32);
INSERT INTO `balance` VALUES (44, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 36);
INSERT INTO `balance` VALUES (45, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 37);
INSERT INTO `balance` VALUES (46, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 39);
INSERT INTO `balance` VALUES (47, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 40);
INSERT INTO `balance` VALUES (48, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 42);
INSERT INTO `balance` VALUES (49, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 43);
INSERT INTO `balance` VALUES (50, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 44);
INSERT INTO `balance` VALUES (51, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 45);
INSERT INTO `balance` VALUES (52, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 46);
INSERT INTO `balance` VALUES (53, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 47);
INSERT INTO `balance` VALUES (54, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 48);
INSERT INTO `balance` VALUES (55, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 49);
INSERT INTO `balance` VALUES (56, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 55);
INSERT INTO `balance` VALUES (57, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 58);
INSERT INTO `balance` VALUES (58, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 59);
INSERT INTO `balance` VALUES (59, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 60);
INSERT INTO `balance` VALUES (60, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 61);
INSERT INTO `balance` VALUES (61, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 62);
INSERT INTO `balance` VALUES (62, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 63);
INSERT INTO `balance` VALUES (63, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 64);
INSERT INTO `balance` VALUES (64, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 65);
INSERT INTO `balance` VALUES (65, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 66);
INSERT INTO `balance` VALUES (66, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 67);
INSERT INTO `balance` VALUES (67, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 70);
INSERT INTO `balance` VALUES (68, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 74);
INSERT INTO `balance` VALUES (69, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 75);
INSERT INTO `balance` VALUES (70, 4000.00, 0, '2021-04-05 14:58:05', '来自充值', 76);
INSERT INTO `balance` VALUES (71, -145.00, 1, '2021-05-08 02:18:37', '来自预约支付', 36);
INSERT INTO `balance` VALUES (72, -250.00, 1, '2021-05-08 10:41:31', '来自预约支付', 36);
INSERT INTO `balance` VALUES (73, -140.00, 1, '2021-05-08 11:00:24', '来自预约支付', 36);
INSERT INTO `balance` VALUES (74, -140.00, 1, '2021-05-08 11:01:45', '来自预约支付', 36);
INSERT INTO `balance` VALUES (75, -175.00, 1, '2021-05-08 11:04:11', '来自预约支付', 36);
INSERT INTO `balance` VALUES (76, -300.00, 1, '2021-05-08 11:15:47', '来自预约支付', 37);
INSERT INTO `balance` VALUES (77, -30.00, 1, '2021-05-08 11:16:42', '来自预约支付', 37);
INSERT INTO `balance` VALUES (78, -175.00, 1, '2021-05-08 11:17:12', '来自预约支付', 37);
INSERT INTO `balance` VALUES (79, -125.00, 1, '2021-05-08 11:40:17', '来自预约支付', 37);
INSERT INTO `balance` VALUES (80, -130.00, 1, '2021-05-08 11:42:00', '来自预约支付', 37);
INSERT INTO `balance` VALUES (81, -30.00, 1, '2021-05-08 11:44:47', '来自预约支付', 39);
INSERT INTO `balance` VALUES (82, -105.00, 1, '2021-05-08 11:45:18', '来自预约支付', 39);
INSERT INTO `balance` VALUES (83, -55.00, 1, '2021-05-08 11:46:07', '来自预约支付', 39);
INSERT INTO `balance` VALUES (84, -135.00, 1, '2021-05-08 11:53:43', '来自预约支付', 39);
INSERT INTO `balance` VALUES (85, -125.00, 1, '2021-05-08 11:54:22', '来自预约支付', 39);
INSERT INTO `balance` VALUES (86, -75.00, 1, '2021-05-08 11:56:32', '来自预约支付', 40);
INSERT INTO `balance` VALUES (87, -250.00, 1, '2021-05-08 11:58:26', '来自预约支付', 40);
INSERT INTO `balance` VALUES (88, -115.00, 1, '2021-05-08 11:59:30', '来自预约支付', 40);
INSERT INTO `balance` VALUES (89, -150.00, 1, '2021-05-08 12:00:30', '来自预约支付', 40);
INSERT INTO `balance` VALUES (90, -150.00, 1, '2021-05-08 12:00:52', '来自预约支付', 40);
INSERT INTO `balance` VALUES (91, -80.00, 1, '2021-05-09 12:08:44', '来自预约支付', 42);
INSERT INTO `balance` VALUES (92, -125.00, 1, '2021-05-09 12:09:47', '来自预约支付', 42);
INSERT INTO `balance` VALUES (93, -130.00, 1, '2021-05-09 12:10:04', '来自预约支付', 42);
INSERT INTO `balance` VALUES (94, -90.00, 1, '2021-05-09 12:10:30', '来自预约支付', 42);
INSERT INTO `balance` VALUES (95, -275.00, 1, '2021-05-09 12:10:58', '来自预约支付', 42);
INSERT INTO `balance` VALUES (96, -130.00, 1, '2021-05-09 12:14:03', '来自预约支付', 43);
INSERT INTO `balance` VALUES (97, -200.00, 1, '2021-05-09 12:14:18', '来自预约支付', 43);
INSERT INTO `balance` VALUES (98, -80.00, 1, '2021-05-09 12:14:33', '来自预约支付', 43);
INSERT INTO `balance` VALUES (99, -140.00, 1, '2021-05-09 12:15:12', '来自预约支付', 43);
INSERT INTO `balance` VALUES (100, -140.00, 1, '2021-05-09 12:15:33', '来自预约支付', 43);
INSERT INTO `balance` VALUES (101, -180.00, 1, '2021-05-09 12:16:43', '来自预约支付', 44);
INSERT INTO `balance` VALUES (102, -135.00, 1, '2021-05-09 12:17:20', '来自预约支付', 44);
INSERT INTO `balance` VALUES (103, -195.00, 1, '2021-05-09 12:17:41', '来自预约支付', 44);
INSERT INTO `balance` VALUES (104, -145.00, 1, '2021-05-09 12:18:14', '来自预约支付', 44);
INSERT INTO `balance` VALUES (105, -190.00, 1, '2021-05-09 12:18:32', '来自预约支付', 44);
INSERT INTO `balance` VALUES (106, -145.00, 1, '2021-05-09 12:19:43', '来自预约支付', 46);
INSERT INTO `balance` VALUES (107, -180.00, 1, '2021-05-09 12:20:10', '来自预约支付', 46);
INSERT INTO `balance` VALUES (108, -160.00, 1, '2021-05-09 12:20:40', '来自预约支付', 46);
INSERT INTO `balance` VALUES (109, -140.00, 1, '2021-05-09 12:21:14', '来自预约支付', 46);
INSERT INTO `balance` VALUES (110, -150.00, 1, '2021-05-09 12:21:55', '来自预约支付', 46);
INSERT INTO `balance` VALUES (111, -145.00, 1, '2021-05-10 12:27:11', '来自预约支付', 47);
INSERT INTO `balance` VALUES (112, -130.00, 1, '2021-05-10 12:28:01', '来自预约支付', 47);
INSERT INTO `balance` VALUES (113, -110.00, 1, '2021-05-10 12:29:38', '来自预约支付', 47);
INSERT INTO `balance` VALUES (114, -135.00, 1, '2021-05-10 12:30:14', '来自预约支付', 47);
INSERT INTO `balance` VALUES (115, -150.00, 1, '2021-05-10 12:30:30', '来自预约支付', 47);
INSERT INTO `balance` VALUES (116, -145.00, 1, '2021-05-10 12:31:34', '来自预约支付', 48);
INSERT INTO `balance` VALUES (117, -190.00, 1, '2021-05-10 12:31:46', '来自预约支付', 48);
INSERT INTO `balance` VALUES (118, -235.00, 1, '2021-05-10 12:32:00', '来自预约支付', 48);
INSERT INTO `balance` VALUES (119, -150.00, 1, '2021-05-10 12:32:47', '来自预约支付', 48);
INSERT INTO `balance` VALUES (120, -180.00, 1, '2021-05-10 12:33:03', '来自预约支付', 48);
INSERT INTO `balance` VALUES (121, -200.00, 1, '2021-05-10 12:34:16', '来自预约支付', 49);
INSERT INTO `balance` VALUES (122, -145.00, 1, '2021-05-10 12:35:07', '来自预约支付', 49);
INSERT INTO `balance` VALUES (123, -245.00, 1, '2021-05-10 12:35:56', '来自预约支付', 49);
INSERT INTO `balance` VALUES (124, -160.00, 1, '2021-05-10 12:36:17', '来自预约支付', 49);
INSERT INTO `balance` VALUES (125, -110.00, 1, '2021-05-10 12:36:43', '来自预约支付', 49);
INSERT INTO `balance` VALUES (126, -200.00, 1, '2021-05-10 12:38:33', '来自预约支付', 55);
INSERT INTO `balance` VALUES (127, -150.00, 1, '2021-05-10 12:38:47', '来自预约支付', 55);
INSERT INTO `balance` VALUES (128, -195.00, 1, '2021-05-10 12:39:10', '来自预约支付', 55);
INSERT INTO `balance` VALUES (129, -195.00, 1, '2021-05-10 12:39:31', '来自预约支付', 55);
INSERT INTO `balance` VALUES (130, -80.00, 1, '2021-05-10 12:40:00', '来自预约支付', 55);
INSERT INTO `balance` VALUES (131, -150.00, 1, '2021-05-11 12:43:26', '来自预约支付', 58);
INSERT INTO `balance` VALUES (132, -185.00, 1, '2021-05-11 12:44:18', '来自预约支付', 58);
INSERT INTO `balance` VALUES (133, -180.00, 1, '2021-05-11 12:44:38', '来自预约支付', 58);
INSERT INTO `balance` VALUES (134, -130.00, 1, '2021-05-11 12:44:55', '来自预约支付', 58);
INSERT INTO `balance` VALUES (135, -80.00, 1, '2021-05-11 12:45:42', '来自预约支付', 58);
INSERT INTO `balance` VALUES (136, -185.00, 1, '2021-05-11 12:46:55', '来自预约支付', 59);
INSERT INTO `balance` VALUES (137, -80.00, 1, '2021-05-11 12:47:43', '来自预约支付', 59);
INSERT INTO `balance` VALUES (138, -130.00, 1, '2021-05-11 12:48:09', '来自预约支付', 59);
INSERT INTO `balance` VALUES (139, -30.00, 1, '2021-05-11 12:48:26', '来自预约支付', 59);
INSERT INTO `balance` VALUES (140, -145.00, 1, '2021-05-11 12:49:03', '来自预约支付', 59);
INSERT INTO `balance` VALUES (141, -80.00, 1, '2021-05-11 12:50:46', '来自预约支付', 60);
INSERT INTO `balance` VALUES (142, -145.00, 1, '2021-05-11 12:51:15', '来自预约支付', 60);
INSERT INTO `balance` VALUES (143, -105.00, 1, '2021-05-11 12:51:38', '来自预约支付', 60);
INSERT INTO `balance` VALUES (144, -125.00, 1, '2021-05-11 12:52:03', '来自预约支付', 60);
INSERT INTO `balance` VALUES (145, -80.00, 1, '2021-05-11 12:52:22', '来自预约支付', 60);
INSERT INTO `balance` VALUES (146, -135.00, 1, '2021-05-11 12:54:22', '来自预约支付', 61);
INSERT INTO `balance` VALUES (147, -105.00, 1, '2021-05-11 12:54:45', '来自预约支付', 61);
INSERT INTO `balance` VALUES (148, -130.00, 1, '2021-05-11 12:55:06', '来自预约支付', 61);
INSERT INTO `balance` VALUES (149, -230.00, 1, '2021-05-11 12:56:11', '来自预约支付', 61);
INSERT INTO `balance` VALUES (150, -245.00, 1, '2021-05-11 12:56:32', '来自预约支付', 61);
INSERT INTO `balance` VALUES (151, -145.00, 1, '2021-05-12 13:06:07', '来自预约支付', 62);
INSERT INTO `balance` VALUES (152, -140.00, 1, '2021-05-12 13:17:05', '来自预约支付', 62);
INSERT INTO `balance` VALUES (153, -135.00, 1, '2021-05-12 13:17:22', '来自预约支付', 62);
INSERT INTO `balance` VALUES (154, -210.00, 1, '2021-05-12 13:17:39', '来自预约支付', 62);
INSERT INTO `balance` VALUES (155, -80.00, 1, '2021-05-12 13:18:05', '来自预约支付', 62);
INSERT INTO `balance` VALUES (156, -125.00, 1, '2021-05-12 13:19:06', '来自预约支付', 62);
INSERT INTO `balance` VALUES (157, -145.00, 1, '2021-05-12 13:20:40', '来自预约支付', 63);
INSERT INTO `balance` VALUES (158, -100.00, 1, '2021-05-12 13:55:34', '来自预约支付', 63);
INSERT INTO `balance` VALUES (159, -150.00, 1, '2021-05-12 13:55:52', '来自预约支付', 63);
INSERT INTO `balance` VALUES (160, -150.00, 1, '2021-05-12 13:58:15', '来自预约支付', 63);
INSERT INTO `balance` VALUES (161, -250.00, 1, '2021-05-12 13:59:57', '来自预约支付', 63);
INSERT INTO `balance` VALUES (162, -250.00, 1, '2021-05-12 14:05:02', '来自预约支付', 63);
INSERT INTO `balance` VALUES (163, -195.00, 1, '2021-05-12 14:06:25', '来自预约支付', 64);
INSERT INTO `balance` VALUES (164, -100.00, 1, '2021-05-12 14:06:55', '来自预约支付', 64);
INSERT INTO `balance` VALUES (165, -175.00, 1, '2021-05-12 14:07:36', '来自预约支付', 64);
INSERT INTO `balance` VALUES (166, -230.00, 1, '2021-05-12 14:08:38', '来自预约支付', 64);
INSERT INTO `balance` VALUES (167, -170.00, 1, '2021-05-12 14:09:00', '来自预约支付', 64);
INSERT INTO `balance` VALUES (168, -120.00, 1, '2021-05-12 14:10:49', '来自预约支付', 65);
INSERT INTO `balance` VALUES (169, -125.00, 1, '2021-05-12 14:11:22', '来自预约支付', 65);
INSERT INTO `balance` VALUES (170, -140.00, 1, '2021-05-12 14:12:09', '来自预约支付', 65);
INSERT INTO `balance` VALUES (171, -145.00, 1, '2021-05-13 14:36:54', '来自预约支付', 66);
INSERT INTO `balance` VALUES (172, -110.00, 1, '2021-05-13 14:37:33', '来自预约支付', 66);
INSERT INTO `balance` VALUES (173, -105.00, 1, '2021-05-13 14:38:04', '来自预约支付', 66);
INSERT INTO `balance` VALUES (174, -175.00, 1, '2021-05-13 14:39:21', '来自预约支付', 66);
INSERT INTO `balance` VALUES (175, -230.00, 1, '2021-05-13 14:39:37', '来自预约支付', 66);
INSERT INTO `balance` VALUES (176, -200.00, 1, '2021-05-13 14:40:45', '来自预约支付', 67);
INSERT INTO `balance` VALUES (177, -185.00, 1, '2021-05-13 14:41:35', '来自预约支付', 67);
INSERT INTO `balance` VALUES (178, -185.00, 1, '2021-05-13 14:42:26', '来自预约支付', 67);
INSERT INTO `balance` VALUES (179, -270.00, 1, '2021-05-13 14:43:18', '来自预约支付', 67);
INSERT INTO `balance` VALUES (180, -180.00, 1, '2021-05-13 14:44:01', '来自预约支付', 67);
INSERT INTO `balance` VALUES (181, -80.00, 1, '2021-05-13 15:19:57', '来自预约支付', 70);
INSERT INTO `balance` VALUES (182, -65.00, 1, '2021-05-13 15:21:26', '来自预约支付', 70);
INSERT INTO `balance` VALUES (183, -125.00, 1, '2021-05-13 15:22:30', '来自预约支付', 70);
INSERT INTO `balance` VALUES (184, -145.00, 1, '2021-05-13 15:26:55', '来自预约支付', 70);
INSERT INTO `balance` VALUES (185, -80.00, 1, '2021-05-13 15:27:35', '来自预约支付', 70);
INSERT INTO `balance` VALUES (186, -145.00, 1, '2021-05-13 15:28:55', '来自预约支付', 74);
INSERT INTO `balance` VALUES (187, -105.00, 1, '2021-05-13 15:29:19', '来自预约支付', 74);
INSERT INTO `balance` VALUES (188, -30.00, 1, '2021-05-13 15:29:48', '来自预约支付', 74);
INSERT INTO `balance` VALUES (189, -130.00, 1, '2021-05-13 15:30:10', '来自预约支付', 74);
INSERT INTO `balance` VALUES (190, -75.00, 1, '2021-05-13 15:30:33', '来自预约支付', 74);
INSERT INTO `balance` VALUES (191, -210.00, 1, '2021-05-14 15:39:02', '来自预约支付', 74);
INSERT INTO `balance` VALUES (192, -145.00, 1, '2021-05-14 15:40:21', '来自预约支付', 74);
INSERT INTO `balance` VALUES (193, -65.00, 1, '2021-05-14 15:40:48', '来自预约支付', 74);
INSERT INTO `balance` VALUES (194, -130.00, 1, '2021-05-14 15:41:10', '来自预约支付', 74);
INSERT INTO `balance` VALUES (195, -165.00, 1, '2021-05-14 15:41:43', '来自预约支付', 74);
INSERT INTO `balance` VALUES (196, -185.00, 1, '2021-05-14 15:42:04', '来自预约支付', 74);
INSERT INTO `balance` VALUES (197, -105.00, 1, '2021-05-14 15:42:28', '来自预约支付', 74);
INSERT INTO `balance` VALUES (198, -135.00, 1, '2021-05-14 15:42:56', '来自预约支付', 74);
INSERT INTO `balance` VALUES (199, -100.00, 1, '2021-05-14 15:43:19', '来自预约支付', 74);
INSERT INTO `balance` VALUES (200, -165.00, 1, '2021-05-14 15:44:03', '来自预约支付', 74);
INSERT INTO `balance` VALUES (201, -125.00, 1, '2021-05-14 15:45:23', '来自预约支付', 75);
INSERT INTO `balance` VALUES (202, -135.00, 1, '2021-05-14 15:45:45', '来自预约支付', 75);
INSERT INTO `balance` VALUES (203, -80.00, 1, '2021-05-14 15:46:22', '来自预约支付', 75);
INSERT INTO `balance` VALUES (204, -95.00, 1, '2021-05-14 15:46:41', '来自预约支付', 75);
INSERT INTO `balance` VALUES (205, -165.00, 1, '2021-05-14 15:47:33', '来自预约支付', 75);
INSERT INTO `balance` VALUES (206, -80.00, 1, '2021-05-14 15:49:00', '来自预约支付', 76);
INSERT INTO `balance` VALUES (207, -120.00, 1, '2021-05-14 15:49:50', '来自预约支付', 76);
INSERT INTO `balance` VALUES (208, -110.00, 1, '2021-05-14 15:50:16', '来自预约支付', 76);
INSERT INTO `balance` VALUES (209, -30.00, 1, '2021-05-14 15:50:34', '来自预约支付', 76);
INSERT INTO `balance` VALUES (210, -165.00, 1, '2021-05-14 15:51:04', '来自预约支付', 76);
INSERT INTO `balance` VALUES (211, -30.00, 1, '2021-05-13 16:06:16', '来自预约支付', 76);
INSERT INTO `balance` VALUES (212, -25.00, 1, '2021-05-13 23:34:21', '来自预约支付', 47);
INSERT INTO `balance` VALUES (213, 25.00, 2, '2021-05-13 23:36:19', '来自预约退款', 47);
INSERT INTO `balance` VALUES (214, -10.00, 1, '2021-05-13 23:38:31', '来自预约支付', 47);
INSERT INTO `balance` VALUES (215, -25.00, 1, '2021-05-14 00:45:26', '来自预约支付', 32);
INSERT INTO `balance` VALUES (216, 25.00, 2, '2021-05-14 00:45:53', '来自预约退款', 32);
INSERT INTO `balance` VALUES (217, -87.00, 1, '2021-05-14 01:16:18', '来自预约支付', 32);
INSERT INTO `balance` VALUES (218, 87.00, 2, '2021-05-14 01:16:56', '来自预约退款', 32);
INSERT INTO `balance` VALUES (219, 60.00, 0, '2021-05-14 01:23:31', '来自充值', 32);
INSERT INTO `balance` VALUES (220, 10.00, 2, '2021-05-14 01:29:03', '来自预约退款', 47);
INSERT INTO `balance` VALUES (221, -10.00, 1, '2021-05-14 02:36:07', '来自预约支付', 32);
INSERT INTO `balance` VALUES (222, 10.00, 2, '2021-05-14 02:36:23', '来自预约退款', 32);
INSERT INTO `balance` VALUES (223, -96.00, 1, '2021-05-14 02:56:26', '来自预约支付', 32);
INSERT INTO `balance` VALUES (224, 60.00, 0, '2021-05-14 03:00:18', '来自充值', 32);
INSERT INTO `balance` VALUES (225, 96.00, 2, '2021-05-14 03:01:46', '来自预约退款', 32);
INSERT INTO `balance` VALUES (226, 165.00, 2, '2021-05-14 03:14:55', '来自预约退款', 76);
INSERT INTO `balance` VALUES (227, -80.00, 1, '2021-05-14 17:03:33', '来自预约支付', 32);
INSERT INTO `balance` VALUES (228, -25.00, 1, '2021-05-14 17:19:58', '来自预约支付', 42);
INSERT INTO `balance` VALUES (229, -25.00, 1, '2021-05-14 17:26:56', '来自预约支付', 40);
INSERT INTO `balance` VALUES (230, -15.00, 1, '2021-05-14 19:07:00', '来自预约支付', 32);
INSERT INTO `balance` VALUES (231, 15.00, 2, '2021-05-14 19:08:41', '来自预约退款', 32);
INSERT INTO `balance` VALUES (232, -10.00, 1, '2021-05-14 19:23:42', '来自预约支付', 32);
INSERT INTO `balance` VALUES (233, 10.00, 2, '2021-05-14 19:28:22', '来自预约退款', 32);
INSERT INTO `balance` VALUES (234, -15.00, 1, '2021-05-14 19:40:46', '来自预约支付', 32);
INSERT INTO `balance` VALUES (235, -10.00, 1, '2021-05-14 20:09:08', '来自预约支付', 32);
INSERT INTO `balance` VALUES (236, -15.00, 1, '2021-05-14 20:11:29', '来自预约支付', 32);
INSERT INTO `balance` VALUES (237, -10.00, 1, '2021-05-14 20:13:38', '来自预约支付', 32);
INSERT INTO `balance` VALUES (238, -15.00, 1, '2021-05-14 20:17:12', '来自预约支付', 32);
INSERT INTO `balance` VALUES (239, 15.00, 2, '2021-05-14 20:18:41', '来自预约退款', 32);
INSERT INTO `balance` VALUES (240, -15.00, 1, '2021-05-14 20:19:10', '来自预约支付', 32);
INSERT INTO `balance` VALUES (241, 15.00, 2, '2021-05-14 20:20:36', '来自预约退款', 32);
INSERT INTO `balance` VALUES (242, -10.00, 1, '2021-05-14 20:20:46', '来自预约支付', 32);
INSERT INTO `balance` VALUES (243, 10.00, 2, '2021-05-14 20:21:33', '来自预约退款', 32);
INSERT INTO `balance` VALUES (244, 15.00, 2, '2021-05-14 20:23:27', '来自预约退款', 32);
INSERT INTO `balance` VALUES (245, -10.00, 1, '2021-05-14 20:25:19', '来自预约支付', 32);
INSERT INTO `balance` VALUES (246, 10.00, 2, '2021-05-14 20:26:03', '来自预约退款', 32);
INSERT INTO `balance` VALUES (247, -10.00, 1, '2021-05-14 20:26:14', '来自预约支付', 32);
INSERT INTO `balance` VALUES (248, 10.00, 2, '2021-05-14 20:26:41', '来自预约退款', 32);
INSERT INTO `balance` VALUES (249, -15.00, 1, '2021-05-14 20:26:58', '来自预约支付', 32);
INSERT INTO `balance` VALUES (250, -15.00, 1, '2021-05-14 20:31:55', '来自预约支付', 32);
INSERT INTO `balance` VALUES (251, -15.00, 1, '2021-05-14 20:33:23', '来自预约支付', 32);
INSERT INTO `balance` VALUES (252, -10.00, 1, '2021-05-14 20:34:58', '来自预约支付', 32);
INSERT INTO `balance` VALUES (253, 15.00, 2, '2021-05-14 20:36:33', '来自预约退款', 32);
INSERT INTO `balance` VALUES (254, -10.00, 1, '2021-05-14 20:36:49', '来自预约支付', 32);
INSERT INTO `balance` VALUES (255, -10.00, 1, '2021-05-14 20:37:43', '来自预约支付', 32);
INSERT INTO `balance` VALUES (256, 10.00, 2, '2021-05-14 20:37:55', '来自预约退款', 32);
INSERT INTO `balance` VALUES (257, -10.00, 1, '2021-05-14 20:38:05', '来自预约支付', 32);
INSERT INTO `balance` VALUES (258, -12.00, 1, '2021-05-15 02:23:43', '来自预约支付', 32);
INSERT INTO `balance` VALUES (259, 12.00, 2, '2021-05-15 02:27:27', '来自预约退款', 32);
INSERT INTO `balance` VALUES (260, -30.00, 1, '2021-05-15 09:08:10', '来自预约支付', 46);
INSERT INTO `balance` VALUES (261, -30.00, 1, '2021-05-15 09:09:03', '来自预约支付', 47);
INSERT INTO `balance` VALUES (262, -30.00, 1, '2021-05-15 09:10:13', '来自预约支付', 58);
INSERT INTO `balance` VALUES (263, 15.00, 2, '2021-05-15 11:38:19', '来自预约退款', 32);
INSERT INTO `balance` VALUES (264, 10.00, 2, '2021-05-15 11:38:22', '来自预约退款', 32);
INSERT INTO `balance` VALUES (265, 15.00, 2, '2021-05-15 11:38:26', '来自预约退款', 32);
INSERT INTO `balance` VALUES (266, 10.00, 2, '2021-05-15 11:38:30', '来自预约退款', 32);
INSERT INTO `balance` VALUES (267, 15.00, 2, '2021-05-15 11:38:33', '来自预约退款', 32);
INSERT INTO `balance` VALUES (268, -10.00, 1, '2021-05-15 14:00:00', '来自预约支付', 32);
INSERT INTO `balance` VALUES (269, 10.00, 2, '2021-05-15 14:00:27', '来自预约退款', 32);
INSERT INTO `balance` VALUES (270, -25.00, 1, '2021-05-15 14:12:21', '来自预约支付', 32);

-- ----------------------------
-- Table structure for barbershop
-- ----------------------------
DROP TABLE IF EXISTS `barbershop`;
CREATE TABLE `barbershop`  (
  `barbershop_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '美容美发店id',
  `barbershop_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '美容美发店名',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '店地址',
  `owner_id` int(11) NOT NULL COMMENT '店长，即管理员',
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '店外观',
  `open` time(0) NOT NULL COMMENT '店开始营业时间',
  `close` time(0) NOT NULL COMMENT '店闭店时间',
  PRIMARY KEY (`barbershop_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of barbershop
-- ----------------------------
INSERT INTO `barbershop` VALUES (1, '莞丽美发', '东莞市松山湖大学路1号', 1, NULL, '10:00:00', '21:00:00');
INSERT INTO `barbershop` VALUES (2, '春和美发', '东莞市厚街镇湖景大道92号', 1, NULL, '10:00:00', '21:00:00');
INSERT INTO `barbershop` VALUES (3, '博雅美发', '东莞市陈屋东路18号', 2, NULL, '10:00:00', '21:00:00');

-- ----------------------------
-- Table structure for business_hours
-- ----------------------------
DROP TABLE IF EXISTS `business_hours`;
CREATE TABLE `business_hours`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stylist_id` int(11) NOT NULL COMMENT '发型师id',
  `date_from` datetime(0) NOT NULL,
  `date_to` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 527 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of business_hours
-- ----------------------------
INSERT INTO `business_hours` VALUES (66, 9, '2021-04-11 10:00:00', '2021-04-11 21:00:00');
INSERT INTO `business_hours` VALUES (67, 9, '2021-04-12 10:00:00', '2021-04-12 11:35:26');
INSERT INTO `business_hours` VALUES (69, 8, '2021-04-11 10:00:00', '2021-04-11 21:00:00');
INSERT INTO `business_hours` VALUES (72, 8, '2021-04-12 10:00:00', '2021-04-12 11:54:59');
INSERT INTO `business_hours` VALUES (73, 7, '2021-04-11 10:00:00', '2021-04-11 21:00:00');
INSERT INTO `business_hours` VALUES (77, 6, '2021-04-11 10:00:00', '2021-04-11 21:00:00');
INSERT INTO `business_hours` VALUES (78, 6, '2021-04-12 10:00:00', '2021-04-12 11:27:18');
INSERT INTO `business_hours` VALUES (79, 6, '2021-04-12 11:45:18', '2021-04-12 21:00:00');
INSERT INTO `business_hours` VALUES (82, 7, '2021-04-12 10:00:00', '2021-04-12 21:00:00');
INSERT INTO `business_hours` VALUES (89, 7, '2021-04-13 10:00:00', '2021-04-13 12:26:27');
INSERT INTO `business_hours` VALUES (100, 5, '2021-04-12 10:00:00', '2021-04-12 21:00:00');
INSERT INTO `business_hours` VALUES (104, 8, '2021-04-13 10:00:00', '2021-04-13 12:31:27');
INSERT INTO `business_hours` VALUES (105, 9, '2021-04-13 10:00:00', '2021-04-13 12:10:14');
INSERT INTO `business_hours` VALUES (109, 8, '2021-04-12 14:04:59', '2021-04-12 21:00:00');
INSERT INTO `business_hours` VALUES (111, 6, '2021-04-13 10:00:00', '2021-04-13 13:35:45');
INSERT INTO `business_hours` VALUES (112, 6, '2021-04-13 13:45:45', '2021-04-13 21:00:00');
INSERT INTO `business_hours` VALUES (114, 9, '2021-04-12 14:43:26', '2021-04-12 21:00:00');
INSERT INTO `business_hours` VALUES (128, 5, '2021-04-13 10:00:00', '2021-04-13 21:00:00');
INSERT INTO `business_hours` VALUES (137, 7, '2021-04-13 14:36:27', '2021-04-13 21:00:00');
INSERT INTO `business_hours` VALUES (145, 8, '2021-04-13 12:41:27', '2021-04-13 21:00:00');
INSERT INTO `business_hours` VALUES (146, 9, '2021-04-13 14:20:14', '2021-04-13 21:00:00');
INSERT INTO `business_hours` VALUES (147, 9, '2021-04-14 10:00:00', '2021-04-14 21:00:00');
INSERT INTO `business_hours` VALUES (149, 5, '2021-04-15 10:00:00', '2021-04-15 14:47:00');
INSERT INTO `business_hours` VALUES (150, 5, '2021-04-14 10:00:00', '2021-04-14 15:55:01');
INSERT INTO `business_hours` VALUES (151, 5, '2021-04-15 17:47:00', '2021-04-15 21:00:00');
INSERT INTO `business_hours` VALUES (152, 6, '2021-04-14 10:00:00', '2021-04-14 21:00:00');
INSERT INTO `business_hours` VALUES (153, 6, '2021-04-15 10:00:00', '2021-04-15 21:00:00');
INSERT INTO `business_hours` VALUES (154, 5, '2021-04-14 18:23:01', '2021-04-14 21:00:00');
INSERT INTO `business_hours` VALUES (155, 9, '2021-04-15 10:00:00', '2021-04-15 21:00:00');
INSERT INTO `business_hours` VALUES (156, 9, '2021-04-16 10:00:00', '2021-04-16 12:37:26');
INSERT INTO `business_hours` VALUES (157, 9, '2021-04-16 12:45:26', '2021-04-16 21:00:00');
INSERT INTO `business_hours` VALUES (158, 9, '2021-04-17 10:00:00', '2021-04-17 21:00:00');
INSERT INTO `business_hours` VALUES (160, 9, '2021-04-18 10:00:00', '2021-04-18 21:00:00');
INSERT INTO `business_hours` VALUES (161, 12, '2021-04-18 10:00:00', '2021-04-18 21:00:00');
INSERT INTO `business_hours` VALUES (162, 12, '2021-04-19 10:00:00', '2021-04-19 21:00:00');
INSERT INTO `business_hours` VALUES (163, 9, '2021-04-19 10:00:00', '2021-04-19 21:00:00');
INSERT INTO `business_hours` VALUES (164, 8, '2021-04-18 10:00:00', '2021-04-18 21:00:00');
INSERT INTO `business_hours` VALUES (166, 8, '2021-04-19 10:00:00', '2021-04-19 21:00:00');
INSERT INTO `business_hours` VALUES (167, 6, '2021-04-18 10:00:00', '2021-04-18 21:00:00');
INSERT INTO `business_hours` VALUES (169, 6, '2021-04-19 10:00:00', '2021-04-19 12:30:00');
INSERT INTO `business_hours` VALUES (170, 6, '2021-04-19 17:20:00', '2021-04-19 19:30:00');
INSERT INTO `business_hours` VALUES (172, 7, '2021-04-18 10:00:00', '2021-04-18 21:00:00');
INSERT INTO `business_hours` VALUES (173, 7, '2021-04-19 10:00:00', '2021-04-19 21:00:00');
INSERT INTO `business_hours` VALUES (174, 6, '2021-04-19 14:00:00', '2021-04-19 14:15:08');
INSERT INTO `business_hours` VALUES (175, 6, '2021-04-19 14:38:08', '2021-04-19 16:10:00');
INSERT INTO `business_hours` VALUES (176, 11, '2021-04-22 10:00:00', '2021-04-22 21:00:00');
INSERT INTO `business_hours` VALUES (178, 11, '2021-04-23 10:00:00', '2021-04-23 21:00:00');
INSERT INTO `business_hours` VALUES (179, 9, '2021-04-22 10:00:00', '2021-04-22 21:00:00');
INSERT INTO `business_hours` VALUES (185, 9, '2021-04-23 10:00:00', '2021-04-23 21:00:00');
INSERT INTO `business_hours` VALUES (187, 11, '2021-04-24 10:00:00', '2021-04-24 21:00:00');
INSERT INTO `business_hours` VALUES (189, 9, '2021-04-24 10:00:00', '2021-04-24 21:00:00');
INSERT INTO `business_hours` VALUES (190, 12, '2021-05-08 10:00:00', '2021-05-08 12:00:14');
INSERT INTO `business_hours` VALUES (192, 12, '2021-05-08 19:53:45', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (193, 12, '2021-05-09 10:00:00', '2021-05-09 12:15:09');
INSERT INTO `business_hours` VALUES (194, 17, '2021-05-13 10:00:00', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (195, 17, '2021-05-14 10:00:00', '2021-05-14 15:44:07');
INSERT INTO `business_hours` VALUES (196, 20, '2021-05-13 10:00:00', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (198, 20, '2021-05-14 10:00:00', '2021-05-14 15:39:49');
INSERT INTO `business_hours` VALUES (199, 19, '2021-05-13 10:00:00', '2021-05-13 15:29:41');
INSERT INTO `business_hours` VALUES (202, 18, '2021-05-13 10:00:00', '2021-05-13 14:42:18');
INSERT INTO `business_hours` VALUES (203, 18, '2021-05-14 10:00:00', '2021-05-14 11:37:55');
INSERT INTO `business_hours` VALUES (204, 21, '2021-05-13 10:00:00', '2021-05-13 14:37:34');
INSERT INTO `business_hours` VALUES (205, 21, '2021-05-14 10:00:00', '2021-05-14 10:03:47');
INSERT INTO `business_hours` VALUES (206, 21, '2021-05-14 12:31:47', '2021-05-14 15:41:38');
INSERT INTO `business_hours` VALUES (215, 19, '2021-05-08 10:00:00', '2021-05-08 10:42:16');
INSERT INTO `business_hours` VALUES (216, 19, '2021-05-09 10:00:00', '2021-05-09 12:19:20');
INSERT INTO `business_hours` VALUES (217, 19, '2021-05-08 14:32:16', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (218, 16, '2021-05-08 10:00:00', '2021-05-08 11:01:09');
INSERT INTO `business_hours` VALUES (219, 16, '2021-05-09 10:00:00', '2021-05-09 12:14:50');
INSERT INTO `business_hours` VALUES (220, 16, '2021-05-08 13:26:09', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (221, 11, '2021-05-08 10:00:00', '2021-05-08 13:15:26');
INSERT INTO `business_hours` VALUES (222, 11, '2021-05-09 10:00:00', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (223, 11, '2021-05-08 15:03:26', '2021-05-08 15:06:06');
INSERT INTO `business_hours` VALUES (224, 17, '2021-05-08 10:00:00', '2021-05-08 11:57:13');
INSERT INTO `business_hours` VALUES (225, 17, '2021-05-09 10:00:00', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (226, 17, '2021-05-08 20:18:58', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (227, 8, '2021-05-08 10:00:00', '2021-05-08 11:17:30');
INSERT INTO `business_hours` VALUES (228, 8, '2021-05-09 10:00:00', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (229, 8, '2021-05-08 15:27:30', '2021-05-08 15:30:52');
INSERT INTO `business_hours` VALUES (230, 13, '2021-05-08 10:00:00', '2021-05-08 11:17:25');
INSERT INTO `business_hours` VALUES (231, 13, '2021-05-09 10:00:00', '2021-05-09 12:11:11');
INSERT INTO `business_hours` VALUES (232, 13, '2021-05-08 11:40:25', '2021-05-08 11:45:36');
INSERT INTO `business_hours` VALUES (233, 9, '2021-05-08 10:00:00', '2021-05-08 11:18:03');
INSERT INTO `business_hours` VALUES (234, 9, '2021-05-09 10:00:00', '2021-05-09 12:11:48');
INSERT INTO `business_hours` VALUES (235, 9, '2021-05-08 14:33:03', '2021-05-08 14:34:27');
INSERT INTO `business_hours` VALUES (236, 18, '2021-05-08 10:00:00', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (237, 18, '2021-05-09 10:00:00', '2021-05-09 12:20:29');
INSERT INTO `business_hours` VALUES (238, 15, '2021-05-08 10:00:00', '2021-05-08 11:41:05');
INSERT INTO `business_hours` VALUES (239, 15, '2021-05-09 10:00:00', '2021-05-09 12:10:52');
INSERT INTO `business_hours` VALUES (240, 15, '2021-05-08 13:19:05', '2021-05-08 13:21:39');
INSERT INTO `business_hours` VALUES (241, 15, '2021-05-08 15:39:39', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (242, 20, '2021-05-08 10:00:00', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (243, 20, '2021-05-09 10:00:00', '2021-05-09 12:10:35');
INSERT INTO `business_hours` VALUES (244, 13, '2021-05-08 12:08:36', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (245, 8, '2021-05-08 16:55:52', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (246, 14, '2021-05-08 10:00:00', '2021-05-08 11:46:50');
INSERT INTO `business_hours` VALUES (247, 14, '2021-05-09 10:00:00', '2021-05-09 12:17:28');
INSERT INTO `business_hours` VALUES (248, 14, '2021-05-08 12:51:50', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (249, 9, '2021-05-08 16:54:27', '2021-05-08 17:00:18');
INSERT INTO `business_hours` VALUES (250, 5, '2021-05-08 10:00:00', '2021-05-08 11:55:04');
INSERT INTO `business_hours` VALUES (251, 5, '2021-05-09 10:00:00', '2021-05-09 12:16:00');
INSERT INTO `business_hours` VALUES (252, 5, '2021-05-08 13:33:04', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (253, 17, '2021-05-08 13:15:13', '2021-05-08 17:03:58');
INSERT INTO `business_hours` VALUES (254, 11, '2021-05-08 18:56:06', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (255, 12, '2021-05-08 13:33:14', '2021-05-08 14:20:45');
INSERT INTO `business_hours` VALUES (256, 9, '2021-05-08 18:55:18', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (257, 6, '2021-05-08 10:00:00', '2021-05-08 12:01:40');
INSERT INTO `business_hours` VALUES (258, 6, '2021-05-09 10:00:00', '2021-05-09 12:16:19');
INSERT INTO `business_hours` VALUES (259, 6, '2021-05-08 13:56:40', '2021-05-08 21:00:00');
INSERT INTO `business_hours` VALUES (260, 21, '2021-05-09 10:00:00', '2021-05-09 13:09:34');
INSERT INTO `business_hours` VALUES (261, 21, '2021-05-10 10:00:00', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (262, 21, '2021-05-09 14:32:34', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (263, 20, '2021-05-10 10:00:00', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (264, 20, '2021-05-09 14:25:35', '2021-05-09 14:26:26');
INSERT INTO `business_hours` VALUES (265, 15, '2021-05-10 10:00:00', '2021-05-10 12:32:24');
INSERT INTO `business_hours` VALUES (266, 15, '2021-05-09 13:50:52', '2021-05-09 13:51:55');
INSERT INTO `business_hours` VALUES (267, 13, '2021-05-10 10:00:00', '2021-05-10 12:30:24');
INSERT INTO `business_hours` VALUES (268, 13, '2021-05-09 12:59:11', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (269, 9, '2021-05-10 10:00:00', '2021-05-10 12:35:20');
INSERT INTO `business_hours` VALUES (270, 9, '2021-05-09 16:46:48', '2021-05-09 16:48:57');
INSERT INTO `business_hours` VALUES (271, 16, '2021-05-10 10:00:00', '2021-05-10 12:33:53');
INSERT INTO `business_hours` VALUES (272, 16, '2021-05-09 13:57:50', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (273, 12, '2021-05-10 10:00:00', '2021-05-10 12:28:27');
INSERT INTO `business_hours` VALUES (274, 12, '2021-05-09 15:05:09', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (275, 7, '2021-05-09 10:00:00', '2021-05-09 12:15:23');
INSERT INTO `business_hours` VALUES (276, 7, '2021-05-10 10:00:00', '2021-05-10 12:30:59');
INSERT INTO `business_hours` VALUES (277, 7, '2021-05-09 13:38:23', '2021-05-09 13:40:28');
INSERT INTO `business_hours` VALUES (278, 5, '2021-05-10 10:00:00', '2021-05-10 12:31:19');
INSERT INTO `business_hours` VALUES (279, 5, '2021-05-09 14:41:00', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (280, 6, '2021-05-10 10:00:00', '2021-05-10 12:36:42');
INSERT INTO `business_hours` VALUES (281, 6, '2021-05-09 14:41:19', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (282, 14, '2021-05-10 10:00:00', '2021-05-10 12:32:37');
INSERT INTO `business_hours` VALUES (283, 14, '2021-05-09 15:00:28', '2021-05-09 15:02:52');
INSERT INTO `business_hours` VALUES (284, 9, '2021-05-09 19:11:57', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (285, 20, '2021-05-09 16:36:26', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (286, 15, '2021-05-09 16:19:55', '2021-05-09 16:20:56');
INSERT INTO `business_hours` VALUES (287, 19, '2021-05-10 10:00:00', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (288, 19, '2021-05-09 15:44:20', '2021-05-09 15:46:24');
INSERT INTO `business_hours` VALUES (289, 18, '2021-05-10 10:00:00', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (290, 18, '2021-05-09 14:10:29', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (291, 15, '2021-05-09 19:03:56', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (292, 7, '2021-05-09 15:43:28', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (293, 14, '2021-05-09 17:27:52', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (294, 19, '2021-05-09 18:19:24', '2021-05-09 21:00:00');
INSERT INTO `business_hours` VALUES (295, 17, '2021-05-10 10:00:00', '2021-05-10 12:28:03');
INSERT INTO `business_hours` VALUES (296, 17, '2021-05-11 10:00:00', '2021-05-11 12:55:11');
INSERT INTO `business_hours` VALUES (297, 17, '2021-05-10 14:56:03', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (298, 12, '2021-05-11 10:00:00', '2021-05-11 12:45:46');
INSERT INTO `business_hours` VALUES (299, 12, '2021-05-10 14:11:27', '2021-05-10 14:13:15');
INSERT INTO `business_hours` VALUES (300, 13, '2021-05-11 10:00:00', '2021-05-11 12:57:02');
INSERT INTO `business_hours` VALUES (301, 13, '2021-05-10 13:33:24', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (302, 7, '2021-05-11 10:00:00', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (303, 7, '2021-05-10 14:53:59', '2021-05-10 14:54:30');
INSERT INTO `business_hours` VALUES (304, 5, '2021-05-11 10:00:00', '2021-05-11 12:48:49');
INSERT INTO `business_hours` VALUES (305, 5, '2021-05-10 14:26:19', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (306, 15, '2021-05-11 10:00:00', '2021-05-11 12:45:27');
INSERT INTO `business_hours` VALUES (307, 15, '2021-05-10 15:00:24', '2021-05-10 15:02:24');
INSERT INTO `business_hours` VALUES (308, 14, '2021-05-11 10:00:00', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (309, 14, '2021-05-10 15:57:37', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (310, 11, '2021-05-10 10:00:00', '2021-05-10 12:32:50');
INSERT INTO `business_hours` VALUES (311, 11, '2021-05-11 10:00:00', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (312, 11, '2021-05-10 16:12:50', '2021-05-10 16:13:00');
INSERT INTO `business_hours` VALUES (313, 7, '2021-05-10 16:49:30', '2021-05-10 16:50:01');
INSERT INTO `business_hours` VALUES (314, 16, '2021-05-11 10:00:00', '2021-05-11 12:52:54');
INSERT INTO `business_hours` VALUES (315, 16, '2021-05-10 15:16:53', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (316, 7, '2021-05-10 19:40:01', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (317, 9, '2021-05-11 10:00:00', '2021-05-11 12:44:09');
INSERT INTO `business_hours` VALUES (318, 9, '2021-05-10 15:03:20', '2021-05-10 15:05:17');
INSERT INTO `business_hours` VALUES (319, 6, '2021-05-11 10:00:00', '2021-05-11 12:52:20');
INSERT INTO `business_hours` VALUES (320, 6, '2021-05-10 16:24:42', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (321, 11, '2021-05-10 18:41:00', '2021-05-10 18:42:46');
INSERT INTO `business_hours` VALUES (322, 15, '2021-05-10 16:05:24', '2021-05-10 16:06:53');
INSERT INTO `business_hours` VALUES (323, 12, '2021-05-10 17:03:15', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (324, 8, '2021-05-10 10:00:00', '2021-05-10 12:39:38');
INSERT INTO `business_hours` VALUES (325, 8, '2021-05-11 10:00:00', '2021-05-11 12:46:00');
INSERT INTO `business_hours` VALUES (326, 8, '2021-05-10 15:12:38', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (327, 15, '2021-05-10 19:34:53', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (328, 9, '2021-05-10 18:33:17', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (329, 11, '2021-05-10 20:05:46', '2021-05-10 21:00:00');
INSERT INTO `business_hours` VALUES (330, 9, '2021-05-12 10:00:00', '2021-05-12 14:09:46');
INSERT INTO `business_hours` VALUES (331, 9, '2021-05-11 15:17:09', '2021-05-11 15:18:50');
INSERT INTO `business_hours` VALUES (332, 19, '2021-05-11 10:00:00', '2021-05-11 12:45:06');
INSERT INTO `business_hours` VALUES (333, 19, '2021-05-12 10:00:00', '2021-05-12 14:09:29');
INSERT INTO `business_hours` VALUES (334, 19, '2021-05-11 16:05:06', '2021-05-11 16:17:29');
INSERT INTO `business_hours` VALUES (335, 15, '2021-05-12 10:00:00', '2021-05-12 13:57:39');
INSERT INTO `business_hours` VALUES (336, 15, '2021-05-11 16:03:27', '2021-05-11 16:04:26');
INSERT INTO `business_hours` VALUES (337, 12, '2021-05-12 10:00:00', '2021-05-12 13:18:12');
INSERT INTO `business_hours` VALUES (338, 12, '2021-05-11 14:28:46', '2021-05-11 14:29:38');
INSERT INTO `business_hours` VALUES (339, 8, '2021-05-12 10:00:00', '2021-05-12 13:18:49');
INSERT INTO `business_hours` VALUES (340, 8, '2021-05-11 14:09:00', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (341, 12, '2021-05-11 17:49:38', '2021-05-11 17:50:13');
INSERT INTO `business_hours` VALUES (342, 14, '2021-05-12 10:00:00', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (343, 15, '2021-05-11 17:27:26', '2021-05-11 17:54:52');
INSERT INTO `business_hours` VALUES (344, 5, '2021-05-12 10:00:00', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (345, 5, '2021-05-11 14:31:49', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (346, 12, '2021-05-11 18:13:13', '2021-05-11 18:14:21');
INSERT INTO `business_hours` VALUES (347, 20, '2021-05-11 10:00:00', '2021-05-11 12:49:50');
INSERT INTO `business_hours` VALUES (348, 20, '2021-05-12 10:00:00', '2021-05-12 14:05:46');
INSERT INTO `business_hours` VALUES (349, 20, '2021-05-11 15:17:50', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (350, 12, '2021-05-11 19:37:21', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (351, 9, '2021-05-11 17:46:50', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (352, 6, '2021-05-12 10:00:00', '2021-05-12 13:18:26');
INSERT INTO `business_hours` VALUES (353, 6, '2021-05-11 13:50:20', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (354, 16, '2021-05-12 10:00:00', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (355, 16, '2021-05-11 14:30:54', '2021-05-11 14:57:18');
INSERT INTO `business_hours` VALUES (356, 21, '2021-05-11 10:00:00', '2021-05-11 12:53:10');
INSERT INTO `business_hours` VALUES (357, 21, '2021-05-12 10:00:00', '2021-05-12 13:06:46');
INSERT INTO `business_hours` VALUES (358, 21, '2021-05-11 14:16:10', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (359, 17, '2021-05-12 10:00:00', '2021-05-12 14:08:26');
INSERT INTO `business_hours` VALUES (360, 17, '2021-05-11 15:15:11', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (361, 19, '2021-05-11 17:15:29', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (362, 15, '2021-05-11 19:37:52', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (363, 13, '2021-05-12 10:00:00', '2021-05-12 13:21:23');
INSERT INTO `business_hours` VALUES (364, 13, '2021-05-11 15:57:02', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (365, 16, '2021-05-11 18:45:18', '2021-05-11 21:00:00');
INSERT INTO `business_hours` VALUES (366, 21, '2021-05-12 15:34:46', '2021-05-12 15:37:38');
INSERT INTO `business_hours` VALUES (367, 18, '2021-05-12 10:00:00', '2021-05-12 13:17:51');
INSERT INTO `business_hours` VALUES (368, 18, '2021-05-12 15:05:51', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (369, 12, '2021-05-13 10:00:00', '2021-05-13 14:44:35');
INSERT INTO `business_hours` VALUES (370, 12, '2021-05-12 15:41:12', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (371, 6, '2021-05-13 10:00:00', '2021-05-13 14:38:44');
INSERT INTO `business_hours` VALUES (372, 6, '2021-05-12 16:16:26', '2021-05-12 16:17:17');
INSERT INTO `business_hours` VALUES (373, 8, '2021-05-13 10:00:00', '2021-05-13 14:40:04');
INSERT INTO `business_hours` VALUES (374, 8, '2021-05-12 14:41:49', '2021-05-12 14:43:02');
INSERT INTO `business_hours` VALUES (375, 11, '2021-05-12 10:00:00', '2021-05-12 13:19:53');
INSERT INTO `business_hours` VALUES (376, 11, '2021-05-13 10:00:00', '2021-05-13 14:40:26');
INSERT INTO `business_hours` VALUES (377, 11, '2021-05-12 15:34:53', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (378, 13, '2021-05-13 10:00:00', '2021-05-13 14:44:06');
INSERT INTO `business_hours` VALUES (379, 13, '2021-05-12 15:11:23', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (380, 6, '2021-05-12 17:12:17', '2021-05-12 17:13:05');
INSERT INTO `business_hours` VALUES (381, 15, '2021-05-13 10:00:00', '2021-05-13 14:43:13');
INSERT INTO `business_hours` VALUES (382, 15, '2021-05-12 16:30:39', '2021-05-12 16:35:34');
INSERT INTO `business_hours` VALUES (383, 7, '2021-05-12 10:00:00', '2021-05-12 13:59:03');
INSERT INTO `business_hours` VALUES (384, 7, '2021-05-13 10:00:00', '2021-05-13 15:30:36');
INSERT INTO `business_hours` VALUES (385, 7, '2021-05-12 16:32:03', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (386, 21, '2021-05-12 19:27:38', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (387, 14, '2021-05-13 10:00:00', '2021-05-13 15:27:48');
INSERT INTO `business_hours` VALUES (388, 20, '2021-05-12 17:55:46', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (389, 8, '2021-05-12 16:53:02', '2021-05-12 17:10:38');
INSERT INTO `business_hours` VALUES (390, 15, '2021-05-12 17:30:34', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (391, 17, '2021-05-12 17:23:26', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (392, 19, '2021-05-12 17:09:29', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (393, 9, '2021-05-13 10:00:00', '2021-05-13 14:38:17');
INSERT INTO `business_hours` VALUES (394, 9, '2021-05-12 17:19:46', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (395, 8, '2021-05-12 18:45:38', '2021-05-12 18:54:48');
INSERT INTO `business_hours` VALUES (396, 6, '2021-05-12 19:28:05', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (397, 8, '2021-05-12 20:42:48', '2021-05-12 21:00:00');
INSERT INTO `business_hours` VALUES (398, 21, '2021-05-13 17:05:34', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (399, 9, '2021-05-14 10:00:00', '2021-05-14 15:47:31');
INSERT INTO `business_hours` VALUES (400, 9, '2021-05-13 16:06:17', '2021-05-13 16:07:20');
INSERT INTO `business_hours` VALUES (401, 6, '2021-05-14 10:00:00', '2021-05-14 15:43:36');
INSERT INTO `business_hours` VALUES (402, 6, '2021-05-13 15:36:44', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (403, 8, '2021-05-14 10:00:00', '2021-05-14 15:51:03');
INSERT INTO `business_hours` VALUES (404, 8, '2021-05-13 17:18:04', '2021-05-13 17:30:20');
INSERT INTO `business_hours` VALUES (405, 11, '2021-05-14 10:00:00', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (406, 11, '2021-05-13 18:18:26', '2021-05-13 18:29:59');
INSERT INTO `business_hours` VALUES (407, 16, '2021-05-13 10:00:00', '2021-05-13 14:42:30');
INSERT INTO `business_hours` VALUES (408, 16, '2021-05-14 10:00:00', '2021-05-14 15:43:17');
INSERT INTO `business_hours` VALUES (409, 16, '2021-05-13 18:15:30', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (410, 18, '2021-05-13 18:02:18', '2021-05-13 18:07:36');
INSERT INTO `business_hours` VALUES (411, 15, '2021-05-14 10:00:00', '2021-05-14 15:42:00');
INSERT INTO `business_hours` VALUES (412, 15, '2021-05-13 18:06:13', '2021-05-13 18:07:00');
INSERT INTO `business_hours` VALUES (413, 13, '2021-05-14 10:00:00', '2021-05-14 15:42:24');
INSERT INTO `business_hours` VALUES (414, 13, '2021-05-13 19:14:06', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (415, 12, '2021-05-14 10:00:00', '2021-05-14 15:41:11');
INSERT INTO `business_hours` VALUES (416, 12, '2021-05-13 18:02:35', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (417, 5, '2021-05-13 10:00:00', '2021-05-13 15:21:53');
INSERT INTO `business_hours` VALUES (418, 5, '2021-05-14 10:00:00', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (419, 18, '2021-05-13 19:30:36', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (420, 5, '2021-05-13 16:34:53', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (421, 15, '2021-05-13 20:22:00', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (422, 14, '2021-05-14 10:00:00', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (423, 14, '2021-05-13 17:55:48', '2021-05-13 17:57:00');
INSERT INTO `business_hours` VALUES (424, 9, '2021-05-13 17:30:20', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (425, 19, '2021-05-13 17:57:41', '2021-05-13 18:08:01');
INSERT INTO `business_hours` VALUES (426, 14, '2021-05-13 18:55:00', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (427, 7, '2021-05-14 10:00:00', '2021-05-14 15:42:53');
INSERT INTO `business_hours` VALUES (428, 7, '2021-05-13 15:53:36', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (429, 11, '2021-05-13 20:47:59', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (430, 8, '2021-05-13 18:48:20', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (434, 20, '2021-05-14 18:37:49', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (435, 12, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (436, 12, '2021-05-14 18:09:11', '2021-05-14 18:14:21');
INSERT INTO `business_hours` VALUES (437, 21, '2021-05-14 16:54:38', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (439, 15, '2021-05-14 17:25:00', '2021-05-14 17:47:23');
INSERT INTO `business_hours` VALUES (441, 13, '2021-05-14 18:15:24', '2021-05-14 18:18:05');
INSERT INTO `business_hours` VALUES (442, 7, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (443, 7, '2021-05-14 19:02:53', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (445, 16, '2021-05-14 16:41:17', '2021-05-14 17:08:07');
INSERT INTO `business_hours` VALUES (446, 6, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (449, 17, '2021-05-14 16:39:07', '2021-05-14 16:45:35');
INSERT INTO `business_hours` VALUES (451, 18, '2021-05-14 18:14:53', '2021-05-14 18:20:35');
INSERT INTO `business_hours` VALUES (453, 17, '2021-05-14 18:30:35', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (454, 13, '2021-05-14 19:41:05', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (455, 9, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (456, 9, '2021-05-14 16:40:31', '2021-05-14 16:50:23');
INSERT INTO `business_hours` VALUES (457, 15, '2021-05-14 20:17:23', '2021-05-14 20:18:04');
INSERT INTO `business_hours` VALUES (458, 18, '2021-05-14 19:43:35', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (459, 12, '2021-05-14 19:49:21', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (460, 8, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (461, 8, '2021-05-14 16:54:03', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (462, 9, '2021-05-14 17:13:23', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (463, 6, '2021-05-14 18:06:36', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (464, 19, '2021-05-13 18:31:01', '2021-05-13 21:00:00');
INSERT INTO `business_hours` VALUES (465, 19, '2021-05-14 10:00:00', '2021-05-14 15:46:03');
INSERT INTO `business_hours` VALUES (466, 19, '2021-05-14 18:01:03', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (467, 18, '2021-05-14 11:47:55', '2021-05-14 15:44:53');
INSERT INTO `business_hours` VALUES (471, 21, '2021-05-15 10:00:00', '2021-05-15 20:13:30');
INSERT INTO `business_hours` VALUES (487, 16, '2021-05-14 18:31:07', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (488, 5, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (489, 15, '2021-05-14 20:55:35', '2021-05-14 21:00:00');
INSERT INTO `business_hours` VALUES (490, 15, '2021-05-14 20:36:04', '2021-05-14 20:37:35');
INSERT INTO `business_hours` VALUES (494, 14, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (496, 20, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (500, 21, '2021-05-15 20:21:30', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (504, 15, '2021-05-15 10:00:00', '2021-05-15 12:09:40');
INSERT INTO `business_hours` VALUES (505, 19, '2021-05-15 10:00:00', '2021-05-15 14:13:12');
INSERT INTO `business_hours` VALUES (508, 16, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (509, 18, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (510, 15, '2021-05-15 18:42:47', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (512, 13, '2021-05-15 10:00:00', '2021-05-15 18:37:56');
INSERT INTO `business_hours` VALUES (513, 13, '2021-05-15 18:45:56', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (515, 9, '2021-05-16 10:00:00', '2021-05-16 21:00:00');
INSERT INTO `business_hours` VALUES (516, 14, '2021-05-16 10:00:00', '2021-05-16 21:00:00');
INSERT INTO `business_hours` VALUES (517, 15, '2021-05-16 10:00:00', '2021-05-16 21:00:00');
INSERT INTO `business_hours` VALUES (518, 15, '2021-05-15 12:32:40', '2021-05-15 12:32:45');
INSERT INTO `business_hours` VALUES (519, 15, '2021-05-15 15:31:42', '2021-05-15 18:34:47');
INSERT INTO `business_hours` VALUES (520, 15, '2021-05-15 12:55:45', '2021-05-15 15:08:42');
INSERT INTO `business_hours` VALUES (521, 17, '2021-05-16 10:00:00', '2021-05-16 21:00:00');
INSERT INTO `business_hours` VALUES (522, 17, '2021-05-15 10:00:00', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (523, 19, '2021-05-16 10:00:00', '2021-05-16 21:00:00');
INSERT INTO `business_hours` VALUES (524, 19, '2021-05-15 14:31:12', '2021-05-15 17:22:02');
INSERT INTO `business_hours` VALUES (525, 20, '2021-05-16 10:00:00', '2021-05-16 21:00:00');
INSERT INTO `business_hours` VALUES (526, 19, '2021-05-15 17:40:02', '2021-05-15 21:00:00');
INSERT INTO `business_hours` VALUES (527, 18, '2021-05-16 10:00:00', '2021-05-16 21:00:00');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL COMMENT '订单id',
  `stylist_id` int(11) NOT NULL COMMENT '发型师id',
  `contact` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '评论内容',
  `create_date` datetime(0) NOT NULL COMMENT '创建时间',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `rate` float(2, 1) NOT NULL COMMENT '评分0~5',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 83 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (35, 140, 5, '一般般，下次换另一家理发店', '2021-04-14 15:55:48', 32, 2.5);
INSERT INTO `comment` VALUES (36, 138, 5, '理发师剪的超级好看，可以说很潮了', '2021-04-14 15:58:00', 32, 5.0);
INSERT INTO `comment` VALUES (38, 138, 5, '下次还来', '2021-04-14 16:02:20', 32, 3.5);
INSERT INTO `comment` VALUES (39, 138, 5, '剪的还好', '2021-04-14 16:07:11', 32, 4.0);
INSERT INTO `comment` VALUES (40, 140, 5, '好失望，剪了个什么玩意儿', '2021-04-14 16:09:03', 32, 1.5);
INSERT INTO `comment` VALUES (41, 140, 5, '还可以', '2021-04-14 16:10:39', 32, 3.0);
INSERT INTO `comment` VALUES (42, 140, 5, '不行', '2021-04-14 16:12:57', 32, 1.5);
INSERT INTO `comment` VALUES (43, 140, 5, '便宜实惠', '2021-04-14 16:15:54', 32, 5.0);
INSERT INTO `comment` VALUES (45, 163, 17, '剪发速度很快', '2021-05-13 22:44:27', 36, 5.0);
INSERT INTO `comment` VALUES (46, 160, 19, '发色很好！染的超可以', '2021-05-13 22:46:02', 36, 5.0);
INSERT INTO `comment` VALUES (47, 162, 11, '一般般啦', '2021-05-13 22:46:38', 36, 3.0);
INSERT INTO `comment` VALUES (48, 161, 16, '发色不好看', '2021-05-13 22:47:43', 36, 2.0);
INSERT INTO `comment` VALUES (49, 175, 11, '还行，价格便宜', '2021-05-13 22:49:21', 40, 2.5);
INSERT INTO `comment` VALUES (50, 177, 9, '不错的，推荐这家店', '2021-05-13 22:50:10', 40, 4.0);
INSERT INTO `comment` VALUES (51, 176, 12, '还可以吧', '2021-05-13 22:54:02', 40, 3.5);
INSERT INTO `comment` VALUES (52, 174, 17, '勉勉强强', '2021-05-13 22:55:24', 40, 3.5);
INSERT INTO `comment` VALUES (53, 178, 6, '头发护理很到位', '2021-05-13 22:56:16', 40, 3.5);
INSERT INTO `comment` VALUES (54, 169, 13, '便宜实惠，推荐这位发型师', '2021-05-13 22:57:31', 39, 4.0);
INSERT INTO `comment` VALUES (55, 171, 14, '人不是很多，很快就剪完了。发型也挺好', '2021-05-13 22:58:05', 39, 3.5);
INSERT INTO `comment` VALUES (56, 170, 8, '下次再来', '2021-05-13 22:58:31', 39, 3.0);
INSERT INTO `comment` VALUES (57, 180, 20, '新来的发型师技术不错', '2021-05-13 22:59:58', 42, 4.0);
INSERT INTO `comment` VALUES (58, 179, 21, '哈哈不错，头发清爽了很多', '2021-05-13 23:00:25', 42, 3.5);
INSERT INTO `comment` VALUES (59, 181, 15, '还是很不错的哈', '2021-05-13 23:00:52', 42, 3.5);
INSERT INTO `comment` VALUES (60, 167, 15, '下次还预约你', '2021-05-13 23:02:18', 37, 3.5);
INSERT INTO `comment` VALUES (61, 167, 15, '不错不错', '2021-05-13 23:02:34', 37, 3.5);
INSERT INTO `comment` VALUES (62, 165, 13, '洗剪吹便宜实惠', '2021-05-13 23:03:06', 37, 3.5);
INSERT INTO `comment` VALUES (63, 166, 9, '烫发不错的', '2021-05-13 23:03:54', 37, 3.5);
INSERT INTO `comment` VALUES (64, 265, 18, '强烈安利这位神仙发型师', '2021-05-13 23:05:51', 67, 3.5);
INSERT INTO `comment` VALUES (66, 268, 12, '护发不错，头发柔顺了很多', '2021-05-13 23:06:21', 67, 3.5);
INSERT INTO `comment` VALUES (67, 266, 15, '不符预期', '2021-05-13 23:07:10', 67, 2.0);
INSERT INTO `comment` VALUES (68, 186, 7, '哇，这发型！！我好爱', '2021-05-13 23:08:17', 43, 3.5);
INSERT INTO `comment` VALUES (69, 185, 12, '这位发型师可以的', '2021-05-13 23:08:51', 43, 4.5);
INSERT INTO `comment` VALUES (70, 184, 16, '很不错', '2021-05-13 23:09:04', 43, 3.0);
INSERT INTO `comment` VALUES (71, 187, 5, '是我爱的发型', '2021-05-13 23:13:14', 43, 3.5);
INSERT INTO `comment` VALUES (72, 193, 19, '下次还约', '2021-05-13 23:14:37', 44, 3.5);
INSERT INTO `comment` VALUES (73, 192, 15, '爸妈都是剪的很好看', '2021-05-13 23:15:37', 44, 3.5);
INSERT INTO `comment` VALUES (74, 191, 20, '妹子剪得不错。爱了爱了', '2021-05-13 23:16:22', 44, 3.5);
INSERT INTO `comment` VALUES (75, 198, 19, '烫发是真的好看', '2021-05-13 23:17:59', 46, 4.0);
INSERT INTO `comment` VALUES (76, 196, 7, '剪得真心好看', '2021-05-13 23:19:07', 46, 3.0);
INSERT INTO `comment` VALUES (77, 194, 18, '朋友看了都说好！！', '2021-05-13 23:19:27', 46, 3.5);
INSERT INTO `comment` VALUES (78, 203, 5, '及格吧，弄的太久了', '2021-05-13 23:21:11', 47, 3.0);
INSERT INTO `comment` VALUES (79, 202, 7, '为什么我不早点来这家店！！', '2021-05-13 23:21:57', 47, 4.0);
INSERT INTO `comment` VALUES (80, 200, 12, '以后常来', '2021-05-13 23:22:09', 47, 5.0);
INSERT INTO `comment` VALUES (81, 146, 6, '真不错', '2021-05-14 01:24:31', 32, 3.5);
INSERT INTO `comment` VALUES (82, 141, 9, '发型师技术不错', '2021-05-14 03:02:35', 32, 4.0);
INSERT INTO `comment` VALUES (83, 155, 12, '强烈推荐这位发型师哥哥！！', '2021-05-14 17:04:39', 32, 5.0);

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `coupon_id` int(11) NOT NULL COMMENT '优惠券的id',
  `value` int(11) NOT NULL COMMENT '优惠券面值/或折扣百分比',
  `up_to` int(11) NOT NULL COMMENT '满减的门槛金额，为0代表无门槛',
  `valid_date_from` datetime(0) NOT NULL COMMENT '有效起始时间',
  `valid_date_to` datetime(0) NOT NULL COMMENT '有效截止时间',
  `receive_date` datetime(0) NOT NULL COMMENT '领取时间',
  `used_date` datetime(0) NULL DEFAULT NULL COMMENT '使用时间',
  `is_used` int(1) NOT NULL COMMENT '优惠券状态：0表示未使用，1表示已使用',
  `type` int(1) NOT NULL COMMENT '优惠券类型：0表示满减券，1表示折扣券',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of coupon
-- ----------------------------
INSERT INTO `coupon` VALUES (19, 32, 5, 20, 100, '2021-04-10 16:39:14', '2021-05-30 16:39:24', '2021-04-10 16:42:58', '2021-04-14 15:54:16', 1, 0);
INSERT INTO `coupon` VALUES (23, 32, 13, 20, 80, '2021-05-07 00:00:00', '2021-05-19 00:00:00', '2021-05-14 01:45:23', '2021-05-14 02:56:26', 0, 0);
INSERT INTO `coupon` VALUES (24, 32, 9, 8, 0, '2021-04-10 16:42:15', '2021-05-31 16:42:18', '2021-05-14 02:58:34', '2021-05-15 02:23:43', 0, 1);
INSERT INTO `coupon` VALUES (25, 32, 8, 10, 0, '2021-04-10 16:41:24', '2021-05-31 16:41:29', '2021-05-15 02:38:06', NULL, 0, 0);

-- ----------------------------
-- Table structure for coupon_distribution
-- ----------------------------
DROP TABLE IF EXISTS `coupon_distribution`;
CREATE TABLE `coupon_distribution`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) NULL DEFAULT NULL COMMENT '发放优惠券的管理员的id',
  `value` int(11) NOT NULL COMMENT '优惠券面值/或折扣百分比',
  `up_to` int(11) NOT NULL COMMENT '满减的门槛金额，为0代表无门槛',
  `valid_date_from` datetime(0) NOT NULL COMMENT '有效起始时间',
  `valid_date_to` datetime(0) NOT NULL COMMENT '有效截止时间',
  `type` int(1) NOT NULL COMMENT '优惠券类型：0表示满减券，1表示折扣券',
  `num` int(11) NOT NULL COMMENT '优惠券剩余数量',
  `total_num` int(11) NOT NULL COMMENT '优惠券总数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of coupon_distribution
-- ----------------------------
INSERT INTO `coupon_distribution` VALUES (1, NULL, 20, 100, '2021-03-29 00:00:00', '2021-04-05 00:00:00', 0, 50, 50);
INSERT INTO `coupon_distribution` VALUES (2, NULL, 9, 0, '2021-03-30 00:00:00', '2021-03-31 00:00:00', 1, 45, 45);
INSERT INTO `coupon_distribution` VALUES (3, NULL, 60, 200, '2021-04-01 00:00:00', '2021-04-05 00:00:00', 0, 50, 50);
INSERT INTO `coupon_distribution` VALUES (4, NULL, 50, 120, '2021-04-05 23:59:33', '2021-04-05 23:59:43', 0, 50, 50);
INSERT INTO `coupon_distribution` VALUES (5, NULL, 20, 100, '2021-04-10 16:39:14', '2021-05-30 16:39:24', 0, 49, 50);
INSERT INTO `coupon_distribution` VALUES (6, NULL, 30, 170, '2021-04-10 16:40:11', '2021-05-31 16:40:14', 0, 50, 50);
INSERT INTO `coupon_distribution` VALUES (7, NULL, 10, 60, '2021-04-10 16:40:54', '2021-05-31 16:40:56', 0, 60, 60);
INSERT INTO `coupon_distribution` VALUES (8, NULL, 10, 0, '2021-04-10 16:41:24', '2021-05-31 16:41:29', 0, 59, 60);
INSERT INTO `coupon_distribution` VALUES (9, NULL, 8, 0, '2021-04-10 16:42:15', '2021-05-31 16:42:18', 1, 59, 60);
INSERT INTO `coupon_distribution` VALUES (10, NULL, 7, 0, '2021-04-17 20:30:12', '2021-05-31 20:30:18', 1, 0, 40);
INSERT INTO `coupon_distribution` VALUES (11, NULL, 20, 51, '2021-05-05 00:00:00', '2021-05-14 00:00:00', 0, 50, 50);
INSERT INTO `coupon_distribution` VALUES (12, NULL, 20, 80, '2021-05-07 00:00:00', '2021-05-08 00:00:00', 0, 100, 100);
INSERT INTO `coupon_distribution` VALUES (13, NULL, 20, 80, '2021-05-07 00:00:00', '2021-05-19 00:00:00', 0, 19, 20);

-- ----------------------------
-- Table structure for evaluation
-- ----------------------------
DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE `evaluation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stylist_id` int(11) NOT NULL,
  `quantities` int(11) NOT NULL,
  `rate` float(2, 1) UNSIGNED ZEROFILL NOT NULL,
  `popularity` float(5, 2) NOT NULL,
  `positive` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of evaluation
-- ----------------------------
INSERT INTO `evaluation` VALUES (1, 5, 10, 3.2, 70.00, 7);
INSERT INTO `evaluation` VALUES (2, 6, 5, 3.5, 80.00, 4);
INSERT INTO `evaluation` VALUES (3, 7, 3, 3.5, 100.00, 3);
INSERT INTO `evaluation` VALUES (4, 8, 1, 3.0, 100.00, 1);
INSERT INTO `evaluation` VALUES (5, 9, 3, 3.9, 100.00, 3);
INSERT INTO `evaluation` VALUES (6, 11, 2, 2.8, 50.00, 1);
INSERT INTO `evaluation` VALUES (7, 12, 5, 4.3, 100.00, 5);
INSERT INTO `evaluation` VALUES (8, 13, 2, 3.8, 100.00, 2);
INSERT INTO `evaluation` VALUES (9, 14, 1, 3.5, 100.00, 1);
INSERT INTO `evaluation` VALUES (10, 15, 5, 3.2, 80.00, 4);
INSERT INTO `evaluation` VALUES (11, 16, 3, 3.0, 66.67, 2);
INSERT INTO `evaluation` VALUES (12, 17, 2, 4.2, 100.00, 2);
INSERT INTO `evaluation` VALUES (13, 18, 2, 3.5, 100.00, 2);
INSERT INTO `evaluation` VALUES (14, 19, 3, 4.1, 100.00, 3);
INSERT INTO `evaluation` VALUES (15, 20, 2, 3.8, 100.00, 2);
INSERT INTO `evaluation` VALUES (16, 21, 1, 3.5, 100.00, 1);
INSERT INTO `evaluation` VALUES (17, 22, 0, 5.0, 100.00, 0);
INSERT INTO `evaluation` VALUES (24, 29, 0, 5.0, 100.00, 0);

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标题',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '内容',
  `admin_id` int(11) NULL DEFAULT NULL COMMENT '管理员id',
  `create_date` datetime(0) NOT NULL COMMENT '创建日期',
  `web_view` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '带html格式的内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of information
-- ----------------------------
INSERT INTO `information` VALUES (1, '你不知道的那些护发小技巧，简单实用，头发柔软顺滑', '相信不少朋友都很爱漂染头发 烫发。但是头发真的经不起折腾。今天我就来给大家分享下怎样护发。首先呢我们要有一些常识。漂染或者烫发是最严重的，普通的护理效果是不够的。漂过的头发不能做软化、柔顺和烫直，会立马断掉。吹头发，洗完头发，一定要把整个头发吹到全干。秀发严苛守则。1、绝对不让头发接触到它不该接触到的东西。坐椅子把头发撩到胸前再去靠椅背。坐车的时候把头发放在安全带前面。睡觉把头发撩起来再睡。2、尽量不绑马尾或戴发箍。绑马尾或戴发箍会让前额的头发掉的厉害。3、自然垂下 平均分成两边。不让头发偏重任何一边。头发日常护理。1、头发微湿。在头发微湿状态时可以涂些护发精油，可以让头发柔顺很多。2、头发也要做好防晒，避免强烈阳光照射。3、分叉一定要剪。4、吃天然的头发保养品。吃海带、黑芝麻会让发质变好。5、尽量不染发。6、和慕斯、定型液说拜拜。7、这样绑头发不容易掉发。把前面的刘海修短些，有一点层次，绑马尾的时候就不会绑到前面的头发了，橡皮筋一定要用圆柱形的，不能用四方形的。8、每天认真梳头，从头皮到发尖。洗发步骤。可以先用护发素，洗头的时候梳顺头发，把头发打湿，按压护发素到手心，由发梢往上涂抹护发素并揉搓不要碰到头皮，按摩几分钟再梳开冲洗。然后用洗发水，洗发水一定要用无硅油的，然后不要直接抹头皮！将洗发水倒在手心里揉搓，从中间位置再到发尾，最后将泡沫带到头皮，然后用指腹按摩揉搓，最后冲洗干净。这些常识和方法你们都记住了吗。赶紧用起来吧 拥有闪亮秀发。', NULL, '2021-05-10 20:44:57', '<p>相信不少朋友都很爱漂染头发 烫发</p>\n<p>但是头发真的经不起折腾</p>\n<p>今天我就来给大家分享下怎样护发</p>\n<p>首先呢我们要有一些常识</p>\n<p>漂染或者烫发是最严重的，普通的护理效果是不够的</p>\n<p>漂过的头发不能做软化、柔顺和烫直，会立马断掉</p>\n<p>吹头发，洗完头发，一定要把整个头发吹到全干</p>\n<br>\n<p>秀发严苛守则</p>\n<p>1、绝对不让头发接触到它不该接触到的东西</p>\n<p>坐椅子把头发撩到胸前再去靠椅背</p>\n<p>坐车的时候把头发放在安全带前面</p>\n<p>睡觉把头发撩起来再睡</p>\n<p>2、尽量不绑马尾或戴发箍</p>\n<p>绑马尾或戴发箍会让前额的头发掉的厉害</p>\n<p>3、自然垂下 平均分成两边</p>\n<p>不让头发偏重任何一边</p>\n<br>\n<p>头发日常护理</p>\n<p>1、头发微湿</p>\n<p>在头发微湿状态时可以涂些护发精油，可以让头发柔顺很多</p>\n<p>2、头发也要做好防晒，避免强烈阳光照射</p>\n<p>3、分叉一定要剪</p>\n<p>4、吃天然的头发保养品</p>\n<p>吃海带、黑芝麻会让发质变好</p>\n<p>5、尽量不染发</p>\n<p>6、和慕斯、定型液说拜拜</p>\n<p>7、这样绑头发不容易掉发</p>\n<p>把前面的刘海修短些，有一点层次，绑马尾的时候就不会绑到前面的头发了，橡皮筋一定要用圆柱形的，不能用四方形的</p>\n<p>8、每天认真梳头，从头皮到发尖</p>\n<br>\n<p>洗发步骤</p>\n<p>可以先用护发素，洗头的时候梳顺头发，把头发打湿，按压护发素到手心，由发梢往上涂抹护发素并揉搓不要碰到头皮，按摩几分钟再梳开冲洗</p>\n<p>然后用洗发水，洗发水一定要用无硅油的，然后不要直接抹头皮！将洗发水倒在手心里揉搓，从中间位置再到发尾，最后将泡沫带到头皮，然后用指腹按摩揉搓，最后冲洗干净</p>\n<p>这些常识和方法你们都记住了吗</p>\n<p>赶紧用起来吧 拥有闪亮秀发</p>\n<p><img src=\"https://p1-tt.byteimg.com/origin/pgc-image/206b517007ae4055a845c79a5ef19990?from=pc\"class=\"mCS_img_loaded\"></p>\n<p><img src=\"https://p1-tt.byteimg.com/origin/pgc-image/ec4f17749600433791755b6f742de4b7?from=pc\"class=\"mCS_img_loaded\"></p>\n<p><img src=\"https://p1-tt.byteimg.com/origin/pgc-image/d99d35280694426799419662be9c9e81?from=pc\"class=\"mCS_img_loaded\"></p>');
INSERT INTO `information` VALUES (5, '远离毛糙与头屑 冬季男士护发5个技巧', '冬季气候寒冷干燥，头发容易因水分缺失而变得毛糙脆弱，同时头皮也因为油脂分泌不足而变得更加敏感，头屑烦恼也再度升级。以下总结6个适合冬季护发的小技巧，让你时刻表现潇洒出色。\n1. 避免染烫\n\n为了造型的需要，不少男士需要经常染烫头发，不过在冬季需要尽量减少或避免染烫头发的次数，因为染烫属于热造型处理，无论染烫发剂还是高温都会对头发造成难以挽回的伤害，甚至会损伤头皮毛囊，让发质深层受损，让原本就脆弱敏感的头皮出现过敏脱皮等严重反应。\n\n2. 减少洗发\n\n不少男士选择在每天洗澡的时候一起洗发，不过我们还是建议你在冬天没有必要每天都冲洗头发，以免过度洗走头部油脂，让头皮变得更加干燥，另外如果每次洗发冲洗不够彻底，洗发液残留物也会沉积在头皮上，堵塞毛囊，导致头屑问题加重。建议你选用温和滋润型洗发露，最好配合护发素一起使用。洗发后尽量避免热吹风机烘烤，短发的男士自然晾干即可。\n\n3. 定期修剪\n\n不少男士到了冬季因为寒冷的缘故愿意留长头发，但是厚密的长发需要更多的护理和修剪，否则不但发型很容易变形，头发也会因为护理不当受到一定的伤害，比如清洗不到位，吹干不彻底等。虽然冬季头发生长相对缓慢，但是还是建议你至少每个月找造型师修剪一次，定期修剪不但能保持发型，还能刺激头发生长，防止发梢分叉。另外冬季造型发胶类产品尽量少用，尤其是喜欢戴帽子的男士，本来透气性就不好，如果过多使用发胶会让头发无法呼吸。\n\n4. 深度护理\n\n在北方的冬季，我们一般都长时间呆在暖气房间里，在干燥和不流通的空气中头发也会收到伤害。因此不妨每周在家中可以做一次深度的头发护理，舒缓头皮压力，促进血液循环，帮助头发生长。另外冬季所穿的羽绒和羊毛类服装也容易与头发摩擦产生静电，所以选择一款能消除静电的保湿喷雾也是必要的。\n\n5. 阳光防晒\n\n北方的冬季日照相对更强烈，而且寒风卷起沙尘，对头发造成双重伤害。因此如果要长时间进行户外活动，最好在出门前抹上免洗护发素，而且需要选择含有SPF成分的产品，它能在头发周围形成保护膜，降低紫外线的伤害，减少头发水分的流失。\n\n6. 注意饮食\n\n饮食对头发的护理也很重要。缺乏营养的头发看起来一定是枯黄无光泽的，必要的蛋白质和多种维生素能让秀发保持光泽和强韧，因此蔬菜与水果，以及肉蛋奶类都是滋养头发营养的理想来源，不少黑色食物也有护发的功效，比如：黑芝麻、黑豆、紫菜、甘蓝菜等。另外在干燥的冬季，身体和皮肤都容易缺水，所以注意补充水分也是保持头发健康的必要前提。', NULL, '2021-05-13 02:42:10', '<p>冬季气候寒冷干燥，头发容易因水分缺失而变得毛糙脆弱，同时头皮也因为油脂分泌不足而变得更加敏感，头屑烦恼也再度升级。以下总结6个适合冬季护发的小技巧，让你时刻表现潇洒出色。</p><p><img src=\"http://img.gq.com.cn/userfiles/201112/images/13244255623.jpg\" class=\"mCS_img_loaded\"></p><br><p>1. 减少洗发</p><p>不少男士选择在每天洗澡的时候一起洗发，不过我们还是建议你在冬天没有必要每天都冲洗头发，以免过度洗走头部油脂，让头皮变得更加干燥，另外如果每次洗发冲洗不够彻底，洗发液残留物也会沉积在头皮上，堵塞毛囊，导致头屑问题加重。建议你选用温和滋润型洗发露，最好配合护发素一起使用。洗发后尽量避免热吹风机烘烤，短发的男士自然晾干即可。</p><br><p>2. 定期修剪</p><p>不少男士到了冬季因为寒冷的缘故愿意留长头发，但是厚密的长发需要更多的护理和修剪，否则不但发型很容易变形，头发也会因为护理不当受到一定的伤害，比如清洗不到位，吹干不彻底等。虽然冬季头发生长相对缓慢，但是还是建议你至少每个月找造型师修剪一次，定期修剪不但能保持发型，还能刺激头发生长，防止发梢分叉。另外冬季造型发胶类产品尽量少用，尤其是喜欢戴帽子的男士，本来透气性就不好，如果过多使用发胶会让头发无法呼吸。</p><br><p>3. 深度护理</p><p>在北方的冬季，我们一般都长时间呆在暖气房间里，在干燥和不流通的空气中头发也会收到伤害。因此不妨每周在家中可以做一次深度的头发护理，舒缓头皮压力，促进血液循环，帮助头发生长。另外冬季所穿的羽绒和羊毛类服装也容易与头发摩擦产生静电，所以选择一款能消除静电的保湿喷雾也是必要的。</p><br><p>4. 阳光防晒</p><p>北方的冬季日照相对更强烈，而且寒风卷起沙尘，对头发造成双重伤害。因此如果要长时间进行户外活动，最好在出门前抹上免洗护发素，而且需要选择含有SPF成分的产品，它能在头发周围形成保护膜，降低紫外线的伤害，减少头发水分的流失。</p><br><p>5. 注意饮食</p><p>饮食对头发的护理也很重要。缺乏营养的头发看起来一定是枯黄无光泽的，必要的蛋白质和多种维生素能让秀发保持光泽和强韧，因此蔬菜与水果，以及肉蛋奶类都是滋养头发营养的理想来源，不少黑色食物也有护发的功效，比如：黑芝麻、黑豆、紫菜、甘蓝菜等。另外在干燥的冬季，身体和皮肤都容易缺水，所以注意补充水分也是保持头发健康的必要前提。</p>');
INSERT INTO `information` VALUES (6, '清新又时尚 帅哥夏日清爽发型', '韩剧《城市猎人》收视不俗，此剧中李民浩的精致纹理烫发型成为一大亮点。帅气中带着文静，精致而不张扬，被称为“王子头”。今夏很多美男都不约而同的选择了精致清爽款发型，甚至是比较复古的学生头。下面我们给你介绍几款时下在韩国十分流行的男士发型。\n\n1.烫发王子造型\n低调的咖啡色，厚厚的刘海配合两边的鬓发线条，具有小脸效果。微卷的发梢增加了整体的立体感与动感，自然有型。长鬓角将发型整体拉长，增加了稳定感。整体呈现出王子般绅士风度。\n教你怎么做：先将头发整体吹到半干，要边吹，边将发卷打开。之后将软质发蜡或啫喱涂到头发表层的发卷上，并用手指按照卷曲度将发卷轻轻卷起。注意保持两边长发稍的垂直度。\n\n2.文静书生造型\n以稍短的发层为基础进行剪裁。鬓角与发尾都要保留偏长的长度，颜色以暗棕色为优选。与衬衣或英伦造型最为搭配。\n教你怎么做：将头发弄到半湿，将整体涂上硬质凝胶后，马上用梳子将头发有方向感的梳理整齐。\n\n3.性感短发造型\n侧面的基底为紧凑，极短的“两边剃”，要防止杂毛&厚重感的出现。款式上并不需要表现出明显线条，重视同层的柔软曲线造型，高档次的时尚发型。\n教你怎么做：吹干后，为了强调线条，用手梳理，打造发型。此款推荐使用纤维系软质发蜡。也可以不打发蜡。\n\n4.精干简洁造型\n如果你与模特一样的左偏分则如图，反之则反方向剪裁。将头发按照“右4对左6”分开。然后将前发都向前梳。左边保留长鬓角，厚刘海。右边鬓角处剃短至露耳，刘海随之剪短。做好左右刘海的过渡。\n教你怎么做：使用较软的发蜡，将头发表层抓起，做出头顶与后面的蓬松感。清爽感与厚重感并存。\n\n5.清爽卷发造型\n以休闲莫西干为基础，将头发剪出长短不一的层次感。鬓角尾部发梢处要精心处理，防止毛糙，卷曲的出现。清新×绅士沉稳的效果。\n教你怎么做：将发蜡涂在头发上，用双手的五指抓住头发，分方向的做出卷翘。\n\n6.彬彬美男造型\n很具有学院风格，也很适合通勤的发型。很注重文理的打造，前后长短的衔接。浅棕色搭配文气的发型，显得无害而安静。\n教你怎么做：自然吹干后，使用发蜡将全部头发轻轻抓揉一遍，使发梢有线条感即可。', NULL, '2021-05-13 03:06:44', '<p>韩剧《城市猎人》收视不俗，此剧中李民浩的精致纹理烫发型成为一大亮点。帅气中带着文静，精致而不张扬，被称为“王子头”。今夏很多美男都不约而同的选择了精致清爽款发型，甚至是比较复古的学生头。下面我们给你介绍几款时下在韩国十分流行的男士发型。</p><p><img src=\"http://img.gq.com.cn/sites/default/files/userfiles/201107/13110894866.jpg\" class=\"mCS_img_loaded\"></p><p>1.烫发王子造型</p><p>低调的咖啡色，厚厚的刘海配合两边的鬓发线条，具有小脸效果。微卷的发梢增加了整体的立体感与动感，自然有型。长鬓角将发型整体拉长，增加了稳定感。整体呈现出王子般绅士风度。</p><p>教你怎么做：先将头发整体吹到半干，要边吹，边将发卷打开。之后将软质发蜡或啫喱涂到头发表层的发卷上，并用手指按照卷曲度将发卷轻轻卷起。注意保持两边长发稍的垂直度。</p><p><img src=\"http://img.gq.com.cn/sites/default/files/userfiles/201107/13110894966.jpg\" class=\"mCS_img_loaded\"</p><p>2.文静书生造型</p><p>以稍短的发层为基础进行剪裁。鬓角与发尾都要保留偏长的长度，颜色以暗棕色为优选。与衬衣或英伦造型最为搭配。</p>\n<p>教你怎么做：将头发弄到半湿，将整体涂上硬质凝胶后，马上用梳子将头发有方向感的梳理整齐。</p><p><img src=\"http://img.gq.com.cn/sites/default/files/userfiles/201107/13110895061.jpg\" class=\"mCS_img_loaded\"</p><p>3.性感短发造型</p><p>侧面的基底为紧凑，极短的“两边剃”，要防止杂毛&厚重感的出现。款式上并不需要表现出明显线条，重视同层的柔软曲线造型，高档次的时尚发型。</p><p>教你怎么做：吹干后，为了强调线条，用手梳理，打造发型。此款推荐使用纤维系软质发蜡。也可以不打发蜡。</p><p><img src=\"http://img.gq.com.cn/sites/default/files/userfiles/201107/131108951710.jpg\" class=\"mCS_img_loaded\"</p><p>4.精干简洁造型</p><p>如果你与模特一样的左偏分则如图，反之则反方向剪裁。将头发按照“右4对左6”分开。然后将前发都向前梳。左边保留长鬓角，厚刘海。右边鬓角处剃短至露耳，刘海随之剪短。做好左右刘海的过渡。</p><p>教你怎么做：使用较软的发蜡，将头发表层抓起，做出头顶与后面的蓬松感。清爽感与厚重感并存。</p><p><img src=\"http://img.gq.com.cn/sites/default/files/userfiles/201107/13110895276.jpg\" class=\"mCS_img_loaded\"</p><p>5.清爽卷发造型</p><p>以休闲莫西干为基础，将头发剪出长短不一的层次感。鬓角尾部发梢处要精心处理，防止毛糙，卷曲的出现。清新×绅士沉稳的效果。</p><p>教你怎么做：将发蜡涂在头发上，用双手的五指抓住头发，分方向的做出卷翘。</p><p><img src=\"http://img.gq.com.cn/sites/default/files/userfiles/201107/13110895402.jpg\" class=\"mCS_img_loaded\"></p><p>6.彬彬美男造型</p><p>很具有学院风格，也很适合通勤的发型。很注重文理的打造，前后长短的衔接。浅棕色搭配文气的发型，显得无害而安静。</p><p>教你怎么做：自然吹干后，使用发蜡将全部头发轻轻抓揉一遍，使发梢有线条感即可。</p>');
INSERT INTO `information` VALUES (7, '头皮瘙痒 头发脱落 选洗发水需对症', '在超市随便拿一瓶家庭装的洗发水对付过整个夏天是很多男士的做法，反正每天都会洗头难道头发还会有问题？正是这种错误的想法让头发表现出越来越多的问题，头皮更瘙痒、头皮屑不减少、头发脱落加剧。洗发水也讲究对症下药，了解自己是哪种发质或存在哪些情况很容易就能找到适合自己的洗发水。头发干枯无力： 增加光泽、补充养分。如果没有好好的滋养头发，头发蛋白质流失、毛鳞片受损等很容易导致夏日里头发异常干燥晦暗。这时首先要选择能够修复毛鳞片的洗发水，让养分不再流失；然后选择富含鳄梨油、维他命B族的洗发水补充头发流失的蛋白质，增加发丝弹性；也可以配合含有果酸的洗发水来柔软顺滑发质。头皮紧绷瘙痒： 舒缓头皮。皮肤容易敏感的你，头皮会感到敏感瘙痒，所以不要以为头皮瘙痒是单纯没有洗干净头发而加强洗发强度和频率，甚至用梳子、手指来挠头发试图止痒。观察一下你的头皮有没有紧绷、发红状况，有没有在洗完头发之后马上有头屑掉落，如果有的话，你最好更换上舒缓头皮的专业洗发水，并搭配针对敏感头皮、干性头屑的洗发水轮流交替用。发丝脱落加剧： 加固发根。季节性脱发本身不是问题，问题是你很可能把头发营养不足导致的不正常脱发混同为正常脱发。所以，夏日加强发根护理也是不能忽略的。选择能加强头皮弹性、增强毛囊活力的洗发水，甚至是一些能促进循环的中药成分洗发水，例如首乌、人参等，能有效防止头发脱落。头发出油： 平衡头皮水油分泌。夏天温度高，毛囊分泌油脂也会更旺盛，所以这时候你需要用更加具有清洁力的洗发水。啫喱质地洗发水会更让你感到舒适。尤其是油头皮的男士，这时候更要彻底搞清自己头皮头发状况。油头皮也分油头皮干头发、油头皮油头发。所以找到专业发廊咨询，并根据自己头皮出油的原因，找到强度适合的清洁滋润配方。一句话，油头皮不单单是控油，水油平衡才能保持头皮、头发健康完美。尤其要注意开架型洗发水通常会把头发去油和去屑混为一谈，不要盲目选择以避免过度剥脱头皮的正常角质。', NULL, '2021-05-13 19:10:24', '<p>在超市随便拿一瓶家庭装的洗发水对付过整个夏天是很多男士的做法，反正每天都会洗头难道头发还会有问题？正是这种错误的想法让头发表现出越来越多的问题，头皮更瘙痒、头皮屑不减少、头发脱落加剧。</p><p><img src=\"http://img2.selfimg.com.cn/gq800/2020/12/15/1608013910_pCBxOq.png\" class=\"mCS_img_loaded\"></p><p>洗发水也讲究对症下药，了解自己是哪种发质或存在哪些情况很容易就能找到适合自己的洗发水。</p><p>头发干枯无力： 增加光泽、补充养分</p><p>如果没有好好的滋养头发，头发蛋白质流失、毛鳞片受损等很容易导致夏日里头发异常干燥晦暗。这时首先要选择能够修复毛鳞片的洗发水，让养分不再流失；然后选择富含鳄梨油、维他命B族的洗发水补充头发流失的蛋白质，增加发丝弹性；也可以配合含有果酸的洗发水来柔软顺滑发质。</p><p>头皮紧绷瘙痒： 舒缓头皮</p><p>皮肤容易敏感的你，头皮会感到敏感瘙痒，所以不要以为头皮瘙痒是单纯没有洗干净头发而加强洗发强度和频率，甚至用梳子、手指来挠头发试图止痒。观察一下你的头皮有没有紧绷、发红状况，有没有在洗完头发之后马上有头屑掉落，如果有的话，你最好更换上舒缓头皮的专业洗发水，并搭配针对敏感头皮、干性头屑的洗发水轮流交替用。</p><p>发丝脱落加剧： 加固发根</p><p>季节性脱发本身不是问题，问题是你很可能把头发营养不足导致的不正常脱发混同为正常脱发。所以，夏日加强发根护理也是不能忽略的。选择能加强头皮弹性、增强毛囊活力的洗发水，甚至是一些能促进循环的中药成分洗发水，例如首乌、人参等，能有效防止头发脱落。</p><p>头发出油： 平衡头皮水油分泌</p><p>夏天温度高，毛囊分泌油脂也会更旺盛，所以这时候你需要用更加具有清洁力的洗发水。啫喱质地洗发水会更让你感到舒适。尤其是油头皮的男士，这时候更要彻底搞清自己头皮头发状况。油头皮也分油头皮干头发、油头皮油头发。所以找到专业发廊咨询，并根据自己头皮出油的原因，找到强度适合的清洁滋润配方。一句话，油头皮不单单是控油，水油平衡才能保持头皮、头发健康完美。尤其要注意开架型洗发水通常会把头发去油和去屑混为一谈，不要盲目选择以避免过度剥脱头皮的正常角质。</p>');
INSERT INTO `information` VALUES (8, '不要总埋怨掉头发 要掌握这几个正确护发步骤', '拥有乌黑亮丽的头发是很多女性梦寐以求的事，因为它能够让女性显得更加的温柔可人，还给人一种自律且精致的感觉。但是现实生活中总会有各种各样的头发问题困扰着大家，应该怎样养护自己的头发呢？这些护法步骤希望大家都能够做到。\n\n养发护发的步骤有哪些？\n\n1、梳头发\n\n在洗头发之前很多人都不注重这件事，那就是梳头发。很多人在洗头发的时候都是直接用水去冲洗，如果把头发用梳子梳理好再洗头，就能够使护发素和洗发膏更好的接触头发，洗掉头发的脏东西，使头发更加干净。另外如果头发处于打结的状态，先用头发梳理开，也能够预防掉更多的头发。\n\n2、洗头发\n\n洗头是一件非常简单的事，但是就是因为简单才有很多讲究的地方，首先抹洗发膏的时候要把洗发膏先打出泡沫之后再抹到头发上，这样可以减轻洗发膏对于头皮的刺激。其次把洗发膏抹到头发上，要充分的按摩，不要随便抹几下就用水去冲。在洗发膏的选择上要根据自己的发质来选择，如果发质偏干要选择滋养型的，如果发质偏油就要选择清爽型。\n\n3、涂抹护发素\n\n涂抹好洗发膏，然后用水冲去的时候，接下来一个步骤就是涂抹护发素。很多人就是直接的把护发素涂抹到湿的头发上，其实最好的方式就是先把头发用毛巾擦干，然后再涂抹护发素，这样能够起到更好的滋润头发的效果。另外涂抹好护发素之后，稍等上十分钟左右，等到护发素滋养过头发之后，再用水冲洗掉。\n\n4、吹干头发\n\n吹头发是一件非常平常的事，但是也是需要很多注意方法的，首先吹头发的温度不要太高，应该选择中档温度，也就是说温热的温度。另外吹头发的时候不要乱吹，要顺着头发的生长方向吹，应该尽量的避免吹头发的分缝，因为有的人在分缝的地方会出现掉发严重的情况。吹头发不要吹的全干，最好能够保七分分干左右就可以了，这样可以避免损伤发质。\n\n5、护发精油\n\n在洗完头发之后，把头发用吹风机吹到七分干，然后就可以抹护发精油了，护发精油要着重抹在发生和法稍上。抹在发根能够加强头发的营养，使头发不容易掉发，抹在发稍可以滋润发稍，不至于分叉。\n\n除了有以上这些护发养发的步骤以外，日常生活中也要养成良好的习惯，像是早睡早起不熬夜，多吃一些富含营养的食物等等，这些方法对于养发也有很有帮助。\n\n来源： 华商网', NULL, '2021-05-13 21:00:31', '<p>拥有乌黑亮丽的头发是很多女性梦寐以求的事，因为它能够让女性显得更加的温柔可人，还给人一种自律且精致的感觉。但是现实生活中总会有各种各样的头发问题困扰着大家，应该怎样养护自己的头发呢？这些护法步骤希望大家都能够做到。</p><br><p>养发护发的步骤有哪些？</p><br><p>1、梳头发</p><p>在洗头发之前很多人都不注重这件事，那就是梳头发。很多人在洗头发的时候都是直接用水去冲洗，如果把头发用梳子梳理好再洗头，就能够使护发素和洗发膏更好的接触头发，洗掉头发的脏东西，使头发更加干净。另外如果头发处于打结的状态，先用头发梳理开，也能够预防掉更多的头发</p><br><p>2、洗头发</p><p>洗头是一件非常简单的事，但是就是因为简单才有很多讲究的地方，首先抹洗发膏的时候要把洗发膏先打出泡沫之后再抹到头发上，这样可以减轻洗发膏对于头皮的刺激。其次把洗发膏抹到头发上，要充分的按摩，不要随便抹几下就用水去冲。在洗发膏的选择上要根据自己的发质来选择，如果发质偏干要选择滋养型的，如果发质偏油就要选择清爽型。</p><br><p>3、涂抹护发素</p><p>涂抹好洗发膏，然后用水冲去的时候，接下来一个步骤就是涂抹护发素。很多人就是直接的把护发素涂抹到湿的头发上，其实最好的方式就是先把头发用毛巾擦干，然后再涂抹护发素，这样能够起到更好的滋润头发的效果。另外涂抹好护发素之后，稍等上十分钟左右，等到护发素滋养过头发之后，再用水冲洗掉。</p><br><p>4、吹干头发</p><p>吹头发是一件非常平常的事，但是也是需要很多注意方法的，首先吹头发的温度不要太高，应该选择中档温度，也就是说温热的温度。另外吹头发的时候不要乱吹，要顺着头发的生长方向吹，应该尽量的避免吹头发的分缝，因为有的人在分缝的地方会出现掉发严重的情况。吹头发不要吹的全干，最好能够保七分分干左右就可以了，这样可以避免损伤发质。</p><br><p>5、护发精油</p><p>在洗完头发之后，把头发用吹风机吹到七分干，然后就可以抹护发精油了，护发精油要着重抹在发生和法稍上。抹在发根能够加强头发的营养，使头发不容易掉发，抹在发稍可以滋润发稍，不至于分叉。</p><p>除了有以上这些护发养发的步骤以外，日常生活中也要养成良好的习惯，像是早睡早起不熬夜，多吃一些富含营养的食物等等，这些方法对于养发也有很有帮助。</p><br><p>来源： 华商网</p>\n');
INSERT INTO `information` VALUES (9, '6个护发小技巧，坚持一个月，发质变好，头发越来越浓密', '现在很多人，经常烫染头发再加上长期的熬夜，断发，掉发的情况越来越突出。浓密顺滑的秀发成了很多人的羡慕对象，在日常中可以了解一些护发小技巧，改善头发。\n\n想要拥有浓密的好头发，这6个技巧坚持使用\n1、避免频繁洗头\n\n洗头是人们比较常见的清洁头皮的一个方法，但是每天洗头适合油性的发质，干性发质是不适合每天洗头的，干性的发质更易脆弱，出现断发等。\n\n2、正确的洗头方式\n\n洗头时要格外注意，不要用长指甲出抓挠头皮，头皮非常薄弱，容易被抓伤。可以用指腹按摩揉搓头皮，这样不仅能更好的清洁头发，还能避免过度的用力损伤头皮。\n\n3、选用适合自己的洗发水\n\n洗发水的选择和护肤品的选择是一样的，选择质地温和的，没有刺激性的产品，无疑是对头皮最好的保护。不要追捧网上那些网红款的东西，长期的使用未必会有效果，还会对头皮暗藏伤害。可以选用异株荨迷成分的洗发水，它属于有机植物成分，温和不刺激，对于头皮问题有很好的效果。更重要的是能有效的防止掉发，对于爱掉发的朋友们，是比较好的选择。\n\n4、减少烫染\n\n大家都知道染发剂中含有有害物质，但还是忍不住去烫染头发，都是为了那颗爱美的心。所以尽量降低做头发的次数，将伤害尽量减少，平时多加养护头发。\n\n5、使用护发精油\n\n除了洗发水和润发乳这些最基础的洗护外，精油也是不可少的护发工具，尤其是对头发毛躁的人来说，精油可以让头发变乖。\n\n精油里面有天然植物精粹，可以滋养发质，坚持使用精油，你的发质会得到很大的改善，切记精油只适用于干燥的发尾处，不要过量涂抹哦。\n\n6、少扎扯头发的发型\n\n扎头发的时候要避免过紧，长期扎过紧的头发容易使人的发际线上移，撕扯头发的时候还会损伤到头皮，长期还会出现掉发的情况。', NULL, '2021-05-13 21:24:18', '<p>现在很多人，经常烫染头发再加上长期的熬夜，断发，掉发的情况越来越突出。浓密顺滑的秀发成了很多人的羡慕对象，在日常中可以了解一些护发小技巧，改善头发。</p>\n<p><img src=\"https://p1-tt.byteimg.com/origin/dfic-imagehandler/3307f5c9-d750-4caa-b50f-7dfc8d7abfdf?from=pc\"class=\"mCS_img_loaded\"></p>\n<p>想要拥有浓密的好头发，这6个技巧坚持使用</p>\n<p>1、避免频繁洗头</p>\n<p>洗头是人们比较常见的清洁头皮的一个方法，但是每天洗头适合油性的发质，干性发质是不适合每天洗头的，干性的发质更易脆弱，出现断发等。</p>\n<p>2、正确的洗头方式</p>\n<p>洗头时要格外注意，不要用长指甲出抓挠头皮，头皮非常薄弱，容易被抓伤。可以用指腹按摩揉搓头皮，这样不仅能更好的清洁头发，还能避免过度的用力损伤头皮。</p>\n<p><img src=\"https://p1-tt.byteimg.com/origin/dfic-imagehandler/b6fb5652-ad66-4ea3-82d3-0aa50c04e45e?from=pc\"class=\"mCS_img_loaded\"></p>\n<p>3、选用适合自己的洗发水</p>\n<p>洗发水的选择和护肤品的选择是一样的，选择质地温和的，没有刺激性的产品，无疑是对头皮最好的保护。不要追捧网上那些网红款的东西，长期的使用未必会有效果，还会对头皮暗藏伤害。可以选用异株荨迷成分的洗发水，它属于有机植物成分，温和不刺激，对于头皮问题有很好的效果。更重要的是能有效的防止掉发，对于爱掉发的朋友们，是比较好的选择。</p>\n<p><img src=\"https://p3-tt.byteimg.com/origin/dfic-imagehandler/e7f1a501-bb47-445f-b39c-f941ba38f965?from=pc\"class=\"mCS_img_loaded\"></p>\n<p>4、减少烫染</p>\n<p>大家都知道染发剂中含有有害物质，但还是忍不住去烫染头发，都是为了那颗爱美的心。所以尽量降低做头发的次数，将伤害尽量减少，平时多加养护头发。</p>\n<p>5、使用护发精油</p>\n<p>除了洗发水和润发乳这些最基础的洗护外，精油也是不可少的护发工具，尤其是对头发毛躁的人来说，精油可以让头发变乖。</p>\n<p>精油里面有天然植物精粹，可以滋养发质，坚持使用精油，你的发质会得到很大的改善，切记精油只适用于干燥的发尾处，不要过量涂抹哦。</p>\n<p><img src=\"https://p3-tt.byteimg.com/origin/dfic-imagehandler/2ae005e0-d941-4477-9ccf-ae37242767cf?from=pc\"class=\"mCS_img_loaded\"></p>\n<p>6、少扎扯头发的发型</p>\n<p>扎头发的时候要避免过紧，长期扎过紧的头发容易使人的发际线上移，撕扯头发的时候还会损伤到头皮，长期还会出现掉发的情况。</p>');

-- ----------------------------
-- Table structure for points
-- ----------------------------
DROP TABLE IF EXISTS `points`;
CREATE TABLE `points`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `value` int(11) NOT NULL COMMENT '正数为获得积分，负数为使用积分',
  `create_date` datetime(0) NOT NULL COMMENT '领取积分的日期',
  `type` int(1) NOT NULL COMMENT '0表示签到获得积分，1表示支付获得积分，2表示使用积分，3表示退还的积分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 321 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of points
-- ----------------------------
INSERT INTO `points` VALUES (39, 41, 9, '2021-04-01 03:04:19', 0);
INSERT INTO `points` VALUES (40, 41, 8, '2021-04-01 02:04:19', 0);
INSERT INTO `points` VALUES (41, 41, -99, '2021-03-30 23:04:15', 2);
INSERT INTO `points` VALUES (42, 41, 35, '2021-03-31 15:48:49', 1);
INSERT INTO `points` VALUES (43, 32, 3, '2021-04-01 03:11:15', 0);
INSERT INTO `points` VALUES (44, 32, 5, '2021-04-03 00:34:54', 0);
INSERT INTO `points` VALUES (45, 32, 10, '2021-04-04 01:31:06', 0);
INSERT INTO `points` VALUES (46, 32, 8, '2021-04-05 14:42:48', 0);
INSERT INTO `points` VALUES (47, 32, 16, '2021-04-06 00:03:45', 0);
INSERT INTO `points` VALUES (48, 32, 8, '2021-04-08 01:42:47', 0);
INSERT INTO `points` VALUES (49, 32, 4, '2021-04-10 21:16:15', 0);
INSERT INTO `points` VALUES (51, 32, -4600, '2021-04-11 22:04:17', 2);
INSERT INTO `points` VALUES (57, 32, -4300, '2021-04-12 01:25:45', 2);
INSERT INTO `points` VALUES (58, 32, 4300, '2021-04-12 01:26:20', 3);
INSERT INTO `points` VALUES (60, 32, -7600, '2021-04-12 01:53:38', 2);
INSERT INTO `points` VALUES (61, 32, 7600, '2021-04-12 01:54:46', 3);
INSERT INTO `points` VALUES (62, 32, -2400, '2021-04-12 23:56:47', 2);
INSERT INTO `points` VALUES (63, 32, 2400, '2021-04-13 00:35:34', 3);
INSERT INTO `points` VALUES (64, 32, 8, '2021-04-13 01:34:14', 0);
INSERT INTO `points` VALUES (65, 32, 7, '2021-04-14 16:26:01', 0);
INSERT INTO `points` VALUES (66, 32, 10, '2021-04-18 19:54:52', 0);
INSERT INTO `points` VALUES (67, 32, -600, '2021-04-18 21:16:41', 2);
INSERT INTO `points` VALUES (68, 32, 9, '2021-04-22 22:53:27', 0);
INSERT INTO `points` VALUES (166, 32, 13, '2021-04-12 11:27:18', 1);
INSERT INTO `points` VALUES (167, 32, 228, '2021-04-14 13:32:20', 1);
INSERT INTO `points` VALUES (168, 32, 25, '2021-04-14 15:55:01', 1);
INSERT INTO `points` VALUES (169, 32, 3, '2021-04-16 12:37:26', 1);
INSERT INTO `points` VALUES (170, 32, 4, '2021-04-19 14:15:08', 1);
INSERT INTO `points` VALUES (171, 32, 114, '2021-05-08 14:20:45', 1);
INSERT INTO `points` VALUES (172, 32, 8, '2021-05-09 16:02:12', 0);
INSERT INTO `points` VALUES (173, 36, 7, '2021-05-13 01:59:02', 0);
INSERT INTO `points` VALUES (174, 36, 125, '2021-05-08 10:42:16', 1);
INSERT INTO `points` VALUES (175, 36, 56, '2021-05-08 11:01:09', 1);
INSERT INTO `points` VALUES (176, 36, 56, '2021-05-08 13:15:26', 1);
INSERT INTO `points` VALUES (177, 36, 70, '2021-05-08 17:03:58', 1);
INSERT INTO `points` VALUES (178, 36, 29, '2021-05-08 10:03:47', 1);
INSERT INTO `points` VALUES (179, 37, 43, '2021-04-15 14:47:00', 1);
INSERT INTO `points` VALUES (180, 37, 4, '2021-05-13 11:14:53', 0);
INSERT INTO `points` VALUES (181, 37, 120, '2021-05-08 11:17:30', 1);
INSERT INTO `points` VALUES (182, 37, 15, '2021-05-08 11:17:25', 1);
INSERT INTO `points` VALUES (183, 37, 53, '2021-05-08 11:18:03', 1);
INSERT INTO `points` VALUES (184, 37, 63, '2021-05-08 11:41:05', 1);
INSERT INTO `points` VALUES (185, 37, 78, '2021-05-08 13:21:39', 1);
INSERT INTO `points` VALUES (186, 39, 4, '2021-05-13 11:43:31', 0);
INSERT INTO `points` VALUES (187, 39, 18, '2021-05-08 11:45:36', 1);
INSERT INTO `points` VALUES (188, 39, 21, '2021-05-08 15:30:52', 1);
INSERT INTO `points` VALUES (189, 39, 22, '2021-05-08 11:46:50', 1);
INSERT INTO `points` VALUES (190, 39, 54, '2021-05-08 14:34:27', 1);
INSERT INTO `points` VALUES (191, 39, 50, '2021-05-08 11:55:04', 1);
INSERT INTO `points` VALUES (192, 40, 15, '2021-05-08 11:57:13', 1);
INSERT INTO `points` VALUES (193, 40, 50, '2021-05-08 15:06:06', 1);
INSERT INTO `points` VALUES (194, 40, 46, '2021-05-08 12:00:14', 1);
INSERT INTO `points` VALUES (195, 40, 90, '2021-05-08 17:00:18', 1);
INSERT INTO `points` VALUES (196, 40, 75, '2021-05-08 12:01:40', 1);
INSERT INTO `points` VALUES (197, 42, 48, '2021-05-09 13:09:34', 1);
INSERT INTO `points` VALUES (198, 42, 75, '2021-05-09 12:10:35', 1);
INSERT INTO `points` VALUES (199, 42, 52, '2021-05-09 12:10:52', 1);
INSERT INTO `points` VALUES (200, 42, 18, '2021-05-09 12:11:11', 1);
INSERT INTO `points` VALUES (201, 42, 83, '2021-05-09 12:11:48', 1);
INSERT INTO `points` VALUES (204, 43, 6, '2021-05-13 12:12:30', 0);
INSERT INTO `points` VALUES (205, 43, 39, '2021-05-09 12:14:50', 1);
INSERT INTO `points` VALUES (206, 43, 80, '2021-05-09 12:15:09', 1);
INSERT INTO `points` VALUES (207, 43, 32, '2021-05-09 12:15:23', 1);
INSERT INTO `points` VALUES (208, 43, 84, '2021-05-09 12:16:00', 1);
INSERT INTO `points` VALUES (209, 43, 70, '2021-05-09 12:16:19', 1);
INSERT INTO `points` VALUES (210, 44, 8, '2021-05-13 12:16:22', 0);
INSERT INTO `points` VALUES (211, 44, 54, '2021-05-09 12:17:28', 1);
INSERT INTO `points` VALUES (212, 44, 41, '2021-05-09 16:48:57', 1);
INSERT INTO `points` VALUES (213, 44, 98, '2021-05-09 14:26:26', 1);
INSERT INTO `points` VALUES (214, 44, 87, '2021-05-09 13:51:55', 1);
INSERT INTO `points` VALUES (215, 44, 95, '2021-05-09 12:19:20', 1);
INSERT INTO `points` VALUES (216, 46, 58, '2021-05-09 12:20:29', 1);
INSERT INTO `points` VALUES (217, 46, 36, '2021-05-09 16:20:56', 1);
INSERT INTO `points` VALUES (218, 46, 48, '2021-05-09 13:40:28', 1);
INSERT INTO `points` VALUES (219, 46, 28, '2021-05-09 15:02:52', 1);
INSERT INTO `points` VALUES (220, 46, 60, '2021-05-09 15:46:24', 1);
INSERT INTO `points` VALUES (221, 47, 8, '2021-05-13 12:26:25', 0);
INSERT INTO `points` VALUES (222, 47, 73, '2021-05-10 12:28:03', 1);
INSERT INTO `points` VALUES (223, 47, 78, '2021-05-10 12:28:27', 1);
INSERT INTO `points` VALUES (224, 47, 33, '2021-05-10 12:30:24', 1);
INSERT INTO `points` VALUES (225, 47, 81, '2021-05-10 12:30:59', 1);
INSERT INTO `points` VALUES (226, 47, 75, '2021-05-10 12:31:19', 1);
INSERT INTO `points` VALUES (227, 48, 8, '2021-05-13 12:31:19', 0);
INSERT INTO `points` VALUES (228, 48, 29, '2021-05-10 12:32:24', 1);
INSERT INTO `points` VALUES (229, 48, 76, '2021-05-10 12:32:37', 1);
INSERT INTO `points` VALUES (230, 48, 94, '2021-05-10 12:32:50', 1);
INSERT INTO `points` VALUES (231, 48, 45, '2021-05-10 14:54:30', 1);
INSERT INTO `points` VALUES (232, 48, 108, '2021-05-10 12:33:53', 1);
INSERT INTO `points` VALUES (233, 49, 80, '2021-05-10 16:50:01', 1);
INSERT INTO `points` VALUES (234, 49, 58, '2021-05-10 12:35:20', 1);
INSERT INTO `points` VALUES (235, 49, 123, '2021-05-10 12:36:42', 1);
INSERT INTO `points` VALUES (236, 49, 32, '2021-05-10 16:13:00', 1);
INSERT INTO `points` VALUES (237, 49, 33, '2021-05-10 15:02:24', 1);
INSERT INTO `points` VALUES (238, 55, 5, '2021-05-13 12:37:40', 0);
INSERT INTO `points` VALUES (239, 55, 120, '2021-05-10 14:13:15', 1);
INSERT INTO `points` VALUES (240, 55, 45, '2021-05-10 12:39:38', 1);
INSERT INTO `points` VALUES (241, 55, 59, '2021-05-10 16:06:53', 1);
INSERT INTO `points` VALUES (242, 55, 117, '2021-05-10 15:05:17', 1);
INSERT INTO `points` VALUES (243, 55, 40, '2021-05-10 18:42:46', 1);
INSERT INTO `points` VALUES (244, 58, 30, '2021-05-11 12:44:09', 1);
INSERT INTO `points` VALUES (245, 58, 93, '2021-05-11 12:45:06', 1);
INSERT INTO `points` VALUES (246, 58, 72, '2021-05-11 12:45:27', 1);
INSERT INTO `points` VALUES (247, 58, 65, '2021-05-11 12:45:46', 1);
INSERT INTO `points` VALUES (248, 58, 24, '2021-05-11 12:46:00', 1);
INSERT INTO `points` VALUES (249, 58, 3, '2021-05-13 12:46:00', 0);
INSERT INTO `points` VALUES (250, 59, 74, '2021-05-11 14:29:38', 1);
INSERT INTO `points` VALUES (251, 59, 40, '2021-05-11 16:04:26', 1);
INSERT INTO `points` VALUES (252, 59, 39, '2021-05-11 12:48:49', 1);
INSERT INTO `points` VALUES (253, 59, 15, '2021-05-11 17:50:13', 1);
INSERT INTO `points` VALUES (254, 59, 58, '2021-05-11 12:49:50', 1);
INSERT INTO `points` VALUES (255, 59, 6, '2021-05-13 12:49:39', 0);
INSERT INTO `points` VALUES (256, 60, 7, '2021-05-13 12:50:14', 0);
INSERT INTO `points` VALUES (257, 60, 48, '2021-05-11 18:14:21', 1);
INSERT INTO `points` VALUES (258, 60, 58, '2021-05-11 15:18:50', 1);
INSERT INTO `points` VALUES (259, 60, 53, '2021-05-11 12:52:20', 1);
INSERT INTO `points` VALUES (260, 60, 63, '2021-05-11 12:52:54', 1);
INSERT INTO `points` VALUES (261, 60, 48, '2021-05-11 12:53:10', 1);
INSERT INTO `points` VALUES (262, 61, 6, '2021-05-13 12:54:03', 0);
INSERT INTO `points` VALUES (263, 61, 27, '2021-05-11 12:55:11', 1);
INSERT INTO `points` VALUES (264, 61, 21, '2021-05-11 16:17:29', 1);
INSERT INTO `points` VALUES (265, 61, 39, '2021-05-11 17:54:52', 1);
INSERT INTO `points` VALUES (266, 61, 138, '2021-05-11 12:57:02', 1);
INSERT INTO `points` VALUES (267, 61, 74, '2021-05-11 14:57:18', 1);
INSERT INTO `points` VALUES (268, 62, 8, '2021-05-13 13:05:38', 0);
INSERT INTO `points` VALUES (269, 62, 44, '2021-05-12 13:06:46', 1);
INSERT INTO `points` VALUES (270, 62, 28, '2021-05-12 13:17:51', 1);
INSERT INTO `points` VALUES (271, 62, 54, '2021-05-12 13:18:12', 1);
INSERT INTO `points` VALUES (272, 62, 84, '2021-05-12 13:18:26', 1);
INSERT INTO `points` VALUES (273, 62, 24, '2021-05-12 13:18:49', 1);
INSERT INTO `points` VALUES (274, 62, 38, '2021-05-12 13:19:53', 1);
INSERT INTO `points` VALUES (275, 63, 29, '2021-05-12 13:21:23', 1);
INSERT INTO `points` VALUES (276, 63, 50, '2021-05-12 16:17:17', 1);
INSERT INTO `points` VALUES (277, 63, 90, '2021-05-12 13:57:39', 1);
INSERT INTO `points` VALUES (278, 63, 90, '2021-05-12 13:59:03', 1);
INSERT INTO `points` VALUES (279, 63, 6, '2021-05-13 13:59:08', 0);
INSERT INTO `points` VALUES (280, 63, 50, '2021-05-12 15:37:38', 1);
INSERT INTO `points` VALUES (281, 63, 50, '2021-05-12 14:05:46', 1);
INSERT INTO `points` VALUES (282, 64, 5, '2021-05-13 14:05:46', 0);
INSERT INTO `points` VALUES (283, 64, 117, '2021-05-12 14:43:02', 1);
INSERT INTO `points` VALUES (284, 64, 50, '2021-05-12 16:35:34', 1);
INSERT INTO `points` VALUES (285, 64, 88, '2021-05-12 14:08:26', 1);
INSERT INTO `points` VALUES (286, 64, 69, '2021-05-12 14:09:29', 1);
INSERT INTO `points` VALUES (287, 64, 85, '2021-05-12 14:09:46', 1);
INSERT INTO `points` VALUES (288, 65, 36, '2021-05-12 17:10:38', 1);
INSERT INTO `points` VALUES (289, 65, 75, '2021-05-12 17:13:05', 1);
INSERT INTO `points` VALUES (290, 65, 84, '2021-05-12 18:54:48', 1);
INSERT INTO `points` VALUES (291, 66, 3, '2021-05-13 14:32:48', 0);
INSERT INTO `points` VALUES (292, 66, 58, '2021-05-13 14:37:34', 1);
INSERT INTO `points` VALUES (293, 66, 55, '2021-05-13 14:38:17', 1);
INSERT INTO `points` VALUES (294, 66, 42, '2021-05-13 14:38:44', 1);
INSERT INTO `points` VALUES (295, 67, 37, '2021-05-13 14:42:18', 1);
INSERT INTO `points` VALUES (296, 67, 40, '2021-05-13 14:42:30', 1);
INSERT INTO `points` VALUES (297, 67, 56, '2021-05-13 14:43:13', 1);
INSERT INTO `points` VALUES (298, 67, 135, '2021-05-13 14:44:06', 1);
INSERT INTO `points` VALUES (299, 67, 7, '2021-05-13 14:44:28', 0);
INSERT INTO `points` VALUES (300, 67, 108, '2021-05-13 14:44:35', 1);
INSERT INTO `points` VALUES (301, 70, 6, '2021-05-13 15:19:27', 0);
INSERT INTO `points` VALUES (302, 70, 20, '2021-05-13 15:21:53', 1);
INSERT INTO `points` VALUES (303, 70, 29, '2021-05-13 15:27:48', 1);
INSERT INTO `points` VALUES (304, 74, 5, '2021-05-13 15:28:37', 0);
INSERT INTO `points` VALUES (305, 74, 58, '2021-05-13 15:29:41', 1);
INSERT INTO `points` VALUES (306, 74, 15, '2021-05-13 15:30:36', 1);
INSERT INTO `points` VALUES (307, 75, 9, '2021-05-13 15:44:59', 0);
INSERT INTO `points` VALUES (308, 76, 4, '2021-05-13 15:48:14', 0);
INSERT INTO `points` VALUES (309, 76, 12, '2021-05-13 18:08:01', 1);
INSERT INTO `points` VALUES (310, 32, 6, '2021-05-13 00:46:28', 0);
INSERT INTO `points` VALUES (311, 32, -2900, '2021-05-14 01:16:18', 2);
INSERT INTO `points` VALUES (312, 32, 2900, '2021-05-14 01:16:56', 3);
INSERT INTO `points` VALUES (313, 32, -2900, '2021-05-14 02:56:26', 2);
INSERT INTO `points` VALUES (314, 32, 10, '2021-05-14 02:57:22', 0);
INSERT INTO `points` VALUES (315, 32, 2900, '2021-05-14 03:01:46', 3);
INSERT INTO `points` VALUES (316, 32, 16, '2021-05-14 17:08:07', 1);
INSERT INTO `points` VALUES (317, 32, 32, '2021-05-14 17:08:07', 1);
INSERT INTO `points` VALUES (319, 32, 10, '2021-05-15 14:13:12', 1);
INSERT INTO `points` VALUES (320, 32, 10, '2021-05-15 14:13:12', 1);
INSERT INTO `points` VALUES (321, 32, 7, '2021-05-15 15:21:39', 0);

-- ----------------------------
-- Table structure for reserve
-- ----------------------------
DROP TABLE IF EXISTS `reserve`;
CREATE TABLE `reserve`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` int(11) NOT NULL COMMENT ' ',
  `stylist_id` int(11) NOT NULL COMMENT '发型师id',
  `status` int(1) NOT NULL COMMENT '订单状态：0待支付，1已支付待服务，2已完成，3已取消',
  `create_date` datetime(0) NOT NULL COMMENT '创建时间，系统自动填充',
  `pay_date` datetime(0) NULL DEFAULT NULL COMMENT '支付时间',
  `serve_date` datetime(0) NOT NULL COMMENT '服务时间',
  `total` float NOT NULL COMMENT '原本总价',
  `points` int(11) NULL DEFAULT NULL COMMENT '使用的积分，100:1兑换成实际优惠',
  `coupon` int(11) NULL DEFAULT NULL COMMENT '优惠券id',
  `value` float(11, 2) NOT NULL COMMENT '实付金额',
  `services` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '选择的服务',
  `takeUp` int(11) NOT NULL COMMENT '服务预计花费的时间',
  `is_rewarded` int(1) NOT NULL DEFAULT 0 COMMENT '订单是否已经获得奖励标志位，0表示没有，1表示已经给予奖励',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 353 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reserve
-- ----------------------------
INSERT INTO `reserve` VALUES (95, 32, 8, 3, '2021-04-12 11:12:31', NULL, '2021-04-13 11:12:28', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (96, 32, 8, 3, '2021-04-12 11:13:57', NULL, '2021-04-13 11:13:54', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (97, 32, 9, 3, '2021-04-12 11:49:56', NULL, '2021-04-13 11:02:49', 25, NULL, NULL, 25.00, '剪发、洗发', 18, 0);
INSERT INTO `reserve` VALUES (98, 32, 8, 0, '2021-04-12 11:54:01', NULL, '2021-04-12 11:54:59', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (99, 32, 9, 3, '2021-04-12 12:10:18', NULL, '2021-04-13 12:10:14', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (100, 32, 7, 3, '2021-04-12 12:26:29', NULL, '2021-04-13 12:26:27', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (101, 32, 8, 3, '2021-04-12 12:30:04', NULL, '2021-04-12 17:32:56', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (102, 32, 8, 3, '2021-04-12 12:31:30', NULL, '2021-04-13 12:31:27', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (103, 32, 6, 3, '2021-04-12 13:35:49', NULL, '2021-04-13 13:35:45', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (104, 32, 9, 3, '2021-04-12 15:03:05', NULL, '2021-04-13 15:03:01', 25, NULL, NULL, 25.00, '洗发、剪发', 18, 0);
INSERT INTO `reserve` VALUES (105, 32, 9, 3, '2021-04-12 16:16:57', NULL, '2021-04-12 18:16:55', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (106, 32, 8, 3, '2021-04-12 16:21:10', NULL, '2021-04-13 16:21:06', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (107, 32, 7, 3, '2021-04-12 16:34:45', NULL, '2021-04-13 16:34:41', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (108, 32, 7, 3, '2021-04-12 16:36:28', NULL, '2021-04-13 16:36:13', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (109, 32, 7, 3, '2021-04-12 16:45:09', NULL, '2021-04-13 16:54:06', 100, NULL, NULL, 100.00, '染发', 80, 0);
INSERT INTO `reserve` VALUES (110, 32, 7, 3, '2021-04-12 16:47:05', NULL, '2021-04-13 16:58:01', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (111, 32, 9, 3, '2021-04-12 16:51:53', NULL, '2021-04-13 16:51:49', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (112, 32, 9, 3, '2021-04-12 16:54:00', '2021-04-12 16:54:05', '2021-04-13 16:53:57', 120, 0, 0, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (113, 32, 8, 3, '2021-04-12 16:54:33', NULL, '2021-04-13 16:54:29', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (114, 32, 9, 3, '2021-04-12 17:01:49', NULL, '2021-04-13 17:01:48', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (115, 32, 7, 3, '2021-04-12 17:04:10', NULL, '2021-04-13 17:04:05', 80, NULL, NULL, 80.00, '焗油', 40, 0);
INSERT INTO `reserve` VALUES (116, 32, 7, 3, '2021-04-12 17:06:25', NULL, '2021-04-13 17:06:21', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (117, 32, 9, 3, '2021-04-12 17:10:57', NULL, '2021-04-13 17:12:52', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (118, 32, 8, 3, '2021-04-12 17:13:01', NULL, '2021-04-13 17:12:57', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (119, 32, 5, 3, '2021-04-12 17:15:46', NULL, '2021-04-13 17:15:42', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (120, 32, 9, 3, '2021-04-12 17:29:33', NULL, '2021-04-13 17:29:29', 80, NULL, NULL, 80.00, '焗油', 40, 0);
INSERT INTO `reserve` VALUES (121, 32, 9, 3, '2021-04-12 17:35:11', NULL, '2021-04-13 17:35:06', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (122, 32, 9, 3, '2021-04-12 17:36:48', NULL, '2021-04-13 17:36:40', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (123, 32, 8, 3, '2021-04-12 17:37:40', NULL, '2021-04-13 17:37:37', 80, NULL, NULL, 80.00, '焗油', 40, 0);
INSERT INTO `reserve` VALUES (124, 32, 9, 3, '2021-04-12 17:38:33', NULL, '2021-04-13 17:38:30', 80, NULL, NULL, 80.00, '焗油', 40, 0);
INSERT INTO `reserve` VALUES (125, 32, 9, 3, '2021-04-12 17:45:30', NULL, '2021-04-13 17:45:27', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (126, 32, 9, 3, '2021-04-12 17:52:35', NULL, '2021-04-13 17:52:32', 80, NULL, NULL, 80.00, '焗油', 40, 0);
INSERT INTO `reserve` VALUES (127, 32, 8, 3, '2021-04-12 17:57:45', NULL, '2021-04-13 17:57:42', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (128, 32, 7, 3, '2021-04-12 18:06:22', NULL, '2021-04-13 18:06:19', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (129, 32, 9, 3, '2021-04-12 18:07:49', NULL, '2021-04-13 18:07:47', 120, NULL, NULL, 120.00, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (130, 32, 9, 3, '2021-04-12 18:08:39', NULL, '2021-04-13 18:08:34', 80, NULL, NULL, 80.00, '焗油', 40, 0);
INSERT INTO `reserve` VALUES (131, 32, 9, 3, '2021-04-12 18:11:07', NULL, '2021-04-13 18:18:02', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (132, 32, 9, 3, '2021-04-12 19:01:11', NULL, '2021-04-13 19:01:07', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (133, 32, 9, 3, '2021-04-12 19:08:51', NULL, '2021-04-13 19:08:46', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (138, 32, 5, 1, '2021-04-14 02:32:31', '2021-04-14 02:32:39', '2021-04-14 13:32:20', 380, 0, 0, 380.00, '剪发、洗发、烫发、吹发、染发、焗油、护发', 333, 1);
INSERT INTO `reserve` VALUES (139, 37, 5, 1, '2021-04-14 02:47:10', '2021-04-14 02:47:17', '2021-04-15 14:47:00', 215, 0, 0, 215.00, '烫发、剪发、焗油', 180, 1);
INSERT INTO `reserve` VALUES (140, 32, 5, 1, '2021-04-14 15:54:09', '2021-04-14 15:54:16', '2021-04-14 15:55:01', 145, 0, 5, 125.00, '洗发、剪发、烫发', 148, 1);
INSERT INTO `reserve` VALUES (141, 32, 9, 1, '2021-04-15 22:37:30', '2021-04-15 22:37:38', '2021-04-16 12:37:26', 10, 0, 0, 10.00, '洗发', 8, 1);
INSERT INTO `reserve` VALUES (142, 32, 9, 3, '2021-04-17 20:53:02', '2021-04-17 20:56:42', '2021-04-18 16:56:54', 145, 0, 0, 145.00, '烫发、洗发、剪发', 148, 0);
INSERT INTO `reserve` VALUES (143, 32, 8, 3, '2021-04-18 20:11:39', NULL, '2021-04-19 11:11:31', 300, NULL, NULL, 300.00, '染发、烫发、焗油', 250, 0);
INSERT INTO `reserve` VALUES (144, 32, 6, 3, '2021-04-18 20:42:04', NULL, '2021-04-19 10:41:51', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (145, 32, 6, 3, '2021-04-18 21:14:30', NULL, '2021-04-19 14:11:57', 30, NULL, NULL, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (146, 32, 6, 1, '2021-04-18 21:15:29', '2021-04-18 21:16:41', '2021-04-19 14:15:08', 30, 600, 9, 18.00, '洗发、吹发、剪发', 23, 1);
INSERT INTO `reserve` VALUES (147, 32, 11, 3, '2021-04-22 23:21:36', NULL, '2021-04-23 14:21:20', 30, NULL, NULL, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (148, 32, 9, 3, '2021-04-22 23:23:20', NULL, '2021-04-23 13:23:10', 30, NULL, NULL, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (149, 32, 9, 3, '2021-04-22 23:25:28', NULL, '2021-04-23 13:25:19', 30, NULL, NULL, 30.00, '洗发、剪发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (150, 32, 9, 3, '2021-04-22 23:26:34', NULL, '2021-04-23 13:26:24', 30, NULL, NULL, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (151, 32, 9, 3, '2021-04-22 23:34:43', NULL, '2021-04-23 13:27:28', 30, NULL, NULL, 30.00, '洗发、剪发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (152, 32, 9, 3, '2021-04-22 23:37:53', NULL, '2021-04-23 13:27:41', 30, NULL, NULL, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (153, 32, 11, 3, '2021-04-23 00:27:23', NULL, '2021-04-24 13:27:11', 30, NULL, NULL, 30.00, '洗发、剪发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (154, 32, 9, 3, '2021-04-23 00:30:44', NULL, '2021-04-24 13:27:11', 30, NULL, NULL, 30.00, '洗发、剪发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (155, 32, 12, 1, '2021-05-08 14:17:53', '2021-05-08 14:18:06', '2021-05-08 14:20:45', 380, 0, 0, 380.00, '洗发、剪发、烫发、焗油、染发、吹发、护发', 333, 1);
INSERT INTO `reserve` VALUES (156, 32, 12, 3, '2021-05-08 15:43:36', NULL, '2021-05-09 15:43:25', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (157, 32, 20, 3, '2021-05-13 00:52:56', NULL, '2021-05-14 12:52:42', 230, NULL, NULL, 230.00, '洗发、烫发、染发', 218, 0);
INSERT INTO `reserve` VALUES (158, 32, 19, 3, '2021-05-13 00:58:39', NULL, '2021-05-14 13:58:32', 120.58, NULL, NULL, 120.58, '烫发', 130, 0);
INSERT INTO `reserve` VALUES (159, 36, 21, 1, '2021-05-08 02:18:29', '2021-05-08 02:18:37', '2021-05-08 10:03:47', 145, 0, 0, 145.00, '洗发、剪发、烫发', 148, 1);
INSERT INTO `reserve` VALUES (160, 36, 19, 1, '2021-05-08 10:41:21', '2021-05-08 10:41:31', '2021-05-08 10:42:16', 250, 0, 0, 250.00, '烫发、焗油、护发', 230, 1);
INSERT INTO `reserve` VALUES (161, 36, 16, 1, '2021-05-08 11:00:12', '2021-05-08 11:00:24', '2021-05-08 11:01:09', 140, 0, 0, 140.00, '剪发、吹发、烫发', 145, 1);
INSERT INTO `reserve` VALUES (162, 36, 11, 1, '2021-05-08 11:01:40', '2021-05-08 11:01:45', '2021-05-08 13:15:26', 140, 0, 0, 140.00, '洗发、护发、焗油', 108, 1);
INSERT INTO `reserve` VALUES (163, 36, 17, 1, '2021-05-08 11:04:06', '2021-05-08 11:04:11', '2021-05-08 17:03:58', 175, 0, 0, 175.00, '烫发、护发、吹发', 195, 1);
INSERT INTO `reserve` VALUES (164, 37, 8, 1, '2021-05-08 11:15:42', '2021-05-08 11:15:47', '2021-05-08 11:17:30', 300, 0, 0, 300.00, '烫发、焗油、染发', 250, 1);
INSERT INTO `reserve` VALUES (165, 37, 13, 1, '2021-05-08 11:16:37', '2021-05-08 11:16:42', '2021-05-08 11:17:25', 30, 0, 0, 30.00, '剪发、洗发、吹发', 23, 1);
INSERT INTO `reserve` VALUES (166, 37, 9, 1, '2021-05-08 11:17:08', '2021-05-08 11:17:12', '2021-05-08 11:18:03', 175, 0, 0, 175.00, '烫发、护发、吹发', 195, 1);
INSERT INTO `reserve` VALUES (167, 37, 15, 1, '2021-05-08 11:40:11', '2021-05-08 11:40:17', '2021-05-08 11:41:05', 125, 0, 0, 125.00, '剪发、洗发、染发', 98, 1);
INSERT INTO `reserve` VALUES (168, 37, 15, 1, '2021-05-08 11:41:56', '2021-05-08 11:42:00', '2021-05-08 13:21:39', 130, 0, 0, 130.00, '洗发、烫发', 138, 1);
INSERT INTO `reserve` VALUES (169, 39, 13, 1, '2021-05-08 11:44:42', '2021-05-08 11:44:47', '2021-05-08 11:45:36', 30, 0, 0, 30.00, '洗发、剪发、吹发', 23, 1);
INSERT INTO `reserve` VALUES (170, 39, 8, 1, '2021-05-08 11:45:13', '2021-05-08 11:45:18', '2021-05-08 15:30:52', 105, 0, 0, 105.00, '染发、吹发', 85, 1);
INSERT INTO `reserve` VALUES (171, 39, 14, 1, '2021-05-08 11:46:03', '2021-05-08 11:46:07', '2021-05-08 11:46:50', 55, 0, 0, 55.00, '护发、吹发', 65, 1);
INSERT INTO `reserve` VALUES (172, 39, 9, 1, '2021-05-08 11:53:39', '2021-05-08 11:53:43', '2021-05-08 14:34:27', 135, 0, 0, 135.00, '剪发、烫发', 140, 1);
INSERT INTO `reserve` VALUES (173, 39, 5, 1, '2021-05-08 11:54:18', '2021-05-08 11:54:22', '2021-05-08 11:55:04', 125, 0, 0, 125.00, '洗发、剪发、染发', 98, 1);
INSERT INTO `reserve` VALUES (174, 40, 17, 1, '2021-05-08 11:56:28', '2021-05-08 11:56:32', '2021-05-08 11:57:13', 75, 0, 0, 75.00, '洗发、剪发、护发', 78, 1);
INSERT INTO `reserve` VALUES (175, 40, 11, 1, '2021-05-08 11:58:21', '2021-05-08 11:58:26', '2021-05-08 15:06:06', 250, 0, 0, 250.00, '烫发、焗油、护发', 230, 1);
INSERT INTO `reserve` VALUES (176, 40, 12, 1, '2021-05-08 11:59:26', '2021-05-08 11:59:30', '2021-05-08 12:00:14', 115, 0, 0, 115.00, '洗发、吹发、染发', 93, 1);
INSERT INTO `reserve` VALUES (177, 40, 9, 1, '2021-05-08 12:00:26', '2021-05-08 12:00:30', '2021-05-08 17:00:18', 150, 0, 0, 150.00, '剪发、焗油、吹发、护发', 115, 1);
INSERT INTO `reserve` VALUES (178, 40, 6, 1, '2021-05-08 12:00:49', '2021-05-08 12:00:52', '2021-05-08 12:01:40', 150, 0, 0, 150.00, '剪发、焗油、护发、吹发', 115, 1);
INSERT INTO `reserve` VALUES (179, 42, 21, 1, '2021-05-09 12:08:40', '2021-05-09 12:08:44', '2021-05-09 13:09:34', 80, 0, 0, 80.00, '洗发、吹发、剪发、护发', 83, 1);
INSERT INTO `reserve` VALUES (180, 42, 20, 1, '2021-05-09 12:09:43', '2021-05-09 12:09:47', '2021-05-09 12:10:35', 125, 0, 0, 125.00, '烫发、吹发', 135, 1);
INSERT INTO `reserve` VALUES (181, 42, 15, 1, '2021-05-09 12:10:00', '2021-05-09 12:10:04', '2021-05-09 12:10:52', 130, 0, 0, 130.00, '焗油、护发', 100, 1);
INSERT INTO `reserve` VALUES (182, 42, 13, 1, '2021-05-09 12:10:23', '2021-05-09 12:10:30', '2021-05-09 12:11:11', 90, 0, 0, 90.00, '焗油、洗发', 48, 1);
INSERT INTO `reserve` VALUES (183, 42, 9, 1, '2021-05-09 12:10:54', '2021-05-09 12:10:58', '2021-05-09 12:11:48', 275, 0, 0, 275.00, '烫发、染发、护发、吹发', 275, 1);
INSERT INTO `reserve` VALUES (184, 43, 16, 1, '2021-05-09 12:13:59', '2021-05-09 12:14:03', '2021-05-09 12:14:50', 130, 0, 0, 130.00, '剪发、染发、吹发、洗发', 103, 1);
INSERT INTO `reserve` VALUES (185, 43, 12, 1, '2021-05-09 12:14:14', '2021-05-09 12:14:18', '2021-05-09 12:15:09', 200, 0, 0, 200.00, '烫发、焗油', 170, 1);
INSERT INTO `reserve` VALUES (186, 43, 7, 1, '2021-05-09 12:14:29', '2021-05-09 12:14:33', '2021-05-09 12:15:23', 80, 0, 0, 80.00, '剪发、吹发、护发、洗发', 83, 1);
INSERT INTO `reserve` VALUES (187, 43, 5, 1, '2021-05-09 12:15:09', '2021-05-09 12:15:12', '2021-05-09 12:16:00', 140, 0, 0, 140.00, '烫发、吹发、剪发', 145, 1);
INSERT INTO `reserve` VALUES (188, 43, 6, 1, '2021-05-09 12:15:29', '2021-05-09 12:15:33', '2021-05-09 12:16:19', 140, 0, 0, 140.00, '烫发、吹发、剪发', 145, 1);
INSERT INTO `reserve` VALUES (189, 44, 14, 1, '2021-05-09 12:16:39', '2021-05-09 12:16:43', '2021-05-09 12:17:28', 180, 0, 0, 180.00, '洗发、吹发、剪发、护发、染发', 163, 1);
INSERT INTO `reserve` VALUES (190, 44, 9, 1, '2021-05-09 12:17:16', '2021-05-09 12:17:20', '2021-05-09 16:48:57', 135, 0, 0, 135.00, '洗发、吹发、烫发', 143, 1);
INSERT INTO `reserve` VALUES (191, 44, 20, 1, '2021-05-09 12:17:38', '2021-05-09 12:17:41', '2021-05-09 14:26:26', 195, 0, 0, 195.00, '剪发、染发、焗油', 130, 1);
INSERT INTO `reserve` VALUES (192, 44, 15, 1, '2021-05-09 12:18:09', '2021-05-09 12:18:14', '2021-05-09 13:51:55', 145, 0, 0, 145.00, '剪发、烫发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (193, 44, 19, 1, '2021-05-09 12:18:28', '2021-05-09 12:18:32', '2021-05-09 12:19:20', 190, 0, 0, 190.00, '烫发、护发、吹发、剪发', 205, 1);
INSERT INTO `reserve` VALUES (194, 46, 18, 1, '2021-05-09 12:19:39', '2021-05-09 12:19:43', '2021-05-09 12:20:29', 145, 0, 0, 145.00, '剪发、焗油、护发', 110, 1);
INSERT INTO `reserve` VALUES (195, 46, 15, 1, '2021-05-09 12:20:07', '2021-05-09 12:20:10', '2021-05-09 16:20:56', 180, 0, 0, 180.00, '剪发、染发、吹发、护发、洗发', 163, 1);
INSERT INTO `reserve` VALUES (196, 46, 7, 1, '2021-05-09 12:20:36', '2021-05-09 12:20:40', '2021-05-09 13:40:28', 160, 0, 0, 160.00, '洗发、焗油、剪发、吹发、护发', 123, 1);
INSERT INTO `reserve` VALUES (197, 46, 14, 1, '2021-05-09 12:21:11', '2021-05-09 12:21:14', '2021-05-09 15:02:52', 140, 0, 0, 140.00, '烫发、剪发、吹发', 145, 1);
INSERT INTO `reserve` VALUES (198, 46, 19, 1, '2021-05-09 12:21:51', '2021-05-09 12:21:55', '2021-05-09 15:46:24', 150, 0, 0, 150.00, '剪发、洗发、吹发、烫发', 153, 1);
INSERT INTO `reserve` VALUES (199, 47, 17, 1, '2021-05-10 12:27:07', '2021-05-10 12:27:11', '2021-05-10 12:28:03', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (200, 47, 12, 1, '2021-05-10 12:27:58', '2021-05-10 12:28:01', '2021-05-10 12:28:27', 130, 0, 0, 130.00, '染发、剪发、洗发、吹发', 103, 1);
INSERT INTO `reserve` VALUES (201, 47, 13, 1, '2021-05-10 12:29:33', '2021-05-10 12:29:38', '2021-05-10 12:30:24', 110, 0, 0, 110.00, '剪发、焗油、吹发、洗发', 63, 1);
INSERT INTO `reserve` VALUES (202, 47, 7, 1, '2021-05-10 12:30:09', '2021-05-10 12:30:14', '2021-05-10 12:30:59', 135, 0, 0, 135.00, '烫发、吹发、洗发', 143, 1);
INSERT INTO `reserve` VALUES (203, 47, 5, 1, '2021-05-10 12:30:25', '2021-05-10 12:30:30', '2021-05-10 12:31:19', 150, 0, 0, 150.00, '吹发、护发、剪发、焗油', 115, 1);
INSERT INTO `reserve` VALUES (204, 48, 15, 1, '2021-05-10 12:31:30', '2021-05-10 12:31:34', '2021-05-10 12:32:24', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (205, 48, 14, 1, '2021-05-10 12:31:42', '2021-05-10 12:31:46', '2021-05-10 12:32:37', 190, 0, 0, 190.00, '烫发、护发、吹发、剪发', 205, 1);
INSERT INTO `reserve` VALUES (206, 48, 11, 1, '2021-05-10 12:31:56', '2021-05-10 12:32:00', '2021-05-10 12:32:50', 235, 0, 0, 235.00, '烫发、剪发、染发', 220, 1);
INSERT INTO `reserve` VALUES (207, 48, 7, 1, '2021-05-10 12:32:43', '2021-05-10 12:32:47', '2021-05-10 14:54:30', 150, 0, 0, 150.00, '焗油、吹发、剪发、护发', 115, 1);
INSERT INTO `reserve` VALUES (208, 48, 16, 1, '2021-05-10 12:32:59', '2021-05-10 12:33:03', '2021-05-10 12:33:53', 180, 0, 0, 180.00, '剪发、吹发、染发、护发、洗发', 163, 1);
INSERT INTO `reserve` VALUES (209, 49, 7, 1, '2021-05-10 12:34:12', '2021-05-10 12:34:16', '2021-05-10 16:50:01', 200, 0, 0, 200.00, '烫发、焗油', 170, 1);
INSERT INTO `reserve` VALUES (210, 49, 9, 1, '2021-05-10 12:35:03', '2021-05-10 12:35:07', '2021-05-10 12:35:20', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (211, 49, 6, 1, '2021-05-10 12:35:52', '2021-05-10 12:35:56', '2021-05-10 12:36:42', 245, 0, 0, 245.00, '烫发、剪发、染发、洗发', 228, 1);
INSERT INTO `reserve` VALUES (212, 49, 11, 1, '2021-05-10 12:36:13', '2021-05-10 12:36:17', '2021-05-10 16:13:00', 160, 0, 0, 160.00, '洗发、护发、染发', 148, 1);
INSERT INTO `reserve` VALUES (213, 49, 15, 1, '2021-05-10 12:36:40', '2021-05-10 12:36:43', '2021-05-10 15:02:24', 110, 0, 0, 110.00, '焗油、吹发、洗发、剪发', 63, 1);
INSERT INTO `reserve` VALUES (214, 55, 12, 1, '2021-05-10 12:38:29', '2021-05-10 12:38:33', '2021-05-10 14:13:15', 200, 0, 0, 200.00, '烫发、焗油', 170, 1);
INSERT INTO `reserve` VALUES (215, 55, 8, 1, '2021-05-10 12:38:43', '2021-05-10 12:38:47', '2021-05-10 12:39:38', 150, 0, 0, 150.00, '烫发、剪发、洗发、吹发', 153, 1);
INSERT INTO `reserve` VALUES (216, 55, 15, 1, '2021-05-10 12:39:06', '2021-05-10 12:39:10', '2021-05-10 16:06:53', 195, 0, 0, 195.00, '剪发、洗发、护发、烫发', 208, 1);
INSERT INTO `reserve` VALUES (217, 55, 9, 1, '2021-05-10 12:39:27', '2021-05-10 12:39:31', '2021-05-10 15:05:17', 195, 0, 0, 195.00, '剪发、烫发、洗发、护发', 208, 1);
INSERT INTO `reserve` VALUES (218, 55, 11, 1, '2021-05-10 12:39:56', '2021-05-10 12:40:00', '2021-05-10 18:42:46', 80, 0, 0, 80.00, '剪发、吹发、洗发、护发', 83, 1);
INSERT INTO `reserve` VALUES (219, 58, 9, 1, '2021-05-11 12:43:17', '2021-05-11 12:43:26', '2021-05-11 12:44:09', 150, 0, 0, 150.00, '烫发、剪发、洗发、吹发', 153, 1);
INSERT INTO `reserve` VALUES (220, 58, 19, 1, '2021-05-11 12:44:14', '2021-05-11 12:44:18', '2021-05-11 12:45:06', 185, 0, 0, 185.00, '烫发、剪发、护发', 200, 1);
INSERT INTO `reserve` VALUES (221, 58, 15, 1, '2021-05-11 12:44:33', '2021-05-11 12:44:38', '2021-05-11 12:45:27', 180, 0, 0, 180.00, '烫发、护发、洗发', 198, 1);
INSERT INTO `reserve` VALUES (222, 58, 12, 1, '2021-05-11 12:44:52', '2021-05-11 12:44:55', '2021-05-11 12:45:46', 130, 0, 0, 130.00, '剪发、洗发、吹发、染发', 103, 1);
INSERT INTO `reserve` VALUES (223, 58, 8, 1, '2021-05-11 12:45:38', '2021-05-11 12:45:42', '2021-05-11 12:46:00', 80, 0, 0, 80.00, '洗发、剪发、吹发、护发', 83, 1);
INSERT INTO `reserve` VALUES (224, 59, 12, 1, '2021-05-11 12:46:50', '2021-05-11 12:46:55', '2021-05-11 14:29:38', 185, 0, 0, 185.00, '烫发、剪发、护发', 200, 1);
INSERT INTO `reserve` VALUES (225, 59, 15, 1, '2021-05-11 12:47:39', '2021-05-11 12:47:43', '2021-05-11 16:04:26', 80, 0, 0, 80.00, '剪发、洗发、吹发、护发', 83, 1);
INSERT INTO `reserve` VALUES (226, 59, 5, 1, '2021-05-11 12:48:05', '2021-05-11 12:48:09', '2021-05-11 12:48:49', 130, 0, 0, 130.00, '剪发、洗发、吹发、染发', 103, 1);
INSERT INTO `reserve` VALUES (227, 59, 12, 1, '2021-05-11 12:48:23', '2021-05-11 12:48:26', '2021-05-11 17:50:13', 30, 0, 0, 30.00, '洗发、吹发、剪发', 23, 1);
INSERT INTO `reserve` VALUES (228, 59, 20, 1, '2021-05-11 12:48:59', '2021-05-11 12:49:03', '2021-05-11 12:49:50', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (229, 60, 12, 1, '2021-05-11 12:50:33', '2021-05-11 12:50:46', '2021-05-11 18:14:21', 80, 0, 0, 80.00, '剪发、洗发、吹发、护发', 83, 1);
INSERT INTO `reserve` VALUES (230, 60, 9, 1, '2021-05-11 12:51:06', '2021-05-11 12:51:15', '2021-05-11 15:18:50', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (231, 60, 6, 1, '2021-05-11 12:51:33', '2021-05-11 12:51:38', '2021-05-11 12:52:20', 105, 0, 0, 105.00, '焗油、洗发、剪发', 58, 1);
INSERT INTO `reserve` VALUES (232, 60, 16, 1, '2021-05-11 12:52:00', '2021-05-11 12:52:03', '2021-05-11 12:52:54', 125, 0, 0, 125.00, '洗发、染发、剪发', 98, 1);
INSERT INTO `reserve` VALUES (233, 60, 21, 1, '2021-05-11 12:52:18', '2021-05-11 12:52:22', '2021-05-11 12:53:10', 80, 0, 0, 80.00, '护发、吹发、洗发、剪发', 83, 1);
INSERT INTO `reserve` VALUES (234, 61, 17, 1, '2021-05-11 12:54:18', '2021-05-11 12:54:22', '2021-05-11 12:55:11', 135, 0, 0, 135.00, '烫发、剪发', 140, 1);
INSERT INTO `reserve` VALUES (235, 61, 19, 1, '2021-05-11 12:54:41', '2021-05-11 12:54:45', '2021-05-11 16:17:29', 105, 0, 0, 105.00, '焗油、剪发、洗发', 58, 1);
INSERT INTO `reserve` VALUES (236, 61, 15, 1, '2021-05-11 12:55:02', '2021-05-11 12:55:06', '2021-05-11 17:54:52', 130, 0, 0, 130.00, '洗发、吹发、染发、剪发', 103, 1);
INSERT INTO `reserve` VALUES (237, 61, 13, 1, '2021-05-11 12:56:08', '2021-05-11 12:56:11', '2021-05-11 12:57:02', 230, 0, 0, 230.00, '焗油、染发、护发', 180, 1);
INSERT INTO `reserve` VALUES (238, 61, 16, 1, '2021-05-11 12:56:28', '2021-05-11 12:56:32', '2021-05-11 14:57:18', 245, 0, 0, 245.00, '烫发、剪发、洗发、染发', 228, 1);
INSERT INTO `reserve` VALUES (239, 62, 21, 1, '2021-05-12 13:06:03', '2021-05-12 13:06:07', '2021-05-12 13:06:46', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (240, 62, 18, 1, '2021-05-12 13:17:01', '2021-05-12 13:17:05', '2021-05-12 13:17:51', 140, 0, 0, 140.00, '洗发、焗油、护发', 108, 1);
INSERT INTO `reserve` VALUES (241, 62, 12, 1, '2021-05-12 13:17:19', '2021-05-12 13:17:22', '2021-05-12 13:18:12', 135, 0, 0, 135.00, '烫发、吹发、洗发', 143, 1);
INSERT INTO `reserve` VALUES (242, 62, 6, 1, '2021-05-12 13:17:36', '2021-05-12 13:17:39', '2021-05-12 13:18:26', 210, 0, 0, 210.00, '烫发、焗油、洗发', 178, 1);
INSERT INTO `reserve` VALUES (243, 62, 8, 1, '2021-05-12 13:18:01', '2021-05-12 13:18:05', '2021-05-12 13:18:49', 80, 0, 0, 80.00, '洗发、剪发、吹发、护发', 83, 1);
INSERT INTO `reserve` VALUES (244, 62, 11, 1, '2021-05-12 13:19:02', '2021-05-12 13:19:06', '2021-05-12 13:19:53', 125, 0, 0, 125.00, '烫发、吹发', 135, 1);
INSERT INTO `reserve` VALUES (245, 63, 13, 1, '2021-05-12 13:20:36', '2021-05-12 13:20:40', '2021-05-12 13:21:23', 145, 0, 0, 145.00, '剪发、焗油、护发', 110, 1);
INSERT INTO `reserve` VALUES (246, 63, 6, 1, '2021-05-12 13:55:29', '2021-05-12 13:55:34', '2021-05-12 16:17:17', 100, 0, 0, 100.00, '剪发、焗油、吹发', 55, 1);
INSERT INTO `reserve` VALUES (247, 63, 15, 1, '2021-05-12 13:55:48', '2021-05-12 13:55:52', '2021-05-12 13:57:39', 150, 0, 0, 150.00, '洗发、剪发、烫发、吹发', 153, 1);
INSERT INTO `reserve` VALUES (248, 63, 7, 1, '2021-05-12 13:58:10', '2021-05-12 13:58:15', '2021-05-12 13:59:03', 150, 0, 0, 150.00, '烫发、吹发、洗发、剪发', 153, 1);
INSERT INTO `reserve` VALUES (249, 63, 21, 1, '2021-05-12 13:59:53', '2021-05-12 13:59:57', '2021-05-12 15:37:38', 250, 0, 0, 250.00, '焗油、烫发、护发', 230, 1);
INSERT INTO `reserve` VALUES (250, 63, 20, 1, '2021-05-12 14:04:58', '2021-05-12 14:05:02', '2021-05-12 14:05:46', 250, 0, 0, 250.00, '焗油、烫发、护发', 230, 1);
INSERT INTO `reserve` VALUES (251, 64, 8, 1, '2021-05-12 14:06:21', '2021-05-12 14:06:25', '2021-05-12 14:43:02', 195, 0, 0, 195.00, '焗油、染发、剪发', 130, 1);
INSERT INTO `reserve` VALUES (252, 64, 15, 1, '2021-05-12 14:06:51', '2021-05-12 14:06:55', '2021-05-12 16:35:34', 100, 0, 0, 100.00, '剪发、焗油、吹发', 55, 1);
INSERT INTO `reserve` VALUES (253, 64, 17, 1, '2021-05-12 14:07:32', '2021-05-12 14:07:36', '2021-05-12 14:08:26', 175, 0, 0, 175.00, '烫发、吹发、护发', 195, 1);
INSERT INTO `reserve` VALUES (254, 64, 19, 1, '2021-05-12 14:08:35', '2021-05-12 14:08:38', '2021-05-12 14:09:29', 230, 0, 0, 230.00, '焗油、染发、护发', 180, 1);
INSERT INTO `reserve` VALUES (255, 64, 9, 1, '2021-05-12 14:08:56', '2021-05-12 14:09:00', '2021-05-12 14:09:46', 170, 0, 0, 170.00, '烫发、护发', 190, 1);
INSERT INTO `reserve` VALUES (256, 65, 8, 1, '2021-05-12 14:10:45', '2021-05-12 14:10:49', '2021-05-12 17:10:38', 120, 0, 0, 120.00, '剪发、吹发、染发', 95, 1);
INSERT INTO `reserve` VALUES (257, 65, 6, 1, '2021-05-12 14:11:18', '2021-05-12 14:11:22', '2021-05-12 17:13:05', 125, 0, 0, 125.00, '烫发、吹发', 135, 1);
INSERT INTO `reserve` VALUES (258, 65, 8, 1, '2021-05-12 14:12:02', '2021-05-12 14:12:09', '2021-05-12 18:54:48', 140, 0, 0, 140.00, '焗油、护发、洗发', 108, 1);
INSERT INTO `reserve` VALUES (259, 66, 21, 1, '2021-05-13 14:36:50', '2021-05-13 14:36:54', '2021-05-13 14:37:34', 145, 0, 0, 145.00, '烫发、剪发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (260, 66, 9, 1, '2021-05-13 14:37:26', '2021-05-13 14:37:33', '2021-05-13 14:38:17', 110, 0, 0, 110.00, '染发、洗发', 88, 1);
INSERT INTO `reserve` VALUES (261, 66, 6, 1, '2021-05-13 14:37:52', '2021-05-13 14:38:04', '2021-05-13 14:38:44', 105, 0, 0, 105.00, '焗油、剪发、洗发', 58, 1);
INSERT INTO `reserve` VALUES (262, 66, 8, 1, '2021-05-13 14:39:15', '2021-05-13 14:39:21', '2021-05-13 14:40:04', 175, 0, 0, 175.00, '洗发、染发、护发、剪发', 158, 0);
INSERT INTO `reserve` VALUES (263, 66, 11, 1, '2021-05-13 14:39:33', '2021-05-13 14:39:37', '2021-05-13 14:40:26', 230, 0, 0, 230.00, '烫发、染发、洗发', 218, 0);
INSERT INTO `reserve` VALUES (265, 67, 18, 1, '2021-05-13 14:41:26', '2021-05-13 14:41:35', '2021-05-13 14:42:18', 185, 0, 0, 185.00, '剪发、烫发、护发', 200, 1);
INSERT INTO `reserve` VALUES (266, 67, 15, 1, '2021-05-13 14:42:17', '2021-05-13 14:42:26', '2021-05-13 14:43:13', 185, 0, 0, 185.00, '洗发、吹发、烫发、护发', 203, 1);
INSERT INTO `reserve` VALUES (267, 67, 13, 1, '2021-05-13 14:43:15', '2021-05-13 14:43:18', '2021-05-13 14:44:06', 270, 0, 0, 270.00, '护发、染发、烫发', 270, 1);
INSERT INTO `reserve` VALUES (268, 67, 12, 1, '2021-05-13 14:43:56', '2021-05-13 14:44:01', '2021-05-13 14:44:35', 180, 0, 0, 180.00, '烫发、洗发、护发', 198, 1);
INSERT INTO `reserve` VALUES (269, 70, 18, 1, '2021-05-13 15:19:51', '2021-05-13 15:19:57', '2021-05-13 18:07:36', 80, 0, 0, 80.00, '护发、吹发、洗发、剪发', 83, 0);
INSERT INTO `reserve` VALUES (270, 70, 5, 1, '2021-05-13 15:21:21', '2021-05-13 15:21:26', '2021-05-13 15:21:53', 65, 0, 0, 65.00, '吹发、护发、洗发', 73, 1);
INSERT INTO `reserve` VALUES (271, 70, 15, 1, '2021-05-13 15:22:22', '2021-05-13 15:22:30', '2021-05-13 18:07:00', 125, 0, 0, 125.00, '吹发、烫发', 135, 0);
INSERT INTO `reserve` VALUES (272, 70, 14, 1, '2021-05-13 15:26:50', '2021-05-13 15:26:55', '2021-05-13 15:27:48', 145, 0, 0, 145.00, '剪发、烫发、洗发', 148, 1);
INSERT INTO `reserve` VALUES (273, 70, 9, 1, '2021-05-13 15:27:31', '2021-05-13 15:27:35', '2021-05-13 16:07:20', 80, 0, 0, 80.00, '洗发、吹发、护发、剪发', 83, 0);
INSERT INTO `reserve` VALUES (274, 74, 19, 1, '2021-05-13 15:28:51', '2021-05-13 15:28:55', '2021-05-13 15:29:41', 145, 0, 0, 145.00, '洗发、剪发、烫发', 148, 1);
INSERT INTO `reserve` VALUES (275, 74, 14, 1, '2021-05-13 15:29:15', '2021-05-13 15:29:19', '2021-05-13 17:57:00', 105, 0, 0, 105.00, '焗油、洗发、剪发', 58, 0);
INSERT INTO `reserve` VALUES (276, 74, 7, 1, '2021-05-13 15:29:44', '2021-05-13 15:29:48', '2021-05-13 15:30:36', 30, 0, 0, 30.00, '剪发、洗发、吹发', 23, 1);
INSERT INTO `reserve` VALUES (277, 74, 11, 1, '2021-05-13 15:30:06', '2021-05-13 15:30:10', '2021-05-13 18:29:59', 130, 0, 0, 130.00, '烫发、洗发', 138, 0);
INSERT INTO `reserve` VALUES (278, 74, 8, 1, '2021-05-13 15:30:29', '2021-05-13 15:30:33', '2021-05-13 17:30:20', 75, 0, 0, 75.00, '护发、洗发、剪发', 78, 0);
INSERT INTO `reserve` VALUES (279, 74, 20, 1, '2021-05-14 15:38:58', '2021-05-14 15:39:02', '2021-05-14 15:39:49', 210, 0, 0, 210.00, '烫发、焗油、洗发', 178, 0);
INSERT INTO `reserve` VALUES (280, 74, 12, 1, '2021-05-14 15:40:17', '2021-05-14 15:40:21', '2021-05-14 15:41:11', 145, 0, 0, 145.00, '剪发、洗发、烫发', 148, 0);
INSERT INTO `reserve` VALUES (281, 74, 21, 1, '2021-05-14 15:40:44', '2021-05-14 15:40:48', '2021-05-14 15:41:38', 65, 0, 0, 65.00, '洗发、吹发、护发', 73, 0);
INSERT INTO `reserve` VALUES (282, 74, 15, 1, '2021-05-14 15:41:07', '2021-05-14 15:41:10', '2021-05-14 15:42:00', 130, 0, 0, 130.00, '剪发、洗发、吹发、染发', 103, 0);
INSERT INTO `reserve` VALUES (283, 74, 13, 1, '2021-05-14 15:41:36', '2021-05-14 15:41:43', '2021-05-14 15:42:24', 165, 0, 0, 165.00, '洗发、吹发、护发、染发', 153, 0);
INSERT INTO `reserve` VALUES (284, 74, 7, 1, '2021-05-14 15:42:00', '2021-05-14 15:42:04', '2021-05-14 15:42:53', 185, 0, 0, 185.00, '烫发、剪发、护发', 200, 0);
INSERT INTO `reserve` VALUES (285, 74, 16, 1, '2021-05-14 15:42:23', '2021-05-14 15:42:28', '2021-05-14 15:43:17', 105, 0, 0, 105.00, '焗油、剪发、洗发', 58, 0);
INSERT INTO `reserve` VALUES (286, 74, 6, 1, '2021-05-14 15:42:52', '2021-05-14 15:42:56', '2021-05-14 15:43:36', 135, 0, 0, 135.00, '吹发、烫发、洗发', 143, 0);
INSERT INTO `reserve` VALUES (287, 74, 17, 1, '2021-05-14 15:43:14', '2021-05-14 15:43:19', '2021-05-14 15:44:07', 100, 0, 0, 100.00, '焗油、剪发、吹发', 55, 0);
INSERT INTO `reserve` VALUES (288, 74, 18, 1, '2021-05-14 15:43:58', '2021-05-14 15:44:03', '2021-05-14 15:44:53', 165, 0, 0, 165.00, '染发、剪发、护发', 150, 0);
INSERT INTO `reserve` VALUES (289, 75, 19, 1, '2021-05-14 15:45:07', '2021-05-14 15:45:23', '2021-05-14 15:46:03', 125, 0, 0, 125.00, '烫发、吹发', 135, 0);
INSERT INTO `reserve` VALUES (290, 75, 17, 1, '2021-05-14 15:45:41', '2021-05-14 15:45:45', '2021-05-14 16:45:35', 135, 0, 0, 135.00, '焗油、吹发、护发', 105, 0);
INSERT INTO `reserve` VALUES (291, 75, 13, 1, '2021-05-14 15:46:18', '2021-05-14 15:46:22', '2021-05-14 18:18:05', 80, 0, 0, 80.00, '剪发、洗发、吹发、护发', 83, 0);
INSERT INTO `reserve` VALUES (292, 75, 9, 1, '2021-05-14 15:46:37', '2021-05-14 15:46:41', '2021-05-14 15:47:31', 95, 0, 0, 95.00, '焗油、吹发、洗发', 53, 0);
INSERT INTO `reserve` VALUES (293, 75, 15, 1, '2021-05-14 15:47:29', '2021-05-14 15:47:33', '2021-05-14 17:47:23', 165, 0, 0, 165.00, '剪发、染发、护发', 150, 0);
INSERT INTO `reserve` VALUES (294, 76, 18, 1, '2021-05-14 15:48:53', '2021-05-14 15:49:00', '2021-05-14 18:20:35', 80, 0, 0, 80.00, '吹发、洗发、剪发、护发', 83, 0);
INSERT INTO `reserve` VALUES (295, 76, 12, 1, '2021-05-14 15:49:29', '2021-05-14 15:49:50', '2021-05-14 18:14:21', 120, 0, 0, 120.00, '剪发、染发、吹发', 95, 0);
INSERT INTO `reserve` VALUES (296, 76, 8, 1, '2021-05-14 15:50:09', '2021-05-14 15:50:16', '2021-05-14 15:51:03', 110, 0, 0, 110.00, '剪发、洗发、吹发、焗油', 63, 0);
INSERT INTO `reserve` VALUES (297, 76, 9, 1, '2021-05-14 15:50:28', '2021-05-14 15:50:34', '2021-05-14 16:50:23', 30, 0, 0, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (298, 76, 6, 3, '2021-05-14 15:51:00', '2021-05-14 15:51:04', '2021-05-14 18:19:48', 165, 0, 0, 165.00, '剪发、染发、护发', 150, 0);
INSERT INTO `reserve` VALUES (299, 76, 19, 1, '2021-05-13 16:06:10', '2021-05-13 16:06:16', '2021-05-13 18:08:01', 30, 0, 0, 30.00, '洗发、剪发、吹发', 23, 1);
INSERT INTO `reserve` VALUES (300, 47, 19, 3, '2021-05-13 23:28:33', '2021-05-13 23:34:21', '2021-05-14 10:08:10', 25, 0, 0, 25.00, '洗发、剪发', 18, 0);
INSERT INTO `reserve` VALUES (301, 47, 19, 3, '2021-05-13 23:36:35', '2021-05-13 23:38:31', '2021-05-14 18:36:24', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (302, 47, 18, 0, '2021-05-13 23:38:04', NULL, '2021-05-14 11:37:55', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (303, 32, 18, 3, '2021-05-14 00:43:42', '2021-05-14 00:45:26', '2021-05-15 11:45:32', 25, 0, 0, 25.00, '洗发、剪发', 18, 0);
INSERT INTO `reserve` VALUES (304, 32, 20, 3, '2021-05-14 01:05:19', NULL, '2021-05-15 12:05:12', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (305, 32, 20, 3, '2021-05-14 01:08:09', NULL, '2021-05-15 11:08:03', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (306, 32, 21, 3, '2021-05-14 01:09:34', NULL, '2021-05-15 17:09:28', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (307, 32, 18, 3, '2021-05-14 01:14:23', '2021-05-14 01:16:18', '2021-05-15 11:13:56', 145, 2900, 9, 87.00, '洗发、剪发、烫发', 148, 0);
INSERT INTO `reserve` VALUES (308, 32, 20, 3, '2021-05-14 01:46:08', NULL, '2021-05-15 11:46:02', 25, NULL, NULL, 25.00, '洗发、剪发', 18, 0);
INSERT INTO `reserve` VALUES (309, 32, 19, 3, '2021-05-14 01:58:52', NULL, '2021-05-15 10:58:46', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (310, 32, 19, 3, '2021-05-14 02:02:19', NULL, '2021-05-15 10:02:13', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (311, 32, 17, 3, '2021-05-14 02:04:18', NULL, '2021-05-15 10:04:13', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (312, 32, 17, 3, '2021-05-14 02:08:17', NULL, '2021-05-15 11:08:11', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (313, 32, 19, 3, '2021-05-14 02:10:18', NULL, '2021-05-15 11:10:13', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (314, 32, 17, 3, '2021-05-14 02:18:03', NULL, '2021-05-15 10:17:54', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (315, 32, 18, 3, '2021-05-14 02:25:47', NULL, '2021-05-15 10:25:41', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (316, 32, 16, 3, '2021-05-14 02:27:24', NULL, '2021-05-15 16:27:16', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (317, 32, 17, 3, '2021-05-14 02:30:31', NULL, '2021-05-15 11:30:26', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (318, 32, 15, 3, '2021-05-14 02:30:57', NULL, '2021-05-15 12:30:52', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (319, 32, 15, 3, '2021-05-14 02:32:43', NULL, '2021-05-15 10:32:37', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (320, 32, 19, 3, '2021-05-14 02:35:56', '2021-05-14 02:36:07', '2021-05-15 11:35:50', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (321, 32, 15, 3, '2021-05-14 02:54:43', '2021-05-14 02:56:26', '2021-05-15 11:54:07', 145, 2900, 13, 96.00, '洗发、剪发、烫发', 148, 0);
INSERT INTO `reserve` VALUES (322, 32, 16, 1, '2021-05-14 16:59:23', '2021-05-14 17:03:33', '2021-05-14 17:08:07', 80, 0, 0, 80.00, '剪发、洗发、吹发、护发', 83, 1);
INSERT INTO `reserve` VALUES (323, 42, 15, 1, '2021-05-14 17:19:50', '2021-05-14 17:19:58', '2021-05-14 20:37:35', 25, 0, 0, 25.00, '洗发、剪发', 18, 0);
INSERT INTO `reserve` VALUES (324, 40, 15, 1, '2021-05-14 17:26:51', '2021-05-14 17:26:56', '2021-05-14 20:18:04', 25, 0, 0, 25.00, '剪发、洗发', 18, 0);
INSERT INTO `reserve` VALUES (325, 32, 17, 3, '2021-05-14 19:06:56', '2021-05-14 19:07:00', '2021-05-15 19:07:53', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (326, 32, 19, 3, '2021-05-14 19:16:29', NULL, '2021-05-15 19:16:23', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (327, 32, 18, 3, '2021-05-14 19:20:13', NULL, '2021-05-15 19:21:09', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (328, 32, 18, 3, '2021-05-14 19:22:11', '2021-05-14 19:23:42', '2021-05-15 19:22:08', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (329, 32, 20, 3, '2021-05-14 19:40:37', '2021-05-14 19:40:46', '2021-05-15 19:40:34', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (330, 32, 19, 3, '2021-05-14 19:42:09', '2021-05-14 20:11:29', '2021-05-15 19:42:06', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (331, 32, 17, 3, '2021-05-14 20:09:01', '2021-05-14 20:09:08', '2021-05-15 20:08:56', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (332, 32, 18, 3, '2021-05-14 20:11:10', NULL, '2021-05-15 20:11:07', 15, NULL, NULL, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (333, 32, 21, 1, '2021-05-14 20:13:33', '2021-05-14 20:13:38', '2021-05-15 20:13:30', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (334, 32, 18, 3, '2021-05-14 20:16:46', '2021-05-14 20:17:12', '2021-05-15 20:16:41', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (335, 32, 15, 3, '2021-05-14 20:19:03', '2021-05-14 20:19:10', '2021-05-15 20:19:59', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (336, 32, 15, 3, '2021-05-14 20:20:42', '2021-05-14 20:20:46', '2021-05-15 20:17:37', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (337, 32, 15, 3, '2021-05-14 20:21:44', NULL, '2021-05-15 19:21:38', 10, NULL, NULL, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (338, 32, 19, 3, '2021-05-14 20:23:32', '2021-05-14 20:25:19', '2021-05-15 19:23:29', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (339, 32, 17, 3, '2021-05-14 20:26:09', '2021-05-14 20:26:14', '2021-05-15 18:26:05', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (340, 32, 17, 3, '2021-05-14 20:26:48', '2021-05-14 20:26:58', '2021-05-15 18:26:44', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (341, 32, 16, 3, '2021-05-14 20:31:38', '2021-05-14 20:31:55', '2021-05-15 19:31:30', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (342, 32, 18, 3, '2021-05-14 20:33:10', '2021-05-14 20:33:23', '2021-05-15 18:33:05', 15, 0, 0, 15.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (343, 32, 15, 1, '2021-05-14 20:34:52', '2021-05-14 20:34:58', '2021-05-15 18:34:47', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (344, 32, 17, 3, '2021-05-14 20:36:40', '2021-05-14 20:36:49', '2021-05-15 18:36:35', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (345, 32, 13, 3, '2021-05-14 20:37:40', '2021-05-14 20:37:43', '2021-05-15 19:37:33', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (346, 32, 13, 1, '2021-05-14 20:38:00', '2021-05-14 20:38:05', '2021-05-15 18:37:56', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (347, 32, 9, 3, '2021-05-15 02:23:32', '2021-05-15 02:23:43', '2021-05-16 10:23:25', 15, 0, 9, 12.00, '剪发', 10, 0);
INSERT INTO `reserve` VALUES (348, 46, 15, 1, '2021-05-15 09:08:04', '2021-05-15 09:08:10', '2021-05-15 12:09:40', 30, 0, 0, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (349, 47, 15, 1, '2021-05-15 09:08:58', '2021-05-15 09:09:03', '2021-05-15 15:08:42', 30, 0, 0, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (350, 58, 15, 1, '2021-05-15 09:10:09', '2021-05-15 09:10:13', '2021-05-15 12:32:45', 30, 0, 0, 30.00, '剪发、洗发、吹发', 23, 0);
INSERT INTO `reserve` VALUES (351, 32, 17, 3, '2021-05-15 13:59:53', '2021-05-15 14:00:00', '2021-05-15 14:02:46', 10, 0, 0, 10.00, '洗发', 8, 0);
INSERT INTO `reserve` VALUES (352, 32, 19, 1, '2021-05-15 14:12:14', '2021-05-15 14:12:21', '2021-05-15 14:13:12', 25, 0, 0, 25.00, '剪发、洗发', 18, 1);
INSERT INTO `reserve` VALUES (353, 32, 19, 0, '2021-05-15 15:22:11', NULL, '2021-05-15 17:22:02', 25, NULL, NULL, 25.00, '洗发、剪发', 18, 0);

-- ----------------------------
-- Table structure for services
-- ----------------------------
DROP TABLE IF EXISTS `services`;
CREATE TABLE `services`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `barbershop_id` int(11) NULL DEFAULT NULL COMMENT '店id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '服务名称',
  `value` float(11, 2) NOT NULL COMMENT '服务价格',
  `time` int(3) NOT NULL COMMENT '服务预计耗时，单位分钟',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of services
-- ----------------------------
INSERT INTO `services` VALUES (1, NULL, '洗发', 10.00, 8);
INSERT INTO `services` VALUES (2, NULL, '剪发', 15.00, 10);
INSERT INTO `services` VALUES (3, NULL, '烫发', 120.00, 130);
INSERT INTO `services` VALUES (4, NULL, '吹发', 5.00, 5);
INSERT INTO `services` VALUES (5, NULL, '染发', 100.00, 80);
INSERT INTO `services` VALUES (6, NULL, '焗油', 80.00, 40);
INSERT INTO `services` VALUES (7, NULL, '护发', 50.00, 60);

-- ----------------------------
-- Table structure for sign_in
-- ----------------------------
DROP TABLE IF EXISTS `sign_in`;
CREATE TABLE `sign_in`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `last_date` datetime(0) NOT NULL COMMENT '最后签到日期',
  `consecutive_day` int(11) NOT NULL COMMENT '连续签到天数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sign_in
-- ----------------------------
INSERT INTO `sign_in` VALUES (1, 32, '2021-05-15 15:21:39', 3);
INSERT INTO `sign_in` VALUES (4, 41, '2021-04-01 03:04:19', 13);
INSERT INTO `sign_in` VALUES (5, 36, '2021-05-13 01:59:02', 1);
INSERT INTO `sign_in` VALUES (6, 37, '2021-05-13 11:14:53', 1);
INSERT INTO `sign_in` VALUES (7, 39, '2021-05-13 11:43:31', 1);
INSERT INTO `sign_in` VALUES (8, 43, '2021-05-13 12:12:30', 1);
INSERT INTO `sign_in` VALUES (9, 43, '2021-05-13 12:12:30', 1);
INSERT INTO `sign_in` VALUES (10, 43, '2021-05-13 12:12:30', 1);
INSERT INTO `sign_in` VALUES (11, 44, '2021-05-13 12:16:22', 1);
INSERT INTO `sign_in` VALUES (12, 47, '2021-05-13 12:26:25', 1);
INSERT INTO `sign_in` VALUES (13, 48, '2021-05-13 12:31:19', 1);
INSERT INTO `sign_in` VALUES (14, 55, '2021-05-13 12:37:40', 1);
INSERT INTO `sign_in` VALUES (15, 58, '2021-05-13 12:46:00', 1);
INSERT INTO `sign_in` VALUES (16, 59, '2021-05-13 12:49:39', 1);
INSERT INTO `sign_in` VALUES (17, 60, '2021-05-13 12:50:14', 1);
INSERT INTO `sign_in` VALUES (18, 61, '2021-05-13 12:54:03', 1);
INSERT INTO `sign_in` VALUES (19, 62, '2021-05-13 13:05:38', 1);
INSERT INTO `sign_in` VALUES (20, 63, '2021-05-13 13:59:08', 1);
INSERT INTO `sign_in` VALUES (21, 64, '2021-05-13 14:05:45', 1);
INSERT INTO `sign_in` VALUES (22, 66, '2021-05-13 14:32:48', 1);
INSERT INTO `sign_in` VALUES (23, 67, '2021-05-13 14:44:28', 1);
INSERT INTO `sign_in` VALUES (24, 70, '2021-05-13 15:19:27', 1);
INSERT INTO `sign_in` VALUES (25, 74, '2021-05-13 15:28:37', 1);
INSERT INTO `sign_in` VALUES (26, 75, '2021-05-13 15:44:59', 1);
INSERT INTO `sign_in` VALUES (27, 76, '2021-05-13 15:48:14', 1);

-- ----------------------------
-- Table structure for stylist
-- ----------------------------
DROP TABLE IF EXISTS `stylist`;
CREATE TABLE `stylist`  (
  `stylist_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '发型师id',
  `barbershop_id` int(11) NOT NULL COMMENT '发型师注册的店的id',
  `speciality` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '发型师特长',
  `is_passed` int(1) NOT NULL COMMENT '资料是否审核通过：0代表未通过，1代表通过',
  `real_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '发型师姓名',
  `working_years` int(2) NOT NULL COMMENT '工作年龄',
  `stylist_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '手机号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '头像',
  `role` int(1) NOT NULL COMMENT '身份认证：0是普通用户，1是发型师，2是管理员',
  PRIMARY KEY (`stylist_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stylist
-- ----------------------------
INSERT INTO `stylist` VALUES (5, 3, '擅长离子烫', 1, '陈明', 4, '陈明', '13458633429', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620914862187.jpg', 1);
INSERT INTO `stylist` VALUES (6, 2, '擅长时尚发型', 1, '李尚', 3, '李尚', '13428913258', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915593518.jpg', 1);
INSERT INTO `stylist` VALUES (7, 1, '擅长头发护理', 1, '周琛', 3, '周琛', '13428155536', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915668401.jpg', 1);
INSERT INTO `stylist` VALUES (8, 3, '擅长染发', 1, '陈杰', 2, '陈杰', '13757455853', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915705767.jpg', 1);
INSERT INTO `stylist` VALUES (9, 1, '擅长塑造发型', 1, '李柱山', 2, '李柱山', '13932624584', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915738253.jpg', 1);
INSERT INTO `stylist` VALUES (11, 2, '擅长理发', 1, '钱志', 1, '钱志', '13426911154', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915774434.jpg', 1);
INSERT INTO `stylist` VALUES (12, 2, '擅长染发', 1, '林立', 4, '林立', '13932935694', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915806519.jpg', 1);
INSERT INTO `stylist` VALUES (13, 1, '擅长烟花烫', 1, '成礼', 2, '成礼', '13578921478', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915838369.jpg', 1);
INSERT INTO `stylist` VALUES (14, 2, '擅长热烫造型', 1, '李良', 3, '李良', '13635628273', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915870285.jpg', 1);
INSERT INTO `stylist` VALUES (15, 3, '擅长潮流发型', 1, '张东', 3, '张东', '13635823287', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915896602.jpg', 1);
INSERT INTO `stylist` VALUES (16, 3, '擅长头发护理', 1, '陈科', 4, '陈科', '13737263571', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915925487.jpg', 1);
INSERT INTO `stylist` VALUES (17, 2, '擅长热烫造型', 1, '王生', 3, '王生', '13532425365', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915958218.jpg', 1);
INSERT INTO `stylist` VALUES (18, 1, '擅长染发', 1, '赵迪', 2, '赵迪', '14721854896', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620915997902.jpg', 1);
INSERT INTO `stylist` VALUES (19, 1, '擅长理发', 1, '宋乔', 3, '宋乔', '13532757527', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620916032051.jpg', 1);
INSERT INTO `stylist` VALUES (20, 3, '擅长烫发', 1, '徐彤', 3, '徐彤', '13375342391', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620916061567.jpg', 1);
INSERT INTO `stylist` VALUES (21, 2, '擅长卷发', 1, '谭可', 2, '谭可', '13536435893', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620916095051.jpg', 1);

-- ----------------------------
-- Table structure for turnover
-- ----------------------------
DROP TABLE IF EXISTS `turnover`;
CREATE TABLE `turnover`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` date NOT NULL COMMENT '创建时间',
  `total` float NOT NULL COMMENT '每日营业额',
  `person` int(11) NOT NULL COMMENT '每日客流量',
  `barbershop_id` int(11) NOT NULL COMMENT '店id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 102 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of turnover
-- ----------------------------
INSERT INTO `turnover` VALUES (1, '2021-04-11', 154, 1, 1);
INSERT INTO `turnover` VALUES (3, '2021-04-11', 0, 0, 3);
INSERT INTO `turnover` VALUES (4, '2021-04-12', 0, 0, 1);
INSERT INTO `turnover` VALUES (75, '2021-05-08', 1105, 8, 2);
INSERT INTO `turnover` VALUES (76, '2021-05-08', 770, 6, 1);
INSERT INTO `turnover` VALUES (77, '2021-05-08', 925, 6, 3);
INSERT INTO `turnover` VALUES (78, '2021-05-09', 740, 5, 2);
INSERT INTO `turnover` VALUES (79, '2021-05-09', 1045, 7, 3);
INSERT INTO `turnover` VALUES (80, '2021-05-09', 1225, 8, 1);
INSERT INTO `turnover` VALUES (81, '2021-05-10', 1385, 8, 2);
INSERT INTO `turnover` VALUES (82, '2021-05-10', 935, 6, 1);
INSERT INTO `turnover` VALUES (83, '2021-05-10', 930, 6, 3);
INSERT INTO `turnover` VALUES (84, '2021-05-11', 815, 5, 1);
INSERT INTO `turnover` VALUES (85, '2021-05-11', 1115, 8, 3);
INSERT INTO `turnover` VALUES (86, '2021-05-11', 745, 7, 2);
INSERT INTO `turnover` VALUES (87, '2021-05-12', 1265, 8, 2);
INSERT INTO `turnover` VALUES (88, '2021-05-12', 835, 5, 1);
INSERT INTO `turnover` VALUES (89, '2021-05-12', 1035, 7, 3);
INSERT INTO `turnover` VALUES (90, '2021-05-13', 1040, 7, 2);
INSERT INTO `turnover` VALUES (91, '2021-05-13', 930, 8, 1);
INSERT INTO `turnover` VALUES (92, '2021-05-13', 825, 6, 3);
INSERT INTO `turnover` VALUES (93, '2021-05-14', 860, 9, 3);
INSERT INTO `turnover` VALUES (94, '2021-05-14', 710, 7, 2);
INSERT INTO `turnover` VALUES (95, '2021-05-14', 935, 9, 1);
INSERT INTO `turnover` VALUES (97, '2021-05-07', 0, 0, 1);
INSERT INTO `turnover` VALUES (98, '2021-05-07', 0, 0, 2);
INSERT INTO `turnover` VALUES (99, '2021-05-07', 0, 0, 3);
INSERT INTO `turnover` VALUES (100, '2021-05-15', 25, 1, 1);
INSERT INTO `turnover` VALUES (101, '2021-05-15', 0, 0, 2);
INSERT INTO `turnover` VALUES (102, '2021-05-15', 90, 3, 3);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `role` int(1) NOT NULL COMMENT '身份认证：0是普通用户，1是发型师，2是管理员',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '头像',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '联系电话',
  `hobby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '兴趣偏好',
  `points` int(11) NULL DEFAULT NULL COMMENT '积分',
  `money` float(13, 2) NULL DEFAULT NULL COMMENT '余额',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 84 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (32, 'Lee', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1620888509998.jpg', '1991-04-14', '13785989654', '敲代码、写程序', 9507, 4039.00);
INSERT INTO `user` VALUES (36, 'tony', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/02162021871.jpg', '1986-04-11', '13554254353', '打篮球', 343, 3150.00);
INSERT INTO `user` VALUES (37, '繁华十里', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/02162021869.jpg', '1984-04-11', '13625475611', '绘画，写生', 329, 3025.00);
INSERT INTO `user` VALUES (39, '振华', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620211707.jpg', '2003-04-11', '13942354357', '做手工', 169, 3550.00);
INSERT INTO `user` VALUES (40, '建国', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620211705.jpg', '2002-04-11', '13942357777', '读书、品历史', 281, 3235.00);
INSERT INTO `user` VALUES (42, '观海', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620211716.jpg', '1998-04-15', '13164647898', '喜欢哲学，钻研问题', 276, 3275.00);
INSERT INTO `user` VALUES (43, '晨曦', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206944.jpg', '1987-04-15', '13764647898', '运动，跑步', 311, 3310.00);
INSERT INTO `user` VALUES (44, '樱花开了', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206946.jpg', '2004-04-15', '13728187898', '喜欢健身，沉醉于大汗淋漓的时刻', 383, 3155.00);
INSERT INTO `user` VALUES (46, '家余', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206951.jpg', '1996-04-11', '13463587898', '喜欢刷机、写面具模块', 230, 3195.00);
INSERT INTO `user` VALUES (47, '春华', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320207041.jpg', NULL, '13232827369', '热爱绘图和平面设计', 348, 3300.00);
INSERT INTO `user` VALUES (48, '尘封之泪', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/02162021723.jpg', '1998-04-12', '13785999654', '热爱数学，喜欢思考生活中的数学问题', 360, 3100.00);
INSERT INTO `user` VALUES (49, '落霞孤鹜', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/02162021729.jpg', '1998-04-12', '13728789654', '敲代码、写BUG', 326, 3140.00);
INSERT INTO `user` VALUES (55, '陈曦', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/02162021732.jpg', NULL, '13625942517', '喜欢打游戏、有自己独特的游戏技巧', 386, 3180.00);
INSERT INTO `user` VALUES (58, '宁静', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/02162021998.jpg', NULL, '13428199949', '喜欢乒乓球', 287, 3245.00);
INSERT INTO `user` VALUES (59, '小白是小白', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620211006.jpg', NULL, '13428794375', '跑酷是我的热爱', 232, 3430.00);
INSERT INTO `user` VALUES (60, '落花知意', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620211005.jpg', '1985-04-16', '13426722272', '驾车旅行是我的追求和热爱', 277, 3465.00);
INSERT INTO `user` VALUES (61, '蛋黄的长裙', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620212067.jpg', '1989-04-16', '13484284412', '看番追剧，二次元带给我无限的乐趣', 305, 3155.00);
INSERT INTO `user` VALUES (62, '两面包夹芝士', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620212075.jpg', NULL, '13429264599', '喜欢下象棋，享受思想博弈的过程', 280, 3165.00);
INSERT INTO `user` VALUES (63, '陈谨年', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620212694.jpg', NULL, '13423155535', '喜欢钓鱼', 365, 2955.00);
INSERT INTO `user` VALUES (64, '李好烦', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620212697.jpg', NULL, '13542380877', '喜欢露营和户外运动', 414, 3130.00);
INSERT INTO `user` VALUES (65, '城北徐公', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620212700.jpg', NULL, '13425311121', '登山总能让我开阔眼界和感叹自然', 195, 3615.00);
INSERT INTO `user` VALUES (66, '风月同天', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/021620212690.jpg', NULL, '13789744464', '热爱建模，研究生活中的一些现象', 158, 3235.00);
INSERT INTO `user` VALUES (67, '稻香', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320208082.jpg', NULL, '13435799969', '热爱马拉松', 383, 2980.00);
INSERT INTO `user` VALUES (70, '李逍遥', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206836.jpg', '1997-04-15', '13432814598', '喜欢游泳', 55, 3505.00);
INSERT INTO `user` VALUES (74, '陈晨', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206825.jpg', NULL, '13428978949', '喜欢读书。书中自有黄金屋', 78, 2110.00);
INSERT INTO `user` VALUES (75, 'Sakura', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206831.jpg', NULL, '13745695267', '喜欢看电影。感受人生百态', 9, 3400.00);
INSERT INTO `user` VALUES (76, 'HelloWorld', '8ca32d950873fd2b5b34a7d79c4a294b2fd805abe3261beb04fab61a3b4b75609afd6478aa8d34e03f262d68bb09a2ba9d655e228c96723b2854838a6e613b9d', 0, 'http://img.jj20.com/up/allimg/tx28/112320206832.jpg', '1999-04-16', '13725896547', '喜欢摄影，记录每一个有趣的瞬间', 16, 3630.00);

SET FOREIGN_KEY_CHECKS = 1;
