package com.phoenix.streams;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 16-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream ins = IntStream.of(70,50,9,10,20);
		ins.forEach(System.out::println);

		IntStream ins1 = IntStream.of(70,50,9,10,20);
		ins1.sorted().forEach(System.out::println);
	
//		IntStream ins2 = IntStream.iterate(1, i-> i+1);
//		ins2.limit(100).forEach(System.out::println);
		System.out.println("Stream of long");

		IntStream ins3 = IntStream.iterate(1, i-> i+2);
		ins3.limit(10).skip(5)
		.forEach(System.out::println);
		
		System.out.println("Stream of long");
		//LongStream ls = LongStream.range(100L, 105L);
		LongStream ls = LongStream.rangeClosed(100L, 105L);
		ls.forEach(System.out::println);
		
	
		
	}

}
