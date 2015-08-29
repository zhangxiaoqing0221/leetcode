public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null&&l2!=null) {
			 return l2;
		}else if(l2==null&&l1!=null) {
			 return l1;
		}else if(l1==null&&l2==null) {
			return null;
		}
		ListNode headA = l1;
		ListNode headB = l2;
		ListNode headC = null;
		ListNode head = null;
		if(headA.val<=headB.val) {
			headC = headA;
			headA = headA.next;
		}else {
			headC = headB;
			headB = headB.next;
		}
		head = headC;
		while(headA!=null&&headB!=null){
			if(headA.val<=headB.val) {
				headC.next = headA;
				headA = headA.next;
				headC = headC.next;
			}else {
				headC.next = headB;
				headB = headB.next;
				headC = headC.next;
			}
		}
		if(headA!=null){
			while(headA!=null) {
				headC.next = headA;
				headA = headA.next;
				headC = headC.next;
			}
		}
		if(headB!=null){
			while(headB!=null) {
				headC.next = headB;
				headB = headB.next;
				headC = headC.next;
			}
		}
	 return head;
    }
}