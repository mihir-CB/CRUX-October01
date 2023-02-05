package Assignments;

class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backtrack(board,i,j,word,0)) {
                    return true;
                }
            }
        }
        return false;    
    }
    private boolean backtrack(char[][] board, int cr, int cc, String word, int idx){
        if(idx==word.length()){
            return true;
        }
        if(cr<0 || cc<0 || cr==board.length || cc==board[0].length || board[cr][cc]!=word.charAt(idx)){
            return false;
        }
        boolean res = false;
        char ch = board[cr][cc];
        board[cr][cc]='#';
        res=res||backtrack(board,cr+1,cc,word,idx+1);
        res=res||backtrack(board,cr-1,cc,word,idx+1);
        res=res||backtrack(board,cr,cc+1,word,idx+1);
        res=res||backtrack(board,cr,cc-1,word,idx+1);
        board[cr][cc]=ch;
        return res;
    }

}