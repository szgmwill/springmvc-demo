CREATE TABLE `t_tianxun_module_demo` (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '����',
  `demo_biz_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'ҵ���ֶ�һ',
  `demo_biz_2` varchar(100) DEFAULT NULL COMMENT 'ҵ���ֶζ�',
  `demo_biz_3` enum('boy','girl') NOT NULL COMMENT 'ҵ���ֶ���',
  PRIMARY KEY (`pid`),
  KEY `idx_demo_biz_1` (`demo_biz_1`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='maven test demo table'