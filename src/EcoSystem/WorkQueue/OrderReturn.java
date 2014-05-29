/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import EcoSystem.Enterprise.WareHouse;
import EcoSystem.Order.OrderItem;
import EcoSystem.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Mustansir
 */
public class OrderReturn extends WorkRequest {
    
    private OrderItem orderItem;
    private UserAccount customer;
    private WareHouse wareHouse;
    private Date customerDropOff;
    private Date DeliveryDate;
    private UserAccount deliveryEmployee;

    public Date getCustomerDropOff() {
        return customerDropOff;
    }

    public void setCustomerDropOff(Date customerDropOff) {
        this.customerDropOff = customerDropOff;
    }

    public UserAccount getDeliveryEmployee() {
        return deliveryEmployee;
    }

    public void setDeliveryEmployee(UserAccount deliveryEmployee) {
        this.deliveryEmployee = deliveryEmployee;
    }
    
    

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

   

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    @Override
    public String toString() {
        return orderItem.getProductInventory().getProduct().getName();
    }
    
    
    
}
