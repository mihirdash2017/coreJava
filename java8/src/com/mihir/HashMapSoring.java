package com.mihir;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapSoring {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap();
		map.put("hi","mihir");
		map.put("dhello", "paralay");
		map.put("by", "malay");
		System.out.println("before sorting :"+map);
		TreeMap<String, String>tree=new TreeMap<>(map);
		System.out.println("After key sorting :"+tree);
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKet,Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		Map result = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey()) 			
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("sored by key :"+result);
		
		Map  resultVal = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("sored by value :"+resultVal);
		
		
	}

}
