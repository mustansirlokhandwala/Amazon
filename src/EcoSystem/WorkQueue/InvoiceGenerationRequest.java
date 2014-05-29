/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.WorkQueue;

import EcoSystem.Order.OrderItem;

/**
 *
 * @author Mustansir
 */
public class InvoiceGenerationRequest extends WorkRequest {
    
    private OrderItem orderItem;
    private boolean generated;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public boolean isGenerated() {
        return generated;
    }

    public void setGenerated(boolean generated) {
        this.generated = generated;
    }

    @Override
    public String toString() {
        return orderItem.getProductInventory().getProduct().getName();
    }
    
    
    
}
