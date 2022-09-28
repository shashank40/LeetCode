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
// SECOND FASTER
//         List<ListNode> arr= new ArrayList<>();
           ListNode temp=new ListNode(-1);
        temp.next=head;
        if(head==null) 
            return head;

        
//         while(temp!=null){
//             arr.add(temp);
//             temp=temp.next;
//         }
        
//         if(n>arr.size())
//             return head;
        
//         if(n==arr.size())
//             return head.next;
        
//         arr.get(arr.size()-n-1).next=arr.get(arr.size()-n-1).next.next;
        
//         return head;
        
        ListNode fast = temp;
        ListNode slow = temp;
        
        for(int i=0;i<n;i++)
            fast=fast.next;
        
        while(fast.next!=null)//mtlb end node pe reached
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        
        return temp.next;
    }
}