/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import Database.Bdd;
import Database.Logs;
import Database.ResultSetTableModel;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author edmae
 */
public class PettyCash extends javax.swing.JPanel {

    private static Bdd mBdd;
    private static Calendar mCalendar = new GregorianCalendar();
    private static ResultSet rs;
    /**
     * Creates new form PettyCash
     */
    public PettyCash() {
        initComponents();
        mBdd = new Bdd();
        jTable1.setModel(new ResultSetTableModel(mBdd.querySelectAll("PETTYCASH")));
        txt_error.setVisible(false);
        txt_balance.setText(getBalance());
    }
    public void updateJTable(){
        jTable1.setModel(new ResultSetTableModel(mBdd.querySelectAll("PETTYCASH")));
        txt_balance.setText(getBalance());
    }
    public static String getBalance(){
        int deb_ret = 0;
        int sumWithDrawal = 0;
        try{
            rs = mBdd.querySelectParttion("PETTYCASH", "(SUM(DEBIT) - SUM(CREDIT)) AS BALANCE");
            if(rs.next())
                deb_ret = Integer.valueOf(   ( (rs.getString(1) == null ) ? "0" : rs.getString(1))  );
            
            rs = mBdd.querySelectParttion("transactions", "SUM(WITHDRAWAL)");
            if(rs.next())
                sumWithDrawal = Integer.valueOf( ( (rs.getString(1) == null ) ? "0" : rs.getString(1)) );
            
            
            return String.valueOf(deb_ret - sumWithDrawal);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void retrievePettyCashAmount(int value){
        if(value > 0){
            String date = mCalendar.get(Calendar.DAY_OF_MONTH)+"/"+mCalendar.get(Calendar.MONTH)+"/"+mCalendar.get(Calendar.YEAR);
            String[] columns = {"DATE", "DEBIT","CREDIT"};
            String[] values = {date, "0", ""+value};
            mBdd.queryInsert("pettycash", columns,  values);
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jsp_amount = new javax.swing.JSpinner();
        btn_submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_balance = new javax.swing.JLabel();
        txt_error = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 153));
        setMaximumSize(new java.awt.Dimension(400, 315));
        setMinimumSize(new java.awt.Dimension(400, 315));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Petty Cash");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 380, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 380, 157));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Operation:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add amount", "Retrieve amount" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 63, 123, -1));
        add(jsp_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 63, 98, -1));

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 62, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BALANCE AFTER WITHDRAWAL: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txt_balance.setForeground(new java.awt.Color(255, 255, 255));
        txt_balance.setText("...");
        add(txt_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 96, -1));

        txt_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_error.setText("...");
        add(txt_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, 301, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        try{
            String date = mCalendar.get(Calendar.DAY_OF_MONTH)+"/"+mCalendar.get(Calendar.MONTH)+"/"+mCalendar.get(Calendar.YEAR);
            txt_error.setVisible(false);
            if(jComboBox1.getSelectedIndex() == 0){
                if((int)jsp_amount.getValue() > 0){
                    
                    String[] columns = {"DATE", "DEBIT","CREDIT"};
                    String[] values = {date, ""+ (int)jsp_amount.getValue(), "0"};
                    Logs.setLogMessage("Petty Cash",mBdd.queryInsert("pettycash", columns,  values));
                    jsp_amount.setValue(0);
                    txt_balance.setText(getBalance());
                }else{
                    txt_error.setVisible(true);
                    txt_error.setText("The amount must be greater than 0");
                    Logs.setLogMessage("Petty Cash", txt_error.getText());
                }
            }else{
                if((int)jsp_amount.getValue() > 0){
                    
                    String[] columns = {"DATE", "DEBIT","CREDIT"};
                    String[] values = {date, "0", ""+ (int)jsp_amount.getValue()};
                    Logs.setLogMessage("Petty Cash",mBdd.queryInsert("pettycash", columns,  values));
                    jsp_amount.setValue(0);
                    txt_balance.setText(getBalance());
                }else{
                    txt_error.setVisible(true);
                    txt_error.setText("The amount must be greater than 0");
                    Logs.setLogMessage("Petty Cash", txt_error.getText());
                }
                
            }
            jTable1.setModel(new ResultSetTableModel(mBdd.querySelectAll("PETTYCASH")));
        }catch(Exception e){Logs.setLogMessage("Petty Cash", e.toString());}
    }//GEN-LAST:event_btn_submitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner jsp_amount;
    private javax.swing.JLabel txt_balance;
    private javax.swing.JLabel txt_error;
    // End of variables declaration//GEN-END:variables
}
