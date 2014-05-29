/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.Role;
import EcoSystem.Role.SupplierLogisticsEmployeeRole;
import EcoSystem.Role.SupplierPackagingEmployeeRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class SupplierLogistics extends Organization{

    public SupplierLogistics() {
        super(OrganizationType.SupplierLogistics.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierLogisticsEmployeeRole());
        
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
