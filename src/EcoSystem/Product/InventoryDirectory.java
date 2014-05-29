/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Product;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class InventoryDirectory {
    
    
    private ArrayList<ProductInventory> inventoryList;

    public InventoryDirectory() {
        inventoryList = new ArrayList<ProductInventory>();
    }

    public ArrayList<ProductInventory> getInventoryList() {
        return inventoryList;
    }
    
     public void increaseInventory(ProductInventory pi , int n){
         pi.setQuantity(n);
     }
    
     public ProductInventory addProductInventory(Product p){
        ProductInventory pi = new ProductInventory();
        pi.setProduct(p);
        pi.setQuantity(0);
        inventoryList.add(pi);
        return pi;
    }
    
    
}
