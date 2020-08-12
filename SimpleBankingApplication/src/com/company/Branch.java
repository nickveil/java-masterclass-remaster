package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<String> customers = new ArrayList<String>();
    private String branchName;

    public Branch(ArrayList<String> customers, String branchName) {
        this.customers = customers;
        this.branchName = branchName;
    }

    public ArrayList<String> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer( String customerName, ArrayList<Double> initialDeposit, String branch){
        Customer newCustomer = new Customer(customerName, initialDeposit, branch);
        customers.add(customerName);

    }

}
