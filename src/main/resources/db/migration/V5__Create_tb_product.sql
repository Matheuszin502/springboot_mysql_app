DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `price` double DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)