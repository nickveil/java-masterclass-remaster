package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Union Bank");

	    bank.addBranch("Old Chenny");
	    bank.addCustomer("Old Chenny", "Mike", 50.03);
        bank.addCustomer("Old Chenny", "Carter", 78.43);
        bank.addCustomer("Old Chenny", "Hannah", 1000.67);
        bank.addCustomerTransaction("Old Chenny", "Hannah", 25.44);
        bank.addCustomerTransaction("Old Chenny", "Mike", 54.44);
        bank.addCustomerTransaction("Old Chenny", "Carter", 25.76);
        bank.addCustomerTransaction("Old Chenny", "Hannah", 33.44);
        bank.addCustomerTransaction("Old Chenny", "Hannah", 25.55);


        bank.addBranch("Stacy Lane");
        bank.addCustomer("Stacy Lane", "John",54.56);
        bank.addCustomerTransaction("Stacy Lane", "John", 25.43);


        bank.addCustomerTransaction("Old Chenny","John", 45.33);

        bank.listCustomers("Old Chenny",true);
        bank.listCustomers("Stacy Lane",false);
        
    }
}
