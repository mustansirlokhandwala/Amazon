/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Employee.EmployeeDirectory;
import EcoSystem.Role.Role;
import EcoSystem.UserAccount.UserAccountDirectory;
import EcoSystem.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public abstract class Organization {
    
    public enum OrganizationType{
    
        SupplierLogistics("Supplier Logistics"),
        SupplierBilling("Supplier Billing"),
        SupplierPackaging("Supplier Packaging"),
        AmazonBilling("Amazon Billing"),
        AmazonSupplierSupport("Amazon Supplier Suppoer"),
        AmazonReturnManagement("Amazon Return Management"),
        USPSDeliveryRole("USPS Delivery Role"),
        WareHouseProcessing("WareHouse Processing");
        
        
        private String value;

        private OrganizationType(String type) {
            this.value = type;
        }

        public String getValue() {
            return value;
        }
        
        
        
        public String toString(){
            return value;
        }  
    
}
    
    private static int orgcount;
   private int organizationID;
   private EmployeeDirectory employeeDirectory;
   private UserAccountDirectory userAccountDirectory;
   private String name;
   private WorkQueue workQueue;

    public Organization(String name) {
        this.name = name ;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        organizationID = orgcount;
        ++orgcount;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    @Override
    public String toString() {
        return name;
    }
    
   
    
}
