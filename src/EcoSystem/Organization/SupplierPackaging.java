/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.AmazonAdminRole;
import EcoSystem.Role.CustomerRole;
import EcoSystem.Role.Role;
import EcoSystem.Role.SupplierPackagingEmployeeRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class SupplierPackaging extends Organization {

    public SupplierPackaging() {
        super(OrganizationType.SupplierPackaging.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierPackagingEmployeeRole());
        
        return roles;
    }
    
}
