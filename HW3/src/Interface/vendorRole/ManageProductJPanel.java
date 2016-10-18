/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.vendorRole;

import Business.Product;
import Business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leslie
 */
public class ManageProductJPanel extends javax.swing.JPanel {

    private ProductDirectory productDirectory;
    private JPanel userProcessContainerJPanel; 
    private String vendorName;
    
    public ManageProductJPanel(ProductDirectory productDirectory, JPanel userProcessContainerJPanel, String vendorName) {
        initComponents();
        this.productDirectory = productDirectory;
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.vendorName = vendorName;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)viewProductTable.getModel();
        dtm.setRowCount(0);
        
        for(Product product:productDirectory.getProductDirectory())
        {
            Object row[] = new Object[3];
            row[0] = product;
            row[1] = product.getUnderCatalog();
            row[2] = product.getBasePrice();
            dtm.addRow(row);
        }
         
    }
    
    public static boolean keywordFilter(String description, String keyword){
        return description.indexOf(keyword) > 0 ;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        modelNumTextField = new javax.swing.JTextField();
        categoryTextField = new javax.swing.JTextField();
        basePriceTextField = new javax.swing.JTextField();
        ceilingPriceTextField = new javax.swing.JTextField();
        floorPriceTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewProductTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        deicriptionTextField = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        viewDetailBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        searchNameTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        featureTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        searchKeyTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        searchBtn1 = new javax.swing.JButton();

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel1.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel3.setText("Model Number:");

        jLabel4.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel4.setText("Description:");

        jLabel5.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel5.setText("Base Price:");

        jLabel6.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel6.setText("Ceiling Price:");

        jLabel7.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel7.setText("Floor Price:");

        jLabel8.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel8.setText("Features:");

        jLabel9.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        jLabel9.setText("Category:");

        productNameTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        productNameTextField.setEnabled(false);

        modelNumTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        modelNumTextField.setEnabled(false);

        categoryTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        categoryTextField.setEnabled(false);

        basePriceTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        basePriceTextField.setEnabled(false);

        ceilingPriceTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        ceilingPriceTextField.setEnabled(false);

        floorPriceTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        floorPriceTextField.setEnabled(false);

        viewProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Catagory", "Base Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewProductTable);
        if (viewProductTable.getColumnModel().getColumnCount() > 0) {
            viewProductTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            viewProductTable.getColumnModel().getColumn(2).setPreferredWidth(70);
        }

        jScrollPane2.setEnabled(false);

        deicriptionTextField.setColumns(20);
        deicriptionTextField.setRows(3);
        jScrollPane2.setViewportView(deicriptionTextField);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        viewDetailBtn.setText("View Detail");
        viewDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);

        searchNameTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        searchNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameTextFieldActionPerformed(evt);
            }
        });

        jScrollPane3.setEnabled(false);

        featureTextArea.setColumns(20);
        featureTextArea.setRows(3);
        jScrollPane3.setViewportView(featureTextArea);

        jLabel10.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 14)); // NOI18N
        jLabel10.setText("Name:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel11.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 14)); // NOI18N
        jLabel11.setText("Keyword in decription:");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        searchKeyTextField.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 13)); // NOI18N
        searchKeyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchKeyTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("sort by Lowesr Price");

        resetBtn.setText("Reset Table");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        searchBtn1.setText("Search by name");
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(modelNumTextField)
                                .addComponent(categoryTextField)
                                .addComponent(basePriceTextField)
                                .addComponent(ceilingPriceTextField)
                                .addComponent(floorPriceTextField)
                                .addComponent(productNameTextField)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(viewDetailBtn)
                    .addComponent(jButton1))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(basePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ceilingPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(floorPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn)
                    .addComponent(backBtn))
                .addGap(58, 58, 58))
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainerJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.previous(userProcessContainerJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtnActionPerformed
        int selectedrow = viewProductTable.getSelectedRow();
        
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row","Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            Product product = (Product)viewProductTable.getValueAt(selectedrow, 0);
            
            //set Text Field
            productNameTextField.setText(product.getName());
            modelNumTextField.setText(product.getModelNum());
            categoryTextField.setText(product.getUnderCatalog());
            basePriceTextField.setText(Float.toString(product.getBasePrice()));
            ceilingPriceTextField.setText(Float.toString(product.getCeilingPrice()));
            floorPriceTextField.setText(Float.toString(product.getFloorPrice()));
            deicriptionTextField.setText(product.getDescription());
            
            //set features Text Field
            String features = null;
            for (String feature : product.getFeatures()) {
                features += feature + ",";
            }
            features = features.substring(0, features.length()-1);
            featureTextArea.setText(features);
            
        }
    }//GEN-LAST:event_viewDetailBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        
        int selectedrow = viewProductTable.getSelectedRow();   
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row","Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            Product product = (Product)viewProductTable.getValueAt(selectedrow, 0);
            productDirectory.deleteProduct(product);
            populateTable();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameTextFieldActionPerformed

    private void searchKeyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchKeyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyTextFieldActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)viewProductTable.getModel();
        dtm.setRowCount(0);
        
        String keyword = searchKeyTextField.getText();
        for (Product p : productDirectory.getProductDirectory()) {
            if(keywordFilter(p.getDescription(), keyword)){
              
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getUnderCatalog();
                row[2] = p.getBasePrice();
                dtm.addRow(row);
            }
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        String name = searchNameTextField.getText();
        DefaultTableModel dtm = (DefaultTableModel)viewProductTable.getModel();
        dtm.setRowCount(0);
        for (Product p : productDirectory.getProductDirectory()) {
            if(p.getName().equals(name)){
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getUnderCatalog();
                row[2] = p.getBasePrice();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_searchBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField basePriceTextField;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JTextField ceilingPriceTextField;
    private javax.swing.JTextArea deicriptionTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea featureTextArea;
    private javax.swing.JTextField floorPriceTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField modelNumTextField;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JTextField searchKeyTextField;
    private javax.swing.JTextField searchNameTextField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewDetailBtn;
    private javax.swing.JTable viewProductTable;
    // End of variables declaration//GEN-END:variables
}