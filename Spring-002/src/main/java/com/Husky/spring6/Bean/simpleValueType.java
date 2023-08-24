package com.Husky.spring6.Bean;

import java.util.Date;

public class simpleValueType {
    private char c;
    private Character c2;

    private byte b;
    private Byte b2;

    private int i;
    private Integer i2;

    private String str;

    private Season season;

    private Date date;

    private Class clazz;

    public void setC(char c) {
        this.c = c;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public void setB2(Byte b2) {
        this.b2 = b2;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setI2(Integer i2) {
        this.i2 = i2;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "simpleValueType{" +
                "c=" + c +
                ", c2=" + c2 +
                ", b=" + b +
                ", b2=" + b2 +
                ", i=" + i +
                ", i2=" + i2 +
                ", str='" + str + '\'' +
                ", season=" + season +
                ", date=" + date +
                ", clazz=" + clazz +
                '}';
    }
}
