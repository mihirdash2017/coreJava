package com.mihir.streamandlamda;

//cermony code means to run a single stamt into a thread we need to do these much things
//means need to crate anonymous class and construct the run() and pass the stmt then stats the thraed
public class Example1 {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			//function has four things
			//1.method name --->not imp
			//2.method return type---->not imp
			//3.method parameter
			//4.method body
			//invokedynamic
			@Override
			public void run() {
				System.out.println("i from main thread");
				
			}
		});
		thread.start();
		System.out.println("i am out side thraed");
	}

}
