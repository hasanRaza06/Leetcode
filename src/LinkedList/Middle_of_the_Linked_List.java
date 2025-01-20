package LinkedList;

public class Middle_of_the_Linked_List {
    // Brute Force
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count/2;
        temp=head;
        while(count>0){
            temp=temp.next;
            count--;
        }
        return temp;
    }
    // Better
    public ListNode middlNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
