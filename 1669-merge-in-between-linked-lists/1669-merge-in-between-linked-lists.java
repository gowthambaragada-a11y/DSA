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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l=list1,bl=list1,l2=list2;
        for(int i=0;i<a-1;i++)l=l.next;
        for(int i=0;i<b+1;i++)bl=bl.next;
        l.next=list2;
        while(l2.next!=null)l2=l2.next;
        l2.next=bl;
        return list1;
    }
}