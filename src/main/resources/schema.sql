SET NAMES utf8mb4;
 SET FOREIGN_KEY_CHECKS = 0;
 -- ----------------------------
 -- Table structure for t_order_0
 -- ----------------------------
 DROP TABLE IF EXISTS `t_order_0`;
 CREATE TABLE `t_order_0` (
  `order_id` bigint NOT NULL,
  `user_id` bigint NULL DEFAULT NULL,
  `amount` decimal(10, 2) NULL DEFAULT NULL,
  `merchant_id` bigint NULL DEFAULT NULL,
  `order_status_id` int,
  PRIMARY KEY (`order_id`) USING BTREE
 ) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;
 DROP TABLE IF EXISTS `t_order_1`;
 CREATE TABLE `t_order_1` (
  `order_id` bigint NOT NULL,
  `user_id` bigint NULL DEFAULT NULL,
  `amount` decimal(10, 2) NULL DEFAULT NULL,
  `merchant_id` bigint NULL DEFAULT NULL,
  `order_status_id` int,
  PRIMARY KEY (`order_id`) USING BTREE
 ) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

 SET FOREIGN_KEY_CHECKS = 1;
