public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null)
			return null;
		if (strs.length == 0)
			return "";
		StringBuilder sb = new StringBuilder("");
		int arrayLength = strs.length;
		int minLength = strs[0].length();
		for (int i = 1; i < arrayLength; i++) {
			if (strs[i].length() < minLength) {
				minLength = strs[i].length();
			}
		}
		boolean flag = false;
		for (int i = 0; i < minLength; i++) {
			if (flag)
				break;
			else {
				char c = strs[0].charAt(i);
				int count = 0;
				for (int j = 1; j < arrayLength; j++) {
					if (strs[j].charAt(i) != c) {
						flag = true;
						break;
					} else {
						count++;
					}
				}
				if (count == arrayLength - 1) {
					sb.append(c);
				}
			}
		}
		return sb.toString();
	}
}