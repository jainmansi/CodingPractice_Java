package javaquestions;

import java.util.HashSet;

public class GetAllPermutations {
	static HashSet<String> hs = new HashSet<>();
	public static void main(String args[]) {
		String test = "ABCA";
		int l = 0;
		int r = test.length()-1;
		HashSet<String> res = permute(test, l,r);
		System.out.println(res.size());
		for(String s : res)
			
			System.out.println(s);
	}
	
	public static HashSet<String> permute(String str, int l, int r) {
		
		if(l == r) 
			hs.add(str);
		
		for (int i = l; i <= r; i++) {
			str = swap(str, l , i);
			permute(str, l+1 , r);
			str = swap(str, l, i);
		}
		return hs;
	}
	
	public static String swap(String str, int l, int r) {
		char[] c = str.toCharArray();
		char temp;
		temp = c[l];
		c[l] = c[r];
		c[r] = temp;
		
		return String.valueOf(c);
	}
}
