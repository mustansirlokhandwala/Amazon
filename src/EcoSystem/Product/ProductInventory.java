/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Product;

/**
 *
 * @author Mustansir
 */
public class ProductInventory {
    
    private Product product;
    private int quantity = 0;
    //private String batchNo;
    private int counter=1;

    public ProductInventory() {
        //batchNo = "B"+counter;
        //counter++;
        
    }

    /*public String getBatchNo() {
        return batchNo;
    }*/

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = this.quantity+quantity;
    }

    @Override
    public String toString() {
        return product.getName();
    }
    
   
    
    
    
    
    
    
    
}
