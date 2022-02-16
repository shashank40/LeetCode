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
    public ListNode swapPairs(ListNode head) {
       if(head==null)
           return null;
        
        if(head.next==null)
            return head;
        
        ListNode h=swapPairs(head.next.next);
        ListNode temp=head.next;
        if(h!=null){
            temp.next=head;
            head.next=h;
            return temp;
        }
        else{
            if(head.next==null)
                return head;
            else if(head==null)
                return null;
            else{
                temp.next=head;
                head.next=null;
                return temp;
            }
        }
        
    }
}