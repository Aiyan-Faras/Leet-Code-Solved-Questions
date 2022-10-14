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
    
    private class MyClass{
        public ListNode head;
        public ListNode tail;
        
        public MyClass(){
            head = new ListNode();
            tail = head;
        }
        
        public void append(int val){
            ListNode node = new ListNode(val);
            tail.next = node;
            tail = node;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        MyClass node = new MyClass();
        int carry=0;
        while(l1!=null ||l2!=null){
            int num1 = (l1==null)? 0:l1.val;
            int num2 = (l2==null)? 0:l2.val;
            int sum = num1+num2+carry;
            node.append(sum%10);
            carry = (sum>9)?1:0;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry>0)node.append(1);
        return node.head.next;
    }
}