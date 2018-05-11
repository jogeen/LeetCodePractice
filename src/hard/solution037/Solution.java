package hard.solution037;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {
	private class Grid {
		public int i;
		public int j;
		public List<Character> allowList = new ArrayList<>();
	}

	public void solveSudoku(char[][] board) {
		Stack<String> stack = new Stack<>();
		List<Grid> listRoad = new ArrayList<>();
		List<Set<Character>> list = new ArrayList<>(27);
		for (int i = 0; i < 27; i++) {
			list.add(new HashSet<Character>());
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				Set<Character> rowSet = list.get(i);
				Set<Character> colSet = list.get(9 + j);
				Set<Character> gongSet = list.get(18 + ((i / 3) * 3 + j / 3));
				if ('.' != board[i][j]) {
					rowSet.add(board[i][j]);
					colSet.add(board[i][j]);
					gongSet.add(board[i][j]);
				} else {
					Grid grid = new Grid();
					Set<Character> allowSet = new HashSet<>();
					allowSet.add('1');
					allowSet.add('2');
					allowSet.add('3');
					allowSet.add('4');
					allowSet.add('5');
					allowSet.add('6');
					allowSet.add('7');
					allowSet.add('8');
					allowSet.add('9');
					grid.i = i;
					grid.j = j;
					for (int k = 0; k < board.length; k++) {
						allowSet.remove(board[i][k]);
						allowSet.remove(board[k][j]);
						allowSet.remove(board[(i / 3) * 3 + k / 3][(j / 3) * 3 + k % 3]);
					}
					for (Character c : allowSet) {
						grid.allowList.add(c);
					}
					listRoad.add(grid);
				}
			}
		}
		for (Grid grid : listRoad) {
			int i=grid.i;
			int j=grid.j;
			Set<Character> rowSet = list.get(i);
			Set<Character> colSet = list.get(9 + j);
			Set<Character> gongSet = list.get(18 + ((i / 3) * 3 + j / 3));
		}
	}

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		Solution solution = new Solution();
		solution.printBoard(board);
		solution.solveSudoku(board);
		solution.printBoard(board);

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
