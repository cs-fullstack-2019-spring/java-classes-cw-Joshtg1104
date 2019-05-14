package com.company.classwork;

public class Account {
    private String customerName;
    private Integer balance;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }


    public double Deposit() {
        double deposited=0;
        return (this.balance + deposited);
    }


    public double Withdraw() {
        double withdrawn=0;
        return (this.balance - withdrawn);
    }

}
