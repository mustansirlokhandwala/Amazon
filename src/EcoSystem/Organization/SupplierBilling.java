/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.AmazonAdminRole;
import EcoSystem.Role.CustomerRole;
import EcoSystem.Role.Role;
import EcoSystem.Role.SupplierBillingEmployeeRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class SupplierBilling extends Organization{

    public SupplierBilling() {
        super(OrganizationType.SupplierBilling.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierBillingEmployeeRole());
        return roles;
    }
    
}
