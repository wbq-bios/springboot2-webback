
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for role_perm
-- ----------------------------
DROP TABLE IF EXISTS `role_perm`;
CREATE TABLE `role_perm` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `perm_id` int(32) DEFAULT NULL COMMENT '权限id',
  `role_id` int(32) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Table structure for sys_perm
-- ----------------------------
DROP TABLE IF EXISTS `sys_perm`;
CREATE TABLE `sys_perm` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `perm_name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `perm_desc` varchar(255) DEFAULT NULL COMMENT '权限描述',
  `perm_value` varchar(255) DEFAULT NULL COMMENT '权限值',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_disable` int(1) DEFAULT NULL COMMENT '是否禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限表';

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(36) NOT NULL AUTO_INCREMENT COMMENT '角色名称',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称，用于显示',
  `role_desc` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `role_value` varchar(255) DEFAULT NULL COMMENT '角色值，用于权限判断',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_disable` int(1) DEFAULT NULL COMMENT '是否禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` VALUES (1, '普通用户', '普通用户', '1', '2019-03-07 09:24:59', '2019-03-07 09:25:04', 0);
INSERT INTO `sys_role` VALUES (2, '超级管理员', '系统管理员', '2', '2019-03-07 09:24:56', '2019-03-07 09:24:58', 0);
INSERT INTO `sys_role` VALUES (3, 'vip用户', 'VIP用户', '3', '2019-03-07 09:25:32', '2019-03-07 09:25:36', 0);
COMMIT;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `delect` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user_info
-- ----------------------------
BEGIN;
INSERT INTO `user_info` VALUES (1, 'root', '123456', NULL, 0);
COMMIT;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `user_id` int(36) DEFAULT NULL COMMENT '用户ID',
  `role_id` int(36) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

SET FOREIGN_KEY_CHECKS = 1;
