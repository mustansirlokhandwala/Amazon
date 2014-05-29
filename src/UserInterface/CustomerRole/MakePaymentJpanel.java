/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CustomerRole;

import EcoSystem.BankAccount.BankAccount;
import EcoSystem.Customer.Customer;
import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Order.Invoice;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mustansir
 */
public class MakePaymentJpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Customer customer;
    private Amazon amazon;
    private BankAccount bankAccount;
    
    public MakePaymentJpanel(JPanel upc , EcoSystem ecoSystem , Customer customer ,Amazon amazon , BankAccount bankAccount) {
        initComponents();
        this.userProcessContainer = upc ;
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        this.amazon = amazon;
        this.bankAccount = bankAccount;
        populatePayment();
    }
    
    
    private void populatePayment(){
        DefaultTableModel model =(DefaultTableModel)paymentTable.getModel();
        model.setRowCount(0);
        
        for(Invoice invoice : customer.getInvoiceDirectory().getInvoiceList()){
            Object[] row = new Object[4];
            row[0]=invoice;
            row[1]=invoice.getTotal();
            row[2]=invoice.getPayment().getAmountPaid();
            
            row[3]=invoice.isPaid() == true ? "Amount Paid" : "Pending";
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
        paymentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order", "Amount Due", "Amount paid", "isPaid"
            }
        ));
        jScrollPane1.setViewportView(paymentTable);

        jButton1.setText("Make Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backButton))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = paymentTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a order");
            return;
        }
        Invoice invoice = (Invoice)paymentTable.getValueAt(selectedRow, 0);
        if(invoice.isPaid()){
            JOptionPane.showMessageDialog(null, "Payment has Already Been made");
        }
        ProcessPayementJPanel processPayementJPanel = new ProcessPayementJPanel(invoice, customer, userProcessContainer, amazon, ecoSystem, bankAccount);
        CardLayout layout = (CardLayout )userProcessContainer.getLayout();
        userProcessContainer.add("Process payment", processPayementJPanel);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable paymentTable;
    // End of variables declaration//GEN-END:variables
}