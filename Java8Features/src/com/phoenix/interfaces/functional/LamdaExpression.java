package com.phoenix.interfaces.functional;
/*
 * @author dharmik.maru@stl.in
 * @version 1.0
 * @creation_date 15-jul-2021
 * @copyright  Sterlite Technologies
 * */
public class LamdaExpression {

	public void doMath(Addable ob1) {
		System.out.println(ob1.add(15, 30));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movable m  =()->System.out.println("Anonymous object moves");
		 m.move();
		
		Jumpable j  =()->System.out.println("Jump");
		j.jump();
		
		Addable ob = (int x,int y) -> {return x + y;};
//		Addable ob1 = (x, y) -> {return x + y;};
//		Addable ob2 = (x,y) -> x + y;
		int res = ob.add(10, 20);
		System.out.println("Addition is "+ res);

		//calling default method
		float res1 = ob.addFloats(2.5f, 3.6f);
		System.out.println(res1);
		
		//calling static method 
		Addable.show();
		
		Greeting g = personName -> "Hello "+ personName;
		g.greet("Mohan Kumar");

		
		
		LamdaExpression ob1 = new LamdaExpression();
		ob1.doMath((c,d) -> c+d);
		
	}

}
