/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Enterprise;

import EcoSystem.BankAccount.BankAccountDirectory;
import EcoSystem.Person.Address;
import EcoSystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class Bank extends Enterprise{
    private Address address;
    private BankAccountDirectory bankAccountDirectory;
    private int bankId;
    private int counter=1;

    public Bank(String name, Address add) {
        super(name, EnterpriseType.Bank,add);
        address = add;
        bankId = counter;
        counter++;                
        bankAccountDirectory = new BankAccountDirectory();
    }

    public Address getAddress() {
        return address;
    }

    public BankAccountDirectory getBankAccountDirectory() {
        return bankAccountDirectory;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
