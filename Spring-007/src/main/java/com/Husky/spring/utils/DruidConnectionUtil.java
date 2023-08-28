package com.Husky.spring.utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DruidConnectionUtil {
    private static String Driver;
    private static String Url;
    private static String UserName;
    private static String Password;
    private static Connection conn;

    public void setDriver(String driver) {
        Driver = driver;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }
    static DruidDataSource druidDataSource=new DruidDataSource();

    static {
        ResourceBundle rb=ResourceBundle.getBundle("jdbc");
        Driver=rb.getString("driver");
        Url=rb.getString("url");
        UserName=rb.getString("uName");
        Password=rb.getString("password");
        druidDataSource.setDriverClassName(Driver);
        druidDataSource.setUrl(Url);
        druidDataSource.setUsername(UserName);
        druidDataSource.setPassword(Password);
    }
    static {
    druidDataSource.setDriverClassName(Driver);
    druidDataSource.setUrl(Url);
    druidDataSource.setUsername(UserName);
    druidDataSource.setPassword(Password);
}

    public static Connection getConnection(){
        try {
            conn=druidDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public Connection getConnection1(){
        try {
            conn=druidDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
