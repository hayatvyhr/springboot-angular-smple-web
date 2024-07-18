package com.test.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id_order",length = 50)
    @GeneratedValue
    private int id_order;
    @Column(name = "item", length = 100)
    private String item;
    @Column(name = "date", length = 100)
    private String date;
    @Column(name = "quantity", length = 100)
    private String quantity;
    @ManyToOne
    @JoinColumn(name = "customer_id") // This is the foreign key column in the order table
    private Customer customer;
    public Order() {}

    public Order(Customer customer, String date, String item, int id_order) {
        this.customer = customer;
        this.date = date;
        this.item = item;
        this.id_order = id_order;
    }

    public int getId_order() {
        return id_order;
    }

    public String getItem() {
        return item;
    }

    public String getDate() {
        return date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
