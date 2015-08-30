public class Solution {
	public ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null || n == 0) {
			return head;
		}
		ListNode result = null;
		ListNode node = head;
		ListNode tail = head;
		int length = 0;
		while (node != null) {
			length++;
			tail = node;
			node = node.next;
		}
		n %= length;
		if (n == 0)
			return head;
		node = head;
		for (int i = 0; i < length - n - 1; i++) {
			node = node.next;
		}
		result = node.next;
		node.next = null;
		tail.next = head;
		return result;
	}
}