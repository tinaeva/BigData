package com.eva.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
Strings consists of lowercase English letters only 
and the length of both strings s and p will not be larger than 20,100.
The order of output does not matter.
*/
public class Anagram438 {
	private boolean winCheck(int[] pWin, int[] sWin) {
        for(int i = 0; i<pWin.length; i++) {
            if(pWin[i] != sWin[i]) return false;
        }
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s == null || p == null || s.length() == 0 || p.length() == 0) {
            return list;
        }
        
        int[] count = new int[26];
        for(char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        
        int[] find = new int[26];
        for(int i = 0; i<s.length(); i++) {
            find[s.charAt(i) - 'a']++;
            
            if(i >= p.length()) {
                find[s.charAt(i - p.length()) - 'a']--;
            }
            
            if(winCheck(count, find)) {
                list.add(i-p.length()+1);
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		Anagram438 obj = new Anagram438(); 
		String s1 = "cbaebabacd";
		String s2 = "abc";
		
		String s3 = "abab";
		String s4="ab";
		
		List<Integer> list1 = obj.findAnagrams(s1,s2);
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i));
		}
		System.out.println("");
		List<Integer> list2 = obj.findAnagrams(s3,s4);
		for(int i=0; i<list2.size(); i++) {
			System.out.print(list2.get(i));
		}
	}
}
