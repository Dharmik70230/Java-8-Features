package com.phoenix.interfaces.functional;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class MethodReference {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Static method reference
		Movable m = MyClass::myMethod;
		m.move();

		YourClass ob = new YourClass();
		// instance method reference on specific object
		m = ob::yourClass;
		m.move();

		StringMerger sm = String::concat;
		System.out.println(sm.merge("Hello ", "Dharmik"));

		// Constructor reference
		Messaging ob1 = Message::new;
		Message msg = ob1.getObject("HEllo");
		System.out.println(msg.getMsg());

	}

}
