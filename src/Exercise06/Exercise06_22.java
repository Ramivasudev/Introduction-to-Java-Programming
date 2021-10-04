package Exercise06;
/*
* @author Rami Vasudev (D21CS104)
*/
/*(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
on a chessboard such that no two queens can attack each other (i.e., no two
queens are on the same row, same column, or same diagonal). There are many
possible solutions. Write a program that displays one such solution. A sample
output is shown below:*/
public class Exercise06_22 {
	public static void main(String[] args) {
		char[] board;                       // Create an array
		do {                                // Repeat while queens are attacking
			board = Board();          // create a board
			placeQueens(board);             // Place eight queens
		} while (Attacking(board));
		print(board);                   	// Display solution
	}
	public static void placeQueens(char[] board) {    //placeQueens randomly places eight queens on board
		int location;
		for (int i = 0; i < 8; i++) {
			do {
				location = placeQueens();
			} while (Occupied(board[location]));
			board[location] = 'Q';
		}
	}
	public static int placeQueens() {          //placeQueens randomly places one queen on board 
		int a = (int) (Math.random() * 64);
		return (a);
	}
	public static boolean Attacking(char[] board) {       //Attacking returns true if two queens are attacking each other
		return Row(board) || Column(board) ||  Diagonal(board);
	}
	public static boolean Row(char[] board) {       //Row returns true if two queens are in the same row
		int[] rows = new int[8];
		for (int i = 0; i < board.length; i++) {
			if (Occupied(board[i])) {
				rows[getRow(i)]++;
			}	
			if (rows[getRow(i)] > 1) 
				return true;
		}
		return false;
	}
	public static boolean Column(char[] board) {      //Column returns true if two queens are in the same column 
		int[] columns = new int[8];
		for (int i = 0; i < board.length; i++) {
			if (Occupied(board[i])) {
				columns[getColumn(i)]++;
			}	
			if (columns[getColumn(i)] > 1) {
				return true;
			}
		}
		return false;
	}
	public static boolean Diagonal(char[] board) {     //Diagonal returns true if two queens are on the same diagonal 
		for (int i = 0; i < board.length; i++) {
			if (Occupied(board[i])) {
				for (int j = 0; j < board.length; j++) {
					if (Occupied(board[j]) && Math.abs(getColumn(j) - getColumn(i)) ==
					    Math.abs(getRow(j) - getRow(i)) && j != i) {
						return true;
					}
				}
			}	
		}
		return false;
	}
	public static boolean Occupied(char x) { 	//Occupied returns true if element in x is char Q 
		return x == 'Q';
	}
	public static char[] Board() {   //Board returns a char array 
		char[] board = new char[64];
			for (int i = 0; i < board.length; i++) {
				board[i] = ' ';
			}
		return board;
	}
	public static void print(char[] board) {                  //print board 
		for (int i = 0; i < board.length; i++) {
			System.out.print("|" + ((getRow(i + 1) == 0) ? board[i] + "|\n" : board[i]));
		}
	}
	public static int getRow(int index) {          //returns row number 
		return index % 8;
	}
	public static int getColumn(int index) {       // returns column number 
		return index / 8;
	}
}
