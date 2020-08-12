package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String bankName, ArrayList<Branch> branches) {
        this.bankName = bankName;
        this.branches = branches;
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch (Branch branchName){
        branches.add(branchName);
    }
}
