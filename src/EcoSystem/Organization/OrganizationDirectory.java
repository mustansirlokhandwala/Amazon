/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Organization;

import EcoSystem.Organization.Organization.OrganizationType;
import java.util.ArrayList;
import static org.omg.IOP.CodecPackage.TypeMismatchHelper.type;

/**
 *
 * @author Mustansir
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationlist;

    public OrganizationDirectory() {
        organizationlist = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationlist() {
        return organizationlist;
    }
    
    public Organization createOrganization(OrganizationType type ){
        Organization organization = null;
     if(type.getValue().equals(OrganizationType.SupplierLogistics.getValue())){
         organization = new SupplierLogistics();
         organizationlist.add(organization);         
     }
     else if(type.getValue().equals(OrganizationType.SupplierPackaging.getValue())){
         organization = new SupplierPackaging();
         organizationlist.add(organization);
     }
     else if(type.getValue().equals(OrganizationType.SupplierBilling.getValue())){
         organization = new SupplierBilling();
         organizationlist.add(organization);
     }
     else if (type.getValue().equals(OrganizationType.AmazonBilling.getValue())){
         organization = new AmazonBilling();
         organizationlist.add(organization);
     }
     else if(type.getValue().equals((OrganizationType.AmazonSupplierSupport.getValue()))){
         organization = new AmazonSupplierSupport();
         organizationlist.add(organization);
     }
     else if (type.getValue().equals(OrganizationType.AmazonReturnManagement.getValue())){
         organization = new AmazonReturnManagement();
         organizationlist.add(organization);
     }
     else if (type.getValue().equals(OrganizationType.WareHouseProcessing.getValue())){
         organization = new WareHouseProcessing();
         organizationlist.add(organization);
     }
     
     return organization;
    }
    
    
}
