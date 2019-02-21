package org.source;

import java.util.ArrayList;
import java.util.List;

public class StringExample {

	List<String> strLst = new ArrayList<String>();
	int index = 0;
	String s = null;

	public static void main(String[] args) {
		StringExample example = new StringExample();
		String s = "123456789";
		List<String> resultList = example.display1(s);
		StringBuilder finalString=new StringBuilder();
		for (String string : resultList) {
			finalString.append(string);
		}
		System.out.println("Final String ------>"+finalString);

		
	}

	/*
	 * private String display(String s) { String s1 = s; if (s.length() > 3) {
	 * String subStr = s.substring(0, 3); s = s.substring(3);
	 * System.out.println("After Sub String --->" + s); if
	 * (s1.substring(3).length() < 3 && strLst.size() > 2) { System.out.
	 * println("If length of the string is less than 3 anad list size is =2>");
	 * if (s1.substring(3).length() == 2) { strLst.add(s1.substring(0, 3));
	 * strLst.add(s1.substring(3)); } else { strLst.add(s1.substring(0,
	 * s1.length() / 2)); strLst.add(s1.substring(s1.length() / 2)); }
	 * 
	 * // return strLst.toString();
	 * 
	 * } else { strLst.add(subStr); index = index + 1;
	 * System.out.println("Index Value --->" + index);
	 * System.out.println("List Value --->" + strLst); //
	 * display(s.substring(3));
	 * 
	 * } return strLst.add(subStr) + display(s); } else { // return
	 * strLst.add(s1); return s1; }
	 * 
	 * }
	 */

	public List<String> display1(String s) {
		int modValue = s.length() % 3;
		System.out.println("Mod Value ------->" + modValue);
		String s1 = null;
		while (s.length() > modValue) {

			String subStr = s.substring(0, 3);
			System.out.println("subStr ---->" + subStr);
			s1 = s;
			s = s.substring(3);
			if (s.length() != modValue) {
				strLst.add(subStr);

				strLst.add("-");
			}
		}
		System.out.println("S1  ----->" + s1);
		if (0 == modValue) {
			strLst.add(s1);
		} else if (1 == modValue) {
			strLst.add(s1.substring(0, s1.length() / 2));
			strLst.add("-");
			strLst.add(s1.substring(s1.length() / 2));
		} else {
			strLst.add(s1.substring(0, 3));
			strLst.add("-");
			strLst.add(s1.substring(3));
		}

		return strLst;
	}

}
