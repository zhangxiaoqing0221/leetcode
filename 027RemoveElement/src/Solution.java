public class Solution {
	public int removeElement(int[] A, int elem) {
		int len = A.length;
		int result = 0;
		int p = 0;
		int q = 0;
		while (p < len) {
			if (A[p] != elem) {
				A[q] = A[p];
				p++;
				q++;
			} else {
				p++;
			}
		}
		result = q;
		return result;
	}
}