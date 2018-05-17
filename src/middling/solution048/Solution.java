package middling.solution048;

public class Solution {

	public void rotate(int[][] matrix) {
		int length = matrix.length - 1;
		int halfRow = matrix.length % 2 == 0 ? matrix.length / 2 : matrix.length / 2 + 1;
		int halfCol = matrix.length / 2;
		for (int i = 0; i < halfRow; i++) {
			for (int j = 0; j < halfCol; j++) {
				int startI=i;
				int startJ=j;
				int startTemp = matrix[i][j];
				int temp = startTemp;
				int tempNext = temp;
				int tempi = j;
				int tempj = length - i;
				while (tempi!=startI||tempj!=startJ) {
					tempNext = matrix[tempi][tempj];
					matrix[tempi][tempj] = temp;
					temp = tempNext;
					int tempx = tempi;
					tempi = tempj;
					tempj = length - tempx;
				}
				matrix[tempi][tempj] = temp;
				printMatrix(matrix);
			}
		}
	}

	public static void main(String[] args) {

		// int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
		// 14, 15, 16 } };
		int[][] matrix = { 
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 8, 9, 10, 11, 12, 13, 14 }, 
				{ 15, 16, 17, 18, 19, 20, 21 },
				{ 22, 23, 24, 25, 26, 27,28}, 
				{29,30,31,32,33,34,35},
				{36,37,38,39,40,41,42},
				{43,44,45,46,47,48,49}};
		// int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		new Solution().printMatrix(matrix);
		new Solution().rotate(matrix);
		System.out.println("######################");
		new Solution().printMatrix(matrix);
	}

	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println("");
		}
		System.out.println("######################");
	}
}
