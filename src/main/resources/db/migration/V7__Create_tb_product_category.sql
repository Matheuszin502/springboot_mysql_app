DROP TABLE IF EXISTS `tb_product_category`;

CREATE TABLE `tb_product_category` (
  `category_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  PRIMARY KEY (`category_id`,`product_id`),
  KEY `FKgbof0jclmaf8wn2alsoexxq3u` (`product_id`),
  CONSTRAINT `FK5r4sbavb4nkd9xpl0f095qs2a` FOREIGN KEY (`category_id`) REFERENCES `tb_category` (`id`),
  CONSTRAINT `FKgbof0jclmaf8wn2alsoexxq3u` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`id`)
)