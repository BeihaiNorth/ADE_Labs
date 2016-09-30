/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ProductDirectory;
import java.awt.CardLayout;

/**
 *
 * @author leslie
 */
public class MainJFrame extends javax.swing.JFrame {

    private ProductDirectory productDirectory;
    
    
    public MainJFrame() {
        initComponents();
        this.productDirectory = new ProductDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        selectRoleJPanel = new javax.swing.JPanel();
        manageBtn = new javax.swing.JButton();
        browseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userProcessContainerJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectRoleJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageBtn.setText("Manage Products");
        manageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBtnActionPerformed(evt);
            }
        });
        selectRoleJPanel.add(manageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, -1, -1));

        browseBtn.setText("Browse Products");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });
        selectRoleJPanel.add(browseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel1.setText("If you are a costumer:");
        selectRoleJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel2.setText("If you are a supplier:");
        selectRoleJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jSplitPane1.setLeftComponent(selectRoleJPanel);

        userProcessContainerJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainerJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        ChooseCategoryJPanel chooseCategoryJPanel = new ChooseCategoryJPanel(productDirectory, userProcessContainerJPanel);
        userProcessContainerJPanel.add("chooseCategoryJPanel", chooseCategoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
    }//GEN-LAST:event_browseBtnActionPerformed

    private void manageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBtnActionPerformed
        VendorIdentifyJPanel supplierIdentifyJPanel = new VendorIdentifyJPanel(productDirectory, userProcessContainerJPanel);
        userProcessContainerJPanel.add("supplierIdentifyJPanel", supplierIdentifyJPanel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
    }//GEN-LAST:event_manageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageBtn;
    private javax.swing.JPanel selectRoleJPanel;
    private javax.swing.JPanel userProcessContainerJPanel;
    // End of variables declaration//GEN-END:variables
}