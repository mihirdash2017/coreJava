package com.mihir;

import java.util.stream.Stream;

public class StreamConcatination {

	public static void main(String[] args) {
		Stream<String> str=Stream.of("AA","BB","CC");
		Stream<String>str1=Stream.of("DD","EE","FF","CC");
		Stream<String>str2=Stream.concat(str, str1).distinct();
		str2.forEach(e->System.out.print(e+" "));
	}

}
