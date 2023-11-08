/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class Order {
    ArrayList<OrderItem> orderItemList;
    
    public Order(){
        this.orderItemList = new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addOrderItem(Product product, double salesPrice, int quantity){
        OrderItem orderItem = new OrderItem(product, salesPrice, quantity);
        this.orderItemList.add(orderItem);
    }
    
    public OrderItem findProductFromOrderItem(Product product){
        for(OrderItem orderItem : this.orderItemList){
            if(product.getModelNumber() == orderItem.getProduct().getModelNumber())
                return orderItem;
        }
        return null;
    }
    
}
