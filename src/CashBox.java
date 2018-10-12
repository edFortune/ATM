
import Database.Logs;
import java.awt.CardLayout;
import Database.ConnectorMXJObjectTestExample;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edmae
 */
public class CashBox extends javax.swing.JFrame {
    public static final CardLayout cardLayout = new CardLayout();
    private final Management mManagement = new Management();
    private final Logs mLogs = new Logs();
    /**
     * Creates new form CashBox
     */
    public CashBox() {
        initComponents();
        setCardLayout();
    }
    
    private void setCardLayout(){
        
        pnl_cardLayout.setLayout(cardLayout);
        
        
        pnl_cardLayout.add(new LogIn(), "Login");
        pnl_cardLayout.add(new Withdrawal(), "Withdrawal");
        pnl_cardLayout.add(new Confirmation(), "Confirmation");
        pnl_cardLayout.add(mManagement, "Management");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_logname = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_signIn = new javax.swing.JLabel();
        sptr_signIn = new javax.swing.JSeparator();
        txt_withdraw = new javax.swing.JLabel();
        sptr_withdraw = new javax.swing.JSeparator();
        txt_confirm = new javax.swing.JLabel();
        sptr_confirm = new javax.swing.JSeparator();
        txt_management = new javax.swing.JLabel();
        sptr_cards = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        pnl_cardLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My CashBox");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello,");

        txt_logname.setForeground(new java.awt.Color(255, 255, 255));
        txt_logname.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_logname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txt_logname))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_signIn.setBackground(new java.awt.Color(51, 51, 255));
        txt_signIn.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        txt_signIn.setForeground(new java.awt.Color(255, 255, 255));
        txt_signIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_signIn.setText("Sign In");
        txt_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_signInMouseExited(evt);
            }
        });
        jPanel3.add(txt_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, 120, 28));
        jPanel3.add(sptr_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 140, 10));

        txt_withdraw.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        txt_withdraw.setForeground(new java.awt.Color(255, 255, 255));
        txt_withdraw.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_withdraw.setText("Withdrawal");
        txt_withdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_withdrawMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_withdrawMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_withdrawMouseExited(evt);
            }
        });
        jPanel3.add(txt_withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 61, 120, 24));
        jPanel3.add(sptr_withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, 140, 10));

        txt_confirm.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        txt_confirm.setForeground(new java.awt.Color(255, 255, 255));
        txt_confirm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_confirm.setText("Confirmation");
        txt_confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_confirmMouseExited(evt);
            }
        });
        jPanel3.add(txt_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 107, 110, 23));
        jPanel3.add(sptr_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 140, 10));

        txt_management.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        txt_management.setForeground(new java.awt.Color(255, 255, 255));
        txt_management.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_management.setText("Management");
        txt_management.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_managementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_managementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_managementMouseExited(evt);
            }
        });
        jPanel3.add(txt_management, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 26));
        jPanel3.add(sptr_cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 10));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 160, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 450));

        pnl_cardLayout.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout pnl_cardLayoutLayout = new javax.swing.GroupLayout(pnl_cardLayout);
        pnl_cardLayout.setLayout(pnl_cardLayoutLayout);
        pnl_cardLayoutLayout.setHorizontalGroup(
            pnl_cardLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        pnl_cardLayoutLayout.setVerticalGroup(
            pnl_cardLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_cardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 610, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_signInMouseEntered
        // TODO add your handling code here:
        txt_signIn.setFont(new java.awt.Font("Book Antiqua", 1, 12));
        sptr_signIn.setVisible(false);
    }//GEN-LAST:event_txt_signInMouseEntered

    private void txt_signInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_signInMouseExited
        // TODO add your handling code here:
        txt_signIn.setFont(new java.awt.Font("Book Antiqua", 0, 11));
        sptr_signIn.setVisible(true);
    }//GEN-LAST:event_txt_signInMouseExited

    private void txt_withdrawMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_withdrawMouseEntered
        // TODO add your handling code here:
        txt_withdraw.setFont(new java.awt.Font("Book Antiqua", 1, 12));
        sptr_withdraw.setVisible(false);
    }//GEN-LAST:event_txt_withdrawMouseEntered

    private void txt_withdrawMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_withdrawMouseExited
        // TODO add your handling code here:
        txt_withdraw.setFont(new java.awt.Font("Book Antiqua", 0, 11));
        sptr_withdraw.setVisible(true);
    }//GEN-LAST:event_txt_withdrawMouseExited

    private void txt_confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_confirmMouseEntered
        // TODO add your handling code here:
        txt_confirm.setFont(new java.awt.Font("Book Antiqua", 1, 12));
        sptr_confirm.setVisible(false);
    }//GEN-LAST:event_txt_confirmMouseEntered

    private void txt_confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_confirmMouseExited
        // TODO add your handling code here:
        txt_confirm.setFont(new java.awt.Font("Book Antiqua", 0, 11));
        sptr_confirm.setVisible(true);
    }//GEN-LAST:event_txt_confirmMouseExited

    private void txt_managementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_managementMouseEntered
        // TODO add your handling code here:
        txt_management.setFont(new java.awt.Font("Book Antiqua", 1, 12));
        sptr_cards.setVisible(false);
    }//GEN-LAST:event_txt_managementMouseEntered

    private void txt_managementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_managementMouseExited
        // TODO add your handling code here:
        txt_management.setFont(new java.awt.Font("Book Antiqua", 0, 11));
        sptr_cards.setVisible(true);
    }//GEN-LAST:event_txt_managementMouseExited

    private void txt_signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_signInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_signInMouseClicked

    private void txt_withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_withdrawMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_withdrawMouseClicked

    private void txt_confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_confirmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirmMouseClicked

    private void txt_managementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_managementMouseClicked
        // TODO add your handling code here:
        mManagement.setLockOnManagement();
        cardLayout.show(pnl_cardLayout, "Management");
    }//GEN-LAST:event_txt_managementMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ConnectorMXJObjectTestExample.mysqldResource.shutdown();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CashBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CashBox cashBox = new CashBox();
                cashBox.setVisible(true);
                cashBox.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel pnl_cardLayout;
    private javax.swing.JSeparator sptr_cards;
    private javax.swing.JSeparator sptr_confirm;
    private javax.swing.JSeparator sptr_signIn;
    private javax.swing.JSeparator sptr_withdraw;
    private javax.swing.JLabel txt_confirm;
    public static javax.swing.JLabel txt_logname;
    private javax.swing.JLabel txt_management;
    private javax.swing.JLabel txt_signIn;
    private javax.swing.JLabel txt_withdraw;
    // End of variables declaration//GEN-END:variables
}