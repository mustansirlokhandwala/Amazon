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
public class MasterOrderList {
    private ArrayList<Order> orderList;
    
    public MasterOrderList(){
    orderList = new ArrayList<>();
}

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
    
}
