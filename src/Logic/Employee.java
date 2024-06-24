package Logic;

import java.io.Serializable;

/**
 * @author  Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */
public class Employee implements Serializable {

    private String firstName;
    private String surname;
    private String address;
    private int phone;
    private double salary;
    private int employeeID;

    /**
     * Name: Employee 
     * Purpose/description: custom constructors that used to
     * initialize an object using value passed as arguments
     *
     * @param firstName variable that holds the employee's first name
     * @param surname variable that holds the employee's surname
     * @param address variable that holds the employee's address
     * @param phone variable that holds the employee's phone
     * @param salary variable that holds the employee's salary
     * @param employeeID variable that holds the employee's ID
     */
    public Employee(String firstName, String surname, String address, int phone, double salary, int employeeID) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    /**
     * Name: Employee 
     * Purpose/description: default constructors that used to
     * initialize an object's state default value.
     * It initializes all instance variables to their default values
     */
    public Employee() {
        this.firstName = null;
        this.surname = null;
        this.address = null;
        this.phone = 0;
        this.salary = 0;
        this.employeeID = 0;
    }

    /**
     * Name: setFirstName
     * Purpose/description: setter that used to set or update
     * the value of the first name variable
     *
     * @param firstName variable that holds the employee's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Name: setSurname 
     * Purpose/description: setter that used to set or update
     * the value of the surname variable
     *
     * @param surname variable that holds the employee's surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Name: setAddress 
     * Purpose/description: setter that used to set or update
     * the value of the address variable
     *
     * @param address variable that holds the employee's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Name: setPhone 
     * Purpose/description: setter that used to set or update the
     * value of the phone variable
     *
     * @param phone variable that holds the employee's phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Name: setPhone 
     * Purpose/description: setter that used to set or update the
     * value of the salary variable
     *
     * @param salary variable that holds the employee's salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
     /**
     * Name: setEmployeeID 
     * Purpose/description: setter that used to set or update the
     * value of the ID variable
     *
     * @param employeeID variable that holds the employee's ID
     */

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

     /**
     * Name: getFirstName 
     * Purpose/description: getter that used to retrieve the
     * value of the first name variable.
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
     /**
     * Name: getSurname 
     * Purpose/description: getter that used to retrieve the
     * value of the surname variable.
     *
     * @return surName
     */

    public String getSurname() {
        return surname;
    }
    
     /**
     * Name: getAddress 
     * Purpose/description: getter that used to retrieve the
     * value of the address variable.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }
    
     /**
     * Name: getPhone 
     * Purpose/description: getter that used to retrieve the
     * value of the phone variable.
     *
     * @return phone
     */
    public int getPhone() {
        return phone;
    }

     /**
     * Name: getSalary 
     * Purpose/description: getter that used to retrieve the
     * value of the salary variable.
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }
    
     /**
     * Name: getEmployeeID 
     * Purpose/description: getter that used to retrieve the
     * value of the ID variable.
     *
     * @return employeeID
     */ 
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     *
     * @return string that consists of Employee's ID, First and Last Name
     */
    @Override
    public String toString() {
        return +this.getEmployeeID() + " " + this.getFirstName() + " " + this.getSurname();
    }

}//end Employee
