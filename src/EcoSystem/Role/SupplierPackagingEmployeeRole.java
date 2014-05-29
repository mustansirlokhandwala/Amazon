/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Enterprise.Supplier;
import EcoSystem.Organization.Organization;
import EcoSystem.Organization.SupplierPackaging;
import EcoSystem.UserAccount.UserAccount;
import UserInterface.SupplierPackagingRole.SupplierPackagingEmployeeWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Mustansir
 */
public class SupplierPackagingEmployeeRole extends Role {

    @Override
    public JPanel createWorkArea(EcoSystem ecosystem, JPanel userProcessContainer, Organization organization, Enterprise enterprise, UserAccount userAccount) {
        return new SupplierPackagingEmployeeWorkArea((Supplier)enterprise, userAccount,(SupplierPackaging)organization, userProcessContainer,ecosystem);
    }
    
}
