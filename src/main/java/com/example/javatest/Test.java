package com.example.javatest;

/**
 * 编写一个登录界面，要求帐户名只能由 1 至 10 位数字组成，密码只能有 6 位，任何不符
 * 合帐户名和密码要求的情况都视为异常，必须捕获并处理异常
 */
public class Test {

    public static void main(String[] args) {

        try {
            login("123");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void login(String username) throws Exception {
        if (username.isEmpty() || username.length() != 6 || !username.matches("\\d")) {
            throw new Exception("账户不符合规则");
        }
    }


}














