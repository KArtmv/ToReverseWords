package ua.com.foxminded.java.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseOfWord {

	public static StringBuilder reverseOfWord(String inputWords) {

		String cutLettersRegex = "([a-zA-Z]+)";

		StringBuilder letters = new StringBuilder();

		Pattern pattern = Pattern.compile(cutLettersRegex);
		Matcher matcher = pattern.matcher(inputWords);

		while (matcher.find()) {
			if (matcher.group(1) != null) {
				letters.append(new StringBuilder(matcher.group(1)));
			}

		}

		letters.reverse();

		return letters;

	}
}
