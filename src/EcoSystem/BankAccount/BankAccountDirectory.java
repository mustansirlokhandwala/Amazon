/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.BankAccount;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mustansir
 */
public class BankAccountDirectory {
    
    private ArrayList<BankAccount> bankAccountList;

    public BankAccountDirectory() {
        bankAccountList = new ArrayList<BankAccount>();
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
    
    public BankAccount createandAddBankAccount(){
        BankAccount bk = new BankAccount();
        bankAccountList.add(bk);
        return bk;
    }
    
    public void performtransaction(Transaction transaction){
        BankAccount credit = transaction.getCreditAccount();
        BankAccount debit = transaction.getDebitAccount();
        Double amount = transaction.getAmount();
        credit.setBankBalance(credit.getBankBalance()+amount);
        debit.setBankBalance(debit.getBankBalance() - amount);
        
    }
    
    public void peformBanktransaction(Transaction transaction){
        BankAccount credit = transaction.getCreditAccount();
        Double amount = transaction.getAmount();
        credit.setBankBalance(credit.getBankBalance()+amount);
    }
    
    
}
