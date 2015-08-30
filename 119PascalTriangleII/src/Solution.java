import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> before = new ArrayList<Integer>();
		ArrayList<Integer> after = new ArrayList<Integer>();
		if (rowIndex < 0)
			return before;
		for (int i = 0; i <= rowIndex; i++) {
			if (i == 0) {
				after.add(1);
			} else {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						after.add(1);
					} else {
						after.add(before.get(j - 1) + before.get(j));
					}
				}
			}
			ArrayList<Integer> temp = before;
			before = after;
			after = temp;
			after.clear();
		}
		return before;
	}
}