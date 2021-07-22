package com.phoenix.models;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 15-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Product  implements Comparable<Product>{

	private int id;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String brand, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public float getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	
	public int compareTo(Product o) {
		if(this.id > o.id)
			return 1;
		else if(this.id < o.id)
			return -1;
		else 
			return 0;
	}
	
	
	public int hashCode() {
		return id + name.hashCode() + (int)price;
	}
	
	public boolean equals(Object ob) {
		if(!(ob instanceof Product))
			return false;
		else {
			Product p = (Product)ob;
			if(this.id == p.id &&
						this.name.equals(p.name) &&
							this.brand.equals(p.brand) &&
								this.price == p.price) {
				return true;
			}else
				return false;
		}
	}
	
}
