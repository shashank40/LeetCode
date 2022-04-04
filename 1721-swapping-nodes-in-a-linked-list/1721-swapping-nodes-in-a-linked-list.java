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
        
        ListNode temp=head;
        
        Queue<ListNode> st= new LinkedList<>();
        ListNode curr=null;
        while(st.size()<k && temp!=null)
        {   st.add(temp);
         if(st.size()==k)
             curr=temp;
            temp=temp.next;
        }
        
        if(st.size()<k && temp==null)
            return head;
         while(temp!=null){
            st.add(temp);
            temp=temp.next;
        }
        
        while(st.size()>k)
            st.poll();
        
        int c=curr.val;
        curr.val=st.peek().val;
        st.peek().val=c;
        
        return head;
    }
}