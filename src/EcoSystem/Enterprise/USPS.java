/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.DeliveryVans.DeliveryVanDirectory;
import EcoSystem.Person.Address;
import EcoSystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class USPS extends Enterprise{
    
    private DeliveryVanDirectory deliveryVanDirectory;
    private int uspsId;
    private int counter=1;
    
    public USPS(String name, Address address) {
        super(name, EnterpriseType.USPS, address);
        uspsId=counter;
        counter++;
        deliveryVanDirectory = new DeliveryVanDirectory();
    }

    

    

    public DeliveryVanDirectory getDeliveryVanDirectory() {
        return deliveryVanDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
