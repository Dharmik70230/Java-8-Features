package com.phoenix.streams;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 16-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Product>	productList = new ArrayList<Product>();
		productList.add(new Product(100, "Laptop", "Hp", 10000.00f));
		productList.add(new Product(108, "Mobile", "One +", 25000.00f));
		productList.add(new Product(101, "Tv", "Sony", 96666.00f));
		productList.add(new Product(111, "Friez", "Godrej", 40000.00f));
		productList.add(new Product(123, "Laptop", "Lenevo", 43000.00f));

		Collections.sort(productList);
		productList.forEach(System.out :: println);
		System.out.println("\n");
		
		//Java 8
		productList.sort(Comparator.naturalOrder());
		productList.forEach(System.out :: println);
	
		System.out.println("\n");
		
		productList.sort(Comparator.reverseOrder());
		productList.forEach(System.out :: println);
		
		System.out.println("\n Using Stream Shorting in Ascending Order");
		productList.stream()
					.sorted()
					.forEach(System.out :: println);

		System.out.println("\n Using Stream Shorting in Descending Order");
		productList.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(System.out :: println);

		System.out.println("\n>>>Sorting according Ascending order of product Name");
		
		productList.sort(Comparator.comparing(Product::getName));
		productList.forEach(System.out::println);

		System.out.println("\n>>>Sorting according Descending order of product Name");
		
		
		productList.sort(Comparator.comparing(Product::getName,(name1,name2) -> name2.compareTo(name1) ));
		productList.forEach(System.out::println);
		
		System.out.println("\n>>Sorting according Ascending order of product Brand");
		
		productList.stream()
			.sorted(Comparator.comparing(Product::getBrand))
			.forEach(System.out::println);

		System.out.println("\n>>>Sorting according Descending order of product Brand");
		productList.stream()
					.sorted(Comparator.comparing(Product::getBrand,(brand1,brand2) -> brand2.compareTo(brand1) ))
					.forEach(System.out::println);
		System.out.println("\n>>>Sorting according Ascending order of product Price");
		
		productList.stream()
					.sorted(Comparator.comparing(Product::getPrice))
					.forEach(System.out::println);
	
		System.out.println("\n>>>Sorting according Descending order of product Price");
		
		productList.stream()
					.sorted(Comparator.comparing(Product::getPrice,(price1,price2) -> price2.compareTo(price1) ))
					.forEach(System.out::println);

		System.out.println("\n>>>Sorting according Ascending order of product Name and Ascending order of Brand");
		
		productList.stream()
					.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand))
					.forEach(System.out::println);
		
		System.out.println("\n>>>Sorting according Ascending order of product Name and Descending order of Brand");
		//Sorting according asc order of product name
		productList.stream()
					.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand,(brand1,brand2) -> brand2.compareTo(brand1)))
					.forEach(System.out::println);
	
		System.out.println("\n>>>Sorting according Ascending order of product Barnd and Descending order of Name");
		//Sorting according asc order of product name
		productList.stream()
					.sorted(Comparator.comparing(Product::getName).reversed().thenComparing(Product::getBrand))
					.forEach(System.out::println);
		
		
	}

}
