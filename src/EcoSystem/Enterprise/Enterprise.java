/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Organization.Organization;
import EcoSystem.Organization.OrganizationDirectory;
import EcoSystem.Person.Address;

/**
 *
 * @author Mustansir
 */
public abstract class Enterprise extends Organization {
    
    public  enum EnterpriseType{
        Amazon("AMAZON"),Bank("Bank"),Supplier("Supplier"),USPS("USPS"),Warehouse("Warehouse");
        
        private String type;

        private EnterpriseType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
        
        public String toString(){
            return type;
        }
    }
    
    public static int enterpriseCounter;
    private int enterpriseID  ;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Address address;
    private String name;

    public Address getAddress() {
        return address;
    }
    

    public Enterprise(String name , EnterpriseType type , Address address) {
        super(name);
        enterpriseType = type;
        this.address = address;
        this.name = name;
        this.enterpriseID=enterpriseCounter;
        
        organizationDirectory = new OrganizationDirectory();
        
        enterpriseCounter++;
                
        
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(int enterpriseID) {
        this.enterpriseID = enterpriseID;
    }
    
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
    
    
    
}
