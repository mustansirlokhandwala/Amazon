/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Organization.Organization;
import EcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Mustansir
 */
public abstract class Role {
    public enum RoleType{
        SystemAdminRole("SystemAdmin"),AmazonAdminRole("AmazonAdmin"),BankAdminRole("BankAdminRole"),SupplierAdminRole("SupplierAdmin"),
        WarehouseAdminRole("WarehouseAdmin"),SupplierBillingEmployeeRole("SupplierBillingEmployee"),SupplierLogisticsEmployeeRole("supplierLogisticsEmployee"),
        SupplierPackagingEmployeeRole("SupplierPackagingEmployee") , USPSAdminRolw("USPSAdmin") , USPSDelvieryEmployee("USPSDeliveryEmployee"),
        AmazonBillingEmployee("AmazonBillingEmployee"),AmazonReturnManagementRole("AmazonReturnManagementRole"),AmazonSupplierManagementRole ("AmazonSupplierManagement");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(EcoSystem ecosystem , JPanel userProcessContainer , Organization organization , Enterprise enterprise , UserAccount userAccount );

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
