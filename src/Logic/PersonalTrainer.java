/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */
public class PersonalTrainer extends Employee implements Serializable {

    ArrayList<Member> memberList;

    /**
     * Name: PersonalTrainer 
     * Purpose/description: Constructs a new instance of
     * the PersonalTrainer class with the specified parameters.
     *
     * @param firstName variable that holds the personal trainer's first name and will be passed to Employee class(Parent Class) constructor
     * @param surname variable that holds the personal trainer's surname and will be passed to Employee class(Parent Class) constructor
     * @param address variable that holds the personal trainer's address and will be passed to Employee class(Parent Class) constructor
     * @param phone variable that holds the personal trainer's phone and will be passed to Employee class(Parent Class) constructor
     * @param salary variable that holds the personal trainer's salary and will be passed to Employee class(Parent Class) constructor
     * @param employeeID variable that holds the personal trainer's ID and will be passed to Employee class(Parent Class) constructor
     */
    
    public PersonalTrainer(String firstName, String surname, String address, int phone, double salary, int employeeID) {
        super(firstName, surname, address, phone, salary, employeeID);
        memberList = new ArrayList<Member>();
    }

    /**
     * Name: PersonalTrainer 
     * Purpose/description: default constructors that used to
     * initialize an object's state default value.
     * It initializes all instance variables to their default values
     */
    public PersonalTrainer() {
        memberList = new ArrayList<Member>();
    }
     /**
     * Name: getMemberList 
     * Purpose/description: getter that used to retrieve the
     * value of Personal trainer's MemberList object.
     *
     * @return memberList
     */
    
    public ArrayList<Member> getMemberList() {
        return memberList;
    }
     /**
     * Name: setMemberList
     * Purpose/description: setter that used to set or update Personal's Trainers
     * MemberList object 
     *
     * @param memberList variable that holds Personal's Trainer's member list object
     */
    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

}
