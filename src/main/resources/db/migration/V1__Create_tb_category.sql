DROP TABLE IF EXISTS `tb_category`;

CREATE TABLE `tb_category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)