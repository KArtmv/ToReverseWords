package ua.com.foxminded.java.spring;

import java.util.StringJoiner;

public class ReverseWord {

	public  String reverseWord(String inputWords) {
		StringJoiner stringJoiner = new StringJoiner(" ");
		if (inputWords != null && !inputWords.isEmpty() && !inputWords.equals(" ")) {

		ReverseOfWord toReverse = new ReverseOfWord();
		InputByIndex inputByIndex = new InputByIndex();

		String[] arrayWords = inputWords.split(" ");

		for (String words : arrayWords) {
			StringBuilder wordIsReversed = toReverse.reverseOfWord(words);
			inputByIndex.inputByIndex(wordIsReversed, words);
			stringJoiner.add(wordIsReversed);

			}
		} else {
			System.out.println("Insert a non-empty value");

		}
		return stringJoiner.toString();
	}

}
