/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MUHAMMED BILAL
 */
public class UpdateRecord extends javax.swing.JFrame {

    /**
     * Creates new form UpdateRecord
     */
    public UpdateRecord() {
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
        updatestudentid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updatestudentname = new javax.swing.JTextField();
        updatestudentdept = new javax.swing.JTextField();
        updateborrowbook = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updatedateofissue = new com.toedter.calendar.JDateChooser();
        updatetillend = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        updatestudentrecord = new javax.swing.JButton();
        backtostudentrecordafterupdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        updatestudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentidActionPerformed(evt);
            }
        });
        jPanel1.add(updatestudentid);
        updatestudentid.setBounds(280, 150, 240, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 160, 110, 22);
        jPanel1.add(updatestudentname);
        updatestudentname.setBounds(280, 200, 240, 40);
        jPanel1.add(updatestudentdept);
        updatestudentdept.setBounds(280, 260, 240, 40);
        jPanel1.add(updateborrowbook);
        updateborrowbook.setBounds(280, 320, 240, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 210, 160, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 270, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name of Borrow Book");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 320, 240, 30);
        jPanel1.add(updatedateofissue);
        updatedateofissue.setBounds(280, 380, 240, 40);
        jPanel1.add(updatetillend);
        updatetillend.setBounds(280, 440, 240, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Issue");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 390, 121, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Till End");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 450, 110, 22);

        updatestudentrecord.setBackground(new java.awt.Color(0, 0, 0));
        updatestudentrecord.setForeground(new java.awt.Color(255, 255, 255));
        updatestudentrecord.setText("Update");
        updatestudentrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentrecordActionPerformed(evt);
            }
        });
        jPanel1.add(updatestudentrecord);
        updatestudentrecord.setBounds(580, 445, 90, 30);

        backtostudentrecordafterupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Icons/Mix Icon/Home.png"))); // NOI18N
        backtostudentrecordafterupdate.setToolTipText("Back to StudentRecord");
        backtostudentrecordafterupdate.setBorderPainted(false);
        backtostudentrecordafterupdate.setContentAreaFilled(false);
        backtostudentrecordafterupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtostudentrecordafterupdateActionPerformed(evt);
            }
        });
        jPanel1.add(backtostudentrecordafterupdate);
        backtostudentrecordafterupdate.setBounds(20, 30, 30, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Update Record");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(230, 40, 300, 44);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Project BackGround/download.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatestudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestudentidActionPerformed

    private void backtostudentrecordafterupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtostudentrecordafterupdateActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecord().setVisible(true);
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_backtostudentrecordafterupdateActionPerformed

    private void updatestudentrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentrecordActionPerformed

     String Tidsearch=updatestudentid.getText()+"\n";
        String TName=updatestudentname.getText();
             String Tdept=updatestudentdept.getText();
             String Tbook=updateborrowbook.getText();
             String TDOII=updatedateofissue.getDate().toString();
             String TDOEE=updatetillend.getDate().toString();
             TDOII = prprocess(TDOII);
            TDOEE = prprocess(TDOEE);
            
            
            String id,name,dept,Nbook,DOII,DOEE;
            
            boolean flag=false;
            FileWriter fw=null;
            BufferedWriter bw=null;
            FileReader fr=null;
            BufferedReader br=null;
            String Orignalfile="Student.txt";
            String Tempfile="Temp.txt";
            File oldfile=new File(Orignalfile);
            File newfile= new File(Tempfile);
            try
            {
                fw=new FileWriter(newfile);
                bw=new BufferedWriter(fw);
                fr=new  FileReader(oldfile);
                br= new BufferedReader(fr);
                while((id=br.readLine())!=null)
                {
                    id=id+"\n";
                    name=br.readLine()+"\n";
                    dept=br.readLine()+"\n";
                    Nbook=br.readLine()+"\n";
                    DOII=br.readLine()+"\n";
                    DOEE=br.readLine()+"\n";
                    if(id.equals(Tidsearch))
                    {
                        flag=true;
                        bw.write(Tidsearch);
                        bw.write(TName);
                        bw.newLine();
                        bw.write(Tdept);
                        bw.newLine();
                        bw.write(Tbook);
                        bw.newLine();
                        bw.write(TDOII);
                        bw.newLine();
                        bw.write(TDOEE);
                        bw.newLine();
                    }
                    else
                    {
                        bw.write(id);
                        bw.write(name);
                        
                        bw.write(dept);
                        
                        bw.write(Nbook);
                        
                        bw.write(DOII);
                       
                        bw.write(DOEE);
                       
                    }
                    
                }
                if(flag==false)
                {
                    JOptionPane.showMessageDialog(this,"Sorry This Person isn't Found in Record");
                }
            } catch (IOException ex) {
            Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally
            {
                if(br!=null)
                    try {
                        br.close();
                } catch (IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(bw!=null)
                    try {
                        bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(fr!=null)
                    try {
                        fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(fw!=null)
                    try {
                        fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
                oldfile.delete();
                File file=new File("Student.txt");
              newfile.renameTo(file);
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestudentrecordActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtostudentrecordafterupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField updateborrowbook;
    private com.toedter.calendar.JDateChooser updatedateofissue;
    private javax.swing.JTextField updatestudentdept;
    private javax.swing.JTextField updatestudentid;
    private javax.swing.JTextField updatestudentname;
    private javax.swing.JButton updatestudentrecord;
    private com.toedter.calendar.JDateChooser updatetillend;
    // End of variables declaration//GEN-END:variables
    private String prprocess(String DOE) {
        String temp = "";
        
        StringTokenizer tokens = new StringTokenizer(DOE);
        
        tokens.nextToken();
       
        temp += tokens.nextToken()+" ";
        
        temp += tokens.nextToken()+" ";
        
        
        tokens.nextToken();
       

        tokens.nextToken();
        temp += tokens.nextToken();
        
        return temp;
        }
}
