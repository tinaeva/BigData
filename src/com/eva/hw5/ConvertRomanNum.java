package com.eva.hw5;
/* 
 * Given a roman numeral, convert it to an integer. 
 * Input is guaranteed to be within the range from 1 to 3999.
*/

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanNum {
	public int romanToInt(String str) {
		if(str == null || str.length() == 0){
			return 0;
		}
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
	    m.put('I', 1);
	    m.put('V', 5);
	    m.put('X', 10);
	    m.put('L', 50);
	    m.put('C', 100);
	    m.put('D', 500);
	    m.put('M', 1000);

		int res = 0;
		for(int i=0; i<str.length()-1; i++) {
			if(m.get(str.charAt(i)) < m.get(str.charAt(i+1))) {
				res -= m.get(str.charAt(i));
			} else {
				res += m.get(str.charAt(i));
			}
		}
		res += m.get(str.charAt(str.length()-1));
		return res;
	}
	
	public static void main(String[] args) {
		String s1 = "VII";
		String s2 = "CD";
		ConvertRomanNum obj = new ConvertRomanNum();
		System.out.println(obj.romanToInt(s1));
		System.out.println(obj.romanToInt(s2));
	}
	
}
