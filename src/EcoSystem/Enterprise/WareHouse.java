/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Person.Address;
import EcoSystem.Role.Role;
import EcoSystem.Role.WarehouseAdmin;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class WareHouse extends Enterprise {
    private Address address;
    private int wareHouseID;
    private int counter=1;
            

    public WareHouse(String name, Address add) {
        super(name, EnterpriseType.Warehouse,add);
        address = add;
        this.wareHouseID = counter;
        counter++;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WarehouseAdmin());
        return roles;
    }
   
}
