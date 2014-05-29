/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.Role;
import EcoSystem.Role.USPSDeliveryEmployeeRole;
import EcoSystem.Role.WareHouseProcessingRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class WareHouseProcessing extends Organization{

    public WareHouseProcessing() {
        super(OrganizationType.WareHouseProcessing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WareHouseProcessingRole());
        return roles;
    }
    
}
