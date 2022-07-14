package ObjectAssignment;

import ObjectTutorial.Restaurant;

import java.util.ArrayList;

// this would have a account id a customer account type etc etc
public class BankAccount {
    //BankBalance double
    //customer Customer
    //accountNumber int

    private double bankBalance;
    private ArrayList<Customer> customerArrayList;
    private int accountNumber;

    public BankAccount(double bankBalance, ArrayList<Customer> customerArrayList, int accountNumber) {
        this.bankBalance = bankBalance;
        this.customerArrayList = customerArrayList;
        this.accountNumber = accountNumber;
    }
}