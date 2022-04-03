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
    public ListNode oddEvenList(ListNode head) {
if(head==null||head.next==null) return head;
            ListNode EvenStartterNode = head.next;
           ListNode OddNode=head,EvenNode = head.next;
            while(OddNode!=null&&
                  EvenNode!=null&&
                  OddNode.next!=null&&
                  OddNode.next.next!=null){
                            OddNode.next = OddNode.next.next;
                            OddNode = OddNode.next;
                 if(EvenNode.next.next!=null&&EvenNode.next.next!=null){
                            EvenNode.next = EvenNode.next.next;
                            EvenNode = EvenNode.next;
                 }else{
				 /*this Line is important because if you do not separate the odd and even parts then the resulting list will be cyclic( Check it yourself and you will know what i maen)*/
                         EvenNode.next = null;
                 }
            }
            OddNode.next =EvenStartterNode;
            return head;
    }
}