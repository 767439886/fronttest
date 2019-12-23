/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.5.49 : Database - shixuanyoumei
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shixuanyoumei` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shixuanyoumei`;

/*Table structure for table `advisory` */

DROP TABLE IF EXISTS `advisory`;

CREATE TABLE `advisory` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `picPath` varchar(50) DEFAULT NULL COMMENT '图片',
  `context` varchar(100) DEFAULT NULL COMMENT '内容',
  `smallContext` varchar(100) DEFAULT NULL COMMENT '小内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `advisory` */

insert  into `advisory`(`id`,`picPath`,`context`,`smallContext`) values (1,'/img/01.jpg','学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆','打造钻石电'),(2,'/img/02.jpg','上班约会展现极致美 心机淡妆提升','心机淡妆提升'),(3,'/img/03.jpg','不要留逗印，7个DIY最有效','心机提升哈哈'),(4,'/img/04.jpg','去逗印最有效的方法，迅速去痘印','去痘印呵呵'),(5,'/img/05.jpg','学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆','打造钻石电'),(6,'/img/06.jpg','不要留逗印，7个DIY最有效','打造钻石电'),(7,'/img/07.jpg','去逗印最有效的方法，迅速去痘印','心机提升哈哈');

/*Table structure for table `beauty` */

DROP TABLE IF EXISTS `beauty`;

CREATE TABLE `beauty` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `picPath` varchar(60) DEFAULT NULL COMMENT '图片',
  `context` varchar(50) DEFAULT NULL COMMENT '内容',
  `smallContext` varchar(50) DEFAULT NULL COMMENT '小内容',
  `city` varchar(30) DEFAULT NULL COMMENT '城市',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `beauty` */

insert  into `beauty`(`id`,`picPath`,`context`,`smallContext`,`city`) values (1,'/img/beauty/01.jpg','SOHO(国际)美容会所','SOHO(国际)美容会所','1'),(2,'/img/beauty/02.jpg','[南山中心区]韩邦蒸馏会所','[南山中心区]韩邦蒸馏会所','1'),(3,'/img/beauty/09.jpg','援堂美容会所','援堂美容会所','2'),(4,'/img/beauty/04.jpg','丽研国际美容会所','丽研国际美容会所','2'),(5,'/img/beauty/05.jpg','援堂美容会所','援堂美容会所','3'),(6,'/img/beauty/06.jpg','丽研国际美容会所','丽研国际美容会所','3'),(7,'/img/beauty/92.jpg','援堂美容会所','援堂美容会所','4');

/*Table structure for table `brand` */

DROP TABLE IF EXISTS `brand`;

CREATE TABLE `brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(20) DEFAULT NULL COMMENT '名字',
  `context` varchar(1000) DEFAULT NULL COMMENT '内容',
  `address` varchar(20) DEFAULT NULL COMMENT '地址',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话',
  `picPath` varchar(20) DEFAULT NULL COMMENT '图片',
  `type` varchar(10) DEFAULT NULL COMMENT '品牌分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `brand` */

insert  into `brand`(`id`,`name`,`context`,`address`,`telephone`,`picPath`,`type`) values (1,'欧莱雅','此品牌非常好,可以更好的发展','广州市黄埔区大学城','1366280409','/img/brand/1.jpg','1'),(2,'尚果','此品牌很厚道,很华丽','广州市黄埔区大学城','1366280409','/img/brand/2.jpg','1'),(3,'莱key','公司于1987年在深圳设立生产基地，凭借优质的产品和简约、现代、时尚、环保的设计风格，三十多年来，“红苹果”家具得到了国内外消费者的广泛信赖与认可，产品远销欧美、东南亚和南非等多个国家和地区。公司业已成为中国家具行业极具规模与影响力企业之一，在全国民用家具市场的占有率及品牌知名度均名列前茅。','广州市天河区大学城','1366280408','/img/brand/3.jpg','2'),(4,'骄韵诗','深圳天诚家具有限公司，1981年创立于香港，是一家以“红苹果”为核心品牌，主要经营高档板式家具、沙发、床垫、床品及定制家具等系列产品，集研发、生产、营销、服务于一体的现代化家具制造企业。公司位于深圳市龙华新区鹊山工业园，占地面积约40万平方米，注册资金25300万港币。','广州市励志区大学城','1366280407','/img/brand/4.jpg','2'),(5,'苹果','必须保持品牌概念的统一和完整，具体包括企业业务领域（行业、主要产品等）、企业形象（跨国、本土等）、企业文化（严谨、进取、保守）、产品定位（高档、中档、低档）、产品风格（时尚、新潮、动感）。','广州市南沙区大学城','1366280410','/img/brand/5.jpg','3'),(6,'雅姿','品牌(Brand)是一种识别标志、一种精神象征、一种价值理念，是品质优异的核心体现。培育和创造品牌的过程也是不断创新的过程，自身有了创新的力量，才能在激烈的竞争中立于不败之地，继而巩固原有品牌资产，多层次、多角度、多领域地参与竞','广州市越秀区大学城','1366280410','/img/brand/6.jpg','3');

/*Table structure for table `shopping` */

DROP TABLE IF EXISTS `shopping`;

CREATE TABLE `shopping` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id号',
  `picpath` varchar(11) DEFAULT NULL COMMENT '图片路径',
  `content` varchar(100) DEFAULT NULL COMMENT '描述的内容',
  `main` varchar(100) DEFAULT NULL COMMENT '主要内容',
  `consitute` varchar(100) DEFAULT NULL COMMENT '产品组成',
  `price` double DEFAULT NULL COMMENT '价钱',
  `type` bigint(5) DEFAULT NULL COMMENT '产品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `shopping` */

insert  into `shopping`(`id`,`picpath`,`content`,`main`,`consitute`,`price`,`type`) values (1,'/img/89.jpg','排毒养颜值礼盒','荀草,上树龙华,杜仲，大发散','本地草x12',1200,1),(2,'/img/90.jpg','颈椎睡眠熏调礼盒','人参,天花雪莲，蘑菇','本地油x13',2200,1),(3,'/img/91.jpg','蜜意熏条礼盒','回魂草,天魂草,金叶草','本草油x14',2300,2),(4,'/img/92.jpg','清肝养肝熏条礼盒','清水,回魂,天花','回魂x15',2400,4),(5,'/img/93.jpg','排毒养颜值礼盒','美颜,护肤，美白','艾叶x11',2500,4),(6,'/img/94.jpg','化妆养颜值礼盒','金花,银花，中花','红花x12',2100,2),(7,'/img/95.jpg','调式礼盒','珍珠，雪莲，党参','本地油x13',2000,2),(8,'/img/96.jpg','热门漂亮礼盒','人参,雪莲，天魂草','大发散x14',2300,3),(9,'/img/97.jpg','美丽偏凉礼盒','薰衣草,杜仲,红发','本地油x15',2100,3),(10,'/img/91.jpg','学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆学少时闪亮眼妆','金花,银花，中花','大发散x12',2200,6),(11,'/img/92.jpg','美丽偏凉礼盒','珍珠，雪莲，党参','本地油x15',2300,6);

/*Table structure for table `shoppinglist` */

DROP TABLE IF EXISTS `shoppinglist`;

CREATE TABLE `shoppinglist` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `shoppingId` int(20) DEFAULT NULL COMMENT '购物表的id',
  `uid` int(20) DEFAULT NULL COMMENT '用户id',
  `number` bigint(10) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `shoppinglist` */

insert  into `shoppinglist`(`id`,`shoppingId`,`uid`,`number`) values (1,1,1,2),(2,2,1,1),(3,3,1,4),(4,4,1,2),(5,6,1,1),(6,8,1,2),(7,5,1,1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(10) DEFAULT NULL COMMENT '用户名',
  `password` varchar(10) DEFAULT NULL COMMENT '密码',
  `address` varchar(20) DEFAULT NULL COMMENT '地址',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `deliverAddress` varchar(30) DEFAULT NULL COMMENT '送货地址',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`address`,`phone`,`deliverAddress`,`name`) values (1,'admin','admin','广州市黄埔区xx街道xx小区','123321123','广州市黄埔区xx街道xx小区','王无'),(2,'123','123',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
