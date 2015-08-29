public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
		ListNode result = head;
		while(result!=null) {
			length ++;
			result  = result.next;
		}
		if(length==n) {
			return head.next;
		}
		else {
			result = head;
			for(int i=1;i<(length-n);i++) {
				result = result.next;
			}
			result.next = result.next.next;
			return head;
		}
    }
}