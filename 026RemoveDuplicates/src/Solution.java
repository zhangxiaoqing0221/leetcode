public class Solution {
	public int removeDuplicates(int[] A) {
		int len = A.length;
		if (len == 0) {
			return 0;
		}
		int result = 0;
		int p = 0;
		int q = p + 1;
		while (p < len && q < len) {
			while (q < len && A[q] == A[p]) {
				q++;
			}
			if (q < len) {
				A[++p] = A[q];
				q++;
			}
		}
		result = p + 1;
		return result;

	}
}