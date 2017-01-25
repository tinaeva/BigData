package com.eva.hw1;

public class PrintASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "acd";
		char[] arr = new char[26];
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'a'] ++;
		}
		String s2 = new String(arr);
		System.out.println(arr[0] + " " + (int)s2.charAt(0)+ " " + (int)s2.charAt(1) + " " + (int)s2.charAt(2));
		
		for(int i=0; i<256; i++) {
			System.out.println("ASCII " + i + ":" + (char)i);
		}
		
		System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE + " "
							+ Double.MAX_VALUE + " " + Double.MIN_VALUE + " "
							+ Double.NEGATIVE_INFINITY + " " + Double.POSITIVE_INFINITY);
		
		Integer i1 = new Integer(127);
		Integer i2 = 127;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(Integer.valueOf(i1)==Integer.valueOf(i2));
		Integer i3 = 128;
		Integer i4 = new Integer(128);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println(Integer.valueOf(i3)==Integer.valueOf(i4));
		
		char c1 = 'a';
		char c2 = 'a';
		System.out.println(c1==c2);
		System.out.println((int)c1);
		System.out.println(Integer.valueOf(c1)==Integer.valueOf(c2));
		
	}
}
