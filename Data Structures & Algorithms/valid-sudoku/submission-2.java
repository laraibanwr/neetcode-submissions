class Solution {
    private boolean inRange(char c) {
        int digit = c - '0';
        return digit >= 1 && digit <= 9;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                if(!inRange(board[i][j]) || !set.add(board[i][j])) {
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] == '.') {
                    continue;
                }
                if(!inRange(board[j][i]) || !set.add(board[j][i])) {
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i += 3) {
            for(int j = 0; j < 9; j+= 3) {
                Set<Character> set = new HashSet<>();
                for(int k = i; k < i + 3; k++) {
                    for(int l = j; l < j + 3; l++) {
                        if(board[k][l] == '.') {
                        continue;
                        }
                        if(!inRange(board[k][l]) || !set.add(board[k][l])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
