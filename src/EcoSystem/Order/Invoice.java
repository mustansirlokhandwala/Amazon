/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Order;

import EcoSystem.Customer.Customer;

/**
 *
 * @author Mustansir
 */
public class Invoice {
    private static int count = 0;
    private int invoiceNumber;
    
    private double total;            
    private Payment payment;
    private Order order;
    private Customer customer;
    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    private boolean paid;

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

   

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
    
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Invoice() {
        ++count;
        invoiceNumber = count;
        this.payment = new Payment();
        
    }
    
    

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    @Override
    public String toString(){
        return String.valueOf(invoiceNumber);
    }
    
}
