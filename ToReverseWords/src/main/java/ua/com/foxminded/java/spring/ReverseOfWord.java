package ua.com.foxminded.java.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseOfWord {

	public StringBuilder reverseOfWord(String inputWord) {
		String cutWordRegex = "([a-zA-Z]+)";
		StringBuilder word = new StringBuilder();

		Pattern pattern = Pattern.compile(cutWordRegex);
		Matcher matcher = pattern.matcher(inputWord);

		while (matcher.find()) {
				word.append(matcher.group());

		}

		return word.reverse();

	}
}
