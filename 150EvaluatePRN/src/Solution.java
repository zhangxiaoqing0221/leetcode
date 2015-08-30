import java.util.Stack;

public class Solution {
	Stack<String> stack = new Stack<String>();

	public int evalRPN(String[] tokens) {
		for (int i = 0; i < tokens.length; i++) {
			String temp = tokens[i];
			if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
				String op2 = stack.pop();
				String op1 = stack.pop();
				stack.push("" + calculate(op1, temp, op2));
			} else {
				stack.push(temp);
			}
		}
		return Integer.valueOf(stack.pop());
	}

	public int calculate(String op1, String temp, String op2) {
		int number1 = Integer.valueOf(op1);
		int number2 = Integer.valueOf(op2);
		if (temp.equals("+")) {
			return number1 + number2;
		} else if (temp.equals("-")) {
			return number1 - number2;
		} else if (temp.equals("*")) {
			return number1 * number2;
		} else if (temp.equals("/")) {
			return number1 / number2;
		}
		return 0;

	}
}