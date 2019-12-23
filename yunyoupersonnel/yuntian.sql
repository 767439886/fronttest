/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.5.49 : Database - yuntianpersonnel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yuntianpersonnel` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yuntianpersonnel`;

/*Table structure for table `basicsmessage` */

DROP TABLE IF EXISTS `basicsmessage`;

CREATE TABLE `basicsmessage` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `uid` bigint(10) DEFAULT NULL COMMENT '用户名id',
  `phone` varchar(10) DEFAULT NULL COMMENT '电话号码',
  `mobilePhone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `address` varchar(10) DEFAULT NULL COMMENT '地址',
  `incumbency` varchar(4) DEFAULT NULL COMMENT '在职情况',
  `incumbencyType` varchar(10) DEFAULT NULL COMMENT '用工形式',
  `resume` varchar(200) DEFAULT NULL COMMENT '个人介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

/*Data for the table `basicsmessage` */

insert  into `basicsmessage`(`id`,`uid`,`phone`,`mobilePhone`,`address`,`incumbency`,`incumbencyType`,`resume`) values (16,323,'1313','1313','aaa','事假','正式工','cc'),(20,15,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(21,16,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(22,17,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(23,18,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(24,19,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(25,20,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(38,12,'','13456453534','广州市新溪村','产假','暑期工','xxxxxxx啊哈哈'),(45,43214,'','','',NULL,'',''),(46,14,NULL,'2131223','新溪','在职','正式工','谢谢谢谢谢谢'),(48,234,'','','',NULL,'',''),(49,321,'','','',NULL,'',''),(50,543,'','','',NULL,'','');

/*Table structure for table `cultivate` */

DROP TABLE IF EXISTS `cultivate`;

CREATE TABLE `cultivate` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id号',
  `cultivateName` varchar(20) DEFAULT NULL COMMENT '培训名称',
  `cultivateCenter` varchar(100) DEFAULT NULL COMMENT '培训内容',
  `startDate` varchar(20) DEFAULT NULL COMMENT '开始日期',
  `endDate` varchar(20) DEFAULT NULL COMMENT '结束日期',
  `culitivateCompany` varchar(20) DEFAULT NULL COMMENT '培训单位',
  `culitivateResult` varchar(20) DEFAULT NULL COMMENT '培训结果',
  `uid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

/*Data for the table `cultivate` */

insert  into `cultivate`(`id`,`cultivateName`,`cultivateCenter`,`startDate`,`endDate`,`culitivateCompany`,`culitivateResult`,`uid`) values (22,'阿斯蒂芬','阿斯蒂芬斯','2019-11-30','2019-11-22','xxx','良好',16),(23,'培训','xxxx','2019-11-01','2019-11-23','ooo','优秀',4),(24,'培训','我们就是和','2019-11-15','2019-11-22','xxx','良好',3),(26,'哈哈','撒旦','2019-11-07','2019-11-08','撒地方','良好',12),(27,'哈哈','撒旦','2019-11-07','2019-11-08','撒地方','良好',14),(28,'哈哈','撒旦','2019-11-07','2019-11-08','撒地方','良好',15),(29,'阿斯蒂芬','新溪','2019-11-13','2019-11-25','阿斯蒂芬','差',15);

/*Table structure for table `management` */

DROP TABLE IF EXISTS `management`;

CREATE TABLE `management` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `updateDate` varchar(10) DEFAULT NULL COMMENT '升职日期',
  `uid` bigint(10) DEFAULT NULL COMMENT '升值id',
  `position` varchar(10) DEFAULT NULL COMMENT '职位',
  `level` varchar(10) DEFAULT NULL COMMENT '等级',
  `upPerson` varchar(10) DEFAULT NULL COMMENT '升职负责人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `management` */

insert  into `management`(`id`,`updateDate`,`uid`,`position`,`level`,`upPerson`) values (1,'2019-11-14',14,'后端','高级','阿斯蒂'),(2,'2019-11-01',14,'后端','中级','阿斯蒂芬'),(3,'2019-11-02',12,'后端','高级','顺德府'),(4,'2019-11-16',14,'后端','高级','儿童'),(10,'2019-11-07',12,'后端','低级','阿斯蒂芬');

/*Table structure for table `peoplemove` */

DROP TABLE IF EXISTS `peoplemove`;

CREATE TABLE `peoplemove` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `uid` bigint(10) DEFAULT NULL COMMENT '用户名id',
  `translateDate` varchar(20) DEFAULT NULL COMMENT '调动时间',
  `priorBranch` varchar(20) DEFAULT NULL COMMENT '前部门',
  `nextBranch` varchar(20) DEFAULT NULL COMMENT '现部门',
  `priorDuty` varchar(20) DEFAULT NULL COMMENT '前职务',
  `nextDuty` varchar(20) DEFAULT NULL COMMENT '现职务',
  `handeName` varchar(10) DEFAULT NULL COMMENT '经办人',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

/*Data for the table `peoplemove` */

insert  into `peoplemove`(`id`,`uid`,`translateDate`,`priorBranch`,`nextBranch`,`priorDuty`,`nextDuty`,`handeName`,`remark`) values (31,14,'2019-11-01','人事部','董事部',NULL,NULL,'',''),(32,14,'2019-11-08','人事部','董事部','管理','程序员','黄总','ppxxx'),(33,15,'2019-11-09','前台','董事部','管理','程序员','李经理','oopp'),(34,14,'2019-11-23','人事部','董事部','管理','程序员','叶总管','前去v'),(35,14,'2019-11-16','人事部','董事部','管理','程序员','撒地方','热武器');

/*Table structure for table `punishment` */

DROP TABLE IF EXISTS `punishment`;

CREATE TABLE `punishment` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `uid` bigint(10) DEFAULT NULL COMMENT '用户名id',
  `position` varchar(20) DEFAULT NULL COMMENT '职称',
  `rewardPunish` varchar(10) DEFAULT NULL COMMENT '惩罚',
  `rewardContent` varchar(30) DEFAULT NULL COMMENT '惩罚内容',
  `reason` varchar(40) DEFAULT NULL COMMENT '原因',
  `branch` varchar(20) DEFAULT NULL COMMENT '批注部门',
  `handleName` varchar(10) DEFAULT NULL COMMENT '审核人',
  `startDate` date DEFAULT NULL COMMENT '开始时间',
  `cancelDate` date DEFAULT NULL COMMENT '撤销时间',
  `cancelReason` varchar(40) DEFAULT NULL COMMENT '撤销原因',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `punishment` */

insert  into `punishment`(`id`,`uid`,`position`,`rewardPunish`,`rewardContent`,`reason`,`branch`,`handleName`,`startDate`,`cancelDate`,`cancelReason`,`remark`) values (5,12,'后端程序员','奖','撒地方','去微软','项目经理','阿斯蒂芬','2019-11-16','2019-11-30','水岸东方',''),(6,12,'总经理','罚','哈哈','哈哈','项目经理','哈哈','2019-11-14','2019-11-23','xx','');

/*Table structure for table `schoolmessage` */

DROP TABLE IF EXISTS `schoolmessage`;

CREATE TABLE `schoolmessage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `computerLevel` varchar(4) DEFAULT NULL COMMENT '计算机等级',
  `graduateDate` date DEFAULT NULL COMMENT '毕业时间',
  `accumulateID` varchar(10) DEFAULT '0' COMMENT '公积金',
  `administrationLevel` varchar(10) DEFAULT NULL COMMENT '行政级别',
  `duty` varchar(10) DEFAULT NULL COMMENT '职务',
  `position` varchar(20) DEFAULT NULL COMMENT '职称',
  `foreignLanuage` varchar(10) DEFAULT NULL COMMENT '外语语种',
  `FLlevel` varchar(20) DEFAULT NULL COMMENT '英语级别',
  `uid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `university` varchar(10) DEFAULT NULL COMMENT '毕业校园',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

/*Data for the table `schoolmessage` */

insert  into `schoolmessage`(`id`,`computerLevel`,`graduateDate`,`accumulateID`,`administrationLevel`,`duty`,`position`,`foreignLanuage`,`FLlevel`,`uid`,`university`) values (4,'二级','2019-11-07','321','初级工程师','初级工程师','ff','三级','asdf',323,'分发'),(8,'三级','2019-10-31','543212323','初级工程师','初级工程师','尼们','三级','汉语',15,'xxx'),(9,'三级','2019-10-31','543212323','初级工程师','初级工程师','尼们','三级','汉语',16,'xxx'),(10,'三级','2019-10-31','543212323','初级工程师','初级工程师','尼们','三级','汉语',17,'xxx'),(11,'三级','2019-10-31','543212323','初级工程师','初级工程师','尼们','三级','汉语',18,'xxx'),(12,'三级','2019-10-31','543212323','初级工程师','初级工程师','尼们','三级','汉语',19,'xxx'),(13,'三级','2019-10-31','543212323','初级工程师','初级工程师','尼们','三级','汉语',20,'xxx'),(24,'二级','2019-10-31','543212323','初级工程师','初级工程师','xx','二级','英',12,'xxx'),(30,'','2019-11-08','','','','','','',43214,''),(31,'三级','2019-11-07','123123123','初级工程师','助理工程师','xx','二级','汉',14,'xxx'),(32,'','2019-11-15','','','','','','',234,''),(33,'','2019-11-15','','','','','','',321,''),(34,'','2019-11-21','','','','','','',543,'');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(10) DEFAULT NULL COMMENT '用户名',
  `password` varchar(10) DEFAULT 'admin' COMMENT '账号密码',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `branch` varchar(10) DEFAULT NULL COMMENT '部门',
  `idCard` varchar(18) DEFAULT NULL COMMENT '身份证',
  `nativePlace` varchar(10) DEFAULT NULL COMMENT '籍贯',
  `marriage` varchar(2) DEFAULT NULL COMMENT '婚姻',
  `politics` varchar(10) DEFAULT NULL COMMENT '政治面貌',
  `folk` varchar(10) DEFAULT NULL COMMENT '名族',
  `education` varchar(10) DEFAULT NULL COMMENT '学历',
  `deparment` varchar(10) DEFAULT NULL COMMENT '专业',
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43215 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`sex`,`branch`,`idCard`,`nativePlace`,`marriage`,`politics`,`folk`,`education`,`deparment`,`name`) values (1,'admin','admin',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'admin'),(12,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','叶'),(14,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','李c'),(15,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','钟'),(16,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','唐'),(17,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','魑魅魍魉'),(18,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','张'),(19,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','天'),(20,NULL,'admin','男','财务部','4401123123123123','广东深圳','未婚','群众','苗','大专','计算机','周'),(234,NULL,'admin','','','','','','','','','',''),(321,NULL,'admin','','','','','','','','','',''),(323,NULL,'admin','女','研发部','4123423','广东深圳','未婚','党员','汉','大专','所属','aa'),(543,NULL,'admin','男','研发部','','广东广州','','','','','','法人股'),(43214,NULL,'admin','女','研发部','','广东深圳','','','','','','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
