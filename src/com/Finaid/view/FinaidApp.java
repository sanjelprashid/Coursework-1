/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Finaid.view;

/**
 *
 * @author sanje
 */
public class FinaidApp extends javax.swing.JFrame {

    /**
     * Creates new form FinaidApp
     */
    public FinaidApp() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Email / Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, -1, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, -1));

        jTextField2.setText("jTextField1");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, -1));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, 70, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 270, -1));

        jLabel3.setText("Forget your password ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(FinaidApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinaidApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinaidApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinaidApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinaidApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
package com.finaid.view;

import com.finaid.model.ScholarshipModel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class FinaidApp extends javax.swing.JFrame {
    private CardLayout cardLayout;
   
    public FinaidApp() {
        initComponents();
        initializeLayout();
        initializeData();
        startProgress();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        pnlLoadingScreen = new javax.swing.JPanel();
        lblLoading = new javax.swing.JLabel();
        pgbLoading = new javax.swing.JProgressBar();
        lblLoadingLogo = new javax.swing.JLabel();
       
        pnlLoginScreen = new javax.swing.JPanel();
        pnlLoginLeft = new javax.swing.JPanel();
        lblLoginLogo = new javax.swing.JLabel();
        lblSlogan = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblLoginError = new javax.swing.JLabel();
       
        pnlMainScreen = new javax.swing.JPanel();
        pnlMainHeader = new javax.swing.JPanel();
        lblMainLogo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        tabMain = new javax.swing.JTabbedPane();
       
        // Dashboard Panel
        pnlDashboard = new javax.swing.JPanel();
        lblDashTitle = new javax.swing.JLabel();
        pnlStats = new javax.swing.JPanel();
        lblTotalApps = new javax.swing.JLabel();
        lblPendingApps = new javax.swing.JLabel();
        lblApprovedApps = new javax.swing.JLabel();
       
        // Applications Panel
        pnlApplications = new javax.swing.JPanel();
        pnlAppForm = new javax.swing.JPanel();
        lblStudentId = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblProgram = new javax.swing.JLabel();
        cmbProgram = new javax.swing.JComboBox<>();
        lblCGPA = new javax.swing.JLabel();
        txtCGPA = new javax.swing.JTextField();
        lblIncome = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        lblScholarshipType = new javax.swing.JLabel();
        cmbScholarshipType = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
       
        pnlAppList = new javax.swing.JPanel();
        scrollApplications = new javax.swing.JScrollPane();
        tblApplications = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finaid - Scholarship Management System");
        setMinimumSize(new java.awt.Dimension(1130, 514));
        setPreferredSize(new java.awt.Dimension(1130, 514));

        // Loading Screen Setup
        pnlLoadingScreen.setBackground(new java.awt.Color(234, 192, 32));
       
        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblLoading.setText("Loading...");
       
        pgbLoading.setStringPainted(true);
       
        lblLoadingLogo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblLoadingLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoadingLogo.setText("Finaid");

        // Login Screen Setup
        pnlLoginScreen.setBackground(new java.awt.Color(255, 255, 255));
       
        pnlLoginLeft.setBackground(new java.awt.Color(234, 192, 32));
       
        lblLoginLogo.setFont(new java.awt.Font("Segoe UI", 1, 36));
        lblLoginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginLogo.setText("Finaid");
       
        lblSlogan.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblSlogan.setText("Empowering Education Through Financial Support");
       
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));
        pwdPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
       
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
       
        lblLoginError.setForeground(new java.awt.Color(255, 0, 0));

        // Main Screen Setup
        pnlMainHeader.setBackground(new java.awt.Color(234, 192, 32));
       
        lblMainLogo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblMainLogo.setText("Finaid");
       
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        // Dashboard Setup
        pnlDashboard.setBackground(new java.awt.Color(255, 255, 255));
       
        lblDashTitle.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblDashTitle.setText("Dashboard");
       
        pnlStats.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistics"));
       
        lblTotalApps.setText("Total Applications: 0");
        lblPendingApps.setText("Pending: 0");
        lblApprovedApps.setText("Approved: 0");

        // Applications Setup
        pnlApplications.setBackground(new java.awt.Color(255, 255, 255));
       
        pnlAppForm.setBorder(javax.swing.BorderFactory.createTitledBorder("New Application"));
       
        lblStudentId.setText("Student ID:");
        lblFullName.setText("Full Name:");
        lblProgram.setText("Program:");
        lblCGPA.setText("CGPA:");
        lblIncome.setText("Family Income:");
        lblScholarshipType.setText("Scholarship Type:");
       
        cmbProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "Computing", "Business", "Engineering", "Medicine"
        }));
       
        cmbScholarshipType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "Merit-Based", "Need-Based", "Sports", "Research"
        }));
       
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
       
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        // Applications Table Setup
        tblApplications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Student ID", "Name", "Program", "CGPA", "Income", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollApplications.setViewportView(tblApplications);

        // Layout code would be generated by NetBeans GUI Builder
        // [Layout code would be here]

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void initializeLayout() {
        cardLayout = new CardLayout();
        getContentPane().setLayout(cardLayout);
        getContentPane().add(pnlLoadingScreen, "LoadingScreen");
        getContentPane().add(pnlLoginScreen, "LoginScreen");
        getContentPane().add(pnlMainScreen, "MainScreen");
        cardLayout.show(getContentPane(), "LoadingScreen");
    }

    private void initializeData() {
        // Initialize your data structures here
    }

    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30);
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                pgbLoading.setValue(progress);
            }

            @Override
            protected void done() {
                cardLayout.show(getContentPane(), "LoginScreen");
            }
        };
        worker.execute();
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = new String(pwdPassword.getPassword());
       
        if (username.isEmpty() || password.isEmpty()) {
            lblLoginError.setText("Please enter username and password");
            return;
        }
       
        if (username.equals("admin") && password.equals("admin")) {
            lblLoginError.setText("");
            cardLayout.show(getContentPane(), "MainScreen");
        } else {
            lblLoginError.setText("Invalid username or password");
        }
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        txtUsername.setText("");
        pwdPassword.setText("");
        lblLoginError.setText("");
        cardLayout.show(getContentPane(), "LoginScreen");
    }

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        // Implement application submission logic
        try {
            int studentId = Integer.parseInt(txtStudentId.getText());
            String fullName = txtFullName.getText();
            String program = cmbProgram.getSelectedItem().toString();
            double cgpa = Double.parseDouble(txtCGPA.getText());
            String income = txtIncome.getText();
            String scholarshipType = cmbScholarshipType.getSelectedItem().toString();
           
            // Add validation here
           
            ScholarshipModel application = new ScholarshipModel(
                studentId, fullName, program, cgpa, income,
                scholarshipType, "Pending", ""
            );
           
            // Add to table
            DefaultTableModel model = (DefaultTableModel) tblApplications.getModel();
            model.addRow(new Object[]{
                studentId, fullName, program, cgpa, income,
                scholarshipType, "Pending"
            });
           
            clearForm();
            JOptionPane.showMessageDialog(this, "Application submitted successfully!");
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Please enter valid numeric values for Student ID and CGPA");
        }
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        clearForm();
    }
   
    private void clearForm() {
        txtStudentId.setText("");
        txtFullName.setText("");
        cmbProgram.setSelectedIndex(0);
        txtCGPA.setText("");
        txtIncome.setText("");
        cmbScholarshipType.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinaidApp.class.getName())
                .log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FinaidApp().setVisible(true);
        });
    }

    // Variables declaration                    
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbProgram;
    private javax.swing.JComboBox<String> cmbScholarshipType;
    private javax.swing.JLabel lblApprovedApps;
    private javax.swing.JLabel lblCGPA;
    private javax.swing.JLabel lblDashTitle;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLoadingLogo;
    private javax.swing.JLabel lblLoginError;
    private javax.swing.JLabel lblLoginLogo;
    private javax.swing.JLabel lblMainLogo;
    private javax.swing.JLabel lblPendingApps;
    private javax.swing.JLabel lblScholarshipType;
    private javax.swing.JLabel lblSlogan;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblTotalApps;
    private javax.swing.JPanel pnlAppForm;
    private javax.swing.JPanel pnlAppList;
    private