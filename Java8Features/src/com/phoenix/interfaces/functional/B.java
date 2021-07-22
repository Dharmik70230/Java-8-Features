package com.phoenix.interfaces.functional;

public interface B {


	default void test() {
		System.out.println("A");
	}
	static void show() {
		System.out.println("A");
	}

}
