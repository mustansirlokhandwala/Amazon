/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CustomerRole;

import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Enterprise.USPS;
import EcoSystem.Network.Network;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkQueue.OrderReturn;
import EcoSystem.WorkQueue.OrderReturnRequest;
import EcoSystem.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mustansir
 */
public class DropOffProduct extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private UserAccount userAccount;
   private OrderReturnRequest OrderReturnRequest;
   private OrderReturn orderReturn;
   private EcoSystem ecosystem;
   
    public DropOffProduct(JPanel userProcessContainer , UserAccount userAccount , OrderReturnRequest orderReturnRequest , EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.OrderReturnRequest = orderReturnRequest;
        this.ecosystem = ecoSystem;
        
        
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkQueueList()){
            if(wr instanceof OrderReturn){
                OrderReturn or = (OrderReturn)wr;
                if(or.getOrderItem().equals(OrderReturnRequest.getOrderItem())){
                    this.orderReturn = or;
                    break;
                }
            }
        }
        
    populateform();
    populatecombo();
        
        
    }
    
    
    private void populateform(){
        productTxtField.setText(String.valueOf(orderReturn.getOrderItem().getProductInventory().getProduct()));
        productCompnayTxtField.setText(String.valueOf(orderReturn.getOrderItem().getProductInventory().getProduct().getProductCompany()));
        quantityTxtField.setText(String.valueOf(orderReturn.getOrderItem().getQuantity()));
    }
    
    private void populatecombo(){
        USPScomboBox.removeAllItems();
        String country = orderReturn.getCustomer().getPerson().getAddress().getCountry();
        String state = orderReturn.getCustomer().getPerson().getAddress().getState();
        String city = orderReturn.getCustomer().getPerson().getAddress().getCity();
        
        for(Network countryNetwork : ecosystem.getNetworkDirectory().getNetworkList()){
            if(countryNetwork.getName().equals(country)){
                for(Network stateNetwork : countryNetwork.getNetworkDirectory().getNetworkList()){
                    if(stateNetwork.getName().equals(state)){
                        for(Network cityNetwork : stateNetwork.getNetworkDirectory().getNetworkList()){
                            if(cityNetwork.getName().equals(city)){
                                for(Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                                    if(enterprise instanceof USPS){
                                        USPS usps = (USPS)enterprise;
                                        USPScomboBox.addItem(usps);
                                    }
                                }
                            }
                        }
                    }
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productTxtField = new javax.swing.JTextField();
        productCompnayTxtField = new javax.swing.JTextField();
        quantityTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        USPScomboBox = new javax.swing.JComboBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Product");

        jLabel2.setText("Product Company :");

        jLabel3.setText("Quantity :");

        jButton1.setText("Drop Off");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("USPS Store");

        USPScomboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(productTxtField)
                                .addComponent(productCompnayTxtField)
                                .addComponent(quantityTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(USPScomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productCompnayTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(USPScomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        orderReturn.setCustomerDropOff(new Date());
        USPS usps = (USPS)USPScomboBox.getSelectedItem();
        if(usps == null){
            JOptionPane.showMessageDialog(null, "Please select usps");
            return;
            
        }
        usps.getWorkQueue().addWorkRequest(orderReturn);
        OrderReturnRequest.setStatus("Package Droped Off");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox USPScomboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField productCompnayTxtField;
    private javax.swing.JTextField productTxtField;
    private javax.swing.JTextField quantityTxtField;
    // End of variables declaration//GEN-END:variables
}
