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
        if(lists==null||lists.length==0)return null;
        ListNode r=lists[0];
        for(int i=1;i<lists.length;i++){
            r=merge(r,lists[i]);
        }
        return r;
    }
    static ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        while(a!=null&&b!=null){
            if(a.val<b.val){
                t.next=a;
                a=a.next;
            }
            else{
                t.next=b;
                b=b.next;
            }
            t=t.next;
        }
        if(a!=null)t.next=a;
        if(b!=null)t.next=b;
        return dummy.next;
    }
}