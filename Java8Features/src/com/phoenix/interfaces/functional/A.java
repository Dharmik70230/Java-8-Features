package com.phoenix.interfaces.functional;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public interface A {

	default void test() {
		System.out.println("A");
	}
	static void show() {
		System.out.println("A");
	}
}
