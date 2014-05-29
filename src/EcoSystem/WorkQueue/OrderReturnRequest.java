/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import EcoSystem.Enterprise.WareHouse;
import EcoSystem.Order.Order;
import EcoSystem.Order.OrderItem;
import java.util.Date;

/**
 *
 * @author Mustansir
 */
public class OrderReturnRequest extends WorkRequest {
    
    private OrderItem orderItem;
    private WareHouse returnWarehouse;
    private Date purchaseDate;
    private Date returnRequestDate;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public WareHouse getReturnWarehouse() {
        return returnWarehouse;
    }

    public void setReturnWarehouse(WareHouse returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getReturnRequestDate() {
        return returnRequestDate;
    }

    public void setReturnRequestDate(Date returnRequestDate) {
        this.returnRequestDate = returnRequestDate;
    }
    
    
}
