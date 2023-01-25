package ua.com.foxminded.java.spring;

public class ToReverseWords {

	public static String reverseWord (String inputWorld) {
		String outputWords = new StringBuilder(inputWorld).reverse().toString();
		return outputWords;
		}
	
}
