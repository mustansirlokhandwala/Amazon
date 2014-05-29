/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Order;

import EcoSystem.Product.Product;
import EcoSystem.Product.ProductInventory;
import java.text.DecimalFormat;

/**
 *
 * @author Mustansir
 */
public class OrderItem {
    //private Product product;
    private int quantity;
    private ProductInventory productInventory;
    

    public ProductInventory getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(ProductInventory productInventory) {
        this.productInventory = productInventory;
    }

    
    
   /* public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }*/

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
    public double Price(){
        double price = productInventory.getProduct().getProductPrice() * quantity;
        DecimalFormat df = new DecimalFormat("#.00");
        double formattedprice=Double.parseDouble(df.format(price));
        return formattedprice;
    }

    @Override
    public String toString() {
        return productInventory.getProduct().getName();
    }
    
    
}
