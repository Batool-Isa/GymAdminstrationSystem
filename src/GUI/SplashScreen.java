/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import Logic.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Runtime;
import java.io.*;
import java.util.ArrayList;

/**
 * Name: SplashScreen class
 *
 * @author Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 25-May-2023 3:00 PM Purpose: The SplashScreen class displays a
 * splash screen with progress while the program initializes. This class also
 * handles the serialization and de-serialization of data for employees and
 * members
 */
//contains a static GymSystem object to hold the data for the gym system, **
//as well as constants for the file names of the employee and member data files.**
public class SplashScreen extends javax.swing.JFrame {

    static GymSystem gymSys;
    //static GymSystem restoredData;
    private static final String EMPLOYEES_DATA = "EmployeesData.dat";
    private static final String MEMBERS_DATA = "MembersData.dat";

    private static final String EMPLOYEES_IDS = "EmployeesIDs.dat";
    private static final String MEMBERS_IDS = "MembersIDs.dat";

    /**
     * Name:SplashScreen Purpose:Creates new form SplashScreen The constructor
     * initializes the GymSystem object for the gym system and calls the
     * initComponents method to initialize the GUI components It calls the
     * getStartupdata method to load start-up data for the system from both
     * members and employees data files
     */
    public SplashScreen() {
        gymSys = new GymSystem();
        initComponents();
        getStartupdata();

    }

    /**
     * Name:getStartupdata Purpose: to insure that Start up data run once This
     * method loads the startup data for the gym system from a text file and
     * initializes the system with the data flag file is checked first to
     * determine if the code has already been executed A text file is read for
     * startup data if the flag file does not exist The catch block handles the
     * FileNotFoundException that may be thrown during the loading of startup
     * data from the text file The method prints the error message and stack
     * trace to the console if the exception is caught by Logger.getLogger
     */
    public void getStartupdata() {
        String flagFilePath = "flag.txt";
        File flagFile = new File(flagFilePath);

        if (!flagFile.exists()) {

            // File has not been executed before, so run the code here
            System.out.println("This code will run only once");
            File inFile = new File("startup.txt");

            try {

                Scanner input = new Scanner(inFile);
                while (input.hasNext()) {
                    int empNum = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < empNum; i++) {
                        String empType = input.nextLine();
                        String eFname = input.nextLine();
                        String eLname = input.nextLine();
                        String eAddress = input.nextLine();
                        int ePhone = Integer.parseInt(input.nextLine());
                        double eSalary = Double.parseDouble(input.nextLine());
                        if (empType.equals("E")) {
                            GymSystem.addEmployee(eFname, eLname, eAddress, ePhone, eSalary, false);
                        } else if (empType.equals("PT")) {
                            GymSystem.addEmployee(eFname, eLname, eAddress, ePhone, eSalary, true);
                            int memberNum = Integer.parseInt(input.nextLine());
                            for (int j = 0; j < memberNum; j++) {
                                String memberType = input.nextLine();
                                String mFname = input.nextLine();
                                String mLname = input.nextLine();
                                String mAddress = input.nextLine();
                                String mDob = input.nextLine();
                                int mPhone = Integer.parseInt(input.nextLine());
                                String mGender = input.nextLine();
                                if (memberType.equals("staff")) {
                                    String mPosition = input.nextLine();
                                    String mDep = input.nextLine();
                                    GymSystem.addStaffMember(mFname, mLname, mAddress, mDob, mPhone, mGender, mDep, mPosition);
                                    GymSystem.assignPtToMember(GymSystem.getMemberIDs(), GymSystem.getEmpIDs());
                                } else if (memberType.equals("student")) {
                                    String mMajor = input.nextLine();
                                    String mTeam = input.nextLine();
                                    GymSystem.addStudentMember(mFname, mLname, mAddress, mDob, mPhone, mGender, mMajor, mTeam);
                                    GymSystem.assignPtToMember(GymSystem.getMemberIDs(), GymSystem.getEmpIDs());
                                }

                            }
                        }
                    }

                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Create the flag file to indicate that the code has been executed
            try {
                flagFile.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // File has been executed before, so do nothing
            System.out.println("This code will not run again");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlbackground = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        lblLoadingVal = new javax.swing.JLabel();
        lblBeYour = new javax.swing.JLabel();
        lblBest = new javax.swing.JLabel();
        lblDumbbellImg = new javax.swing.JLabel();
        lblBPLogo = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        lblBackgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle1.setFont(new java.awt.Font("Eras Bold ITC", 1, 60)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("GYM ADMINISTRATION ");
        pnlbackground.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 800, 120));

        lblTitle2.setFont(new java.awt.Font("Eras Bold ITC", 1, 60)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("SYSTEM");
        pnlbackground.add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setText("Loading...");
        pnlbackground.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        lblLoadingVal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLoadingVal.setForeground(new java.awt.Color(255, 255, 255));
        lblLoadingVal.setText("0%");
        pnlbackground.add(lblLoadingVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 570, -1, -1));

        lblBeYour.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        lblBeYour.setForeground(new java.awt.Color(255, 255, 255));
        lblBeYour.setText("BE YOUR");
        pnlbackground.add(lblBeYour, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 130, 40));

        lblBest.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        lblBest.setForeground(java.awt.SystemColor.activeCaption);
        lblBest.setText("BEST");
        pnlbackground.add(lblBest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 110, 60));

        lblDumbbellImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/dumbbell.png"))); // NOI18N
        pnlbackground.add(lblDumbbellImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 230, 110));

        lblBPLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/BPLogo.png"))); // NOI18N
        pnlbackground.add(lblBPLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 170));
        pnlbackground.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1340, 10));

        lblBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/SplashScreen.png"))); // NOI18N
        pnlbackground.add(lblBackgroundImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1340, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Name: main Purpose:the main method creates the shutdown hook to serialize
     * the employee and member data before the program exits. Then it sets the
     * Nimbus look and feel for the GUI It initialize and display the splash
     * screen and will Display progress updates while the program initializes,
     * then it will hide the splash screen and display the main menu Finally, it
     * will read the serialized data for employees and members from files and
     * de-serialize them to initialize the system data
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create some data to serialize
        // Add a shutdown hook to serialize the data before program exits
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                FileOutputStream fosEmployee = new FileOutputStream(EMPLOYEES_DATA);
                ObjectOutputStream oosEmployee = new ObjectOutputStream(fosEmployee);
                oosEmployee.writeObject(GymSystem.getEmployeesList());
                fosEmployee.close();
                oosEmployee.close();

                FileOutputStream fosMember = new FileOutputStream(MEMBERS_DATA);
                ObjectOutputStream oosMember = new ObjectOutputStream(fosMember);
                oosMember.writeObject(GymSystem.getMembersList());
                fosMember.close();
                oosMember.close();

                FileOutputStream fosEmployeeid = new FileOutputStream(EMPLOYEES_IDS);
                ObjectOutputStream oosEmployeeid = new ObjectOutputStream(fosEmployeeid);
                oosEmployeeid.writeObject(GymSystem.getEmpIDs());
                fosEmployeeid.close();
                oosEmployeeid.close();

                FileOutputStream fosMemberid = new FileOutputStream(MEMBERS_IDS);
                ObjectOutputStream oosMemberid = new ObjectOutputStream(fosMemberid);
                oosMemberid.writeObject(GymSystem.getMemberIDs());
                fosMemberid.close();
                oosMemberid.close();;
                System.out.println("Data serialized successfully");

            } catch (IOException e) {
                System.out.println("The following exception occurs :\n " + e);

            }
        }));

        // rest of your program code here
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        try {
            for (int i = 0; i <= 100; i += 4) {
                Thread.sleep(100);
                sp.lblLoadingVal.setText(i + "%");

                if (i == 10) {
                    sp.lblLoading.setText("Turning on Modules...");
                }
                if (i == 20) {
                    sp.lblLoading.setText("Loading on Modules...");
                }
                if (i == 50) {
                    sp.lblLoading.setText("Connecting to Database...");
                }
                if (i == 70) {
                    sp.lblLoading.setText("Connection Succesful...");
                }
                if (i == 80) {
                    sp.lblLoading.setText("Launching Application...");
                }
                if (i == 100) {
                    sp.setVisible(false);
                    MainMenu main = new MainMenu();
                    main.setVisible(true);
                }
                sp.loadingBar.setValue(i);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            FileInputStream fisEmployee = new FileInputStream(EMPLOYEES_DATA);
            ObjectInputStream oisEmployee = new ObjectInputStream(fisEmployee);
            GymSystem.setEmployeesList((ArrayList<Employee>) oisEmployee.readObject());
            fisEmployee.close();
            oisEmployee.close();

            FileInputStream fisMember = new FileInputStream(MEMBERS_DATA);
            ObjectInputStream oisMember = new ObjectInputStream(fisMember);
            GymSystem.setMembersList((ArrayList<Member>) oisMember.readObject());
            fisMember.close();
            oisMember.close();

            FileInputStream fisEmployeeid = new FileInputStream(EMPLOYEES_IDS);
            ObjectInputStream oisEmployeeid = new ObjectInputStream(fisEmployeeid);
            GymSystem.setEmpIDs((Integer) oisEmployeeid.readObject());
            fisEmployeeid.close();
            oisEmployeeid.close();

            FileInputStream fisMemberid = new FileInputStream(MEMBERS_IDS);
            ObjectInputStream oisMemberid = new ObjectInputStream(fisMemberid);
            GymSystem.setMemberIDs((Integer) oisMemberid.readObject());
            fisMemberid.close();
            oisMemberid.close();

            System.out.println("Data deserialized successfully: " + gymSys);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("The following exception occurs :\n " + e);
        }

        // Rest of your program code here
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBPLogo;
    private javax.swing.JLabel lblBackgroundImg;
    private javax.swing.JLabel lblBeYour;
    private javax.swing.JLabel lblBest;
    private javax.swing.JLabel lblDumbbellImg;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLoadingVal;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JPanel pnlbackground;
    // End of variables declaration//GEN-END:variables
}
