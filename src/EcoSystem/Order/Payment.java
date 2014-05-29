/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Order;

/**
 *
 * @author Mustansir
 */
public class Payment {
    
    public static final String FULL_PAYMENT="Full Payment ";
    public static final String PARTIAL_PAYMENT="Partial Payment";
    
    private double bill;
    private double AmountPaid = 0;
    private double partialAmount = 0;
    private String status = "Incomplete";

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getPartialAmount() {
        return partialAmount;
    }

    public void setPartialAmount(double partialAmount) {
        this.partialAmount = partialAmount;
    }

    

    public double getAmountPaid() {
        return AmountPaid;
    }

    public void setAmountPaid(double AmountPaid) {
        this.AmountPaid = AmountPaid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
