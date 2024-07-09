package com.test.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name="customer_id" , length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="customer_name" , length = 50)

    private String cusname;
    @Column(name="customer_address" , length = 70)

    private String cusaddress;
    @Column(name="customer_mobile" , length = 50)

    private int mobile;

    public Customer(String cusaddress, String cusname, int mobile) {
        this.mobile = mobile;
        this.cusaddress = cusaddress;
        this.cusname = cusname;

    }

    public Customer() {

    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getCusaddress() {
        return cusaddress;
    }

    public void setCusaddress(String cusaddress) {
        this.cusaddress = cusaddress;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cusname='" + cusname + '\'' +
                ", cusaddress='" + cusaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
