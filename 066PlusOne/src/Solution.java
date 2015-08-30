public class Solution {
	public int[] plusOne(int[] digits) {
		int len = digits.length;
		int addition = 1;
		for (int i = len - 1; i >= 0; i--) {
			int digit = (digits[i] + addition) % 10;
			addition = (digits[i] + addition) / 10;
			digits[i] = digit;
			if (addition == 0) {
				return digits;
			}
		}
		int[] result = new int[len + 1];
		result[0] = 1;
		for (int i = 0; i < len; i++) {
			result[i + 1] = digits[i];
		}
		return result;

	}
}