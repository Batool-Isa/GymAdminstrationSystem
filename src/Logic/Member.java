package Logic;

import java.io.Serializable;

/**
 * @author Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */
public class Member implements Serializable {

    private String firstName;
    private String surname;
    private String address;
    private String dateOfBirth;
    private int phone;
    private String gender;
    private int membershipID;
    private int PtID;
    private boolean hasPt;

    /**
     * Name: Member
     * Purpose/description: custom constructors that used to
     * initialize an object using value passed as arguments
     *
     * @param firstName variable that holds the member's first name
     * @param surname variable that holds the member's surname
     * @param address variable that holds the member's address
     * @param dateOfBirth variable that holds the member's date of birth
     * @param phone variable that holds the member's phone
     * @param gender variable that holds the member's gender
     * @param membershipID variable that holds the member's ID
     */
    public Member(String firstName, String surname, String address, String dateOfBirth, int phone, String gender, int membershipID) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
        this.membershipID = membershipID;
        this.hasPt = false;
    }

    /**
     * Name: Member
     * Purpose/description: default constructors that used to
     * initialize an object's state default value. It initializes all instance
     * variables to their default values.
     */
    public Member() {
        this.firstName = null;
        this.surname = null;
        this.address = null;
        this.dateOfBirth = null;
        this.phone = 0;
        this.gender = null;
        this.membershipID = 0;
        this.hasPt = false;
    }

    /**
     * Name: setFirstName
     * Purpose/description: setter that used to set or update
     * the value of the first name variable
     *
     * @param firstName variable that holds the member's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Name: setSurname
     * Purpose/description: setter that used to set or update
     * the value of the surname variable
     *
     * @param surname variable that holds the member's surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Name: setAddress
     * Purpose/description: setter that used to set or update
     * the value of the address variable
     *
     * @param address variable that holds the member's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Name: setDateOfBirth
     * Purpose/description: setter that used to set or
     * update the value of the date of birth variable
     *
     * @param dateOfBirth variable that holds the member's date of birth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Name: setPhone
     * Purpose/description: setter that used to set or update the
     * value of the phone variable
     *
     * @param phone variable that holds the member's phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Name: setGender
     * Purpose/description: setter that used to set or update
     * the value of the gender variable
     *
     * @param gender variable that holds the member's gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Name: setMembershipID
     * Purpose/description: setter that used to set or
     * update the value of the membership id variable
     *
     * @param membershipID variable that holds the member's id
     */
    public void setMembershipID(int membershipID) {
        this.membershipID = membershipID;
    }

    /**
     * Name: setPtID
     * Purpose/description: setter that used to set or update the
     * value of the personal trainer id variable
     *
     * @param PtID variable that holds the personal trainers ID
     */
    public void setPtID(int PtID) {
        this.PtID = PtID;
    }

    /**
     * Name: setHasPt
     * Purpose/description: setter that used to set or update the
     * value of the hasPT variable
     *
     * @param hasPt
     */
    public void setHasPt(boolean hasPt) {
        this.hasPt = hasPt;
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
     * Name: getDateOfBirth
     * Purpose/description: getter that used to retrieve
     * the value of the date of birth variable.
     *
     * @return dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Name: getPhone
     * Purpose/description: getter that used to retrieve the
     * value of the date of phone variable.
     *
     * @return phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Name: getGender
     * Purpose/description: getter that used to retrieve the
     * value of the gender variable.
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Name: getMembershipID
     * Purpose/description: getter that used to retrieve
     * the value of the membership ID variable.
     *
     * @return membershipID
     */
    public int getMembershipID() {
        return membershipID;
    }

    /**
     * Name: getPtID
     * Purpose/description: getter that used to retrieve the value
     * of the PT ID variable.
     *
     * @return PtID
     */
    public int getPtID() {
        return PtID;
    }

    /**
     * Name: isHasPt 
     * Purpose/description: Returns whether this Member is currently assigned to a Personal Trainer or not.
     *
     *  * @return {@code true} if this object is active, {@code false} otherwise
     */
    public boolean isHasPt() {
        return hasPt;
    }

    public String toString() {
        return this.getMembershipID() + " " + this.getFirstName() + " " + this.getSurname();
    }

}//end Member
