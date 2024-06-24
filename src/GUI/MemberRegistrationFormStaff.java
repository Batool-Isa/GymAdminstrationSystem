/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import Logic.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Batool Isa, Fatima Mahfoodh, Fedaa Abdualwahab, Fatema Omran
 * @version 1.0
 * @created 10-May-2023 11:34:54 AM
 * A class to add a new staff member to the BP gym system 
 */
public class MemberRegistrationFormStaff extends javax.swing.JFrame {

    MemberType memberType2;
    MembersOptions memberOption3;

    /**
     * Creates new form MemberRegistrationForm
     */
    public MemberRegistrationFormStaff(MemberType memberType2, MembersOptions memberOption3) {
        this.memberType2 = memberType2;
        this.memberOption3 = memberOption3;
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    public MemberRegistrationFormStaff() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupGenderSMRF = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblMRFTitle = new javax.swing.JLabel();
        lblSMRFStaff = new javax.swing.JLabel();
        btnSMRFSubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblSMRFFirstName = new javax.swing.JLabel();
        txtSMRFFirstName = new javax.swing.JTextField();
        lblSMRFPhone = new javax.swing.JLabel();
        lblSMRFDeptNo = new javax.swing.JLabel();
        txtSMRFDeptName = new javax.swing.JTextField();
        lblSMRFGender = new javax.swing.JLabel();
        btnSMRFMale = new javax.swing.JRadioButton();
        btnSMRFFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        lblFnameError = new javax.swing.JLabel();
        lblPhoneError = new javax.swing.JLabel();
        lblDepError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblSMRFSurname = new javax.swing.JLabel();
        txtSMRFSurname = new javax.swing.JTextField();
        lblSMRFAddress = new javax.swing.JLabel();
        txtSMRFAddress = new javax.swing.JTextField();
        lblSMRFDOB = new javax.swing.JLabel();
        jDateChooserSMRF = new com.toedter.calendar.JDateChooser();
        lblSMRFPosition = new javax.swing.JLabel();
        txtSMRFPosition = new javax.swing.JTextField();
        lblLnameError = new javax.swing.JLabel();
        lblAddressError = new javax.swing.JLabel();
        lblPostitionError = new javax.swing.JLabel();
        lblDateError = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(57, 72, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMRFTitle.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblMRFTitle.setForeground(new java.awt.Color(156, 176, 219));
        lblMRFTitle.setText("Member Registration Form");
        jPanel1.add(lblMRFTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        lblSMRFStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSMRFStaff.setForeground(new java.awt.Color(179, 190, 194));
        lblSMRFStaff.setText("STAFF");
        jPanel1.add(lblSMRFStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        btnSMRFSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSMRFSubmit.setText("Submit");
        btnSMRFSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMRFSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSMRFSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        jPanel2.setBackground(new java.awt.Color(57, 72, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSMRFFirstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFFirstName.setText("First Name:");
        jPanel2.add(lblSMRFFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));
        jPanel2.add(txtSMRFFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 160, 30));

        lblSMRFPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFPhone.setText("Phone:");
        jPanel2.add(lblSMRFPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, -1));

        lblSMRFDeptNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFDeptNo.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFDeptNo.setText("Department Name:");
        jPanel2.add(lblSMRFDeptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));
        jPanel2.add(txtSMRFDeptName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 160, 30));

        lblSMRFGender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFGender.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFGender.setText("Gender:");
        jPanel2.add(lblSMRFGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        GroupGenderSMRF.add(btnSMRFMale);
        btnSMRFMale.setForeground(new java.awt.Color(255, 255, 255));
        btnSMRFMale.setText("Male");
        jPanel2.add(btnSMRFMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 98, 20));

        GroupGenderSMRF.add(btnSMRFFemale);
        btnSMRFFemale.setForeground(new java.awt.Color(255, 255, 255));
        btnSMRFFemale.setText("Female");
        jPanel2.add(btnSMRFFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 98, 20));
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, 30));

        lblFnameError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lblFnameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 30));

        lblPhoneError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lblPhoneError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 30));

        lblDepError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lblDepError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 400, 250));

        jPanel3.setBackground(new java.awt.Color(57, 72, 103));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSMRFSurname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFSurname.setText("Surname:");
        jPanel3.add(lblSMRFSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel3.add(txtSMRFSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 160, 30));

        lblSMRFAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFAddress.setText("Address:");
        jPanel3.add(lblSMRFAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 96, -1));
        jPanel3.add(txtSMRFAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 62, 160, 30));

        lblSMRFDOB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFDOB.setText("Date of birth:");
        jPanel3.add(lblSMRFDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, -1, -1));
        jPanel3.add(jDateChooserSMRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 122, 160, 30));

        lblSMRFPosition.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSMRFPosition.setForeground(new java.awt.Color(255, 255, 255));
        lblSMRFPosition.setText("Position:");
        jPanel3.add(lblSMRFPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 191, 102, -1));
        jPanel3.add(txtSMRFPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 186, 160, 30));

        lblLnameError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(lblLnameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 30));

        lblAddressError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(lblAddressError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 30));

        lblPostitionError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(lblPostitionError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 30));

        lblDateError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(lblDateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 330, 270));

        lblBPLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/BPLogosmall.png"))); // NOI18N
        jPanel1.add(lblBPLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTitle1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("GYM ADMINISTRATION ");
        jPanel1.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        lblTitle2.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("SYSTEM");
        jPanel1.add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lblDumbbellImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/dumbbellsmall.png"))); // NOI18N
        jPanel1.add(lblDumbbellImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 40));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1340, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Name: btnSMRFSubmitActionPerformed
     * Purpose/description: to submit a new information of staff member to 
     * BP gym system. 
     * @param evt An event object represents the action of clicking on 
     * submit button. 
     */
    private void btnSMRFSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMRFSubmitActionPerformed
        
        lblFnameError.setText(null);
        lblLnameError.setText(null);
        lblAddressError.setText(null);
        lblDepError.setText(null);
        lblPostitionError.setText(null);
        lblPhoneError.setText(null);
        lblDateError.setText(null);
        
        boolean submit = true;
        
        if (txtSMRFFirstName.getText().isEmpty() || txtSMRFFirstName.getText().length() < 3) {
            lblFnameError.setText("*First name must be at least 3 characters");
            submit = false;
        }
        if (txtSMRFSurname.getText().isEmpty() || txtSMRFSurname.getText().length() < 3) {
            lblLnameError.setText("*Surname must be at least 3 characters");
            submit = false;
        }
        if (txtSMRFAddress.getText().isEmpty() || txtSMRFAddress.getText().length() < 6) {
            lblAddressError.setText("*Address must be at least 6 characters");
            submit = false;
        }
        if (txtSMRFDeptName.getText().isEmpty() || txtSMRFDeptName.getText().length() < 5) {
            lblDepError.setText("*Department Name must be at least 5 characters");
            submit = false;
        }
        if (txtSMRFPosition.getText().isEmpty() || txtSMRFPosition.getText().length() < 5) {
            lblPostitionError.setText("*Position must be at least 5 characters");
            submit = false;
        }
        if (jDateChooserSMRF.getDate()==null) {
            lblDateError.setText("*Date of Birth cannot be null");
            submit = false;
        }
        if (txtPhone.getText().isEmpty() || txtPhone.getText().length() < 6) {
            lblPhoneError.setText("*Phone must be at least 6 digits");
            submit = false;
        }
        try {
            if (submit == true) {
                String fName = txtSMRFFirstName.getText();
                String lName = txtSMRFSurname.getText();
                String address = txtSMRFAddress.getText();
                String Department = txtSMRFDeptName.getText();
                String position = txtSMRFPosition.getText();
                // Date date = jDateChooserSMRF.getDate();
                ///String dateOfBirth = DateFormat.getDateInstance().format(date);
                SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
                String dateOfBirth = sdf.format(jDateChooserSMRF.getDate());

                int phone = Integer.parseInt(txtPhone.getText());
                String gender;
                if (btnSMRFMale.isSelected()) {
                    gender = "male";
                } else {
                    gender = "female";
                }
                GymSystem.addStaffMember(fName, lName, address, dateOfBirth, phone, gender, Department, position);
                JOptionPane.showMessageDialog(this, "The member has been added successfully", "Successful Registraion", 1);
                dispose();
                memberOption3.setVisible(true);
            }
        } catch (NumberFormatException ex1) {
            JOptionPane.showMessageDialog(this, "Phone Input must be number", "Number Format Exception", 0);
        }


    }//GEN-LAST:event_btnSMRFSubmitActionPerformed

    
    /**
     * Name: btnBackActionPerformed
     * Purpose/description: to open MainMenu and close 
     * MemberRegistrationFormStaff
     * @param evt An event object represents the action of clicking on 
     * back button.
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        memberType2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

      /**
     * Name: formWindowOpened
     * Purpose/description: to make btnSMRFMale to be selected while 
     * MemberRegistrationFormStaff is opened. 
     * @param evt 
     */
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnSMRFMale.setSelected(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MemberRegistrationFormStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberRegistrationFormStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberRegistrationFormStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberRegistrationFormStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberRegistrationFormStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupGenderSMRF;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnSMRFFemale;
    private javax.swing.JRadioButton btnSMRFMale;
    private javax.swing.JButton btnSMRFSubmit;
    private com.toedter.calendar.JDateChooser jDateChooserSMRF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddressError;
    private javax.swing.JLabel lblBPLogo;
    private javax.swing.JLabel lblDateError;
    private javax.swing.JLabel lblDepError;
    private javax.swing.JLabel lblDumbbellImg;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLnameError;
    private javax.swing.JLabel lblMRFTitle;
    private javax.swing.JLabel lblPhoneError;
    private javax.swing.JLabel lblPostitionError;
    private javax.swing.JLabel lblSMRFAddress;
    private javax.swing.JLabel lblSMRFDOB;
    private javax.swing.JLabel lblSMRFDeptNo;
    private javax.swing.JLabel lblSMRFFirstName;
    private javax.swing.JLabel lblSMRFGender;
    private javax.swing.JLabel lblSMRFPhone;
    private javax.swing.JLabel lblSMRFPosition;
    private javax.swing.JLabel lblSMRFStaff;
    private javax.swing.JLabel lblSMRFSurname;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSMRFAddress;
    private javax.swing.JTextField txtSMRFDeptName;
    private javax.swing.JTextField txtSMRFFirstName;
    private javax.swing.JTextField txtSMRFPosition;
    private javax.swing.JTextField txtSMRFSurname;
    // End of variables declaration//GEN-END:variables
}
