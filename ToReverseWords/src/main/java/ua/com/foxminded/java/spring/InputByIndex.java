package ua.com.foxminded.java.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputByIndex {

	public String inputByIndex(StringBuilder word, String srsWord) {
		String cutSymbolsRegex = "([^a-zA-Z]+)";
		int indexOfSymbols = 0;
		String symbols = new String();

		Pattern pattern = Pattern.compile(cutSymbolsRegex);
		Matcher matcher = pattern.matcher(srsWord);

		while (matcher.find()) {
			indexOfSymbols = matcher.start();
			symbols = matcher.group(1);
			word.insert(indexOfSymbols, symbols);
		}

		return word.toString();

	}

}