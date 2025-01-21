package LinkedList;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class Convert_Sorted_List_to_Binary_Search_Tree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)return null;
        if(head.next==null){
            return new TreeNode(head.val);
        }

        ListNode slow=head;
        ListNode fast=head;
        ListNode slowPrev=null;

        while(fast!=null && fast.next!=null){
            slowPrev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root=new TreeNode(slow.val);
        slowPrev.next=null;
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        return root;
    }
}
