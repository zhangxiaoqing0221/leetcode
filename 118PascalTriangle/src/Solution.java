import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows <= 0)
			return result;
		List<Integer> one = new ArrayList<Integer>();
		one.add(1);
		result.add(one);
		for (int k = 1; k <= numRows - 1; k++) {
			List<Integer> before = result.get(k - 1);
			List<Integer> after = new ArrayList<Integer>();
			after.add(1);
			for (int i = 0; i < before.size() - 1; i++) {
				after.add(before.get(i) + before.get(i + 1));
			}
			after.add(1);
			result.add(after);
		}
		return result;
	}
}