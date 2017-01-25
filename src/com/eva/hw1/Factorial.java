package com.eva.hw1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int out = 1;
		if(in == 0) out = 1;
		for(int i=1; i<=in; i++) {
			out *= i;				
			
		}
		System.out.println("Factorial of " + in + " is " + out);
		sc.close();
	}

}
