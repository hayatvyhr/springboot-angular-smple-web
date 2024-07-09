package com.test.demo.DTO;

public class customerSavedto
{

    private String cusname;

    private String cusaddress;

    private int mobile;

    public customerSavedto(int mobile, String cusaddress, String cusname) {
        this.mobile = mobile;
        this.cusaddress = cusaddress;
        this.cusname = cusname;
    }

    public customerSavedto() {
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




    @Override
    public String toString() {
        return "CustomerDTO{" +
                ", cusname='" + cusname + '\'' +
                ", cusaddress='" + cusaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
