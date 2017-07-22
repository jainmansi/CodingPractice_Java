package javaquestions;

public class DecodeWays {
	
	public static void main(String[] args) {
		String s = "11011011123411";
		System.out.println(numDecodings(s));
	}

	public static int numDecodings(String s) {

		if(s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        
        int[] D = new int[n+1];
        
        D[0] = 1;
        
        if(s.charAt(0) != '0') {
            D[1] = 1;
        } else {
            D[1] = 0;
        }
        
        for(int i = 2; i <= n; i++) {
            
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));
            
            if(first >= 1 && first <= 9) {
               D[i] += D[i-1];  
            }
            
            if(second >= 10 && second <= 26) {
                D[i] += D[i-2];
            }
        }
        return D[n];
	}
}
