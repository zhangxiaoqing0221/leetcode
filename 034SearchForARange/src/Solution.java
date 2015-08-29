public class Solution {
	public int[] searchRange(int[] A, int target) {
		int Lstart = -1;
		int Lend = -1;
		int low = 0;
		int high = A.length - 1;
		int middle = (low + high) / 2;
		boolean flag = false;
		while (low <= high) {
			if (A[middle] == target) {
				flag = true;
				break;
			} else if (A[middle] > target) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
			middle = (low + high) / 2;
		}
		if (flag) {
			low = 0;
			high = A.length - 1;
			middle = (low + high) / 2;
			while (low <= high) {
				if (A[middle] == target) {
					if (middle > 0 && A[middle - 1] != target || middle == 0) {
						break;
					} else {
						high = middle - 1;
					}
				} else if (A[middle] > target) {
					high = middle - 1;
				} else {
					low = middle + 1;
				}
				middle = (low + high) / 2;
			}
			Lstart = middle;
			low = 0;
			high = A.length - 1;
			middle = (low + high) / 2;
			while (low <= high) {
				if (A[middle] == target) {
					if ((middle < (A.length - 1)) && A[middle + 1] != target || middle == (A.length - 1)) {
						break;
					} else {
						low = middle + 1;
					}
				} else if (A[middle] < target) {
					low = middle + 1;
				} else {
					high = middle - 1;
				}
				middle = (low + high) / 2;
			}
			Lend = middle;
			return new int[] { Lstart, Lend };
		} else {
			return new int[] { -1, -1 };
		}
	}
}