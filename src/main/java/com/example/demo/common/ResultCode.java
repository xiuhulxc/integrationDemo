package com.minzheng.blog.common;


/**
 * @author: Loco Li
 * @description:
 * 错误码和错误信息定义类
 *      1. 错误码定义规则为 5 位数字
 *      2. 前两位表示业务场景，最后三位表示错误码。例如：100001。10:通用 001:系统未知异常
 * 错误码列表：
 *      10: 通用
 *              001：参数格式校验
 *              002：短信验证码频率太高
 *      11: 用户
 *
 * @date: 2023/11/26 18:54
 */
public enum ResultCode {

    //成功
    SUCCESS( 200, "SUCCESS" ),
    //失败
    FAILURE( 500, "FAILURE" ),

    // 系统级别错误码
    ERROR_DEFAULT(10001,"系统繁忙，请稍后重试"),
    PARAMS_ILLEGAL(10002,"参数不合法"),

    //2.权限层面
    NOT_LOGIN(11000, "请先登录"),
    MUST_REGISTER(11001,"请先注册帐号"),
    ERROR_PASSWORD(11002,"用户帐号或者密码错误"),
    DISABLE_ACCOUNT(11003,"帐号已被禁用!"),
    USER_NOT_EXIST(11004, "用户不存在"),
    EMAIL_EXIST(11005,"该邮箱已注册，请直接登录!"),
    NO_PERMISSION(11006,"无权限"),
    EXCEPTION_MOBILE_CODE(11007,"验证码不正确或已过期，请重新输入");

    public int code;
    public String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
