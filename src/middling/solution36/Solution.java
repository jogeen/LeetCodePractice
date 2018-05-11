package middling.solution36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public boolean isValidSudoku(char[][] board) {
		List<Set<Character>> list = new ArrayList<>(27);
		for (int i = 0; i < 27; i++) {
			list.add(new HashSet<Character>());
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				Set<Character> rowSet = list.get(i);
				Set<Character> colSet = list.get(9 + j);
				Set<Character> gongSet = list.get(18+((i/3)*3 + j / 3));
				if ('.' != board[i][j]) {
					if (rowSet.contains(board[i][j])) {
						return false;
					}else {
						rowSet.add(board[i][j]);
					}
					if (colSet.contains(board[i][j])) {
						return false;
					}else {
						colSet.add(board[i][j]);
					}
					if (gongSet.contains(board[i][j])) {
						return false;
					}else {
						gongSet.add(board[i][j]);
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = { { '5', '5', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		Solution solution = new Solution();
		solution.printBoard(board);
		boolean validSudoku = solution.isValidSudoku(board);
		System.out.println(validSudoku);
		
	}

	public void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + "  ");
				if ((j + 1) % 3 == 0) {
					System.out.print(" ");
				}
			}
			System.out.println("");
			if ((i + 1) % 3 == 0) {
				System.out.println(" ");
			}
		}
	}
}
