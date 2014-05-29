/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import EcoSystem.Enterprise.Supplier;
import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author Mustansir
 */
public class SupplierRequest extends WorkRequest {
    
    private Supplier supplier;
    private int requestID;
    private UserAccount ua;
    private int counter = 1;

    public SupplierRequest() {
        this.requestID = counter;
        counter++;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    

    public int getRequestID() {
        return requestID;
    }
    
    

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
    
}
