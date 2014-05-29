/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Person.Address;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    public Supplier createandAddSupplier(String name , Address add){
        Supplier s = new Supplier(name, add);
        supplierList.add(s);
        return s;
    }
    
    
    
    
}
