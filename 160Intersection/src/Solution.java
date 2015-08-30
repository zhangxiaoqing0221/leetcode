public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode result1 = headA;
		ListNode result2 = headB;
		int length1 = 0;
		int length2 = 0;
		while (result1 != null) {
			length1++;
			result1 = result1.next;
		}
		while (result2 != null) {
			length2++;
			result2 = result2.next;
		}
		result1 = headA;
		result2 = headB;
		if (length1 > length2) {
			for (int i = 0; i < length1 - length2; i++) {
				result1 = result1.next;
			}
		} else if (length1 < length2) {
			for (int i = 0; i < length2 - length1; i++) {
				result2 = result2.next;
			}
		}
		while (result1 != null && result2 != null && result1.val != result2.val) {
			result1 = result1.next;
			result2 = result2.next;
		}
		if (result1 == null && result2 == null) {
			return null;
		} else {
			return result1;
		}
	}
}