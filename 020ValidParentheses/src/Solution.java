import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack stack = new Stack();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ')' && c != '}' && c != ']') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char pre = (char) stack.peek();
				switch (c) {
				case ')': {
					if (pre == '(')
						stack.pop();
					else
						return false;
					break;
				}
				case '}': {
					if (pre == '{')
						stack.pop();
					else
						return false;
					break;
				}

				case ']': {
					if (pre == '[')
						stack.pop();
					else
						return false;
					break;
				}
				}
			}
		}
		if (stack.isEmpty())
			return true;
		return false;
	}
}