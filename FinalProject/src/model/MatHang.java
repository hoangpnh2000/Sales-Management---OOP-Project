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
public class MatHang implements Serializable {
    private int id;
    private static int sId = 10000000;
    private float price;
    private String type;
    private String name;

    public MatHang() {
        this.id = sId++;
    }

    public MatHang(float price, String type, String name) {
        this.id = sId++;
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        MatHang.sId = sId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

