public class Solution {
	public int lengthOfLastWord(String s) {
		if (s != null && !s.trim().equals("")) {
			String[] str = s.trim().split(" ");
			int length = str[str.length - 1].length();
			return length;
		}
		return 0;
	}
}