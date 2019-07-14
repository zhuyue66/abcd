/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : jspdb

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-07-14 15:58:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) DEFAULT NULL,
  `admin_pass` varchar(32) DEFAULT NULL,
  `admin_role` int(11) DEFAULT NULL,
  PRIMARY KEY (`admin_id`),
  KEY `admin_role` (`admin_role`),
  CONSTRAINT `admins_ibfk_1` FOREIGN KEY (`admin_role`) REFERENCES `roles` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', 'admin', '123456', '1');
INSERT INTO `admins` VALUES ('2', 'peter', '123456', '2');
INSERT INTO `admins` VALUES ('3', 'sun', '123456', '3');

-- ----------------------------
-- Table structure for favorites
-- ----------------------------
DROP TABLE IF EXISTS `favorites`;
CREATE TABLE `favorites` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_goods` int(11) DEFAULT NULL,
  `item_price` double DEFAULT NULL,
  `item_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `item_user` (`item_user`),
  KEY `item_goods` (`item_goods`),
  CONSTRAINT `item_goods` FOREIGN KEY (`item_goods`) REFERENCES `goods` (`goods_id`),
  CONSTRAINT `item_user` FOREIGN KEY (`item_user`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of favorites
-- ----------------------------
INSERT INTO `favorites` VALUES ('1', '1', '230', '9');
INSERT INTO `favorites` VALUES ('2', '2', '130', '9');
INSERT INTO `favorites` VALUES ('3', '7', '200', '9');

-- ----------------------------
-- Table structure for funs
-- ----------------------------
DROP TABLE IF EXISTS `funs`;
CREATE TABLE `funs` (
  `fun_id` int(11) NOT NULL AUTO_INCREMENT,
  `fun_name` varchar(200) DEFAULT NULL,
  `fun_url` varchar(200) DEFAULT NULL,
  `fun_pid` int(11) DEFAULT NULL,
  `fun_target` varchar(20) DEFAULT NULL,
  `fun_sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`fun_id`),
  KEY `fun_pid` (`fun_pid`),
  CONSTRAINT `funs_ibfk_1` FOREIGN KEY (`fun_pid`) REFERENCES `funs` (`fun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of funs
-- ----------------------------
INSERT INTO `funs` VALUES ('1', '基础数据管理', null, null, null, '2');
INSERT INTO `funs` VALUES ('2', '订单管理', null, null, null, '5');
INSERT INTO `funs` VALUES ('3', '系统管理', null, null, null, '9');
INSERT INTO `funs` VALUES ('4', '商品信息维护', '/admin/goods/search.do', '1', 'I2', null);
INSERT INTO `funs` VALUES ('5', '商品类型维护', '/admin/goodstype/search.do', '1', 'I2', null);
INSERT INTO `funs` VALUES ('6', '未付款订单', '/admin/order/search.do', '2', 'I2', null);
INSERT INTO `funs` VALUES ('7', '已付款订单', '/admin/order/search.do', '2', 'I2', null);
INSERT INTO `funs` VALUES ('8', '退出', '/adminlogin.jsp', '3', '_top', null);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(200) DEFAULT NULL,
  `goods_price` float DEFAULT NULL,
  `goods_num` int(11) DEFAULT NULL,
  `goods_img` varchar(200) DEFAULT NULL,
  `goods_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`goods_id`),
  KEY `goods_type` (`goods_type`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`goods_type`) REFERENCES `goods_type` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8 COMMENT='InnoDB free: 3072 kB; (`goods_type`) REFER `no8/goods_type`(';

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'Blackmores EPO月见草', '230', '97', 'pro2.png', '4');
INSERT INTO `goods` VALUES ('2', 'Sukin苏芊 玫瑰果补湿日霜 ', '130', '100', 'pro1.png', '4');
INSERT INTO `goods` VALUES ('3', 'Swisse 澳洲活力胶原蛋白液', '150', '99', 'pro3.png', '4');
INSERT INTO `goods` VALUES ('4', 'Doppelherz 双心 补充毛囊防脱头', '159', '100', 'pro4.png', '4');
INSERT INTO `goods` VALUES ('5', 'Swisse 发肤甲润泽口服液', '209', '99', 'pro5.png', '5');
INSERT INTO `goods` VALUES ('6', 'GNC 健安喜 女性胶原蛋白营养片', '115', '99', 'pro6.png', '5');
INSERT INTO `goods` VALUES ('7', 'HECH赫熙纯天然鱼子酱胶原蛋白肽', '200', '999', 'pro7.png', '5');
INSERT INTO `goods` VALUES ('8', '韩风潮流裤子', '119', '100', 'a.jpg', '4');
INSERT INTO `goods` VALUES ('12', '销量口碑双保障火爆热销150万台', '115', '100', 'b.jpg', '4');
INSERT INTO `goods` VALUES ('13', '好鞋！！不要998', '99', '100', 'shoes.jpg', '4');
INSERT INTO `goods` VALUES ('14', 'SHISEIDO 资生堂 UNO 男士洗面奶 ', '44', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('15', '剃须刀', '115', '100', 'c.jpg', '4');
INSERT INTO `goods` VALUES ('16', 'SHISEIDO 资生堂 UNO 男士泡沫快', '48', '99', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('17', '【3件装】Freeplus 芙丽芳丝 净润洗', '289', '197', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('18', '老干妈', '230', '97', 'e.jpg', '4');
INSERT INTO `goods` VALUES ('19', '包', '130', '100', 'f.jpg', '4');
INSERT INTO `goods` VALUES ('20', 'Swisse 澳洲活力胶原蛋白液', '150', '99', 'pro3.png', '4');
INSERT INTO `goods` VALUES ('21', 'Doppelherz 双心 补充毛囊防', '159', '100', 'pro4.png', '4');
INSERT INTO `goods` VALUES ('22', 'Swisse 发肤甲润泽口服液', '209', '99', 'pro5.png', '5');
INSERT INTO `goods` VALUES ('23', 'GNC 健安喜 女性胶原蛋白营养片', '115', '99', 'pro6.png', '5');
INSERT INTO `goods` VALUES ('24', 'HECH赫熙纯天然鱼子酱胶原蛋白', '200', '999', 'pro7.png', '5');
INSERT INTO `goods` VALUES ('25', 'EltaMD 氨基酸泡沫卸妆洁面乳', '119', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('26', 'Freeplus 芙丽芳丝 净润洗面霜 ', '108', '100', 'd.jpg', '4');
INSERT INTO `goods` VALUES ('27', 'SHISEIDO 资生堂 洗颜专科 超柔', '46', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('28', 'Freeplus 芙丽芳丝 净润洗面霜', '99', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('29', 'It\'S SKIN 伊思 美肌蜗牛修复洗面奶', '115', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('30', 'SHISEIDO 资生堂 洗颜专科 超柔', '99', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('31', 'SHISEIDO 资生堂 UNO 男士洗面', '44', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('32', 'Kanebo 佳丽宝 Suisai药用酵母', '115', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('33', 'SHISEIDO 资生堂 UNO 男士泡沫快', '48', '99', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('34', '电磁炉', '289', '197', 'g.jpg', '4');
INSERT INTO `goods` VALUES ('35', 'Blackmores EPO月见草', '230', '97', 'pro2.png', '4');
INSERT INTO `goods` VALUES ('36', 'Sukin苏芊 玫瑰果补湿日霜 ', '130', '100', 'pro1.png', '4');
INSERT INTO `goods` VALUES ('37', 'Swisse 澳洲活力胶原蛋白液', '150', '99', 'pro3.png', '4');
INSERT INTO `goods` VALUES ('38', 'Doppelherz 双心 补充毛囊防', '159', '100', 'pro4.png', '4');
INSERT INTO `goods` VALUES ('39', 'Swisse 发肤甲润泽口服液', '209', '99', 'pro5.png', '5');
INSERT INTO `goods` VALUES ('40', 'GNC 健安喜 女性胶原蛋白营养片', '115', '99', 'pro6.png', '5');
INSERT INTO `goods` VALUES ('41', 'HECH赫熙纯天然鱼子酱胶原蛋白', '200', '999', 'pro7.png', '5');
INSERT INTO `goods` VALUES ('42', 'EltaMD 氨基酸泡沫卸妆洁面乳', '119', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('43', 'Freeplus 芙丽芳丝 净润洗面霜 ', '108', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('44', 'SHISEIDO 资生堂 洗颜专科 超', '46', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('45', 'Freeplus 芙丽芳丝 净润洗面霜', '99', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('46', 'It\'S SKIN 伊思 美肌蜗牛修复洗面奶', '115', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('47', 'SHISEIDO 资生堂 洗颜专科 超柔', '99', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('48', 'SHISEIDO 资生堂 UNO 男士洗面', '44', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('49', 'Kanebo 佳丽宝 Suisai药用酵', '115', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('50', 'SHISEIDO 资生堂 UNO 男士泡沫', '48', '99', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('51', '【3件装】Freeplus 芙丽芳丝 净', '289', '197', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('52', 'EltaMD 氨基酸泡沫卸妆洁面乳', '119', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('53', 'Freeplus 芙丽芳丝 净润洗面霜 ', '108', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('54', 'SHISEIDO 资生堂 洗颜专科 超柔密', '46', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('55', 'Freeplus 芙丽芳丝 净润洗面霜', '99', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('56', 'It\'S SKIN 伊思 美肌蜗牛修复洗面奶', '115', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('57', 'SHISEIDO 资生堂 洗颜专科 超', '99', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('58', 'SHISEIDO 资生堂 UNO 男士洗面', '44', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('59', 'Kanebo 佳丽宝 Suisai药用酵母', '115', '100', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('60', 'SHISEIDO 资生堂 UNO 男士', '48', '99', 'pro21.png', '4');
INSERT INTO `goods` VALUES ('61', '【3件装】Freeplus 芙丽芳丝 霜', '289', '197', 'pro21.png', '4');

-- ----------------------------
-- Table structure for goods_img
-- ----------------------------
DROP TABLE IF EXISTS `goods_img`;
CREATE TABLE `goods_img` (
  `img_id` int(11) NOT NULL AUTO_INCREMENT,
  `img_path` varchar(200) DEFAULT NULL,
  `img_goods` int(11) DEFAULT NULL,
  PRIMARY KEY (`img_id`),
  KEY `img_goods` (`img_goods`),
  CONSTRAINT `goods_img_ibfk_1` FOREIGN KEY (`img_goods`) REFERENCES `goods` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_img
-- ----------------------------

-- ----------------------------
-- Table structure for goods_type
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(20) DEFAULT NULL,
  `type_pid` int(11) DEFAULT NULL,
  `type_lv` int(11) DEFAULT NULL,
  `type_path` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`type_id`),
  KEY `type_pid` (`type_pid`),
  CONSTRAINT `goods_type_ibfk_1` FOREIGN KEY (`type_pid`) REFERENCES `goods_type` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_type
-- ----------------------------
INSERT INTO `goods_type` VALUES ('1', '护肤', null, '1', '|1|');
INSERT INTO `goods_type` VALUES ('2', '个人洗护', null, '1', '|2|');
INSERT INTO `goods_type` VALUES ('3', '健康生活', null, '1', '|3|');
INSERT INTO `goods_type` VALUES ('4', '面部洗护', '1', '2', '|1|4|');
INSERT INTO `goods_type` VALUES ('5', '眼部护理', '1', '2', '|1|5|');
INSERT INTO `goods_type` VALUES ('6', '唇部护理', '1', '2', '|1|6|');
INSERT INTO `goods_type` VALUES ('7', '祛斑祛痘', '1', '2', '|1|7|');
INSERT INTO `goods_type` VALUES ('8', '手足洗护', '1', '2', '|1|8|');
INSERT INTO `goods_type` VALUES ('9', '眼部护理', '1', '2', '|1|9|');
INSERT INTO `goods_type` VALUES ('10', '防晒修复', '1', '2', '|1|10|');
INSERT INTO `goods_type` VALUES ('11', '沐浴护肤', '2', '2', '|2|11|');
INSERT INTO `goods_type` VALUES ('12', '洗发护发', '2', '2', '|2|12|');
INSERT INTO `goods_type` VALUES ('13', '口腔护理', '2', '2', '|2|13|');
INSERT INTO `goods_type` VALUES ('14', '消毒液', '3', '2', '|3|14|');
INSERT INTO `goods_type` VALUES ('15', '洗洁精', '3', '2', '|3|15|');
INSERT INTO `goods_type` VALUES ('16', '测试', '1', '2', '|1||16|');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` varchar(32) NOT NULL,
  `order_user` int(11) DEFAULT NULL,
  `order_address` varchar(200) DEFAULT NULL,
  `order_phone` varchar(11) DEFAULT NULL,
  `order_name` varchar(20) DEFAULT NULL,
  `order_status` int(11) DEFAULT NULL,
  `order_price` double DEFAULT NULL,
  `order_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `order_user` (`order_user`),
  KEY `order_status` (`order_status`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`order_user`) REFERENCES `users` (`user_id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`order_status`) REFERENCES `order_status` (`order_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('0272ab802e3a4b06bf23b876d0155f9b', '9', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '1', '150', '2019-07-13 15:02:57');
INSERT INTO `orders` VALUES ('0c6d148bb1f343d8bc37d749981fc21c', '9', '上海浦东', '15208729361', '囡囡', '1', '0', '2019-07-13 11:29:36');
INSERT INTO `orders` VALUES ('1ce469bc99054248922d19b163121121', '9', '上海浦东', '15208729361', '囡囡', '1', '360', '2019-07-11 11:06:39');
INSERT INTO `orders` VALUES ('1e57210cb9ba469bbb52929b1d6dfb8a', '14', '详细详细', '244666', 'aaa', '3', '309', '2019-07-14 15:42:42');
INSERT INTO `orders` VALUES ('1fd544ac37f64f02bd68f2abc02d85b3', '9', '武汉市', '15187289230', '朱达', '1', '350', '2019-07-14 10:24:52');
INSERT INTO `orders` VALUES ('289983fd7c1d42d09ec21bc1e9bf3dbc', '9', '武汉市', '15187289230', '朱达', '3', '130', '2019-07-11 15:21:51');
INSERT INTO `orders` VALUES ('406190105b3b4a50924f1eb4730563cb', '9', '上海浦东', '15208729361', '囡囡', '3', '749', '2019-07-14 13:18:59');
INSERT INTO `orders` VALUES ('5efd60759e00444eb46638e126a1faa4', '14', '详细详细', '244666', 'aaa', '1', '0', '2019-07-14 15:43:24');
INSERT INTO `orders` VALUES ('7660aa7a327c4ef5963b7f8d69e68c04', '9', '虢州阌乡(今河南灵宝)', '187XXXX3232', '杨玉环', '3', '669', '2019-07-11 16:01:39');
INSERT INTO `orders` VALUES ('7864c378f0a94deba3b933e03e6e8857', '9', '上海浦东', '15208729361', '囡囡', '3', '130', '2019-07-13 14:06:54');
INSERT INTO `orders` VALUES ('8215bd647f45456e87b948f8034ea23b', '9', '武汉市', '15187289230', '朱达', '1', '690', '2019-07-13 10:08:05');
INSERT INTO `orders` VALUES ('8ee8f5a185db4e0294c5c220a86ef4e3', '9', '上海浦东', '15208729361', '囡囡', '1', '130', '2019-07-13 11:28:35');
INSERT INTO `orders` VALUES ('955fe5079a8441dc967069c6709a0db3', '9', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '3', '0', '2019-07-13 14:13:55');
INSERT INTO `orders` VALUES ('b0318c1b35134406a1c88a1afd31bf8d', '9', '武汉市', '15187289230', '朱达', '1', '0', '2019-07-14 10:29:54');
INSERT INTO `orders` VALUES ('ca207216da6440c8b6b9978d9dbbfcac', '9', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '1', '690', '2019-07-13 11:12:00');
INSERT INTO `orders` VALUES ('d640be5084884519b7e68384d1b61f71', '9', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '1', '820', '2019-07-13 11:26:06');
INSERT INTO `orders` VALUES ('f29a17e7ca644470b936cb84b8b6797a', '9', '武汉市', '15187289230', '朱达', '1', '0', '2019-07-14 10:29:58');

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `detail_order` varchar(32) DEFAULT NULL,
  `detail_goods` int(11) DEFAULT NULL,
  `detail_price` float DEFAULT NULL,
  `detail_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`detail_id`),
  KEY `detail_order` (`detail_order`),
  KEY `detail_goods` (`detail_goods`),
  CONSTRAINT `order_detail_ibfk_1` FOREIGN KEY (`detail_order`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `order_detail_ibfk_2` FOREIGN KEY (`detail_goods`) REFERENCES `goods` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('20', '1ce469bc99054248922d19b163121121', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('21', '1ce469bc99054248922d19b163121121', '1', '230', '1');
INSERT INTO `order_detail` VALUES ('22', '289983fd7c1d42d09ec21bc1e9bf3dbc', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('23', '7660aa7a327c4ef5963b7f8d69e68c04', '1', '230', '1');
INSERT INTO `order_detail` VALUES ('24', '7660aa7a327c4ef5963b7f8d69e68c04', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('25', '7660aa7a327c4ef5963b7f8d69e68c04', '3', '150', '1');
INSERT INTO `order_detail` VALUES ('26', '7660aa7a327c4ef5963b7f8d69e68c04', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('27', '8215bd647f45456e87b948f8034ea23b', '1', '230', '3');
INSERT INTO `order_detail` VALUES ('29', 'ca207216da6440c8b6b9978d9dbbfcac', '1', '230', '3');
INSERT INTO `order_detail` VALUES ('31', 'd640be5084884519b7e68384d1b61f71', '1', '230', '3');
INSERT INTO `order_detail` VALUES ('32', 'd640be5084884519b7e68384d1b61f71', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('33', '8ee8f5a185db4e0294c5c220a86ef4e3', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('35', '7864c378f0a94deba3b933e03e6e8857', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('37', '0272ab802e3a4b06bf23b876d0155f9b', '3', '150', '1');
INSERT INTO `order_detail` VALUES ('38', '1fd544ac37f64f02bd68f2abc02d85b3', '3', '150', '1');
INSERT INTO `order_detail` VALUES ('39', '1fd544ac37f64f02bd68f2abc02d85b3', '7', '200', '1');
INSERT INTO `order_detail` VALUES ('40', '406190105b3b4a50924f1eb4730563cb', '1', '230', '1');
INSERT INTO `order_detail` VALUES ('41', '406190105b3b4a50924f1eb4730563cb', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('42', '406190105b3b4a50924f1eb4730563cb', '15', '115', '1');
INSERT INTO `order_detail` VALUES ('43', '406190105b3b4a50924f1eb4730563cb', '12', '115', '1');
INSERT INTO `order_detail` VALUES ('44', '406190105b3b4a50924f1eb4730563cb', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('45', '1e57210cb9ba469bbb52929b1d6dfb8a', '3', '150', '1');
INSERT INTO `order_detail` VALUES ('46', '1e57210cb9ba469bbb52929b1d6dfb8a', '4', '159', '1');

-- ----------------------------
-- Table structure for order_recipients
-- ----------------------------
DROP TABLE IF EXISTS `order_recipients`;
CREATE TABLE `order_recipients` (
  `recipients_id` int(11) NOT NULL AUTO_INCREMENT,
  `recipients_name` varchar(200) DEFAULT NULL,
  `recipients_address` varchar(200) DEFAULT NULL,
  `recipients_phone` varchar(20) DEFAULT NULL,
  `recipients_user` int(11) DEFAULT NULL,
  `recipients_checked` int(11) DEFAULT NULL,
  PRIMARY KEY (`recipients_id`),
  KEY `recipients_user` (`recipients_user`),
  CONSTRAINT `order_recipients_ibfk_1` FOREIGN KEY (`recipients_user`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_recipients
-- ----------------------------
INSERT INTO `order_recipients` VALUES ('1', '西施', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '9', '1');
INSERT INTO `order_recipients` VALUES ('2', '王昭君', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '9', '0');
INSERT INTO `order_recipients` VALUES ('3', '貂蝉', '东汉末年洛阳王司徒府', '185XXXX3344', '9', '0');
INSERT INTO `order_recipients` VALUES ('4', '杨玉环', '虢州阌乡(今河南灵宝)', '187XXXX3232', '9', '0');
INSERT INTO `order_recipients` VALUES ('5', '朱达', '武汉市', '15187289230', '9', '0');
INSERT INTO `order_recipients` VALUES ('6', '囡囡', '上海浦东', '15208729361', '9', '0');
INSERT INTO `order_recipients` VALUES ('7', 'aaa', '详细详细', '244666', '14', '0');

-- ----------------------------
-- Table structure for order_status
-- ----------------------------
DROP TABLE IF EXISTS `order_status`;
CREATE TABLE `order_status` (
  `order_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_status_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`order_status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_status
-- ----------------------------
INSERT INTO `order_status` VALUES ('1', '报关中');
INSERT INTO `order_status` VALUES ('2', '报关成功，待付款');
INSERT INTO `order_status` VALUES ('3', '付款成功，即将发货');
INSERT INTO `order_status` VALUES ('4', '已发货');
INSERT INTO `order_status` VALUES ('5', '交易成功');

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `permission_role` int(11) DEFAULT NULL,
  `permission_fun` int(11) DEFAULT NULL,
  KEY `permission_role` (`permission_role`),
  KEY `permission_fun` (`permission_fun`),
  CONSTRAINT `permissions_ibfk_1` FOREIGN KEY (`permission_role`) REFERENCES `roles` (`role_id`),
  CONSTRAINT `permissions_ibfk_2` FOREIGN KEY (`permission_fun`) REFERENCES `funs` (`fun_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permissions
-- ----------------------------
INSERT INTO `permissions` VALUES ('1', '1');
INSERT INTO `permissions` VALUES ('1', '2');
INSERT INTO `permissions` VALUES ('1', '3');
INSERT INTO `permissions` VALUES ('2', '1');
INSERT INTO `permissions` VALUES ('2', '3');
INSERT INTO `permissions` VALUES ('3', '2');
INSERT INTO `permissions` VALUES ('3', '3');

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1', '超级管理员');
INSERT INTO `roles` VALUES ('2', '基础数据管理员');
INSERT INTO `roles` VALUES ('3', '订单管理员');

-- ----------------------------
-- Table structure for shopitems
-- ----------------------------
DROP TABLE IF EXISTS `shopitems`;
CREATE TABLE `shopitems` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_goods` int(11) DEFAULT NULL,
  `item_price` double DEFAULT NULL,
  `item_num` int(11) DEFAULT NULL,
  `item_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `item_user` (`item_user`),
  KEY `item_goods` (`item_goods`),
  CONSTRAINT `shopitems_ibfk_1` FOREIGN KEY (`item_user`) REFERENCES `users` (`user_id`),
  CONSTRAINT `shopitems_ibfk_2` FOREIGN KEY (`item_goods`) REFERENCES `goods` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopitems
-- ----------------------------
INSERT INTO `shopitems` VALUES ('19', '2', '130', '1', '9');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_pass` varchar(32) DEFAULT NULL,
  `user_address` varchar(200) DEFAULT NULL,
  `user_phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'peter', '123456', '北京', '15810848579');
INSERT INTO `users` VALUES ('2', 'sun', '123456', '天津', '15810848579');
INSERT INTO `users` VALUES ('3', 'puma', '123456', '安阳', '12345678901');
INSERT INTO `users` VALUES ('5', '老张', '123456', '河南', '13298309999');
INSERT INTO `users` VALUES ('6', 'MI2', '123456', '北京海淀', '158XXXX1084');
INSERT INTO `users` VALUES ('7', '王五', '098098', '天津', '1238676');
INSERT INTO `users` VALUES ('8', 'qq', 'qq', 'qq', 'qq');
INSERT INTO `users` VALUES ('9', 'aa', 'aa', null, '15187289230');
INSERT INTO `users` VALUES ('10', 'bb', 'bb', null, '15187289230');
INSERT INTO `users` VALUES ('11', 'cc', 'cc', null, '15187289230');
INSERT INTO `users` VALUES ('12', 'dd', 'dd', null, '15187289230');
INSERT INTO `users` VALUES ('13', 'ee', 'ee', null, '15187289230');
INSERT INTO `users` VALUES ('14', '11', '11', null, '15187289230');
