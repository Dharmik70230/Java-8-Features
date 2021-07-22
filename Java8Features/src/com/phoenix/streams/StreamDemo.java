package com.phoenix.streams;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 16-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product>	productList = new ArrayList<Product>();
		productList.add(new Product(100, "Laptop", "Hp", 10000.00f));
		productList.add(new Product(101, "Mobile", "One +", 25000.00f));
		productList.add(new Product(102, "Tv", "Sony", 96666.00f));
		productList.add(new Product(103, "Friez", "Godrej", 40000.00f));
		productList.add(new Product(104, "Laptop", "Lenevo", 43000.00f));
		
		Stream<Product> prodStream = productList.stream();
		Stream<Product> filterStream = prodStream.filter(p -> p.getPrice()>20000.00f);
		List<Product> filteredProductList =  filterStream.collect(Collectors.toList());
		filteredProductList.forEach(p -> System.out.println(p));

		System.out.println("\n");
	
		//stream pipeline
		List<Product> products = productList.stream()
										.filter(p ->  p.getPrice()>20000.00f)
											.collect(Collectors.toList());
		products.forEach(System.out :: println);
		
		long productCount = productList.stream().count();
		System.out.println("No of Product in a list : " + productCount);
		
		Product prodMaxPrice = productList.stream()
									.max((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1 )
									.get();
		System.out.println("Product having maximum price : " + prodMaxPrice);

		Product prodMinPrice = productList.stream()
									.min((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1 )
									.get();
		System.out.println("Product having minimum price : " + prodMinPrice);
	
	}
	}
