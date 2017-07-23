package javaquestions;

public class WordSearch {
	
	public static void main(String args[]) {
		char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
		String word = "ABCCED";
		
		System.out.println(exist(board, word));
	}

	public static boolean exist(char[][] board, String word) {
        for(int i =0; i < board.length; i++) {
            for(int j = 0; j< board[i].length; j++) {
                if(checkIfExist(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }
    
    public static boolean checkIfExist (char[][] board, int x, int y, String word, int index) {
        if (index >= word.length())
            return true;
        
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length)
            return false;
        
        if(board[x][y] == word.charAt(index++)) {
            char c = board[x][y];
            board[x][y] = '#';
            boolean result = checkIfExist(board, x + 1, y, word, index) || checkIfExist(board, x - 1, y, word, index) ||                                       checkIfExist(board, x , y + 1, word, index) || checkIfExist(board, x, y - 1, word, index);
            board[x][y] = c;
            return result;
        }
        return false;
    }
}
