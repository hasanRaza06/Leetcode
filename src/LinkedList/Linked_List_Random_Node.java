package LinkedList;
import java.util.*;

public class Linked_List_Random_Node {
}

//Approach 1

class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
    }

    public int getRandom() {
        Random rand=new Random();
        int rand_ind=rand.nextInt(list.size());
        return list.get(rand_ind);
    }
}
