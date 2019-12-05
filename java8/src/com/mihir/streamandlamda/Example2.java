package com.mihir.streamandlamda;

public class Example2 {

	public static void main(String[] args) {
		// here method name and return type is not much imp in lambda expression
		Thread t=new Thread(()->System.out.println("i am from main thread"));
		t.start();

	}

}
