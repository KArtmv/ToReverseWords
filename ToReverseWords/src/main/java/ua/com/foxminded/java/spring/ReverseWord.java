package ua.com.foxminded.java.spring;

import java.util.StringJoiner;

public class ReverseWord {

	public static String reverseWord(String inputWords) {
		String[] arrayWords = inputWords.split(" ");
		StringJoiner stringJoiner = new StringJoiner(" ");

		for (String words : arrayWords) {

			StringBuilder reverse = ReverseOfWord.reverseOfWord(words);
			String str = InputByIndex.inputByIndex(reverse, words);

			stringJoiner.add(str);

		}

		return stringJoiner.toString();
	}

}
