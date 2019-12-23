package com.example.shixuanyoumei.entity;

public class User {

    private Integer id ;
    private String username ;
    private String password ;
    private String address ;
    private String phone ;
    private String deliverAddress ;
    private String name ;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDeliverAddress() {
        return deliverAddress;
    }
    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
