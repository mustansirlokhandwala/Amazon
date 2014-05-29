/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Person;

import EcoSystem.GeoConverting.AddressConverter;
import javax.swing.JOptionPane;

/**
 *
 * @author Mustansir
 */
public class Address {
    
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private int zipCode;
    private double longitude;
    private double latitude;

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public Address() {
        
        
    }

    
    
    

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    

    @Override
    public String toString() {
        return  streetAddress+","+city+","+state+","+country+","+String.valueOf(zipCode);
                
    }
           
            
    
}
