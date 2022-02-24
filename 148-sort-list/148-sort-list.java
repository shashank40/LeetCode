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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode tmp=head;
        
        while(tmp!=null){
            arr.add(tmp.val);
            tmp=tmp.next;
        }
        
        Collections.sort(arr);
        
        tmp=head;
        int i=0;
        while(tmp!=null){
            tmp.val=arr.get(i++);
            tmp=tmp.next;
        }
     
        return head;
    }
}