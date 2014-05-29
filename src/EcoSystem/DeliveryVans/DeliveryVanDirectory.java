/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.DeliveryVans;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class DeliveryVanDirectory {
    
    private ArrayList<DeliveryVans> deliveryVanList;

    public DeliveryVanDirectory() {
        deliveryVanList = new ArrayList<>();
    }

    public ArrayList<DeliveryVans> getDeliveryVanList() {
        return deliveryVanList;
    }
    
    public DeliveryVans createandAddVans(){
        DeliveryVans van = new DeliveryVans();
        deliveryVanList.add(van);
        return van;
    }
    
    
}
