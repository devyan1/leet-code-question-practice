package com.leetcodequestions.LinkedList;

/*
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class MergeTwoLinkedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null || Integer.toString(l1.val).equals(""))
        {
            return l2;
        }
        else if(l2==null || Integer.toString(l2.val).equals(""))
        {
            return l1;
        }
        else if (l1.val <=l2.val)
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode argl1 = l1;
        ListNode argl2 = l2;

        l1.next= new ListNode(5);
        l1=l1.next;

        l1.next= new ListNode(7);


        l2.next= new ListNode(10);
        l2=l2.next;

        l2.next= new ListNode(12);


        ListNode result = MergeTwoLinkedLists.mergeTwoLists(argl1,argl2);

        while(result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }
}




/*
Use recursion
*/
