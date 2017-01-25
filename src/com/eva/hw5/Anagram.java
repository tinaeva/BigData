package com.eva.hw5;
/*
 * Given two strings s and t, write a function to determine 
 * if t is an anagram of s.
 * For example, s = "anagram", t = "nagaram", return true. 
 * s = "rat", t = "car", return false.
 * Suppose all lower case characters
*/
public class Anagram {
	public boolean findAnagram(String str1, String str2) {
		if(str1.length() != str2.length() || str1 == null || str1.length() == 0 || str2 == null || str2.length() ==0) 
			return false;
		int[] s1 = new int[26];
		int[] s2 = new int[26];
		for(int i=0; i<str1.length(); i++) {
			s1[str1.charAt(i) - 'a'] ++;
			s2[str2.charAt(i) - 'a'] ++;
		}
		for(int j=0; j<s1.length; j++) {
			if(s1[j] != s2[j]) return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "anagram";
		String str2 = "nagaram";
		String str3 = "coach";
		String str4 = "cache";
		Anagram obj = new Anagram();
		System.out.println(obj.findAnagram(str1,str2));
		System.out.println(obj.findAnagram(str3,str4));
	}

}
