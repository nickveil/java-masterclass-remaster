package com.company;


import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(1, 100, "Nick", "test@email.com","555-555-5555");
//        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.withdrawFunds(1, 15);
//        System.out.println("");
//        bankAccount.depositFunds(1, 25);
//        System.out.println("");
//        bankAccount.withdrawFunds(1, 200);
//        System.out.println("");
//        bankAccount.withdrawFunds(2, 200);
//
//        System.out.println("*******************************");
//
//        BankAccount nicksAccount = new BankAccount(2, 45,"Name","email@email.com", "888-888-8888");
//        nicksAccount.depositFunds(2, 45);

        VipCustomer vipNick = new VipCustomer("Nick Veil", 10000);

        System.out.println("Default Email = " + vipNick.getEmail());

        VipCustomer vipBob = new VipCustomer("Bob",1000, "bob@mail.com");
        System.out.println("Customer Name = " + vipBob.getName());
        System.out.println("Credit Limit = " + vipBob.getCreditLimit());
        System.out.println("Email = " + vipBob.getEmail());

        VipCustomer vipTim = new VipCustomer();
        System.out.println("*****************************");
        System.out.println("Customer Name = " + vipTim.getName());
        System.out.println("Credit Limit = " + vipTim.getCreditLimit());
        System.out.println("Email = " + vipTim.getEmail());
    }
}
