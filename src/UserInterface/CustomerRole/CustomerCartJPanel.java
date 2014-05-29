/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CustomerRole;

import EcoSystem.Customer.Customer;
import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Order.OrderItem;
import EcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mustansir
 */
public class CustomerCartJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Customer customer;
    private EcoSystem ecoSystem;
    private Amazon amazon;
    private UserAccount userAccount;
    public CustomerCartJPanel(EcoSystem ecoSystem , Customer customer ,JPanel upc,Amazon amazon , UserAccount userAccount ) {
        initComponents();
        this.userProcessContainer = upc;
        this.customer = customer;
        this.ecoSystem = ecoSystem;
        this.amazon = amazon;
        this.userAccount = userAccount;
        populateCart();
        populateSavedCart();
    }
    
    public void populateCart()
    {
        DefaultTableModel model = (DefaultTableModel)CheckoutCartTable.getModel();
        model.setRowCount(0);
        
        for(OrderItem oi : customer.getCart().getOrderItemList()){
            Object[] row = new Object[6];
            row[0]=oi;
            row[1]=oi.getProductInventory().getProduct().getProductCompany();
            row[2]=oi.getProductInventory().getProduct().getProductPrice();
            row[3]=oi.getQuantity();
            row[4]=oi.Price();
            row[5]=oi.getProductInventory().getQuantity();
            model.addRow(row);
                    
        }
    }
    
    public void populateSavedCart()
    {
        DefaultTableModel model = (DefaultTableModel)SavedCartTable.getModel();
        model.setRowCount(0);
        
        for(OrderItem oi : customer.getSavedCart().getOrderItemList()){
           Object[] row = new Object[6];
            row[0]=oi;
            row[1]=oi.getProductInventory().getProduct().getProductCompany();
            row[2]=oi.getProductInventory().getProduct().getProductPrice();
            row[3]=oi.getQuantity();
            row[4]=oi.Price();
            row[5]=oi.getProductInventory().getQuantity();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        CheckoutCartTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        SavedCartTable = new javax.swing.JTable();
        saveOrderJButton = new javax.swing.JButton();
        AddCartJButton = new javax.swing.JButton();
        proceedCheckOutJButton = new javax.swing.JButton();
        removefromCartJButton = new javax.swing.JButton();
        removeFromSaveJButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        CheckoutCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "ProductCompany", "ProductPrice", "Quantity", "Price", "Stock Remaining"
            }
        ));
        jScrollPane1.setViewportView(CheckoutCartTable);

        SavedCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Company", "Product Price", "Quantity", "Price", "Stock Remaining"
            }
        ));
        jScrollPane2.setViewportView(SavedCartTable);

        saveOrderJButton.setText("Save OrderItem For Later");
        saveOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOrderJButtonActionPerformed(evt);
            }
        });

        AddCartJButton.setText("Add to Cart");
        AddCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCartJButtonActionPerformed(evt);
            }
        });

        proceedCheckOutJButton.setText("Proceed to Checkout");
        proceedCheckOutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedCheckOutJButtonActionPerformed(evt);
            }
        });

        removefromCartJButton.setText("Remove From Cart");
        removefromCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removefromCartJButtonActionPerformed(evt);
            }
        });

        removeFromSaveJButton.setText("Remove From Saved Orders");
        removeFromSaveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromSaveJButtonActionPerformed(evt);
            }
        });

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Order Cart ");

        jLabel2.setText("Saved Cart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddCartJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeFromSaveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveOrderJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removefromCartJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceedCheckOutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveOrderJButton)
                    .addComponent(removefromCartJButton)
                    .addComponent(proceedCheckOutJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCartJButton)
                    .addComponent(removeFromSaveJButton))
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOrderJButtonActionPerformed
        int selectedRow = CheckoutCartTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an OrderItem to be saved for Later");
            return;
        }
        OrderItem oi = (OrderItem)CheckoutCartTable.getValueAt(selectedRow, 0);
        customer.getSavedCart().addOrderItem(oi);
        customer.getCart().removeOrderItem(oi);
        populateCart();
        populateSavedCart();
    }//GEN-LAST:event_saveOrderJButtonActionPerformed

    private void AddCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCartJButtonActionPerformed
       int selectedRow = SavedCartTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an OrderItem to be added to cart");
            return;
        }
        OrderItem oi = (OrderItem)SavedCartTable.getValueAt(selectedRow, 0);
        customer.getCart().addOrderItem(oi);
        customer.getSavedCart().removeOrderItem(oi);
        populateCart();
        populateSavedCart();
    }//GEN-LAST:event_AddCartJButtonActionPerformed

    private void proceedCheckOutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedCheckOutJButtonActionPerformed
        int i=0;
        if(customer.getCart().getOrderItemList().isEmpty()){
            JOptionPane.showMessageDialog(null, "Your Cart is Empty no order to be purchased ");
            return ;
        }
        for(OrderItem oi : customer.getCart().getOrderItemList()){
            if(oi.getProductInventory().getQuantity() == 0){
                JOptionPane.showMessageDialog(null, "The product "+oi.getProductInventory().getProduct()+"is out of stock");
                customer.getSavedCart().getOrderItemList().add(oi);
                customer.getCart().getOrderItemList().remove(oi);
                populateCart();
                populateSavedCart();
                i++;
                
            }
            if(oi.getProductInventory().getQuantity() < oi.getQuantity()){
                JOptionPane.showMessageDialog(null, "The Product"+oi.getProductInventory().getProduct()+"is more then stock available");
                i++;
            }
        }
        if(i>0){
            return;
        }
        
        CheckoutJPanel cojp = new CheckoutJPanel(customer, userProcessContainer, ecoSystem,amazon, userAccount);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("checkout", cojp);
        layout.next(userProcessContainer);
                
    }//GEN-LAST:event_proceedCheckOutJButtonActionPerformed

    private void removefromCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removefromCartJButtonActionPerformed
        int selectedRow =CheckoutCartTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order Item to delete");
            return;
        }
        OrderItem oi = (OrderItem)CheckoutCartTable.getValueAt(selectedRow, 0);
        customer.getCart().removeOrderItem(oi);
        populateCart();
    }//GEN-LAST:event_removefromCartJButtonActionPerformed

    private void removeFromSaveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromSaveJButtonActionPerformed
        int selectedRow =SavedCartTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order Item to delete");
            return;
        }
        OrderItem oi = (OrderItem)SavedCartTable.getValueAt(selectedRow, 0);
        customer.getSavedCart().removeOrderItem(oi);
        populateSavedCart();
    }//GEN-LAST:event_removeFromSaveJButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        populateCart();
        populateSavedCart();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCartJButton;
    private javax.swing.JTable CheckoutCartTable;
    private javax.swing.JTable SavedCartTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton proceedCheckOutJButton;
    private javax.swing.JButton removeFromSaveJButton;
    private javax.swing.JButton removefromCartJButton;
    private javax.swing.JButton saveOrderJButton;
    // End of variables declaration//GEN-END:variables
}