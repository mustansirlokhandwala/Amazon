/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Order.InvoiceDirectory;
import EcoSystem.Order.MasterOrderList;
import EcoSystem.Person.Address;
import EcoSystem.Role.Role;
import EcoSystem.Product.InventoryDirectory;
import EcoSystem.Product.ProductCatalog;
import EcoSystem.Role.AmazonAdminRole;
import EcoSystem.Role.CustomerRole;
import EcoSystem.Role.SupplierAdmin;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class Supplier extends Enterprise {
    
    private ProductCatalog productCatalog;
    private InventoryDirectory inventoryList;
    private MasterOrderList masterOrderList;
    private InvoiceDirectory invoiceDirectory;
    
    private int supplierId;
    private int counter=1;
    private double rating = 10 ;
    

    public Supplier(String name, Address add) {
        super(name, EnterpriseType.Supplier,add);
        supplierId = counter;
        counter++;
       
        productCatalog = new ProductCatalog();
        inventoryList = new InventoryDirectory();
        masterOrderList = new MasterOrderList();
        invoiceDirectory = new InvoiceDirectory();
        
    }

    public void setRating(double rating) {
        this.rating = (this.rating+rating)/2;
    }

    public InvoiceDirectory getInvoiceDirectory() {
        return invoiceDirectory;
    }

    public double getRating() {
        return rating;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public InventoryDirectory getInventoryList() {
        return inventoryList;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierAdmin());
        
        return roles;
    }
    
   
    
}
