public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode result = head;
		while (result != null) {
			ListNode before = result;
			while (before != null && before.val == result.val) {
				before = before.next;
			}
			result.next = before;
			result = before;
		}
		return head;
	}
}