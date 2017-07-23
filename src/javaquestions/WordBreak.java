package javaquestions;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {

		String trueString = "mansijain";
		String falseString = "thisismansi";
		List<String> wordDict = new ArrayList<>();

		wordDict.add("mansi");
		wordDict.add("jain");
		wordDict.add("an");
		wordDict.add("man");
		wordDict.add("in");
		wordDict.add("ansi");

		System.out.println("This should return true: " + wordBreak(trueString, wordDict));
		System.out.println("This should return false: " + wordBreak(falseString, wordDict));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {

		boolean[] wordCheck = new boolean[s.length() + 1];
		wordCheck[0] = true;

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (wordCheck[j] && wordDict.contains(s.substring(j, i))) {
					wordCheck[i] = true;
					break;
				}
			}
		}
		return wordCheck[s.length()];
	}

}
