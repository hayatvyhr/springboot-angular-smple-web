package com.test.demo.DTO;

public class customerUpdateDto {
    private int id;

    private String cusname;

    private String cusaddress;

    private int mobile;

    public customerUpdateDto(int mobile, String cusaddress, String cusname, int id) {
        this.id = id;

        this.mobile = mobile;
        this.cusaddress = cusaddress;
        this.cusname = cusname;
    }

    public customerUpdateDto() {
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
        return "CustomerDTO{" +
                "id=" + id +
                ", cusname='" + cusname + '\'' +
                ", cusaddress='" + cusaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
