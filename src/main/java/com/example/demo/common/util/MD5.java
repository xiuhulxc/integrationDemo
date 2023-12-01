package com.example.demo.common.util;

import java.security.MessageDigest;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/12/1 10:55
 * @version: 1.0
 */
public class MD5 {

    public static String getMD5(String str) {
        try {
            // 创建一个 MessageDigest 对象
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 将字符串转换成字节数组
            byte[] bytes = str.getBytes();

            // 计算 MD5 哈希值
            byte[] md5 = md.digest(bytes);

            // 将 MD5 哈希值转换成 16 进制字符串
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < md5.length; i++) {
                sb.append(Integer.toHexString((md5[i] & 0xFF) | 0x100).substring(1, 3));
            }

            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
