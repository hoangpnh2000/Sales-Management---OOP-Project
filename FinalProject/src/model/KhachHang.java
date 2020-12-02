/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class KhachHang implements Serializable {
    private int id;
    private String name;
    private String address;
    private String email;
    private String phoneNum;
    private static int sId = 10000000;

    public KhachHang() {
        this.id = sId++;
    }

    public KhachHang(String name, String address, String email, String phoneNum) {
        this.id = sId++;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        KhachHang.sId = sId;
    }
    
    
}
