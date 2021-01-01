/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDon implements Serializable {
    private int id;
    private static int sId = 1000000;
    private String date;
    private KhachHang customer;
    private List<Pair<MatHang,Integer>> pairs;
    private float totalPrice;
    private MatHang item;
    private int soLuong;

    public HoaDon() {
    	pairs= new ArrayList<>();
    	totalPrice=0;
    }
   
	public HoaDon(KhachHang customer, MatHang item, int soLuong,String date) {
		super();
		this.customer = customer;
		this.item = item;
		this.soLuong = soLuong;
		this.date = date;
	}

    public List<Pair<MatHang,Integer>> getPairs() {
		return pairs;
	}

	public void setPairs(Pair pair) {
		this.pairs.add(pair);
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MatHang getItem() {
		return item;
	}


	public void setItem(MatHang item) {
		this.item = item;
	}

	public KhachHang getCustomer() {
		return customer;
	}


	public void setCustomer(KhachHang customer) {
		this.customer = customer;
	}



	public float getTotalPrice() {
    	this.totalPrice=0;
    	/*
    	for(Pair<MatHang,Integer> pair : pairs){
    		this.totalPrice=(int) (pair.getSoLuong()*pair.getMatHang().getPrice());
    	}*/
    	
        return totalPrice=(item.getPrice()*soLuong);
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }



	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

   
    
}
