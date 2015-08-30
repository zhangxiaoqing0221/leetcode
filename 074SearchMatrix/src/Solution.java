public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean flag = false;
		int row = matrix.length;
		int column = matrix[0].length;
		int i = 0;
		int j = column - 1;
		while (i < row && j >= 0) {
			if (matrix[i][j] == target) {
				flag = true;
				break;
			} else if (matrix[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return flag;
	}
}