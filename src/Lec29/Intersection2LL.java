package Lec29;
import Lec29.LinkedList;

public class Intersection2LL {

	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        int lenA = len(headA);
	        int lenB = len(headB);
	        ListNode tempA = headA;
	        ListNode tempB = headB;
	        while(lenA>lenB){
	            lenA--;
	            tempA=tempA.next;
	        }
	        while(lenA<lenB){
	            lenB--;
	            tempB=tempB.next;
	        }
	        while(tempA!=null && tempA!=tempB){
	            tempA=tempA.next;
	            tempB=tempB.next;
	        }
	        if(tempA==null){
	            return null;
	        }else{
	            return tempA;
	        }
	        
	    }

	    private int len(ListNode node){
	        int c=0;
	        while(node!=null){
	            c++;
	            node=node.next;
	        }
	        return c;
	    }
	}

	

}
