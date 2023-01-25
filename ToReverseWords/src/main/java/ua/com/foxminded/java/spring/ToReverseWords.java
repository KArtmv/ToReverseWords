package ua.com.foxminded.java.spring;

public class ToReverseWords {

	public static String reverseWord(String inputWords) {
		int i = 0;
		String arrayWords[] = inputWords.split(" ");
		String outputWords[] = new String[arrayWords.length];

		for (String words : arrayWords) {
			String reverse = new StringBuilder(words).reverse().toString();
			outputWords[i] = reverse;
			i++;
		}

		return String.join(" ", outputWords);
	}

}
