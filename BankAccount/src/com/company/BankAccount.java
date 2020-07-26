package com.company;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1, 0.00, "Default Name", "Default email", "Default phone number");
    }

    public BankAccount(long accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(1, 100,name, email, phoneNumber);
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds (long accountNumber, double depositAmount){
        if (accountNumber == this.accountNumber){
            double newBalance = this.balance += depositAmount;
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Customer Name: " + this.name);
            System.out.println("Email: " + this.email);
            System.out.println("Phone Number: " + this.phoneNumber);
            System.out.println("********************");
            System.out.println("Deposit amount: $" + depositAmount);
            System.out.println("New Balance = $" + newBalance);

        }else{
            System.out.println("Sorry the account number entered does not match the account on file. Please review the account number try again.");
        }

    }

    public void withdrawFunds ( long accountNumber, double withdrawAmount){
        if (accountNumber == this.accountNumber){
            if ( withdrawAmount < this.balance){
                double newBalance = this.balance -= withdrawAmount;
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Customer Name: " + this.name);
                System.out.println("Email: " + this.email);
                System.out.println("Phone Number: " + this.phoneNumber);
                System.out.println("********************");
                System.out.println("Amount Withdrawn: $" + withdrawAmount);
                System.out.println("New Balance = $" + newBalance);
            }else{
                System.out.println("Sorry, the amount $" + withdrawAmount + " is not available to withdraw. Your account has a balance of $" + this.balance + ".");
            }

        }else{
            System.out.println("Sorry the account number entered does not match the account on file. Please review the account number try again.");
        }
    }
}

