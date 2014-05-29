/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CustomerRole;

import EcoSystem.Customer.Customer;
import EcoSystem.DistanceCalculationGraph.DistanceAlgortihm;
import EcoSystem.EcoSystem;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Enterprise.Enterprise;
import EcoSystem.Enterprise.Supplier;
import EcoSystem.Network.Network;
import EcoSystem.Order.OrderItem;
import EcoSystem.Product.ProductInventory;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkQueue.OutOfStockRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mustansir
 */
public class OrderProductJPanel extends javax.swing.JPanel {

    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;
    private Customer customer;
    private Amazon amazon;
    private UserAccount userAccount;
    private ArrayList<Supplier> nearbySuppliers;
    
    
    
    public OrderProductJPanel(EcoSystem ecoSystem , JPanel upc , Customer customer , Amazon amazon , UserAccount userAccount) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = upc;
        this.customer = customer;
        this.amazon = amazon;
        this.userAccount = userAccount;        
        this.nearbySuppliers = new ArrayList<Supplier>();
        
        
        ProductTable.setAutoCreateRowSorter(true);
        populateNearBySuppllier();  
        populateCategoryCombo();
        distanceJSpinner.addChangeListener(listener);
        
        
        
        
            
    }
     ChangeListener listener = new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        nearbySuppliers.clear();
        populateNearBySuppllier();       
        
        String type = new String();
        try{
        type = (String)categoryComboBox.getSelectedItem();
        
        populateTable(type);
        }catch(NullPointerException e1){
            return;
            }
        populateTable(type);
      }
    };
    private void populateNearBySuppllier(){
        int minimumdistance;
        minimumdistance = (int)distanceJSpinner.getValue();
        if(minimumdistance < 0)
        {
        
            JOptionPane.showMessageDialog(null, "Please select minimum distance of 1 Mile");
            return;
        }
        else if(minimumdistance > 20){
            JOptionPane.showMessageDialog(null, "The Stores at a distance of 20 Miles from you cannot Garauntee One day Delivery");
        }
        
        for(Network countryNetwork : ecoSystem.getNetworkDirectory().getNetworkList()){
            for(Network stateNetwork : countryNetwork.getNetworkDirectory().getNetworkList()){
                for(Enterprise enterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise instanceof Supplier){
                        double distance =DistanceAlgortihm.callocationdistance(enterprise.getAddress(), customer.getPerson().getAddress());
                        if(distance < minimumdistance)
                            nearbySuppliers.add((Supplier)enterprise);
                        
                    }
                }
                for(Network cityNetwork : stateNetwork.getNetworkDirectory().getNetworkList()){
                    for(Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise instanceof Supplier){
                        double distance =DistanceAlgortihm.callocationdistance(enterprise.getAddress(), customer.getPerson().getAddress());
                        if(distance < minimumdistance)
                            nearbySuppliers.add((Supplier)enterprise);
                        
                    }
                    }
                }
                
            }
        }
        
        
    }
    
   
    
    public void populateCategoryCombo(){
        categoryComboBox.removeAllItems();
        categoryComboBox.addItem("All");
        for(String type : amazon.getProductTypeDirectory().getProducttypeList()){
            categoryComboBox.addItem(type);
        }
    }
    
   
    
    public void populateTable(String type){
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        model.setRowCount(0);
        
        ArrayList<ProductInventory> templist= new ArrayList<ProductInventory>();
        String countryLocation = customer.getPerson().getAddress().getCountry();
        String stateLocation = customer.getPerson().getAddress().getState();
        String cityLocation = customer.getPerson().getAddress().getCity();
        
        for(Supplier supplier : nearbySuppliers){
             for(ProductInventory pi : supplier.getInventoryList().getInventoryList()){
                 if(pi.getProduct().getProductType().equals(type) || type.equals("All")){
                    templist.add(pi); 
                 }
             }
        }                    
            
        
                                   
                                      
                        
        
        for(ProductInventory productInventory : templist){
            Object[] row = new Object[5];
            row[0]=productInventory;
            row[1]=productInventory.getProduct().getProductCompany();
            row[2]=productInventory.getProduct().getProductPrice();
            row[3]= productInventory.getQuantity() == 0 ? "Out of Stock" : productInventory.getQuantity();
            row[4]=productInventory.getProduct().getProductType();
            
            
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

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        quantityJSpinner = new javax.swing.JSpinner();
        AddButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        searchTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        distanceJSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Compnay", "Product Price", "Quantity Available", "Product Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel1.setText("Quantity :");

        AddButton.setText("Add to Cart ");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Proceed to Cart");
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

        jLabel2.setText("Category :");

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboBoxActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Distance Proximity :");

        distanceJSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        distanceJSpinner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                distanceJSpinnerFocusGained(evt);
            }
        });

        jLabel4.setText("Miles");

        jButton2.setText("GO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(distanceJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTxtField)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(distanceJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addComponent(backButton)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        int selectedRow = ProductTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a value ");
            return;
        }
        ProductInventory productInventory = (ProductInventory)ProductTable.getValueAt(selectedRow, 0);
        int quantity = (int)quantityJSpinner.getValue();
        if(quantity == 0){
            JOptionPane.showMessageDialog(null, "Please select atleast 1 quantity");
            return;
        }
        if(productInventory.getQuantity() == 0){
            JOptionPane.showMessageDialog(null, "This product is out of stock , Sorry for the inconvinience");
            OutOfStockRequest ofStockRequest = new OutOfStockRequest();
            ofStockRequest.setProduct(productInventory.getProduct());
            ofStockRequest.getRequestDate();
            Supplier supplier = productInventory.getProduct().getProductCompany();
            supplier.getWorkQueue().addWorkRequest(ofStockRequest);
            return;
        }
       
        for(OrderItem oi : customer.getCart().getOrderItemList()){
            if(oi.getProductInventory().getProduct().equals(productInventory.getProduct())){
                oi.setQuantity(oi.getQuantity()+quantity);
                return;
            }
        }        
        for(OrderItem oi : customer.getSavedCart().getOrderItemList()){
            if(oi.getProductInventory().getProduct().equals(productInventory.getProduct())){
                oi.setQuantity(oi.getQuantity()+quantity);
                return;
            }
        }
        
        
        OrderItem oi =customer.getCart().createandAddOrderItem();        
        oi.setQuantity(quantity);
        oi.setProductInventory(productInventory);
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      CustomerCartJPanel ccjp = new CustomerCartJPanel(ecoSystem, customer, userProcessContainer, amazon, userAccount);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("CartJPanel", ccjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboBoxActionPerformed
      
        String type = new String();
        try{
        type = (String)categoryComboBox.getSelectedItem();
        
        populateTable(type);
    }catch(NullPointerException e){
            return;
            }
        populateTable(type);
    }//GEN-LAST:event_categoryComboBoxActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      
    }//GEN-LAST:event_formComponentShown

    private void distanceJSpinnerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_distanceJSpinnerFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_distanceJSpinnerFocusGained

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JSpinner distanceJSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JTextField searchTxtField;
    // End of variables declaration//GEN-END:variables
}
