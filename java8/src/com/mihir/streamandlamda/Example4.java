package com.mihir.streamandlamda;

import java.util.Arrays;
import java.util.List;
//method reference
public class Example4 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		//instance method calling by using method reference
		list.forEach(System.out::println);
		
		//static methods calling by using method reference
		//Methods reference order of parameter should be fix
		list.stream()
			.map(String::valueOf)
			.forEach(System.out::println);
		//loop holes same name instance method and sattic method will not work in method reference
		
	}

}
