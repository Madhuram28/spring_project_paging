package com.example.watch.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class watch {
     @Id
     private int modelNo;
	private String brand;
     private String colour;
     private int price;
     private String material;
     public int getModelNo() {
 		return modelNo;
 	}
 	public void setModelNo(int modelNo) {
 		this.modelNo = modelNo;
 	}
     public int price() {
    	 return price;
     }
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
     
}
