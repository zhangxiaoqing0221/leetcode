public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder s = new StringBuilder();
		StringBuilder sa = new StringBuilder(a);
		sa = sa.reverse();
		StringBuilder sb = new StringBuilder(b);
		sb = sb.reverse();
		int length = sa.length() > sb.length() ? sa.length() : sb.length();
		int i1, i2, up = 0;
		for (int index = 0; index < length; index++) {
			if (index >= sa.length()) {
				i1 = 0;
			} else {
				i1 = sa.charAt(index) - '0';

			}

			if (index >= sb.length()) {
				i2 = 0;
			} else {
				i2 = sb.charAt(index) - '0';

			}
			int result = (i1 + i2 + up) % 2;
			up = (i1 + i2 + up) / 2;
			s.append(result);

		}
		if (up != 0) {
			s.append(up);
		}
		s = s.reverse();
		return s.toString();
	}
}