-- 表结构（t_order_202501）
DROP TABLE IF EXISTS `t_order_202501`;
CREATE TABLE `t_order_202501` (
  `order_id` bigint NOT NULL,
  `user_id` bigint DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `merchant_id` bigint DEFAULT NULL,
  `order_status_id` int,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 表结构（t_order_202502）
DROP TABLE IF EXISTS `t_order_202502`;
CREATE TABLE `t_order_202502` (
  `order_id` bigint NOT NULL,
  `user_id` bigint DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `merchant_id` bigint DEFAULT NULL,
  `order_status_id` int,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
