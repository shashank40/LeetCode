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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new mycmp());
        int k=lists.length;
        for(int i=0;i<k;i++)
            if(lists[i]!=null)
            pq.add(lists[i]);
        
        ListNode head=new ListNode(-1);
        ListNode tail=head;
        
        
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            tail.next=temp;
            
            if(temp.next!=null)
            pq.add(temp.next);
            
            tail=temp;
        }
        
        tail.next=null;
        
        return head.next;
    }
}

class mycmp implements Comparator<ListNode>
{
    public int compare(ListNode p, ListNode q){
    return p.val-q.val;}
}