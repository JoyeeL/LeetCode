package easy;

public class SudokuPuzzles {
	  public static boolean isValidSudoku(char[][] board) {
		  	char ch;
		    int cnum;
		    for(int i = 0; i < 9; i ++){
		    	int flag[] =new int[10] ;	    	
		    	for(int j = 0 ; j < 9; j ++){
		    		if(board[i][j]  != '.'){
			        ch = board[i][j];
			        cnum = Integer.parseInt(String.valueOf(ch));
			        if(flag[cnum] == 1) return false;
			        flag[cnum] = 1;
			    }
		    }
		    }
		    
		    for(int i = 0; i < 9;i ++){
		    	int flag[] =new int[10] ;    	
		    	for(int j = 0 ; j < 9; j ++){
		    		if(board[j][i]  != '.') {
		    			ch = board[j][i];
				        cnum = Integer.parseInt(String.valueOf(ch));
				        if(flag[cnum] == 1) return false;
				        flag[cnum] = 1;
		    		}
			        
			    }
		    }
		    
		    int medium,medium_h,medium_l,medium_le,medium_r,medium_hl,medium_hr,medium_ll,medium_lr;
		    for(int i = 1; i < 9-1 ; i = i +3){
		    	for( int j = 1 ; j < 9 -1; j = j +3){
		    		int flag[] =new int[10] ;
		    		if(board[i][j]  != '.') {
		    			medium =  Integer.parseInt(String.valueOf(board[i][j]));
			    		if(flag[medium] == 1) return false;
				        flag[medium] = 1;
		    		}
		    		
			        
		    		if(board[i-1][j]  != '.') {
		    			 medium_h = Integer.parseInt(String.valueOf(board[i-1][j]));
				    	 if(flag[medium_h] == 1) return false;
					     flag[medium_h] = 1;
		    		}
			       
			        
			        
		    		if(board[i+1][j]  != '.') {
		    			medium_l = Integer.parseInt(String.valueOf(board[i+1][j]));
			    		if(flag[medium_l] == 1) return false;
				        flag[medium_l] = 1;
		    		}
			        
			              
			        
		    		if(board[i][j -1]  != '.') {
				        medium_le = Integer.parseInt(String.valueOf(board[i][j-1]));
			    		if(flag[medium_le] == 1) return false;
				        flag[medium_le] = 1;	
		    		}

			        
			        
		    		if(board[i][j+1]  != '.') {
		    			medium_r = Integer.parseInt(String.valueOf(board[i][j+1]));
				    	if(flag[medium_r] == 1) return false;
					    flag[medium_r] = 1;
		    		}
			      
			        
			        
		    		if(board[i-1][j-1]  != '.') {
		    			 medium_hl = Integer.parseInt(String.valueOf(board[i-1][j-1]));
				    	if(flag[medium_hl] == 1) return false;
					     flag[medium_hl] = 1;
		    		}
			       
			        
		    		if(board[i-1][j+1]  != '.') {
		    			  medium_hr =Integer.parseInt(String.valueOf(board[i-1][j+1]));
				    	if(flag[medium_hr] == 1) return false;
					      flag[medium_hr] = 1;
		    		}
			      
			        
		    		if(board[i+1][j-1]  != '.') {
		    			 medium_ll = Integer.parseInt(String.valueOf(board[i+1][j-1]));
				    	if(flag[medium_ll] == 1) return false;
					    flag[medium_ll] = 1;
		    		}
			       
			        
		    		if(board[i+1][j+1]  != '.') {
		    			medium_lr = Integer.parseInt(String.valueOf(board[i+1][j+1]));
				    	if(flag[medium_lr] == 1) return false;
					    flag[medium_lr] = 1;
					        	
		    		}
			       
			        
		    		
		    	}
		    }
		    
		   return true; 
		 }
	public static void main(String[] args) {
//		char[][] board ={{'.','8','7','6','5','4','3','2','1'},
//				{'2','.','.','.','.','.','.','.','.'},
//				{'3','.','.','.','.','.','.','.','.'},
//				{'4','.','.','.','.','.','.','.','.'},
//				{'5','.','.','.','.','.','.','.','.','.'},
//				{'6','.','.','.','.','.','.','.','.','.'},
//				{'7','.','.','.','.','.','.','.','.'},
//				{'8','.','.','.','.','.','.','.','.'},
//				{'9','.','.','.','.','.','.','.','.'}};
//		boolean flag = isValidSudoku(board);		
//		System.out.println(flag);
		
		char board ='8';
		int m = Integer.valueOf(board);
		System.out.println(m);
		
	
		
	} 
	 
}
