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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> arr= new ArrayList<>();
        ListNode temp=head;
        if(head==null)
            return head;
        
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        
        if(n>arr.size())
            return head;
        
        if(n==arr.size())
            return head.next;
        
        arr.get(arr.size()-n-1).next=arr.get(arr.size()-n-1).next.next;
        
        return head;
    }
}