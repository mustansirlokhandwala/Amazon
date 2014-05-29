/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import EcoSystem.Order.Order;
import EcoSystem.Order.OrderItem;
import EcoSystem.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Mustansir
 */
public class OrderRequest extends WorkRequest {
    
    private OrderItem orderItem;   
    private Date orderDate;
    private boolean ordered;
    private Date packageDate;
    private boolean packaged;
    private Date shipmentDate;
    private boolean shipped;
    private Date deliveryDate;
    private boolean delivered;
    private UserAccount customer;
    private UserAccount packagingEmployee;
    private UserAccount DeliveryEmployee;

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public UserAccount getPackagingEmployee() {
        return packagingEmployee;
    }

    public void setPackagingEmployee(UserAccount packagingEmployee) {
        this.packagingEmployee = packagingEmployee;
    }

    public UserAccount getDeliveryEmployee() {
        return DeliveryEmployee;
    }

    public void setDeliveryEmployee(UserAccount DeliveryEmployee) {
        this.DeliveryEmployee = DeliveryEmployee;
    }
    

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public boolean isPackaged() {
        return packaged;
    }

    public void setPackaged(boolean packaged) {
        this.packaged = packaged;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }


    

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getPackageDate() {
        return packageDate;
    }

    public void setPackageDate(Date packageDate) {
        this.packageDate = packageDate;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return orderItem.getProductInventory().getProduct().getName();
    }
    
    
            
    
    
}
