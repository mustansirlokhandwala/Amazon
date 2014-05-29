/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Role.AmazonReturnManagementRole;
import EcoSystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class AmazonReturnManagement extends Organization{

    public AmazonReturnManagement() {
        super(OrganizationType.AmazonReturnManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonReturnManagementRole());
        return roles;
    }
    
}
