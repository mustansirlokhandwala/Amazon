/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.AmazonSupplierManagementEmployee;
import EcoSystem.Role.Role;
import EcoSystem.Role.SupplierBillingEmployeeRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class AmazonSupplierSupport extends Organization{

    public AmazonSupplierSupport() {
        super(OrganizationType.AmazonSupplierSupport.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonSupplierManagementEmployee());
        return roles;
    }
    
}
