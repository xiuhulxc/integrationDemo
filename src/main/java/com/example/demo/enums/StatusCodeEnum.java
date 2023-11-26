package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 接口状态码枚举
 * @author Loco.Li
 * @date: 2023/11/26 18:54
 **/
@Getter
@AllArgsConstructor
public enum StatusCodeEnum {
    SUCCESS(20000, "操作成功"),

    NO_LOGIN(40001, "用户未登录"),
    ERROR_PASSWORD(40002,"用户帐号或者密码错误"),
    AUTHORIZED(40003, "没有操作权限"),
    DISABLE_ACCOUNT(40004,"帐号已被禁用"),
    EMAIL_EXIST(40005,"该邮箱已注册，请直接登录!"),
    USERNAME_EXIST(40006, "用户名已存在"),
    USERNAME_NOT_EXIST(40007, "用户不存在"),
    NO_PERMISSION(40008,"无权限"),
    EXCEPTION_MOBILE_CODE(40009,"验证码不正确或已过期，请重新输入"),

    SYSTEM_ERROR(50000, "未知系统异常"),
    FAIL(51000, "操作失败"),
    VALID_ERROR(52000, "参数格式不正确");
    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 描述
     */
    private final String desc;

}
