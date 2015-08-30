public class Solution {
	public int findMin(int[] num) {
		int low = 0;
		int high = num.length - 1;
		int mid = 0;
		while (num[low] > num[high]) {
			if (high - low == 1) {
				mid = high;
				break;
			}
			mid = (low + high) / 2;
			if (num[mid] > num[low]) {
				low = mid;
			} else if (num[mid] < num[high]) {
				high = mid;
			}
		}
		return num[mid];
	}
}