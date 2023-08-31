package com.Husky.spring.pojo;

public class Account {
    private String accNo;
    private Double balance;

    public Account(String accNo, Double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
