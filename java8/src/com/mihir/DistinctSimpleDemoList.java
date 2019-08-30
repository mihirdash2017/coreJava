package com.mihir;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSimpleDemoList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA","DD");
		Long count=list.stream().count();
		System.out.println("duplicate value :"+count);
		String output=list.stream().distinct().collect(Collectors.joining(","));
		System.out.println("duplicate value :"+output);
	}

}
