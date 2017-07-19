package javaquestions;

public class NeedleInHaystack {

	public static void main(String args[]) {
		System.out.println(strStr("mississippi", "issipi"));
	}

	public static int strStr(String haystack, String needle) {
		int count = 0;
		int index = -1;
		if (needle.length() == 0)
			return 0;
		if (needle.length() > haystack.length())
			return -1;

		int i = 0;

		for (int j = 0; j < haystack.length(); j++) {
			if (haystack.charAt(j) != needle.charAt(i)) {
				j = j - count;
				count = 0;
				index = -1;
				i = 0;
			} else {
				count++;
				if (index == -1)
					index = j;
				i++;
			}
			if (count == needle.length())
				return index;
		}
		
		return -1;

	}
}
