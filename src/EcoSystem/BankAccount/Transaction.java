/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.BankAccount;

/**
 *
 * @author Mustansir
 */
public class Transaction {
    
    
    private BankAccount creditAccount;
    private BankAccount debitAccount;
    private double Amount;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public BankAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(BankAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public BankAccount getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(BankAccount debitAccount) {
        this.debitAccount = debitAccount;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    
    
}
