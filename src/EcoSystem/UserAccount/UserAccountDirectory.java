/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount createandAddUserAccount(){
        UserAccount ua = new UserAccount();
        userAccountList.add(ua);
        return ua;
        
    }
    
    public UserAccount authenticateUser(String username , String password){
        for(UserAccount ua : userAccountList){
            if(ua.getUserName().equals(username)){
                if(ua.getPassword().equals(password)){
                    return ua;
                }
            }
        }
        return null;
    }
    
    public boolean validateUserName (String username){
        for(UserAccount ua : userAccountList){
            if(ua.getUserName().equals(username)){
                return true;
            }
        }
            
        return false;
    }
    
        
    
}
