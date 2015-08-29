public class Solution {
	public String convert(String s, int nRows) {
		if (s == null || nRows <= 0)
			return null;
		if (s.equals(""))
			return "";
		int modKey = (nRows << 1) - 2;
		if (modKey == 0)
			return s;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (j % modKey == i || (j % modKey == (modKey - i))) {
					sb.append(s.charAt(j));
				}
			}
		}
		return sb.toString();
	}
}