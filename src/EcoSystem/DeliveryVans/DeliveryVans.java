/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.DeliveryVans;

import EcoSystem.Person.Person;
import EcoSystem.WorkQueue.WorkQueue;

/**
 *
 * @author Mustansir
 */
public class DeliveryVans {
    
    
    private double totalCapacity ;
    private WorkQueue pickupQueue;
    private WorkQueue DeliveryQueue;
    private Person driver;
    private String vanLicenceNo;
    private int counter = 100;

    public DeliveryVans() {
       this.totalCapacity = 1000;
       pickupQueue = new WorkQueue();
       DeliveryQueue = new WorkQueue();
       this.vanLicenceNo = "DV"+counter;
       counter++;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public WorkQueue getPickupQueue() {
        return pickupQueue;
    }

    public WorkQueue getDeliveryQueue() {
        return DeliveryQueue;
    }

    public String getVanLicenceNo() {
        return vanLicenceNo;
    }
    
    
    
    
}
