/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Customer;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
     
    public Customer createandAddCustomer(){
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }
}
