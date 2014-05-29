/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AmazonAdminRole;

import UserInterface.AmazonBilllinEmployeeRole.AmazonMakePaymentJpanel;
import UserInterface.CustomerRole.*;
import EcoSystem.BankAccount.BankAccount;
import EcoSystem.Customer.Customer;
import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Enterprise.Bank;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mustansir
 */
public class AmazonManageBankAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private BankAccount bankAccount;
    
    private EcoSystem ecoSystem;
    private Amazon amazon;
    
    private Bank bank;
    
            
    
    public AmazonManageBankAccountJPanel(JPanel upc  , EcoSystem ecoSystem , Amazon amazon) {
        initComponents();
        this.userProcessContainer = upc ;
        
        
        this.ecoSystem = ecoSystem;
        this.amazon = amazon;
        for(Network countryNetwork : ecoSystem.getNetworkDirectory().getNetworkList()){
            if(countryNetwork.getName().equals(amazon.getAddress().getCountry())){
                for(Enterprise enterprise : countryNetwork.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise instanceof Bank){
                        this.bank = (Bank)enterprise;
                    }
                }
            }
        }
        for(BankAccount bk : bank.getBankAccountDirectory().getBankAccountList()){
            if(bk.getEnterprise() != null){
                if(bk.getEnterprise().equals(amazon)){
                this.bankAccount=bk;
                }                   
                
            }
                
                
            
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jButton1.setText("View Balance ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Previous transactions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Request Amount Increase ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backButton)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AmazonCheckBankBalance amazonCheckBankBalance = new AmazonCheckBankBalance(bankAccount, userProcessContainer);
        CardLayout layout =(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("OrderProduct", amazonCheckBankBalance);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         AmazonRequestMoneyJPanel amazonRequestMoneyJPanel = new AmazonRequestMoneyJPanel(bankAccount, ecoSystem, userProcessContainer, bank);
         CardLayout layout =(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("OrderProduct", amazonRequestMoneyJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         AmazonViewPreviousTransactionJPanel amazonViewPreviousTransactionJPanel = new AmazonViewPreviousTransactionJPanel(userProcessContainer, bankAccount);
         CardLayout layout =(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("OrderProduct", amazonViewPreviousTransactionJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
