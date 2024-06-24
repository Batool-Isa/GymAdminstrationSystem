package Logic;

import java.io.Serializable;

/**
 * @author  Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */

public class Student extends Member implements Serializable{

    private String studentMajor;
    private String studentTeam;
    /**
     * Name: Student 
     * Purpose/description: Constructs a new instance of
     * the Student class with the specified parameters.
     *
     * @param membershipID variable that holds the student's ID and will be passed to Member class(Parent Class) constructor
     * @param firstName variable that holds the student's first name and will be passed to Member class(Parent Class) constructor
     * @param surname variable that holds the student's surname and will be passed to Member class(Parent Class) constructor
     * @param address variable that holds the student's address and will be passed to Member class(Parent Class) constructor
     * @param dateOfBirth variable that holds the student's date of birth and will be passed to Member class(Parent Class) constructor
     * @param phone variable that holds the student's phone and will be passed to Member class(Parent Class) constructor
     * @param gender variable that holds the student's gender and will be passed to Member class(Parent Class) constructor
     * @param studentMajor variable that holds the student's major
     * @param studentTeam variable that holds the student's team
     * 
     */
    public Student( int membershipID, String firstName, String surname, String address, String dateOfBirth, int phone, String gender,String studentMajor, String studentTeam) {
        super(firstName, surname, address, dateOfBirth, phone, gender, membershipID);
        this.studentMajor = studentMajor;
        this.studentTeam = studentTeam;
    }
    /**
     * Name: Student 
     * Purpose/description: default constructors that used to
     * initialize an object's state default value.
     * It initializes all instance variables to their default values
     */
    public Student() {
        studentMajor = null;
        studentTeam = null;
    }
    /**
     * Name: getStudentMajor
     * Purpose/description: getter that used to retrieve
     * the value of the student major variable.
     *
     * @return studentMajor
     */
    public String getStudentMajor() {
        return studentMajor;
    }
    /**
     * Name: getStudentTeam
     * Purpose/description: getter that used to retrieve
     * the value of the student team variable.
     *
     * @return studentTeam
     */
    public String getStudentTeam() {
        return studentTeam;
    }

     /**
     * Name: setStudentMajor
     * Purpose/description: setter that used to set or update
     * the value of the student major variable
     *
     * @param studentMajor variable that holds the student's major
     */
    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

     /**
     * Name: setStudentTeam
     * Purpose/description: setter that used to set or update
     * the value of the student team variable
     *
     * @param studentTeam variable that holds the student's team
     */
    public void setStudentTeam(String studentTeam) {
        this.studentTeam = studentTeam;
    }

}//end Student
