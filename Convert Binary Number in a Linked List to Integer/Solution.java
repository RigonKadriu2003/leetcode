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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null){
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }
}
 
/*
We can get 5 also like this without Linkedlist

public class Solution{
	public static void main(String [] args){
		int[] head = {1, 0, 1};
		int binaryVal = 0;
		for(int i = 0; i < head.length - 2; i++){
			if(i > 3){
				return;
			}
			binaryVal = Integer.parseInt(head[i] + "" + head[i + 1] + "" + head[i + 2], 2);
			
			
		}
		
		System.out.println(binaryVal);
	}
}
*/