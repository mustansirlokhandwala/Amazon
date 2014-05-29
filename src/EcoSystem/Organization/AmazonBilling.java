/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.AmazonBillingEmployee;
import EcoSystem.Role.Role;
import EcoSystem.Role.SupplierBillingEmployeeRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class AmazonBilling extends Organization {

    public AmazonBilling() {
        super(OrganizationType.AmazonBilling.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonBillingEmployee());
        return roles;
    }
    
}
