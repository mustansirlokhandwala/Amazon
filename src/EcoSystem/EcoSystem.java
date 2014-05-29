/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem;

import EcoSystem.BankAccount.BankAccountDirectory;
import EcoSystem.Network.NetworkDirectory;
import EcoSystem.Organization.Organization;
import EcoSystem.Person.PersonDirectory;
import EcoSystem.Role.Role;
import EcoSystem.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class EcoSystem  extends Organization{

    private static EcoSystem system;
    private NetworkDirectory networkDirectory;
    private PersonDirectory personDirectory;
    
   
    
    public static EcoSystem getInstance(){
        if (system == null){
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        super(null);
        networkDirectory = new NetworkDirectory();
        personDirectory = new PersonDirectory();
        
        
    }

    
    
    
         

  
    
    

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    
    
    

   

    @Override
    public ArrayList<Role> getSupportedRole() {
        SysAdminRole role = new SysAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }
    
    public void validateUserAccount(String username){
        
    }
       
    
}
