package Logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author  Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */
public class GymSystem implements Serializable {

    private static ArrayList<Employee> employeesList;
    private static ArrayList<Member> membersList;
    private static Integer empIDs = 2000;
    private static Integer memberIDs = 6000;

     /**
     * Name: getEmployeesList
     * Purpose/description: getter that used to retrieve the
     * employees array list object .
     *
     * @return employeesList
     */
    public static ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

     /**
     * Name: getMembersList
     * Purpose/description: getter that used to retrieve the
     * members array list object .
     *
     * @return membersList
     */
    
    public static ArrayList<Member> getMembersList() {
        return membersList;
    }
    
     /**
     * Name: setEmployeesList
     * Purpose/description: setter that used to set or update the
     * array list elements.
     *
     * @param employeesList 
     */
    
    public static void setEmployeesList(ArrayList<Employee> employeesList) {
        GymSystem.employeesList = employeesList;
    }

     /**
     * Name: setMembersList
     * Purpose/description: setter that used to set or update the
     * array list elements.
     *
     * @param membersList 
     */
    
    public static void setMembersList(ArrayList<Member> membersList) {
        GymSystem.membersList = membersList;
    }
    
     /**
     * Name: getEmpIDs
     * Purpose/description: getter that used to retrieve the
     * value of employee's ID .
     *
     * @return empIDs
     */
    
    public static Integer getEmpIDs() {
        return empIDs;
    }

     /**
     * Name: getMemberIDs
     * Purpose/description: getter that used to retrieve the
     * value of member's ID .
     *
     * @return memberIDs
     */
    
    public static Integer getMemberIDs() {
        return memberIDs;
    }
     /**
     * Name: setEmpIDs
     * Purpose/description: setter that used to set or update the
     * Employee IDs variable
     *
     * @param empIDs 
     */
    public static void setEmpIDs(Integer empIDs) {
        GymSystem.empIDs = empIDs;
    }
    /**
     * Name: setMemberIDs
     * Purpose/description: setter that used to set or update the
     * Member IDs variable
     *
     * @param memberIDs 
     */
    public static void setMemberIDs(Integer memberIDs) {
        GymSystem.memberIDs = memberIDs;
    }

    /**
     * Name: GymSystem
     * Purpose/description: default constructors that used to
     * initialize an object's state default value. It initializes all instance
     * variables to their default values.
     */
    public GymSystem() {
        employeesList = new ArrayList<Employee>();
        membersList = new ArrayList<Member>();
    }
    
    /**
     * Name: addEmployee
     * Purpose/description: This method is used to create a new employee object
     * and add it to the employees array list .
     * @param firstName variable that holds the employee's first name
     * @param surname variable that holds the employee's surname
     * @param address variable that holds the employee's address
     * @param phone variable that holds the employee's phone
     * @param salary variable that holds the employee's salary
     * @param isPersonalTrainer variable that indicates if the employee is a personal trainer
     */
    
    public static void addEmployee(String firstName, String surname, String address, int phone, double salary, boolean isPersonalTrainer) {
        Employee emp;
        if (isPersonalTrainer == true) {
            emp = new PersonalTrainer(firstName, surname, address, phone, salary, ++empIDs);
        } else {
            emp = new Employee(firstName, surname, address, phone, salary, ++empIDs);
        }
        employeesList.add(emp);
    }

     /**
     * Name: addStudentMember
     * Purpose/description: This method is used to create a new student object
     * and add it to the members array list .
     * @param firstName variable that holds the student's first name and will be passed to Member class(Parent Class) constructor
     * @param surname variable that holds the student's surname and will be passed to Member class(Parent Class) constructor
     * @param address variable that holds the student's address and will be passed to Member class(Parent Class) constructor
     * @param dateOfBirth variable that holds the student's date of birth and will be passed to Member class(Parent Class) constructor
     * @param phone variable that holds the student's phone and will be passed to Member class(Parent Class) constructor
     * @param gender variable that holds the student's gender and will be passed to Member class(Parent Class) constructor
     * @param studentMajor variable that holds the student's major
     * @param studentTeam variable that holds the student's team
     */
    public static void addStudentMember(String firstName, String surname, String address, String dateOfBirth, int phone, String gender, String studentMajor, String studentTeam) {
        Member member = new Student(++memberIDs, firstName, surname, address, dateOfBirth, phone, gender, studentMajor, studentTeam);
        membersList.add(member);
    }
    
     /**
     * Name: addStaffMember
     * Purpose/description: This method is used to create a new staff object
     * and add it to the members array list .
     * @param firstName variable that holds the staff's first name and will be passed to Member class(Parent Class) constructor
     * @param surname variable that holds the staff's surname and will be passed to Member class(Parent Class) constructor
     * @param address variable that holds the staff's address and will be passed to Member class(Parent Class) constructor
     * @param dateOfBirth variable that holds the staff's date of birth and will be passed to Member class(Parent Class) constructor
     * @param phone variable that holds the staff's phone and will be passed to Member class(Parent Class) constructor
     * @param gender variable that holds the staff's gender and will be passed to Member class(Parent Class) constructor
     * @param staffDepartment variable that holds the staff's department
     * @param staffPosition variable that holds the staff's position
     */

    public static void addStaffMember(String firstName, String surname, String address, String dateOfBirth, int phone, String gender, String staffDepartment, String staffPosition) {
        Member member = new Staff(++memberIDs, firstName, surname, address, dateOfBirth, phone, gender, staffDepartment, staffPosition);
        membersList.add(member);
    }

     /**
     * Name: alterEmployee
     * Purpose/description: This method is used to update the employee's information.
     * @param empID variable that holds the employee's ID 
     * @param fName variable that holds the employee's first name
     * @param lName variable that holds the employee's surname
     * @param address variable that holds the employee's address
     * @param salary variable that holds the employee's salary
     * @param phone variable that holds the employee's phone
     * 
     * @return altered - Boolean that indicates that employee's information is altered or not.
     */
    
    public static boolean alterEmployee(int empID, String fName, String lName, String address, double salary, int phone) {
        boolean altered = false;
        Employee tempEmp = searchForEmployee(empID);
        if (tempEmp != null) {
            tempEmp.setFirstName(fName);
            tempEmp.setSurname(lName);
            tempEmp.setAddress(address);
            tempEmp.setSalary(salary);
            tempEmp.setPhone(phone);
            altered = true;
        }
        return altered;

    }
    
     /**
     * Name: alterStaffMember
     * Purpose/description: This method is used to update the staff's information.
     * @param memberID variable that holds the staff's ID and will be passed to Member class(Parent Class) constructor
     * @param firstName variable that holds the staff's first name and will be passed to Member class(Parent Class) constructor
     * @param surname variable that holds the staff's surname and will be passed to Member class(Parent Class) constructor
     * @param address variable that holds the staff's address and will be passed to Member class(Parent Class) constructor
     * @param dateOfBirth variable that holds the staff's date of birth and will be passed to Member class(Parent Class) constructor
     * @param phone variable that holds the staff's phone and will be passed to Member class(Parent Class) constructor
     * @param gender variable that holds the staff's gender and will be passed to Member class(Parent Class) constructor
     * @param staffDepartment variable that holds the staff's department
     * @param staffPosition variable that holds the staff's position
     * 
     * @return altered - Boolean that indicates that staff's information is altered or not.
     */

    public static boolean alterStaffMember(int memberID, String firstName, String surname, String address, String dateOfBirth, int phone, String gender, String staffDepartment, String staffPosition) {
        boolean altered = false;
        Staff tempMember = (Staff) searchForMember(memberID);
        if (tempMember != null && tempMember instanceof Staff) {
            tempMember.setFirstName(firstName);
            tempMember.setSurname(surname);
            tempMember.setAddress(address);
            tempMember.setDateOfBirth(dateOfBirth);
            tempMember.setPhone(phone);
            tempMember.setGender(gender);
            tempMember.setStaffDepartment(staffDepartment);
            tempMember.setStaffPosition(staffPosition);
            altered = true;
        }
        return altered;
    }

     /**
     * Name: alterStduentMember
     * Purpose/description: This method is used to update the student's information.
     * @param memberID variable that holds the student's ID and will be passed to Member class(Parent Class) constructor
     * @param firstName variable that holds the student's first name and will be passed to Member class(Parent Class) constructor
     * @param surname variable that holds the student's surname and will be passed to Member class(Parent Class) constructor
     * @param address variable that holds the student's address and will be passed to Member class(Parent Class) constructor
     * @param dateOfBirth variable that holds the student's date of birth and will be passed to Member class(Parent Class) constructor
     * @param phone variable that holds the student's phone and will be passed to Member class(Parent Class) constructor
     * @param gender variable that holds the student's gender and will be passed to Member class(Parent Class) constructor
     * @param team variable that holds the student's team
     * @param major variable that holds the student's major

     * 
     * @return altered - Boolean that indicates that student's information is altered or not.
     */
    
    public static boolean alterStduentMember(int memberID, String firstName, String surname, String address, String dateOfBirth, int phone, String gender, String team, String major) {
        boolean altered = false;
        Student tempMember = (Student) searchForMember(memberID);
        if (tempMember != null && tempMember instanceof Student) {
            tempMember.setFirstName(firstName);
            tempMember.setSurname(surname);
            tempMember.setAddress(address);
            tempMember.setDateOfBirth(dateOfBirth);
            tempMember.setPhone(phone);
            tempMember.setGender(gender);
            tempMember.setStudentMajor(major);
            tempMember.setStudentTeam(team);
            altered = true;
        }
        return altered;
    }
    
    /**
     * Name: deleteEmployee
     * Purpose/description: This method is used to delete an employee object from the system
     * and remove it from the employees list.
     * Before the employee object is deleted the method checks
     * if the employee is personal trainer and remove the members that are assigned to it.
     * @param empID variable that holds the employee's ID.

     * @return deleted - Boolean that indicates that employee object has been deleted or not.
     */
    
    public static boolean deleteEmployee(int empID) {
        boolean deleted = false;
        Employee tempEmp = searchForEmployee(empID);
        if (tempEmp != null) {
            if (tempEmp instanceof PersonalTrainer) {
                ArrayList<Member> tempList = ((PersonalTrainer) tempEmp).getMemberList();
                if (tempList != null) {
                    for (int i = 0; i < tempList.size(); i++) {
                        int memID = tempList.get(i).getMembershipID();
                        removePtFromMember(memID);
                    }
                }
            }

            employeesList.remove(tempEmp);
            deleted = true;
        }
        return deleted;
    }
    
      /**
     * Name: deleteMember
     * Purpose/description: This method is used to delete a member object from the system
     * and remove it from the members list.
     * Before the member object is deleted the method checks
     * if the member has a personal trainer then the member object is removed from the members list of the PT .
     * @param memberID variable that holds the member's ID.

     * @return deleted - Boolean that indicates that member object has been deleted or not.
     */
    
    public static boolean deleteMember(int memberID) {
        boolean deleted = false;
        Member tempMember = searchForMember(memberID);
        if (tempMember != null) {
            membersList.remove(tempMember);
            if (tempMember.isHasPt() == true) {
                removePtFromMember(tempMember.getMembershipID());
            }
            deleted = true;
        }
        return deleted;
    }
    
     /**
     * Name: displayMembersOfPT
     * Purpose/description: This method is used to display the members that assigned to a personal trainer.
     * @param ptID variable that holds the personal trainer's ID.

     * @return memberList - Members list that .
     */

    public static ArrayList<Member> displayMembersOfPT(int ptID) {
        Employee tempEmp = searchForEmployee(ptID);
        ArrayList<Member> memberList = null;
        if (tempEmp != null && tempEmp instanceof PersonalTrainer) {
            PersonalTrainer tempPT = (PersonalTrainer) tempEmp;
            memberList = tempPT.getMemberList();
        }
        return memberList;
    }

     /**
     * Name: assignPtToMember
     * Purpose/description: This method is used to assign a member to a personal trainer.
     * Before the assignment,this method checks if the member is assigned to a Pt or not.
     * @param memberID variable that holds the member's ID.
     * @param ptID variable that holds the personal trainer's ID.
     * 
     * @return assigned - Boolean that indicated if the member is assigned to a PT or not .
     */
    
    public static boolean assignPtToMember(int memberID, int ptID) {
        boolean assigned = false;
        Member tempMember = searchForMember(memberID);
        Employee tempEmp = searchForEmployee(ptID);
        
        ArrayList<Member> memberList = displayMembersOfPT(ptID);
        if (tempMember.isHasPt()==false) {    
            memberList.add(tempMember);
            tempMember.setHasPt(true);
            tempMember.setPtID(ptID);
            assigned = true;
        } else if (tempMember.isHasPt()==true){
            removePtFromMember(tempMember.getMembershipID());
            memberList.add(tempMember);
            tempMember.setHasPt(true);
            tempMember.setPtID(ptID);
            assigned = true;
        }
        return assigned;
    }

     /**
     * Name: removePtFromMember
     * Purpose/description: This method is used to remove a personal trainer from a member.
     * Before the removal ,this method checks if the member is assigned to a Pt or not.
     * @param memberID variable that holds the member's ID.
     * 
     * @return removed - Boolean that indicated if the PT is removed from a member .
     */
    
    public static boolean removePtFromMember(int memberID) {
        boolean removed = false;
        Member tempMember = searchForMember(memberID);
        if (tempMember != null && tempMember.isHasPt() == true && tempMember.getPtID() != 0) {
            int ptID = tempMember.getPtID();
            ArrayList<Member> memberList = displayMembersOfPT(ptID);
            for (int i = 0; i < memberList.size(); i++) {
                if (memberList.get(i).getMembershipID() == memberID) {
                    memberList.remove(i);
                    tempMember.setHasPt(false);
                    tempMember.setPtID(0);
                    removed = true;
                }
            }
        }
        return removed;
    }

  
    /**
     * Name: searchForEmployee
     * Purpose/description: The method searches for a employee in employees ArrayList and return the employee object.
     * It will return null object if the employee is not found.
     * @param empID variable that holds employee ID
     * @return tempEmp variables that holds employee Object
     *
     */
    public static Employee searchForEmployee(int empID) {
        Employee tempEmp = null;
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getEmployeeID() == empID) {
                tempEmp = employeesList.get(i);
            }
        }
        return tempEmp;
    }

       /**
     * Name: searchForMember
     * Purpose/description: The method searches for a member in members ArrayList and return the member object.
     * It will return null object if the member is not found.
     * @param memberID variable that holds employee ID
     * @return tempMember variables that holds Member Object
     *
     */
    public static Member searchForMember(int memberID) {
        Member tempMember = null;
        for (int i = 0; i < membersList.size(); i++) {
            if (membersList.get(i).getMembershipID() == memberID) {
                tempMember = membersList.get(i);
            }
        }
        return tempMember;
    }
    
     /**
      * Name: generateMarketingReport
      * Purpose/description: The method is used to create text file in Project folder that contains
      * information about gym members. 
      * It will first display Staff members information and then Student members information.
      *
      */
    
    public static void generateMarketingReport() {
        File outFile = new File("marketingReport.txt");
        try {
            PrintStream output = new PrintStream(outFile);
            int staffCounter = 0;
            int studentCounter = 0;

            output.println("******Staff Members******\n");
            for (Member tempMemberStaff : membersList) {
                if (tempMemberStaff instanceof Staff) {
                    output.println("Name: " + tempMemberStaff.getFirstName() + " " + tempMemberStaff.getSurname());
                    output.println("Address: " + tempMemberStaff.getAddress());
                    output.println("Phone Number: " + tempMemberStaff.getPhone());
                    output.println("Position: " + ((Staff) tempMemberStaff).getStaffPosition());
                    output.println("Department: " + ((Staff) tempMemberStaff).getStaffDepartment());
                    output.println("");
                    staffCounter++;
                }
            }
            output.println("***Total Number of Staff Members: " + staffCounter + "\n\n");

            output.println("******Student Members******\n");
            for (Member tempMemberStudent : membersList) {
                if (tempMemberStudent instanceof Student) {
                    output.println("Name: " + tempMemberStudent.getFirstName() + " " + tempMemberStudent.getSurname());
                    output.println("Address: " + tempMemberStudent.getAddress());
                    output.println("Phone Number: " + tempMemberStudent.getPhone());
                    output.println("Major: " + ((Student) tempMemberStudent).getStudentMajor());
                    output.println("Team: " + ((Student) tempMemberStudent).getStudentTeam());
                    output.println("");
                    studentCounter++;
                }
            }
            output.println("***Total Number of Student Members: " + studentCounter);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GymSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//end GymSystem
