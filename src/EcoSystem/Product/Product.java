/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Product;

import EcoSystem.Enterprise.Supplier;
import java.awt.Image;

/**
 *
 * @author Mustansir
 */
public class Product {
    
    private String name;
    private Supplier productCompany;
    private int productID;
    private static int productCounter;
    private double productPrice;
    private String productType;
    private Image productImage;
    private double productVolume;

    public Product() {
        productCounter++;
        productID = productCounter;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public double getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(double productVolume) {
        this.productVolume = productVolume;
    }

    public int getProductID() {
        return productID;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(Supplier productCompany) {
        this.productCompany = productCompany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
    
    
}
