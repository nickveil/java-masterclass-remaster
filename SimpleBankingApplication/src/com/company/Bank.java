package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches ;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch (String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction (String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i=0; i<branches.size(); i++){
            Branch checkedBranches = this.branches.get(i);
            if (checkedBranches.getBranchName().equals(branchName)){
                return checkedBranches;
            }
        }
        return null;
    }

    public boolean listCustomers (String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            System.out.println("Customers details for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() +"[" + (i+1) +"]");
                if (showTransactions){
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j=0; j<transactions.size(); j++){
                        System.out.println("Transaction " + (j+1) + ": amount: $" + transactions.get(j) );
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }


}
