package Lec23;

public class SudokuSolver {

	public static void main(String[] args) {
		char[][] board = new char[9][9];
		sudokuSolver(board, 0, 0);
		display(board);
	}

	public static boolean sudokuSolver(char[][] board, int r, int c) {
		if (c == board[0].length) {
			r++;
			c = 0;
		}
		if (r == board.length) {
			// bhardia board
			return true;
		}
		if (board[r][c] == '.') {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(board, r, c, ch)) {
					board[r][c] = ch;
					if (sudokuSolver(board, r, c + 1)) {
						return true;
					} else {
						board[r][c] = '.';
					}
				}
			}
			return false;
		} else {
			return sudokuSolver(board, r, c + 1);
		}
	}

	public static boolean isSafe(char[][] board, int r, int c, char ch) {
		// check row
		for (int i = 0; i < board[0].length; i++) {
			if (board[r][i] == ch) {
				return false;
			}
		}

		// check col
		for (int i = 0; i < board.length; i++) {
			if (board[i][c] == ch) {
				return false;
			}
		}

		// check sub-block
		int sr = r - (r % 3);
		int sc = c - (c % 3);
		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if (board[i][j] == ch) {
					return false;
				}
			}
		}
		return true;
	}

	public static void display(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
