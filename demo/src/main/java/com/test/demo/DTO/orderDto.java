package com.test.demo.DTO;

public class orderDto {
    private String item;
    private String date;
    private String quantity;

    private int customerId; // Assuming customerId is of type Long (matching Customer's id type)
    private int orderId;
    // Constructors, getters, setters, toString, etc. omitted for brevity

    public orderDto(String item, String date, int customerId, int orderId) {
        this.item = item;
        this.date = date;
        this.customerId = customerId;
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
