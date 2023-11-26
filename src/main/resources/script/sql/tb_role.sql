SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色名',
  `role_label` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色描述',
  `is_disable` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否禁用  0否 1是',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

INSERT INTO `tb_role` VALUES (1, '管理员', 'admin', 0, '2021-03-22 14:10:21', '2022-01-24 01:32:26');
INSERT INTO `tb_role` VALUES (2, '用户', 'user', 0, '2021-03-22 14:25:25', '2022-01-24 01:32:21');
INSERT INTO `tb_role` VALUES (3, '测试', 'test', 0, '2021-03-22 14:42:23', '2022-01-24 01:32:59');

SET FOREIGN_KEY_CHECKS = 1;
