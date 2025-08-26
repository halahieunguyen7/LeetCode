package LeetCode;

public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int total = 1;
        while(current.next != null){
            current = current.next;
            total++;
        }

        total = total / 2 + 1;
        current = head;
        for(int i = 1; i < total; i++)
        {
            current = current.next;
        }

        return current;
    }
}
