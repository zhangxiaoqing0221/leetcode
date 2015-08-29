public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
		ListNode start = result;
		int temp = 0;
		ListNode t1 = l1;
		ListNode t2 = l2;
		int t1v;
		int t2v;
		for(;t1!=null||t2!=null;) {
			result.next = new ListNode(0);
			result = result.next;
			if(t1==null) {
				 t1v = 0;
			}else {
				t1v = t1.val;
				t1 = t1.next;
			}
			
			if(t2==null) {
				 t2v = 0;
			}else {
				t2v = t2.val;
				t2 = t2.next;
			}
			
			result.val = (t1v+t2v+temp)%10;
			temp = (t1v+t2v+temp)/10;
		}
		
		if(temp!=0) {
			result.next = new ListNode(0);
			result.next.val = temp;
		}
		 return start.next;
    }
}