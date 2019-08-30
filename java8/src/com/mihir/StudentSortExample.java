package com.mihir;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSortExample {

	public static void main(String[] args) {
		List<Student> list=new ArrayList();
		list.add(new Student(27, "Mihir"));
		list.add(new Student(23, "pralay"));
		list.add(new Student(25, "Malay"));
		list.add(new Student(26, "Deepika"));
		
		System.out.println("before sorting list values are :"+list);
		List sortedList=list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		System.out.println("After age Sorting :"+sortedList);
		sortedList=list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		System.out.println("After name Sorting :"+sortedList);

	}

}
