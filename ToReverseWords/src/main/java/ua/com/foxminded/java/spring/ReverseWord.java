package ua.com.foxminded.java.spring;

import java.util.StringJoiner;

public class ReverseWord {

	public static String reverseWord(String inputWords) {
		if (inputWords.equals("")) {
			System.out.println("Insert not empty value");
		}

		String[] arrayWords = inputWords.split(" ");
		StringJoiner stringJoiner = new StringJoiner(" ");

		for (String words : arrayWords) {
			StringBuilder reverse = ReverseOfWord.reverseOfWord(words);
			stringJoiner.add(InputByIndex.inputByIndex(reverse, words));
		}
		return stringJoiner.toString();
	}

}
