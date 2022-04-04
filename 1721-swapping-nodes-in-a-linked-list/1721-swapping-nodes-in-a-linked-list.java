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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null)
            return null;
        
        int i=0;
        ListNode temp=head;
        ListNode curr=null;
        while(i<k && temp!=null){
            i++;
            if(i==k)
                curr=temp;
            temp=temp.next;
        }
        
        if(curr==null)
            return head;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        
        int n=0;
        temp=head;
        while(n<i-k){
            n++;
            temp=temp.next;
            
        }
        
        int v=curr.val;
        curr.val=temp.val;
        temp.val=v;
        
        return head;
        
    }
}