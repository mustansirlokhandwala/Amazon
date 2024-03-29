/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdminRole;

import EcoSystem.BankAccount.BankAccount;
import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Bank;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Enterprise.Enterprise.EnterpriseType;
import EcoSystem.GeoConverting.AddressConverter;
import EcoSystem.Network.Network;
import EcoSystem.Person.Address;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class CreateNewBankHeadquatersJPanel extends javax.swing.JPanel {

    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;
    public CreateNewBankHeadquatersJPanel(EcoSystem ecoSystem , JPanel upc) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = upc;
        populateCountryCombo();
    }
    
    public void populateCountryCombo(){
        CountryJcomboBox.removeAllItems();
        for(Network countryNetwork : ecoSystem.getNetworkDirectory().getNetworkList()){
            CountryJcomboBox.addItem(countryNetwork);
        }
    }
    public void populatestateCombo(){
        Network countryNetwork = (Network)CountryJcomboBox.getSelectedItem();
        if(countryNetwork == null){
            return;
        }
        stateComboBox.removeAllItems();
        for(Network stateNetwork : countryNetwork.getNetworkDirectory().getNetworkList()){
            stateComboBox.addItem(stateNetwork);
        }
    }
    
    public void populatecityCombo(){
        Network stateNetwork = (Network)stateComboBox.getSelectedItem();
        if(stateNetwork == null){
            return;
        }
        cityComboBox.removeAllItems();
        for(Network cityNetwork : stateNetwork.getNetworkDirectory().getNetworkList()){
            cityComboBox.addItem(cityNetwork);
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
        CountryJcomboBox = new javax.swing.JComboBox();
        createnewHeadquaterJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        streetTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        zipCodetxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CountryTxtField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        cityComboBox = new javax.swing.JComboBox();
        stateComboBox = new javax.swing.JComboBox();

        jLabel1.setText("HeadQuater Location:");

        CountryJcomboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CountryJcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryJcomboBoxActionPerformed(evt);
            }
        });

        createnewHeadquaterJButton.setText("Create New HeadQuaters");
        createnewHeadquaterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createnewHeadquaterJButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Street Address:");

        jLabel9.setText("City");

        jLabel10.setText("State");

        jLabel11.setText("Please Provide headquaters Address");

        CountryTxtField.setEditable(false);

        jLabel12.setText("Country");

        jLabel13.setText("ZipCode");

        jLabel14.setText("Name :");

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountryJcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel12))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CountryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(zipCodetxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(streetTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(createnewHeadquaterJButton)))
                        .addGap(118, 118, 118)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CountryJcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(streetTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CountryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(zipCodetxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createnewHeadquaterJButton)
                    .addComponent(backButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createnewHeadquaterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createnewHeadquaterJButtonActionPerformed
        Network countryNetwork =(Network) CountryJcomboBox.getSelectedItem();
        for(Enterprise enterprise : countryNetwork.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().equals(EnterpriseType.Bank)){
                if(enterprise.getAddress().getCountry().equals(countryNetwork.getName()));{
                JOptionPane.showMessageDialog(null,"A Bank headquaters in this Country already exist");
                return;
                
            }
            }
        }
        String name = nameTxtField.getText();
        String street = streetTxtField.getText();
        String city = String.valueOf(cityComboBox.getSelectedItem());
        String state = String.valueOf(stateComboBox.getSelectedItem());
        String country = CountryTxtField.getText();
        try{
        int zipcode = Integer.parseInt(zipCodetxtField.getText());
        
        
        
         //Validation 
        if(name.trim().isEmpty() || street.trim().isEmpty() || city.equals(null) || state.equals(null) || country.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Text fields are Incomplete !");
            return ;
        }
        
        Address add = new Address();
        add.setStreetAddress(street);
        add.setCity(city);
        add.setState(state);
        add.setCountry(country);
        AddressConverter ac = new AddressConverter();
        add.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(add))));
        add.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(add))));                
        Enterprise e =countryNetwork.getEnterpriseDirectory().createandAddEnterprise(name, EnterpriseType.Bank, add);
        BankAccount bk = new BankAccount();
        bk.setEnterprise(e);
        Bank bank = (Bank)e;
        bank.getBankAccountDirectory().getBankAccountList().add(bk);
        }catch(NumberFormatException n){JOptionPane.showMessageDialog(null, "Please Enter Numeric Data"); return;}
       
        
        
        
        
        
            
    }//GEN-LAST:event_createnewHeadquaterJButtonActionPerformed

    private void CountryJcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryJcomboBoxActionPerformed
        Network n = (Network)CountryJcomboBox.getSelectedItem();
        if(n == null){
            return;
        }
        CountryTxtField.setText(n.getName());
        populatestateCombo();
    }//GEN-LAST:event_CountryJcomboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
      populatecityCombo();
    }//GEN-LAST:event_stateComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CountryJcomboBox;
    private javax.swing.JTextField CountryTxtField;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox cityComboBox;
    private javax.swing.JButton createnewHeadquaterJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JTextField streetTxtField;
    private javax.swing.JTextField zipCodetxtField;
    // End of variables declaration//GEN-END:variables
}
