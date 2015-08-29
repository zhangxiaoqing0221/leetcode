public class Solution {
	public int maxSubArray(int[] A) {
		int greateNum = A[0];
		int nNum = A[0];
		for (int i = 1; i < A.length; i++) {
			if (nNum >= 0) {
				nNum += A[i];
			} else {
				nNum = A[i];
			}
			if (nNum > greateNum) {
				greateNum = nNum;
			}
		}
		return greateNum;
	}
}