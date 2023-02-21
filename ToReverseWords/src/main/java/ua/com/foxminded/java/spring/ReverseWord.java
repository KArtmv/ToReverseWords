package ua.com.foxminded.java.spring;

import java.util.StringJoiner;

public class ReverseWord {

	public String reverseWord(String inputWords) {
		if (inputWords == null || inputWords.equals("") || inputWords.matches("\\s+")) {
			throw new IllegalArgumentException("input should not be null");
		}

		StringJoiner stringJoiner = new StringJoiner(" ");
		ReverseOfWord toReverse = new ReverseOfWord();
		InputByIndex inputByIndex = new InputByIndex();

		String[] arrayWords = inputWords.split(" ");

		for (String words : arrayWords) {
			StringBuilder wordIsReversed = toReverse.reverseOfWord(words);
			inputByIndex.inputByIndex(wordIsReversed, words);
			stringJoiner.add(wordIsReversed);

		}

		return stringJoiner.toString();
	}

}
