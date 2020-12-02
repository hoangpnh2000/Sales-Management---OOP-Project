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
public class Pair<K, V> implements Serializable {
    private K matHang;
    private V soLuong;
    
    public Pair() {
    }

	public Pair(K matHang, V soLuong) {
		super();
		this.matHang = matHang;
		this.soLuong = soLuong;
	}

	public K getMatHang() {
		return matHang;
	}

	public void setMatHang(K matHang) {
		this.matHang = matHang;
	}

	public V getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(V soLuong) {
		this.soLuong = soLuong;
	}

    
    
}
