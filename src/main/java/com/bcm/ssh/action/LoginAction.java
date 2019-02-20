package com.bcm.ssh.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @program: structsmaven
 * @description:
 * @author: beichunming
 * @create: 2019-01-31 15:23
 **/
public class LoginAction extends ActionSupport {

    public static final long serialVersionUID = 1L;
    // 使用  Action 来封装 HTTP 请求参数
    private String username;
    private String password;
    // getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 处理用户请求的逻辑

    @Override
    public String execute() throws Exception {
        if ("root".equals(username) && "root".equals(password)){
            System.out.println("login success");
            return "success";
        }else if("".equals(username) || "".equals(password)){
            System.out.println("u or p is empty");
            return "input";
        }else{
            System.out.println("login failed");
            return "error";
        }
    }

}
