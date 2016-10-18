/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.VitalSignsHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leslie
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    private VitalSignsHistory vitalSignsHistory;
    public ViewVitalsJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)vitalSignsTbl.getModel(); 
        dtm.setRowCount(0);
        
        for(VitalSigns vitalSigns:vitalSignsHistory.getVitalSignHistory() )
        {
            Object row[] = new Object[2];
            row[0] = vitalSigns;
            row[1] = vitalSigns.getBloodPressure();
            dtm.addRow(row);
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignsTbl = new javax.swing.JTable();
        viewDetailBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        lbPulse = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        dateTxtF = new javax.swing.JTextField();
        lbTemperature = new javax.swing.JLabel();
        temperatueTxtF = new javax.swing.JTextField();
        lbBldPressure = new javax.swing.JLabel();
        bldPressureTxtF = new javax.swing.JTextField();
        pulseTxtF = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("View Vital Sign");

        vitalSignsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignsTbl);

        viewDetailBtn.setText("View Details ");
        viewDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        lbPulse.setText("Pulse:");

        lbDate.setText("Date:");

        dateTxtF.setEnabled(false);

        lbTemperature.setText("Temperature:");

        temperatueTxtF.setEnabled(false);

        lbBldPressure.setText("Blood Pressure:");

        bldPressureTxtF.setEnabled(false);

        pulseTxtF.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(viewDetailBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbDate)
                                    .addGap(38, 38, 38)
                                    .addComponent(dateTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPulse)
                                    .addGap(38, 38, 38)
                                    .addComponent(pulseTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbBldPressure)
                                    .addGap(38, 38, 38)
                                    .addComponent(bldPressureTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbTemperature)
                                    .addGap(38, 38, 38)
                                    .addComponent(temperatueTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel1))))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailBtn)
                    .addComponent(deleteBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTemperature)
                    .addComponent(temperatueTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBldPressure)
                    .addComponent(bldPressureTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPulse)
                    .addComponent(pulseTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(dateTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtnActionPerformed
        int selectedrow = vitalSignsTbl.getSelectedRow();
        
        if(selectedrow >= 0)
        {
            VitalSigns vitalSigns = (VitalSigns)vitalSignsTbl.getValueAt(selectedrow, 0);
            bldPressureTxtF.setText(String.valueOf(vitalSigns.getBloodPressure()));
            temperatueTxtF.setText(String.valueOf(vitalSigns.getTemprature()));
            pulseTxtF.setText(String.valueOf(vitalSigns.getPulse()));
            dateTxtF.setText(vitalSigns.getDate());
            
            
        }
        else 
            JOptionPane.showMessageDialog(null, "please select a row");
    }//GEN-LAST:event_viewDetailBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = vitalSignsTbl.getSelectedRow();
        
        if(selectedrow >= 0)
        {
            VitalSigns vitalSigns = (VitalSigns)vitalSignsTbl.getValueAt(selectedrow, 0);
            vitalSignsHistory.deleteVitals(vitalSigns);
            JOptionPane.showMessageDialog(null, "VitalSign has been deleted.");
            populateTable();
        }
        else 
            JOptionPane.showMessageDialog(null, "please select a row");
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bldPressureTxtF;
    private javax.swing.JTextField dateTxtF;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBldPressure;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbPulse;
    private javax.swing.JLabel lbTemperature;
    private javax.swing.JTextField pulseTxtF;
    private javax.swing.JTextField temperatueTxtF;
    private javax.swing.JButton viewDetailBtn;
    private javax.swing.JTable vitalSignsTbl;
    // End of variables declaration//GEN-END:variables
}