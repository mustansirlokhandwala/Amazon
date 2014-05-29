/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Organization.Organization;
import EcoSystem.UserAccount.UserAccount;
import UserInterface.AmazonReturnEmployeeRole.ReturnEmployeeWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Mustansir
 */
public class AmazonReturnManagementRole extends Role {

    @Override
    public JPanel createWorkArea(EcoSystem ecosystem, JPanel userProcessContainer, Organization organization, Enterprise enterprise, UserAccount userAccount) {
        return new ReturnEmployeeWorkArea((Amazon)enterprise, userAccount, userProcessContainer);
    }
    
}
