/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.1.73-community : Database - bbs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bbs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bbs`;

/*Table structure for table `blocks` */

DROP TABLE IF EXISTS `blocks`;

CREATE TABLE `blocks` (
  `blockId` int(11) NOT NULL AUTO_INCREMENT,
  `blockName` varchar(20) DEFAULT NULL,
  `blocakState` int(11) DEFAULT '1',
  PRIMARY KEY (`blockId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `blocks` */

insert  into `blocks`(`blockId`,`blockName`,`blocakState`) values 
(1,'西安论坛',1),
(2,'科大论坛',1),
(3,'宝鸡论坛',1),
(4,'交大论坛',1),
(5,'工业论坛',1),
(6,'农业论坛',1),
(7,'商业论坛',1),
(8,'其他论坛',1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `userpass` varchar(20) NOT NULL,
  `usernickname` varchar(20) NOT NULL,
  `userimg` varchar(100) DEFAULT 'default.jpg',
  `userlev` int(11) DEFAULT '0',
  `usercity` varchar(20) DEFAULT NULL,
  `userdate` varchar(50) DEFAULT NULL,
  `userstate` int(11) DEFAULT '1',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`userid`,`username`,`userpass`,`usernickname`,`userimg`,`userlev`,`usercity`,`userdate`,`userstate`) values 
(1,'admin','china','管理员','default.jpg',0,'西安','2018-07-30 10:36:12',1),
(2,'team','team','Z官儿','default.jpg',0,'宝鸡','2018-07-30 10:36:12',1),
(3,'zhangsan','123456','张三','default.jpg',0,'汉中','2018-07-30 10:36:12',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
