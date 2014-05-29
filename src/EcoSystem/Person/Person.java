/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Person;

/**
 *
 * @author Mustansir
 */
public class Person {
    private static int personCount = 0;
    private int personID;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private int ssn;
    private String dateOfBirth;

    public Person() {
        personCount++;
        personID = personCount;
                
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPersonID() {
        return personID;
    }

    @Override
    public String toString() {
        return firstName+lastName;
    }
    
    
    
    
    
    
    
            
}
