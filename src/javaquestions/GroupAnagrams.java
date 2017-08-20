package javaquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static void main(String args[]) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = groupAnagrams(strs);
		
		for (List<String> str : result) {
			for(String s : str) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        if(strs.length == 0)
            return result;
        
        for(String s : strs) {
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String strKey = String.valueOf(key);
            if(!hm.containsKey(strKey)) {
                hm.put(strKey, new ArrayList<>());
            } 
            hm.get(strKey).add(s);
        }
        
        
        
        for(String str : hm.keySet()) {
            List<String> list = hm.get(str);
            result.add(list);
        }
        return result;
    }
}
