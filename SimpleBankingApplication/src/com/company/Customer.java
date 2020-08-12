package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String branch;

    public Customer(String name, ArrayList<Double> transactions, String branch) {
        this.customerName = name;
        this.transactions = transactions;
        this.branch = branch;
    }

    public String getName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getBranch() {
        return branch;
    }

}
