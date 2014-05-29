/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Employee;

import EcoSystem.Person.Person;

/**
 *
 * @author Mustansir
 */
public class Employee  {
    
    private Person person;
    private static int empcount = 0;
    private int employeeID;

    public Employee() {
        empcount++;
        employeeID = empcount;    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static int getEmpcount() {
        return empcount;
    }

    public static void setEmpcount(int empcount) {
        Employee.empcount = empcount;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return person.getFirstName()+" "+person.getLastName();
    }
    
    
    
    
}
