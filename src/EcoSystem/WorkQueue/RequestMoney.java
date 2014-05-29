/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import EcoSystem.BankAccount.BankAccount;

/**
 *
 * @author Mustansir
 */
public class RequestMoney extends WorkRequest {
    
    
    private  BankAccount bk;
    private int amount;

    public BankAccount getBk() {
        return bk;
    }

    public void setBk(BankAccount bk) {
        this.bk = bk;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    

   
    
    
}
