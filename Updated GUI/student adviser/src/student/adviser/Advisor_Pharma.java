/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.adviser;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.jpl7.Term;
import java.util.Hashtable;
import jpl.*;
import jpl.Query;
/**
 *
 * @author spide
 */
public class Advisor_Pharma extends javax.swing.JFrame {

    /**
     * Creates new form advisor
     */
    public Advisor_Pharma() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DropBtn = new javax.swing.JButton();
        PreBtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        ReqBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Offered Courses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Courses Completed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DropBtn.setText("Drop");
        DropBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropBtnActionPerformed(evt);
            }
        });

        PreBtn.setText("Prerequisite");
        PreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreBtnActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Course Code");

        ReqBtn.setText("Required for");
        ReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReqBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Faculty of Computer Engineering");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DropBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DropBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        File file = new File("F:\\GitHub\\Concepts-Project\\Courses_Available_Pharma.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Advisor_Pharma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String st;
        try {
            while ((st = br.readLine()) != null)
            {
                System.out.println(st);
                jTextArea1.append(st);
                jTextArea1.append(" \n");
                
            }   
        } catch (IOException ex) {
            Logger.getLogger(Advisor_Pharma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        close();
            Main m = new Main();
            m.setVisible(true);

    }//GEN-LAST:event_logoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        File file = new File("F:\\GitHub\\Concepts-Project\\Pharma_Student_Courses_Taken.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Advisor_Pharma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String st;
        try {
            while ((st = br.readLine()) != null)
            {
                System.out.println(st);
                jTextArea1.append(st);
                jTextArea1.append(" \n");
                
            }   
        } catch (IOException ex) {
            Logger.getLogger(Advisor_Pharma.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DropBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropBtnActionPerformed
        // TODO add your handling code here:
        
        ArrayList<String> Offered = new ArrayList<String>();
        
        File file = new File("F:\\GitHub\\Concepts-Project\\Courses_Available_Pharma.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Advisor_Pharma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String st;
        try 
        {
            while ((st = br.readLine()) != null)
             Offered.add(st);            
        } catch (IOException ex) {
            Logger.getLogger(Advisor_Pharma.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        Variable Course = new Variable();
        String usercourse = "";
        String t1,t2;
        
        t1 = "consult('F:/GitHub/Concepts-Project/PrologEnginePharma.pl')"; //initialize database
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "success" : "failed") );
        
        usercourse = jTextField3.getText();
        t2 = "prereq(" + usercourse + ",Course)";
        System.out.println(t2);
        Query q2 = new Query(t2);
        
        //System.out.println(t2);
        //temp2 = q2.getSolution().toString();
        //jTextField3.setText(temp2);
        //System.out.println(q2.oneSolution().get("Course"));
        
        java.util.Hashtable[] answers = q2.allSolutions();
        for ( int i = 0; i < answers.length; i++)
        {
            if(Offered.contains(answers[i]))
            {
            jTextArea1.append(answers[i].toString());
            jTextArea1.append(" \n");
            }
        } 
        
    }//GEN-LAST:event_DropBtnActionPerformed

    private void PreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreBtnActionPerformed
        // TODO add your handling code here:
        String temp;
        temp = jTextField3.getText();
        Variable Course = new Variable();
        String usercourse = "";
        
        String t1 = "consult('F:/GitHub/Concepts-Project/PrologEnginePharma.pl')"; //initialize database
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "success" : "failed") );
        
        //String t2 = "prereq(mth100,Course)";
        
        usercourse = jTextField3.getText();
        String t2 = "prereq(" + usercourse + ",Course)";
        System.out.println(t2);
        Query q2 = new Query(t2);
        
        //System.out.println(t2);
        //temp2 = q2.getSolution().toString();
        //jTextField3.setText(temp2);
        //System.out.println(q2.oneSolution().get("Course"));
        
        java.util.Hashtable[] answers = q2.allSolutions();
        for ( int i = 0; i < answers.length; i++)
        {
            jTextArea1.append(answers[i].toString());
            jTextArea1.append(" \n");
        }

    }//GEN-LAST:event_PreBtnActionPerformed

    private void ReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReqBtnActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        String temp;
        temp = jTextField3.getText();
        Variable Course = new Variable();
        String usercourse = "";
        
        String t1 = "consult('F:/GitHub/Concepts-Project/PrologEnginePharma.pl')"; //initialize database
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "success" : "failed") );
        
        //String t2 = "prereq(mth100,Course)";
        
        usercourse = jTextField3.getText();
        String t2 = "prereq(Course," + usercourse +")";
        System.out.println(t2);
        Query q2 = new Query(t2);
        
        //System.out.println(t2);
        //temp2 = q2.getSolution().toString();
        //jTextField3.setText(temp2);
        //System.out.println(q2.oneSolution().get("Course"));
        
        java.util.Hashtable[] answers = q2.allSolutions();
        for ( int i = 0; i < answers.length; i++)
        {
            jTextArea1.append(answers[i].toString());
            jTextArea1.append(" \n");
        }
        
    }//GEN-LAST:event_ReqBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Advisor_Pharma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Advisor_Pharma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Advisor_Pharma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Advisor_Pharma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Advisor_Pharma().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DropBtn;
    private javax.swing.JButton PreBtn;
    private javax.swing.JButton ReqBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
private void close()
{
    WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseing);
}

    
}
