package javaquestions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		String testDigit = "2345";
		
		System.out.println(letterCombinations(testDigit));
	}
	public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] dict = {"0","1","abc","def", "ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        if(digits.length() == 0)
            return result;
        
        result.add("");
        
        for(int i = 0; i < digits.length(); i++) 
            result = combine(dict[digits.charAt(i) - '0'], result);
        
        return result;
    }
    
    public static List<String> combine(String digitVal, List<String> li) {
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < digitVal.length(); i++) {
            for(String s : li) {
                result.add(s+digitVal.charAt(i));
            }
        }
        return result;
    }
}
