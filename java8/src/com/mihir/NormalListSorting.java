package com.mihir;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NormalListSorting {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "DD", "CC", "BB", "KK", "PP", "LL","BB");
		List sortedList=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Sorted list :"+sortedList);

	}

}
