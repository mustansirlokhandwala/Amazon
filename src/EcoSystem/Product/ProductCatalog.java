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
public class ProductCatalog {
    
    private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    public Product createandAddProduct(){
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
}
