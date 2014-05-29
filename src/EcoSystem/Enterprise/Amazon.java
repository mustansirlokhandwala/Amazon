/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Customer.CustomerDirectory;
import EcoSystem.Order.InvoiceDirectory;
import EcoSystem.Order.MasterOrderList;
import EcoSystem.Person.Address;
import EcoSystem.Product.ProductType;
import EcoSystem.Role.AmazonAdminRole;
import EcoSystem.Role.CustomerRole;
import EcoSystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class Amazon extends Enterprise {
    
    private int counter = 1;
    private int amazonID;
    private String name;
    private SupplierDirectory supplierDirectory;
    private WarehouseDirectory warehouseDirectory;
    
    private CustomerDirectory customerDirectory;
    private MasterOrderList masterOrderList;
    private InvoiceDirectory CustomerInvoiceDirectory;
    private ProductType productTypeDirectory;
    private InvoiceDirectory supplierInvoiceDirectory;

    public Amazon(String name, Address add) {
        super(name,EnterpriseType.Amazon,add);
        amazonID = counter;
        counter++;
        
        supplierDirectory = new SupplierDirectory();
        warehouseDirectory = new WarehouseDirectory();
        customerDirectory = new CustomerDirectory();
        masterOrderList = new MasterOrderList();
        CustomerInvoiceDirectory = new InvoiceDirectory();
        productTypeDirectory = new ProductType();
        supplierInvoiceDirectory = new InvoiceDirectory();
        
       
    }

    public InvoiceDirectory getSupplierInvoiceDirectory() {
        return supplierInvoiceDirectory;
    }
    
    

    public ProductType getProductTypeDirectory() {
        return productTypeDirectory;
    }

    
    

    public InvoiceDirectory getCustomerInvoiceDirectory() {
        return CustomerInvoiceDirectory;
    }
    
    

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

   
    
    

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public WarehouseDirectory getWarehouseDirectory() {
        return warehouseDirectory;
    }

    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
     ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonAdminRole());
        roles.add(new CustomerRole());
        return roles;
    }
    
}
