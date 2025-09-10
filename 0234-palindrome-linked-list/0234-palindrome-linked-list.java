class Solution {
    public static ListNode reverse(ListNode head){
    ListNode curr = head, prev = null;
    while (curr != null) {
        ListNode nextNode = curr.next; 
        curr.next = prev;              
        prev = curr;                   
        curr = nextNode;          
    }
    return prev; 
} 
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow);
        ListNode firstHalf=head,secondHalf=newHead;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val) {
                reverse(newHead);
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;


        }
        reverse(newHead);
      
        return true;
    }
}