/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital_management_system;


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class admitPatient extends javax.swing.JFrame implements Runnable  {

    int hour,seconds,minutes;
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pr =null;
    
    
    public admitPatient() {
        initComponents();
        con = DatabaseConnectionClass.connectDB();
        
        showDate();
        Thread t=new Thread(this);
        t.start();
    }

    void showDate(){
    Date d= new Date();
    SimpleDateFormat sd= new SimpleDateFormat("dd-MM-yyyy");
    pad.setText(sd.format(d));
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        pad = new javax.swing.JTextField();
        pat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIT PATIENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient's Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 136, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Disease:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 175, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admit Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 214, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Admit Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 258, -1, -1));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 92, 191, -1));
        getContentPane().add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 126, 191, -1));
        getContentPane().add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 170, 191, -1));
        getContentPane().add(pad, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 204, 191, -1));
        getContentPane().add(pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 248, 191, -1));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 336, -1, -1));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 336, -1, -1));

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setText("Admit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/national-cancer-institute-NFvdKI-2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        String query ="insert into patient_record values(?,?,?,?,?) ";
         
        try {
            pr=con.prepareStatement(query);
            pr.setString(1, pid.getText());
            pr.setString(2, pn.getText());
            pr.setString(3, pd.getText());
            pr.setString(4, pad.getText());
            pr.setString(5, pat.getText());
            
            pr.executeUpdate();
             JOptionPane.showMessageDialog(null, "saved");
             con.close();
       pid.setText("");pn.setText("");pd.setText("");
             //AdminLogin lg = new AdminLogin();
             //lg.setVisible(true); 
             //this.dispose();
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "not saved");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Patients obj = new Patients();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginPage obj =new LoginPage();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admitPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pad;
    private javax.swing.JTextField pat;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pn;
    // End of variables declaration//GEN-END:variables
   
    @Override
    public void run() {
    while(true){
    Calendar cal= Calendar.getInstance();
    hour=cal.get(Calendar.HOUR_OF_DAY);
    minutes=cal.get(Calendar.MINUTE);
    seconds=cal.get(Calendar.SECOND);
    
        SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss:aa");
        Date dat = cal.getTime();
        String time24 =sdf24.format(dat);
        pat.setText(time24);
        
        
    
    }
    
    
    }

}
