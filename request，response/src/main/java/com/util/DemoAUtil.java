package com.util;

public class DemoAUtil {

	public String getJiuJiu(){
		String str = "";
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				str+=i+"*"+j+"="+i*j+"&nbsp;";
			}
			str+="<br/>";
		}
		
		return str;
	}
	
}
