package javaquestions;

public class ReverseWordsInAString {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("   a   b "));
	}

	public static String reverseWords(String s) {
        if(s.equals(" ") || s.equals("") || s == null || s.trim().equals(""))
            return s.trim();
        String[] splitted = s.trim().split(" ");
        
        int i = 0;
        int j = splitted.length - 1;
        
        while(splitted[i].equals(" "))
            i++;
        
        while (i < j) {
        	if(!splitted[i].replaceAll(" ", "").equals("") && !splitted[j].replaceAll(" ", "").equals("")) {
	        	String temp = splitted[i].replace(" ", "");
	            splitted[i] = splitted[j].replace(" ", "");
	            splitted[j] = temp;
	            i++;
	            j--;
        	}
        	if (splitted[i].trim().replaceAll(" ", "").equals(""))
        		i++;
        	if (splitted[j].trim().replaceAll(" ", "").equals(""))
        		j--;
        }
        
        StringBuilder result = new StringBuilder(splitted[0]);
        for (int k = 1; k < splitted.length; k++) {
            if(!splitted[k].equals("") && !splitted[k].equals(" ")) {
            	result.append(" ");
                result.append(splitted[k]);
            }
        }
        return result.toString();
    }
}
