/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

/**
 *
 * @author ubaid ur rehman
 */
public class StudentRecord extends javax.swing.JFrame {

    /**
     * Creates new form StudentRecord
     */
    public StudentRecord() {
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
        addrecord = new javax.swing.JButton();
        deleterecord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mainmenu = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        veiwall = new javax.swing.JButton();
        updaterecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        addrecord.setBackground(new java.awt.Color(204, 153, 0));
        addrecord.setText("Add Record");
        addrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrecordActionPerformed(evt);
            }
        });
        jPanel1.add(addrecord);
        addrecord.setBounds(250, 170, 160, 40);

        deleterecord.setBackground(new java.awt.Color(204, 153, 0));
        deleterecord.setText("Delete Record");
        deleterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterecordActionPerformed(evt);
            }
        });
        jPanel1.add(deleterecord);
        deleterecord.setBounds(470, 170, 150, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Record");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 80, 370, 60);

        mainmenu.setBackground(new java.awt.Color(204, 153, 0));
        mainmenu.setText("MainMenu");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });
        jPanel1.add(mainmenu);
        mainmenu.setBounds(660, 280, 140, 40);

        jButton4.setBackground(new java.awt.Color(204, 153, 0));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(660, 170, 140, 40);

        veiwall.setBackground(new java.awt.Color(204, 153, 0));
        veiwall.setText("Veiw All");
        veiwall.setActionCommand("Veiw All");
        veiwall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiwallActionPerformed(evt);
            }
        });
        jPanel1.add(veiwall);
        veiwall.setBounds(250, 280, 160, 40);

        updaterecord.setBackground(new java.awt.Color(204, 153, 0));
        updaterecord.setText("Update Record");
        updaterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaterecordActionPerformed(evt);
            }
        });
        jPanel1.add(updaterecord);
        updaterecord.setBounds(470, 280, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Project BackGround/1713707-library-wallpaper.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, -50, 1200, 680);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 320, 73, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        // TODO add your handling code here:
        dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secondpage().setVisible(true);
            }
        });
    }//GEN-LAST:event_mainmenuActionPerformed

    private void addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecordActionPerformed
        // TODO add your handling code here:
        dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecord().setVisible(true);
            }
        });
    }//GEN-LAST:event_addrecordActionPerformed

    private void deleterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterecordActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteRecord().setVisible(true);
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_deleterecordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecord().setVisible(true);
            }
        });

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updaterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterecordActionPerformed
        // TODO add your handling code here:
        dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRecord().setVisible(true);
            }
        });
    }//GEN-LAST:event_updaterecordActionPerformed

    private void veiwallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiwallActionPerformed
        // TODO add your handling code here:
        dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veiwall().setVisible(true);
            }
        });
       
    }//GEN-LAST:event_veiwallActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addrecord;
    private javax.swing.JButton deleterecord;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainmenu;
    private javax.swing.JButton updaterecord;
    private javax.swing.JButton veiwall;
    // End of variables declaration//GEN-END:variables
}