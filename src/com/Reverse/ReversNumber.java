package com.Reverse;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		Scanner rn =new Scanner(System.in);
		int number = rn.nextInt();
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  

	}

