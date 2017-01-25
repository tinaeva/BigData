package com.eva.hw2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LearnStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para = "Read all the methods in the String class, how many of them can you implement by yourself? "
				+ "Search for all the appearance of a String in a paragraph and display the count.";
		String keyword = "the";
		int count = 0;
		int fromIndex = 0;
		while(fromIndex != -1) {
			fromIndex = para.indexOf(keyword, fromIndex);
			if(fromIndex != -1 ) {
				count++;
				fromIndex += keyword.length();
			}
		}
		System.out.println(count);
		
		String word = "programming";
		char[] vowels = {'a','e','i','o','u'};
		int[] vCount = new int[5];
		System.out.println(vCount[0]);
		for(int i=0;i<vCount.length;i++) {
			vCount[i] = word.indexOf(vowels[i]);	
			if(vCount[i] != -1) System.out.println(vowels[i] + "-" + vCount[i]);
		}	
		
		String ss = "Hello Woorld!";
		int len = ss.length();
		char[] stc = new char[len];
		for(int i=0;i<len; i++) {
			stc[i] = ss.charAt(i);
		}		
		System.out.println(stc[4]);
		String[] ssl = ss.split("o+");
		for(int i=0; i<ssl.length; i++) {
			System.out.println(ssl[i]);
		}
		// convert String to Date
		String strDate = "January 19, 2010";
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date date = null;
		try {
			date = format.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date); 
		
		
		// repeat String N times without loop in Java
		System.out.println(repeat(ss,3));
		
	}	
	public static String repeat(String str, int times) {
		return new String(new char[times]).replace("\0", str);
	}
}
