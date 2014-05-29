/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.Enterprise.Enterprise.EnterpriseType;
import EcoSystem.Person.Address;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createandAddEnterprise(String name , EnterpriseType type , Address add){
        Enterprise enterprise = null ;
        if(type.equals(EnterpriseType.Amazon)){
            enterprise = new Amazon(name, add);
        }
        else if(type.equals(EnterpriseType.Warehouse)){
            enterprise = new WareHouse(name, add);
        }
        else if(type.equals(EnterpriseType.Supplier)){
            enterprise = new Supplier(name, add);
        }
        else if (type.equals(EnterpriseType.USPS)){
            enterprise = new USPS(name, add);
        }
        else if(type.equals(EnterpriseType.Bank)){
            enterprise = new Bank(name, add);
        }
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
    
}
