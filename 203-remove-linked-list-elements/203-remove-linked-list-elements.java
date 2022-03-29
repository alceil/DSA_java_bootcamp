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
    public ListNode removeElements(ListNode head, int val) {
    if(head==null) return head;
    ListNode dummy = new ListNode(0);
    ListNode dummyHead = dummy;   
    ListNode node = head;     
    while(node!=null){
        if(node.val!=val){
            dummy.next = new ListNode(node.val);
            dummy = dummy.next;
        }
        node = node.next;
    }    
    return dummyHead.next;     
 }

}