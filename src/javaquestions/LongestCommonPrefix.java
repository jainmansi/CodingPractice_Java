package javaquestions;

public class LongestCommonPrefix {

	public static void main(String args[]) {
		String[] arr = {"mansi", "mans", "manu", "manual"};
 		System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		if (strs.length < 0)
			return "";
		
		String result = strs[0];
		for (String str : strs) {
			if(str.length() < result.length()) {
				result = result.substring(0, str.length());
			}
			for (int i = 0; i < result.length(); i++) {
				if(result.charAt(i) != str.charAt(i))
					result = result.substring(0, i);
			}
			
		}
        return result;
    }
}
