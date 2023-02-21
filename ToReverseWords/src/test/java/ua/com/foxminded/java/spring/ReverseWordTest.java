package ua.com.foxminded.java.spring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class ReverseWordTest {

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "  " })
	void reverseWord_shouldReturnIllegalArgumentException_whenInputNullOrEmptyOrSpace(String input) {
		ReverseWord reverseWord = new ReverseWord();
		assertThrows(IllegalArgumentException.class, () -> reverseWord.reverseWord(input));
	}

	@Test
	void reverseWord_shouldReturnSameLetter_whenInputALetter() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("a", reverseWord.reverseWord("a"));
	}

	@Test
	void reverseWord_shouldReturnSameLetters_whenInputIdenticalLetters() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("aa", reverseWord.reverseWord("aa"));
	}

	@Test
	void reverseWord_shouldReturnReverseLetters_whenInputLettersLowerAndUpperCases() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("aA", reverseWord.reverseWord("Aa"));
	}

	@Test
	void reverseWord_shouldReturnReverseAWord_whenInputAWordWithDifferentLetters() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("fedcba", reverseWord.reverseWord("abcdef"));
	}

	@Test
	void treverseWord_shouldReturnSameSymbols_whenInputOnlySymbols() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("1234!@#$", reverseWord.reverseWord("1234!@#$"));
	}

	@Test
	void reverseWord_shouldReturnReverseWords_whenInputSeveralWords() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("olleH drow", reverseWord.reverseWord("Hello word"));
	}

	@Test
	void reverseWord_shouldReturnReverseWordButSymbolsStaySamaPlaces_whenInputAWordWithSymbols() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("e1d@C#bA", reverseWord.reverseWord("A1b@C#de"));
	}

	@Test
	void reverseWord_shouldReturnReverseWordsButSymbolsStaySamaPlaces_whenInputSeveraWordWithSymbols() {
		ReverseWord reverseWord = new ReverseWord();
		assertEquals("e1d@C#bA A1b@C#de", reverseWord.reverseWord("A1b@C#de e1d@C#bA"));
	}

}
