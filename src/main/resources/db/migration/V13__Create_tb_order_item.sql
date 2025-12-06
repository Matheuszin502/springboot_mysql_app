DROP TABLE IF EXISTS `tb_order_item`;

CREATE TABLE `tb_order_item` (
  `price` double DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `order_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  PRIMARY KEY (`order_id`,`product_id`),
  KEY `FK4h5xid5qehset7qwe5l9c997x` (`product_id`),
  CONSTRAINT `FK4h5xid5qehset7qwe5l9c997x` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`id`),
  CONSTRAINT `FKgeobgl2xu916he8vhljktwxnx` FOREIGN KEY (`order_id`) REFERENCES `tb_order` (`id`)
)