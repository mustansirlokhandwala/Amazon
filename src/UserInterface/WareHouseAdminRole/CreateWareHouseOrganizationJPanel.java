/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.WareHouseAdminRole;

import EcoSystem.Enterprise.WareHouse;
import EcoSystem.Organization.Organization;
import EcoSystem.Organization.Organization.OrganizationType;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class CreateWareHouseOrganizationJPanel extends javax.swing.JPanel {

    private WareHouse wareHouse;
    private JPanel userProcessContainer;
    public CreateWareHouseOrganizationJPanel(WareHouse wareHouse , JPanel upc) {
        initComponents();
        this.wareHouse = wareHouse;
        this.userProcessContainer = upc;
        populateOrganizationTable();
        populateOrganizationtypecombo();
    }
    
    public void populateOrganizationTable(){
        DefaultTableModel model = (DefaultTableModel)organizationTable.getModel();
        model.setRowCount(0);
        
        for(Organization organization:wareHouse.getOrganizationDirectory().getOrganizationlist()){
            Object[] row = new Object[2];
            row[0]=organization;
            row[1]=organization.getOrganizationID();
            
            model.addRow(row);
        }
    }
    
    public void populateOrganizationtypecombo(){
        typeJComboBox.removeAllItems();
        typeJComboBox.addItem(OrganizationType.WareHouseProcessing);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        typeJComboBox = new javax.swing.JComboBox();
        createJButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization", "Organization ID"
            }
        ));
        jScrollPane1.setViewportView(organizationTable);

        jLabel1.setText("Name :");

        jLabel2.setText("Type :");

        typeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeJComboBoxActionPerformed(evt);
            }
        });

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTxtField)
                            .addComponent(typeJComboBox, 0, 151, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(96, 96, 96)
                        .addComponent(createJButton)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(typeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJButton)
                    .addComponent(backButton))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeJComboBoxActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        String name = nameTxtField.getText();
        OrganizationType type = (OrganizationType)typeJComboBox.getSelectedItem();
        wareHouse.getOrganizationDirectory().createOrganization(type);
        populateOrganizationTable();
    }//GEN-LAST:event_createJButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable organizationTable;
    private javax.swing.JComboBox typeJComboBox;
    // End of variables declaration//GEN-END:variables
}
