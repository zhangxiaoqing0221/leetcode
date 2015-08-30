public class Solution {
	public void merge(int A[], int m, int B[], int n) {
		int index = m + n - 1;
		int aindex = m - 1;
		int bindex = n - 1;
		while (aindex >= 0 && bindex >= 0) {
			if (A[aindex] <= B[bindex]) {
				A[index] = B[bindex];
				bindex--;
			} else {
				A[index] = A[aindex];
				aindex--;
			}
			index--;
		}
		if (aindex >= 0) {
			for (int k = aindex; k >= 0; k--) {
				A[index--] = A[k];
			}
		}

		if (bindex >= 0) {
			for (int k = bindex; k >= 0; k--) {
				A[index--] = B[k];
			}
		}
	}
}