package LinkedList;
class ListNode{
    int val;
    ListNode next;
}
public class Delete_Node_in_a_Linked_List {
    public void deleteNode(ListNode node) {
        //if node is null or node of next is null return
        if(node == null || node.next==null){
            return;
        }
        ListNode prev=null;
        while(node !=null &&node.next!=null){
            node.val=node.next.val;
            prev=node;
            node=node.next;
        }
        prev.next=null;
    }
}
