/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.UserAccount;

import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Network.Network;
import EcoSystem.Organization.Organization;
import javax.swing.JOptionPane;

/**
 *
 * @author Mustansir
 */
public class ValidateUserAccount {
    
    public static void validate(EcoSystem ecoSystem ,String username){
        if(ecoSystem.getUserAccountDirectory().validateUserName(username)){
            JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
        }
        for(Network countrynetwork : ecoSystem.getNetworkDirectory().getNetworkList()){
            for(Enterprise enterprise : countrynetwork.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getUserAccountDirectory().validateUserName(username)){
                    JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
                    return;
                }
                 
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationlist()){
                        if(organization.getUserAccountDirectory().validateUserName(username)){
                            JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
                            return;
                        }
                        
                    }               
                
            }          
                    
                               
                
            
            for(Network stateNetwork : countrynetwork.getNetworkDirectory().getNetworkList()){
                for(Enterprise enterprise: stateNetwork.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise.getUserAccountDirectory().validateUserName(username)){
                        JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
                         return;
                    }
                    
                    
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationlist()){
                            if(organization.getUserAccountDirectory().validateUserName(username)){
                                JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
                                return;
                            }
                            
                        }
                    
                    
                }
                 
                for(Network cityNetwork : stateNetwork.getNetworkDirectory().getNetworkList()){
                    for(Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise.getUserAccountDirectory().validateUserName(username)){
                            JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
                            return;
                        }
                        
                        
                            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationlist()){
                                if(organization.getUserAccountDirectory().validateUserName(username)){
                                    JOptionPane.showMessageDialog(null, "The Username Entered Already Exists in the System");
                                    return;
                                }
                                
                            }
                            
                        
                    }
                }
               
            }
            
        }

    }
    
}
