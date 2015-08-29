public class Solution {
	public int reverse(int x) {
		double result = 0;
		boolean isStart = false;
		boolean isNative = false;
		if (x < 0) {
			isNative = true;
			x = -x;
		}
		while (x > 0) {
			int temp = x % 10;
			if (temp != 0 && !isStart) {
				isStart = true;
			}
			if (isStart) {
				result = result * 10 + temp;
			}
			x = x / 10;
		}
		if (result > Integer.MAX_VALUE) {
			return 0;
		}

		if (isNative)
			return (int) (-result);
		else
			return (int) result;
	}
}