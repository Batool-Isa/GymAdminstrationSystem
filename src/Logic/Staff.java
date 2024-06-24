package Logic;

import java.io.Serializable;

/**
 * @author Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */
public class Staff extends Member implements Serializable {

    private String staffDepartment;
    private String staffPosition;

    /**
     * Name: Staff 
     * Purpose/description: Constructs a new instance of
     * the Staff class with the specified parameters.
     *
     * @param membershipID variable that holds the staff's ID and will be passed to Member class(Parent Class) constructor
     * @param firstName variable that holds the staff's first name and will be passed to Member class(Parent Class) constructor
     * @param surname variable that holds the staff's surname and will be passed to Member class(Parent Class) constructor
     * @param address variable that holds the staff's address and will be passed to Member class(Parent Class) constructor
     * @param dateOfBirth variable that holds the staff's date of birth and will be passed to Member class(Parent Class) constructor
     * @param phone variable that holds the staff's phone and will be passed to Member class(Parent Class) constructor
     * @param gender variable that holds the staff's gender and will be passed to Member class(Parent Class) constructor
     * @param staffDepartment variable that holds the staff's department
     * @param staffPosition variable that holds the staff's position
     * 
     */
    public Staff(int membershipID, String firstName, String surname, String address, String dateOfBirth, int phone, String gender, String staffDepartment, String staffPosition) {
        super(firstName, surname, address, dateOfBirth, phone, gender, membershipID);
        this.staffDepartment = staffDepartment;
        this.staffPosition = staffPosition;
    }
    /**
     * Name: Staff 
     * Purpose/description: default constructors that used to
     * initialize an object's state default value.
     * It initializes all instance variables to their default values
     */
    public Staff() {
        this.staffDepartment = null;
        this.staffPosition = null;
    }
    /**
     * Name: getStaffDepartment
     * Purpose/description: getter that used to retrieve
     * the value of the staff department variable.
     *
     * @return staffDepartment
     */
    public String getStaffDepartment() {
        return staffDepartment;
    }
    /**
     * Name: getStaffPosition
     * Purpose/description: getter that used to retrieve
     * the value of the staff position variable.
     *
     * @return staffPosition
     */
    public String getStaffPosition() {
        return staffPosition;
    }
    /**
     * Name: setStaffDepartment
     * Purpose/description: setter that used to set or update
     * the value of the staff department variable
     *
     * @param staffDepartment variable that holds the staff's department
     */
    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }
    /**
     * Name: setStaffPosition
     * Purpose/description: setter that used to set or update
     * the value of the staff position variable
     *
     * @param staffPosition variable that holds the staff's department
     */
    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

}//end Staff
