class Solution {
    public boolean isValidSudoku(char[][] board) {


        for(int i = 0; i<9; i++){

        HashSet<Character> rowset = new HashSet<>(); //to check only store unique elemenets from 1-9
            for(int j = 0; j<9; j++){

                if(board[i][j] == '.'){
                    continue;
                }

                if(rowset.contains(board[i][j])){
                    return false;
                }
                rowset.add(board[i][j]);

            }
            }



            //2check cols
        for(int i= 0; i<9; i++){
        HashSet<Character> colset = new HashSet<>(); // same as rowset but for col
        for(int j = 0;  j< 9; j++){

        if(board[j][i] == '.'){
            continue;
        }
        if(colset.contains(board[j][i])){
                    return false;
                }
                colset.add(board[j][i]);
        }
    }


    //boxes

                for(int i = 0; i<9; i += 3){
                    for(int j = 0; j<9; j += 3){
                        HashSet<Character> boxset  = new HashSet<>();

                        for(int x = 0; x < 3; x++) {
                            for(int y = 0; y < 3; y++) {

                                    // current cell:
                                   if(board[i + x][j + y]=='.'){
                                    continue;
                                   }
                                   if(boxset.contains(board[i+x][j+y])){
                                    return false;
                                }
                                   boxset.add(board[i + x][j + y]);
                            }
                    }
                    }
                }
        
            return true;
            }
}

