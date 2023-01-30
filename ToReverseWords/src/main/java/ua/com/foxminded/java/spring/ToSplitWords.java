package ua.com.foxminded.java.spring;

public class ToSplitWords {

	public static String reverseWord(String inputWords) {
		int i = 0;
		String arrayWords[] = inputWords.split(" ");
		String outputWords[] = new String[arrayWords.length];
		StringBuilder reverse = new StringBuilder();
		String str = new String();

		for (String words : arrayWords) {

			reverse = ReverseOfWord.reverseOfWord(words);
			str = InputByIndex.inputByIndex(reverse, words);

			outputWords[i] = str;
			i++;
		}

		return String.join(" ", outputWords);
	}

}
