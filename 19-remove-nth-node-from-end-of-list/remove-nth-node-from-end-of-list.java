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
    int len(ListNode head){
        if(head==null) return 0;
        return 1+len(head.next);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = len(head);
        if(total ==1) return null;
        if(total == n) return head.next;
        int i=1;
        ListNode res = head;
        while(i<total-n){
            head = head.next;
            i++;
        }
        head.next = head.next.next;
        return res;
    }
}