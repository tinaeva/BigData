package com.eva.hw1;

import java.util.Scanner;

public class CountUpperStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Original String is " + s);
		System.out.println("The upper case letters number is " + countUp(s));
		convUp(s);
		
	}

	private static void convUp(String s) {
		// TODO Auto-generated method stub
		char upLetter;
		for(int i=0; i<s.length(); i++) {
			upLetter = s.charAt(i);
			if(upLetter >= 'a' && upLetter <= 'z'){
				upLetter -= 'a' - 'A';
				System.out.print(upLetter);
			}
			else System.out.print(upLetter);
		}
	}

	private static int countUp(String s) {
		// TODO Auto-generated method stub
		int count = 0;
		char s1;
		for(int i=0; i<s.length(); i++) {
			s1 = s.charAt(i);
			if((s1 -'A') >= 0 && ('a' - s1)>0) count++;
		}
		return count;
	}

}
