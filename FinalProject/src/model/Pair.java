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
public class Pair<MatHang, Integer> implements Serializable {
    private MatHang key;
    private Integer value;

    public Pair() {
    }

    public Pair(MatHang key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public MatHang getKey() {
        return key;
    }

    public void setKey(MatHang key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
}
