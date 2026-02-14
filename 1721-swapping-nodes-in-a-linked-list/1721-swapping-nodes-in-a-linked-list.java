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
        int size=0;
        ListNode c=head;
        while(c!=null){
            c=c.next;
            size++;
        }
        ListNode f;
        c=head;
        for(int i=1;i<k;i++)c=c.next;
        f=c;
        c=head;
        for(int i=1;i<size-k+1;i++)c=c.next;
        int temp=c.val;
        c.val=f.val;
        f.val=temp;
        return head;
    }
}