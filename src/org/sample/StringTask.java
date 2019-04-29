package org.sample;

public class StringTask {
	public static void main(String[] args) {
		String s="GeethA@33363$#@&S";
		
		String upper="";
		String lower="";
		String digits="";
		String Special="";
		
		for (int i = 0; i <s.length(); i++) {
			char c=s.charAt(i);
			
		if(Character.isLowerCase(c)){
			lower=lower+c;
		}
		else if(Character.isUpperCase(c)) {
			upper=upper+c;
		}
		else if(Character.isDigit(c)) {
			digits=digits+c;
		}
		else {
			
			Special =Special+c;
			
		}
		}
		System.out.println("small letter: " +lower);
		System.out.println("capital letter: " +upper);
		System.out.println("digits: " +digits);
		System.out.println("special characters: " +Special);
		}

}