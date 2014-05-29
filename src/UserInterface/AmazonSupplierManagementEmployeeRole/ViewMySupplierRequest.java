/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AmazonSupplierManagementEmployeeRole;

import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Network.Network;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkQueue.SupplierRequest;
import EcoSystem.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mustansir
 */
public class ViewMySupplierRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Amazon amazon;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    public ViewMySupplierRequest(JPanel upc , Amazon amazon , UserAccount userAccount , EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = upc;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.amazon = amazon;
    }
     
    private void populateWorkResutTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkQueueList()){
            Object[] row = new Object[7];
            row[0]=request;
            row[1]=((SupplierRequest)request).getSupplier().getName();
            row[2]=((SupplierRequest)request).getSupplier().getAddress();
            row[3]=request.getRequestDate();
            row[4]=request.getResolveDate() == null ? " -- " : request.getResolveDate();
            row[5]=request.getStatus() == null ? "Pending " : "Granted";
            row[6]=request.getReceiver() == null ? "Not Assigned " : request.getReceiver();
            
            model.addRow(row);
            
                    
                    
            
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

        rejectSupplierJButton = new javax.swing.JButton();
        grantPermissionJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        rejectSupplierJButton.setText("Reject Supplier");
        rejectSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectSupplierJButtonActionPerformed(evt);
            }
        });

        grantPermissionJButton.setText("Grant Permission");
        grantPermissionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grantPermissionJButtonActionPerformed(evt);
            }
        });

        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Supplier Name", "Supplier Address", "Date Created", "Date Resolved", "Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestTable);

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(20, 20, 20)
                .addComponent(rejectSupplierJButton)
                .addGap(18, 18, 18)
                .addComponent(grantPermissionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectSupplierJButton)
                    .addComponent(grantPermissionJButton)
                    .addComponent(backButton))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rejectSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectSupplierJButtonActionPerformed
        int selectedRow = workRequestTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }
        WorkRequest request =(WorkRequest)workRequestTable.getValueAt(selectedRow, 0);
        if(request.getStatus() != null){
            JOptionPane.showMessageDialog(null, "The request has already been handled");
            return;
        }
        request.setStatus("Rejected");
        request.setResolveDate(new Date());
        populateWorkResutTable();
    }//GEN-LAST:event_rejectSupplierJButtonActionPerformed

    private void grantPermissionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grantPermissionJButtonActionPerformed
        int selectedRow = workRequestTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request");
        }

        WorkRequest request =(WorkRequest)workRequestTable.getValueAt(selectedRow, 0);
        if(request.getStatus() != null){
            JOptionPane.showMessageDialog(null, "The request has already been handled");
            return;
        }
        String location =((SupplierRequest)request).getSupplier().getAddress().getCity();
        Network inNetwork = null;
        Amazon inAmazon = null;
        for(Network countryNetwork : ecoSystem.getNetworkDirectory().getNetworkList()){
            if(countryNetwork.getName().equals(location)){
                inNetwork = countryNetwork;
            }
            for(Enterprise enterprise : countryNetwork.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof Amazon){
                    inAmazon = (Amazon)enterprise;
                }
            }

            for(Network stateNetwork : countryNetwork.getNetworkDirectory().getNetworkList()){
                if(stateNetwork.getName().equals(location)){
                    inNetwork = stateNetwork;
                }
                for(Network cityNetwork : stateNetwork.getNetworkDirectory().getNetworkList()){
                    if(cityNetwork.getName().equals(location)){
                        inNetwork = cityNetwork;
                    }
                }
            }
        }

        createSupplierJPanel supplierJPanel = new createSupplierJPanel(userProcessContainer, request, inAmazon, inNetwork);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("supplierJPanel", supplierJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_grantPermissionJButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        populateWorkResutTable();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton grantPermissionJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectSupplierJButton;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables
}