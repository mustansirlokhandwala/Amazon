/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Order;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class InvoiceDirectory {
    
    private ArrayList<Invoice> invoiceList;

    public InvoiceDirectory() {
        invoiceList = new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }
    
    public Invoice createandAddInvoice(){
        Invoice invoice = new Invoice();
        invoiceList.add(invoice);
        return invoice;
    }
    public Invoice AddInvoice(Invoice invoice){
        invoiceList.add(invoice);
        return invoice;
    }
    
}
