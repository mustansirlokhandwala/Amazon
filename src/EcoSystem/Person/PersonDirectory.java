/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Person;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    
    public Person createAndAddPerson(){
        Person p = new Person();
        personList.add(p);
        return p;
    }
    
    public Person searchPerson(int personID){
        for(Person p : personList){
            if(p.getPersonID() == personID){
                return p;
            }
            
        }
        return null;
    }
    
    
    
}
