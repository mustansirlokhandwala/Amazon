/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Customer;

import EcoSystem.Order.InvoiceDirectory;
import EcoSystem.Order.MasterOrderList;
import EcoSystem.Order.Order;
import EcoSystem.Order.OrderItem;
import EcoSystem.Person.Person;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class Customer {
    
    private Person person;
    private static int cuscount = 0;
    private int customerId;
    private Order cart;
    private Order savedCart;
    private MasterOrderList masterOrderList;
    private InvoiceDirectory invoiceDirectory;
    private ArrayList<OrderItem> returnOrderItemList;
    

    public Customer() {
        cuscount++;
        customerId = cuscount;
        cart = new Order();
        savedCart = new Order();
        masterOrderList = new MasterOrderList();
        invoiceDirectory = new InvoiceDirectory();
        returnOrderItemList = new ActivatableArrayList<>();
    }

    public ArrayList<OrderItem> getReturnOrderItemList() {
        return returnOrderItemList;
    }

    
    

    public Order getCart() {
        return cart;
    }

    public Order getSavedCart() {
        return savedCart;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public InvoiceDirectory getInvoiceDirectory() {
        return invoiceDirectory;
    }
    
    
   

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static int getCuscount() {
        return cuscount;
    }

    public static void setCuscount(int cuscount) {
        Customer.cuscount = cuscount;
    }

    public int getCustomerId() {
        return customerId;
    }

   
    
    
    
}
