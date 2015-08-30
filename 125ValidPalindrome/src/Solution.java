public class Solution {
	public boolean isValid(char c) {
		if (c >= 'a' && c <= 'z')
			return true;
		if (c >= '0' && c <= '9')
			return true;
		return false;
	}

	public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0)
			return true;
		s = s.toLowerCase();
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (!isValid(s.charAt(left))) {
				left++;
				continue;
			}
			if (!isValid(s.charAt(right))) {
				right--;
				continue;
			}
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;

		}
		return true;
	}
}