package com.classes;

public class BankAccount {
    private String  accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("4556",5000,"mustafa güler","mustafa.glr@hotmail.com","05");
        System.out.println("Empty constructor.");
    }

    public BankAccount(String accountNumber, long balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+ " made. New balance is "+this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if(this.balance - withdrawalAmount <=0){
            System.out.println("Only "+this.balance + " available. Withdrawal not processed");
        }else{
            this.balance -=withdrawalAmount;
            System.out.println(""+withdrawalAmount+" processed. Remaining balance "+this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
