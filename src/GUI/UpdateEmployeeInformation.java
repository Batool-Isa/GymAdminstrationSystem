/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import Logic.*;
import javax.swing.JOptionPane;

/**
 * @author Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 */
public class UpdateEmployeeInformation extends javax.swing.JFrame {

    EmployeesOptions empListScreen;
    Employee emp;
    
     /**
     * Name: UpdateEmployeeInformation
     * Purpose/description: custom constructors that used
     * to initialize an object using value passed as arguments.
     * It initializes the GUI components of the screen.

     * @param empListScreen - EmployeesOptions object 
     * @param tempEmp -  Employee object that represents the employee object whose information is being updated.
     */
    public UpdateEmployeeInformation(EmployeesOptions empListScreen, Employee tempEmp) {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        this.empListScreen = empListScreen;
        emp = tempEmp;

    }
    
    /**
     * Name: UpdateEmployeeInformation
     * Purpose/description: default constructors that
     * used to initialize the form components.
     * It initializes the GUI components of the screen.
     */
    public UpdateEmployeeInformation() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupGenderUE = new javax.swing.ButtonGroup();
        GroupPositionUE = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblUpdateEmployeeInfo = new javax.swing.JLabel();
        btnUESave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblUEFirstName = new javax.swing.JLabel();
        lblUEPhone = new javax.swing.JLabel();
        txtUEPhone = new javax.swing.JTextField();
        lblUESalary = new javax.swing.JLabel();
        txtUESalary = new javax.swing.JTextField();
        txtUEFirstName = new javax.swing.JTextField();
        lblFnameError = new javax.swing.JLabel();
        lblPhoneError = new javax.swing.JLabel();
        lblSalaryError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblUESurname = new javax.swing.JLabel();
        lblUEAddress = new javax.swing.JLabel();
        txtUEAddress = new javax.swing.JTextField();
        txtUESurname = new javax.swing.JTextField();
        lblLnameError1 = new javax.swing.JLabel();
        lblAddressError = new javax.swing.JLabel();
        lblBPLogo = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblDumbbellImg = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 72, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUpdateEmployeeInfo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblUpdateEmployeeInfo.setForeground(new java.awt.Color(156, 176, 219));
        lblUpdateEmployeeInfo.setText("Update Employee Information");
        jPanel2.add(lblUpdateEmployeeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        btnUESave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUESave.setText("Save");
        btnUESave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUESaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnUESave, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, -1));

        jPanel1.setBackground(new java.awt.Color(57, 72, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUEFirstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUEFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblUEFirstName.setText("First Name:");
        jPanel1.add(lblUEFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 114, -1));

        lblUEPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUEPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblUEPhone.setText("Phone:");
        jPanel1.add(lblUEPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 178, -1));
        jPanel1.add(txtUEPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 30));

        lblUESalary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUESalary.setForeground(new java.awt.Color(255, 255, 255));
        lblUESalary.setText("Salary:");
        jPanel1.add(lblUESalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 58, -1));
        jPanel1.add(txtUESalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));
        jPanel1.add(txtUEFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 160, 30));
        txtUEFirstName.getAccessibleContext().setAccessibleName("");

        lblFnameError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblFnameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 30));

        lblPhoneError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblPhoneError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 30));

        lblSalaryError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblSalaryError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 350, 310));

        jPanel3.setBackground(new java.awt.Color(57, 72, 103));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUESurname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUESurname.setForeground(new java.awt.Color(255, 255, 255));
        lblUESurname.setText("Surname:");
        jPanel3.add(lblUESurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, -1));

        lblUEAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUEAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblUEAddress.setText("Address:");
        jPanel3.add(lblUEAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 90, -1));
        jPanel3.add(txtUEAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, 30));
        jPanel3.add(txtUESurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 160, 30));

        lblLnameError1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(lblLnameError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 30));

        lblAddressError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(lblAddressError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 340, 350));

        lblBPLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/BPLogosmall.png"))); // NOI18N
        jPanel2.add(lblBPLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTitle1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("GYM ADMINISTRATION ");
        jPanel2.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        lblTitle2.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("SYSTEM");
        jPanel2.add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lblDumbbellImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/dumbbellsmall.png"))); // NOI18N
        jPanel2.add(lblDumbbellImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 40));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Name:btnUESaveActionPerformed
     * Purpose/description: This method is called when the "Save" button is clicked in the Update Employee form . 
     * It validates the user input for the employee information fields,.
     * If the input is valid, it updates the information of the selected employee in the system.
     * If the input is invalid, it displays error messages to the user. 
     * 
     * @param evt the event that triggered the invocation of this method.
     */
    private void btnUESaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUESaveActionPerformed
        boolean save = true;
        lblFnameError.setText(null);
        lblLnameError1.setText(null);
        lblAddressError.setText(null);
        lblSalaryError.setText(null);
        lblPhoneError.setText(null);

        if (txtUEFirstName.getText().isEmpty() || txtUEFirstName.getText().length() < 3) {
            lblFnameError.setText("*First name must be at least 3 characters");
            save = false;
        }
        if (txtUESurname.getText().isEmpty() || txtUESurname.getText().length() < 3) {
            lblLnameError1.setText("*Surname must be at least 3 characters");
            save = false;
        }
        if (txtUEAddress.getText().isEmpty() || txtUEAddress.getText().length() < 6) {
            lblAddressError.setText("*Address must be at least 6 characters");
            save = false;
        }
        if (txtUESalary.getText().isEmpty() || txtUESalary.getText().length() < 3) {
            lblSalaryError.setText("*Salary must be at least 3 characters");
            save = false;
        }
        if (txtUEPhone.getText().isEmpty() || txtUEPhone.getText().length() < 6) {
            lblPhoneError.setText("*Phone must be at least 6 digits");
            save = false;
        }
        try {
            if (save == true) {
                String fName = txtUEFirstName.getText();
                String lName = txtUESurname.getText();
                String address = txtUEAddress.getText();
                double salary = Double.parseDouble(txtUESalary.getText());
                int phone = Integer.parseInt(txtUEPhone.getText());
                GymSystem.alterEmployee(emp.getEmployeeID(), fName, lName, address, salary, phone);
                JOptionPane.showMessageDialog(this, "The Employee information has been updated", "Information Updated", 1);
                empListScreen.setVisible(true);
            }
        } catch (NumberFormatException ex1) {
            JOptionPane.showMessageDialog(this, "Phone and Salary Inputs must be numbers", "Number Format Exception", 0);
        }


    }//GEN-LAST:event_btnUESaveActionPerformed
    
    /** 
     * Name:formWindowOpened
     * Invoked when UpdateEmployeeInformation form is opened.
     * It sets the text of the employee information fields to the current information of the selected employee,
     * which is passed as an object to the constructor of this screen.
     * 
     * @param evt the event that triggered the invocation of this method (WindowEvent).
     */

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtUEFirstName.setText(emp.getFirstName());
        txtUESurname.setText(emp.getSurname());
        txtUEAddress.setText(emp.getAddress());
        txtUESalary.setText(Double.toString(emp.getSalary()));
        txtUEPhone.setText(Integer.toString(emp.getPhone()));

    }//GEN-LAST:event_formWindowOpened

    
    /** 
     * Name:btnBackActionPerformed
     * Purpose/description: This method is called when the "Back" button is clicked.
     * It sets the visibility of the current screen to false and the visibility of the Employee options screen to true.
     * 
     * @param evt the event that triggered the invocation of this method (ActionEvent).
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        empListScreen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UpdateEmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupGenderUE;
    private javax.swing.ButtonGroup GroupPositionUE;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUESave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddressError;
    private javax.swing.JLabel lblBPLogo;
    private javax.swing.JLabel lblDumbbellImg;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLnameError1;
    private javax.swing.JLabel lblPhoneError;
    private javax.swing.JLabel lblSalaryError;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblUEAddress;
    private javax.swing.JLabel lblUEFirstName;
    private javax.swing.JLabel lblUEPhone;
    private javax.swing.JLabel lblUESalary;
    private javax.swing.JLabel lblUESurname;
    private javax.swing.JLabel lblUpdateEmployeeInfo;
    private javax.swing.JTextField txtUEAddress;
    private javax.swing.JTextField txtUEFirstName;
    private javax.swing.JTextField txtUEPhone;
    private javax.swing.JTextField txtUESalary;
    private javax.swing.JTextField txtUESurname;
    // End of variables declaration//GEN-END:variables
}