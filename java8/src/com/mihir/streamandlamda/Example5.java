package com.mihir.streamandlamda;

import java.util.Arrays;
import java.util.List;

//function compensation
public class Example5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// dobule even number and total
		int total = 0;
		for (int integer : list) {
			if (integer % 2 == 0) {
				total += integer * 2;
			}
		}
		System.out.println(total);
		// java 8.do the java8 setup
		int total2 = list.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * 2).sum();
		System.out.println("java8 style :" + total2);

	}

}
