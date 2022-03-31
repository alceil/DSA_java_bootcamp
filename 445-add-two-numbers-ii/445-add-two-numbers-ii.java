/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
    		return (l1 == null) ? l2 : l1;
    	}
        l1 = reverse(l1);
        l2 = reverse(l2);
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(carry != 0 || l1 != null || l2 != null) {
        	int a = 0;
        	if(l1 != null) {
        		a = l1.val;
        		l1 = l1.next;
        	}
        	int b = 0;
        	if(l2 != null) {
        		b = l2.val;
        		l2 = l2.next;
        	}
        	int sum = a + b + carry;
        	ListNode newNode = new ListNode(sum % 10);
        	curr.next = newNode;
        	curr = curr.next;
        	carry = sum / 10;
        }
        ListNode ans = dummy.next;
        dummy.next = null;
        return reverse(ans);
    }
    
    public static ListNode reverse(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode pre = null;
    	ListNode curr = head;
    	ListNode forw = null;
    	
    	while(curr != null) {
    		forw = curr.next;
    		curr.next = pre;
    		pre = curr;
    		curr = forw;
    	}
    	return pre;
    }
}