/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDon implements Serializable {
    private int id;
    private static int sId = 1000000;
    private Date date;
    private KhachHang customer;
    private List<Pair<KhachHang, MatHang>> items;
    private float totalPrice;
    private int totalItems;

    public HoaDon() {
    }

    public HoaDon(Date date, KhachHang customer, 
            List<Pair<KhachHang, MatHang>> items, 
            float totalPrice, int totalItems) {
        this.date = date;
        this.customer = customer;
        this.items = items;
        this.totalPrice = totalPrice;
        this.totalItems = totalItems;
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
        HoaDon.sId = sId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public KhachHang getCustomer() {
        return customer;
    }

    public void setCustomer(KhachHang customer) {
        this.customer = customer;
    }

    public List<Pair<KhachHang, MatHang>> getItems() {
        return items;
    }

    public void setItems(List<Pair<KhachHang, MatHang>> items) {
        this.items = items;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }
    
    
}
