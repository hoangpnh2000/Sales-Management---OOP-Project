/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.corba.se.impl.io.IIOPOutputStream;

import model.HoaDon;
import model.KhachHang;
import model.MatHang;
import model.Pair;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ControllerImp implements Controller {

	@Override
	public <T> boolean writeToFile(List<T> list, String fileName) {
		try {
			File file = new File(fileName);
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			fos.close();
			return true;
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public <T> List<T> readDataFromFile(String fileName) {
		List<T> list = null;
		try {
			File file = new File(fileName);
			file.createNewFile();
			if (file.length() > 0) {
				FileInputStream fos = new FileInputStream(file);
				ObjectInputStream oos = new ObjectInputStream(fos);
				Object obj = oos.readObject();
				list = (List<T>) obj;
				oos.close();
				fos.close();
			} else {
				list = new ArrayList<>();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return list;
	}

	@Override
	public <T> void sortByPrice(List<T> list) {
		list.sort(new Comparator<T>() {
			@Override
			public int compare(T o1, T o2) {
				if (o1 instanceof MatHang) {
					MatHang m1 = (MatHang) o1;
					MatHang m2 = (MatHang) o2;
					float d1 = m1.getPrice();
					float d2 = m2.getPrice();
					if (d1 > d2) {
						return -1;
					} else if (d1 < d2) {
						return 1;
					}
				} else if (o1 instanceof HoaDon) {
					HoaDon m1 = (HoaDon) o1;
					HoaDon m2 = (HoaDon) o2;
					float d1 = m1.getTotalPrice();
					float d2 = m2.getTotalPrice();
					if (d1 > d2) {
						return -1;
					} else if (d1 < d2) {
						return 1;
					}
				}
				return 0;
			}
		});

	}

}
