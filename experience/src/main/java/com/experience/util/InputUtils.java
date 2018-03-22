package com.experience.util;

public class InputUtils {


	public static Object validateInput(Object object,String caseTest) {
		if(caseTest.equals("checkIntString")) {
			try {
				return Integer.parseInt(object.toString());
			} catch (Exception e) {
				return object.toString();
			}
		}else if(caseTest.equals("checkDoubleString")) {
			try {
				return Double.parseDouble(object.toString());
			} catch (Exception e) {
				return object.toString();
			}
		}
		return null;
	}

}
