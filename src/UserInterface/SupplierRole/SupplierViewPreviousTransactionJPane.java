/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SupplierRole;

import EcoSystem.BankAccount.BankAccount;
import EcoSystem.BankAccount.Transaction;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mustansir
 */
public class SupplierViewPreviousTransactionJPane extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private BankAccount bankAccount;
    public SupplierViewPreviousTransactionJPane(JPanel upc , BankAccount bankAccount) {
        initComponents();
        this.bankAccount = bankAccount;
        this.userProcessContainer = upc;
        populateTransactionTable();
    }
    
    
    private void populateTransactionTable(){
        DefaultTableModel model = (DefaultTableModel)transactiontable.getModel();
        model.setRowCount(0);
        for(Transaction t :bankAccount.getTransactionList()){
            Object[] row = new Object[4];
                    row[0]=t.getCreditAccount().getPerson() == null?t.getCreditAccount().getEnterprise() : t.getCreditAccount().getPerson();
                    row[1]=t.getDebitAccount().getPerson() == null? t.getDebitAccount().getEnterprise():t.getDebitAccount().getPerson();
                    row[2]=t.getAmount();
                    row[2]=t.getType();
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
        transactiontable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transactiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Credit Account", "Debit Account", "Amount", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transactiontable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 375, 132));

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transactiontable;
    // End of variables declaration//GEN-END:variables
}
