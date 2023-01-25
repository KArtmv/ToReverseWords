package ua.com.foxminded.java.spring;

import java.util.Scanner;

public class ReverseOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputWord = sc.nextLine();
		sc.close();
		
		
		System.out.println(ToReverseWords.reverseWord(inputWord));
		
		
		
	}

}
