public class Solution {
	public int searchInsert(int[] A, int target) {
		int low = 0;
		int high = A.length - 1;
		int mid = (low + high) / 2;
		while (low < high) {
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (A[mid] < target)
			return mid + 1;
		else
			return mid;
	}
}