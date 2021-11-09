package com.Fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10, firstNum = 0, secondNum = 1;
	    System.out.println("Fibonacci Series till " + n + " numbers:-");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstNum + ", ");
	      int nextNum = firstNum + secondNum;
	      firstNum = secondNum;
	      secondNum = nextNum;
	    }

	}

}
