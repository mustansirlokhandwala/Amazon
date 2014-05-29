/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.Order;

import java.util.ArrayList;

/**
 *
 * @author Mustansir
 */
public class Order {
    public static int count =0;
    
    private int orderID;
    private ArrayList<OrderItem> orderItemList;
    
    public Order()
    {
        ++count;
        orderID = count;
        orderItemList = new ArrayList<>();
                
    }

    public int getOrderID() {
        return orderID;
    }

    

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public OrderItem createandAddOrderItem(){
     OrderItem orderItem = new OrderItem();
     orderItemList.add(orderItem);
     return orderItem;
    }
    
    public void addOrderItem(OrderItem oi){
        orderItemList.add(oi);
    }
    
    public void removeOrderItem(OrderItem oi){
        orderItemList.remove(oi);
    }
    
}
