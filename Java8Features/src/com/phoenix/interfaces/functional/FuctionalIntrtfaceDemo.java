package com.phoenix.interfaces.functional;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class FuctionalIntrtfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = n1 -> n1>10;
		boolean res =p.test(12);
		System.out.println(res);
		
		Predicate<String> p1 = s -> s.equals("Java");
		System.out.println(p1.test("Java"));
		System.out.println(p1.test("Python"));
	
		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Welcome to Functional Programming in Java");

		Consumer<Integer> c2 = n -> System.out.println(n);
		c2.accept(100);
		
		Supplier<Double> u = ()->12.5;
		System.out.println(u.get());
		

		Supplier<String> u1 = ()->"Good Afternoon";
		System.out.println(u1.get());
		
		Supplier<ArrayList<Integer>> s3 = ArrayList::new;
		ArrayList<Integer> numList = s3.get();
		System.out.println(numList.size());
		
		Consumer<Integer> s4 = ele -> numList.add(ele);
		s4.accept(100);
		s4.accept(70);
		s4.accept(60);
		s4.accept(80);
		s4.accept(90);
		System.out.println(numList.size());
		
		Function<String, Integer> f1 = s-> Integer.valueOf(s);
		System.out.println(f1.apply("30000"));
	
		Supplier<Product> s5 = () -> new Product(1070, "Laptop", "Asus", 85200.00f);
		Product pob = s5.get();
		
		Consumer<Product> c6 = pob1 -> System.out.println(pob1);
		
		Function<Product, Float> f7 = product -> product.getPrice();
		System.out.println(f7.apply(pob));
		Function<Product, String> f8 = product -> product.getBrand();
		System.out.println(f8.apply(pob));
		
		BiPredicate<Integer,Double> b1 = (i,d) -> i>=d;
		System.out.println(b1.test(2, 9.2));
		System.out.println(b1.test(2, 2.0));
		
		BiConsumer<Integer, String> b2 = (n,s) -> System.out.println(n + "\t " + s);
		b2.accept(100, "Hello");
		b2.accept(pob.getId(),pob.getName());
		
		BiFunction<String, Integer, Boolean> b3 = (s,i) -> s.equals(i);
		System.out.println(b3.apply("100",100));
		
		BiFunction<String, Integer, Boolean> b4 = (s,i) -> i == Integer.parseInt(s);
		System.out.println(b4.apply("100",100));
		
		UnaryOperator<String> o1 = s -> s.toUpperCase();
		System.out.println(o1.apply("Hello"));
		System.out.println(o1.apply(pob.getBrand()));
		
		BinaryOperator<String> o2 = (s1,s2) -> s1.concat(s2);
		System.out.println(o2.apply("Hello ", "STL"));
		
		
	
	}

}
