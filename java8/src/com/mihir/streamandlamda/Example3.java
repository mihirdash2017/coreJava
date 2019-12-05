package com.mihir.streamandlamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example3 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//external iterators
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//external iterators also
		for (int i : list) {
			System.out.println(i);
		}
		
		//internal iterators
		list.forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println("from list.foreach :"+t);
			}
			
		});
		
		//replacing the above code with lambda
		list.forEach((Integer i)->System.out.println("with lambda:"+i));
		
		//replacing the above code with lambda without type inference.only for lambda exp
				list.forEach((Integer i)->System.out.println("without type :"+i));
				//paranthesis is optional,but only for one parameter lambda. 
				
				list.forEach( i->System.out.println("without paranthesis :"+i));
				//using method refrence becoz here i am not passing the value i just passing the method.lambda is glue code
				//http://blog.agiledeveloper.com/2015/06/lambdas-are-glue-code.html
				list.forEach(System.out::println);
		
		
		
		
		
		
		
		

	}

}
