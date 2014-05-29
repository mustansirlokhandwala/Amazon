/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.BankAccount;

import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Person.Person;
import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author Mustansir
 */
public class BankAccount {
    private int bankAccountNumber;
    private Person person;
    private Enterprise enterprise;
    private double bankBalance ;
    private int counter;
    private ArrayList<Transaction> transactionList;
    
    
    public BankAccount() {
       Random random = new Random();
       counter = 100000000 + random.nextInt(900000000);
       bankAccountNumber  = counter;
       this.transactionList = new ArrayList<>();
       
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    
    
    
    
    
}
