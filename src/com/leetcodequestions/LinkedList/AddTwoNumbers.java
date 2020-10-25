package com.leetcodequestions.LinkedList;

public class AddTwoNumbers
{
    ListNode l3 = new ListNode(-1);
    ListNode temp;
    int carry=0;
    int sum=0;
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummyHead = new ListNode();

        if(l1!=null && l2!=null)
        {
            sum = l1.val + l2.val+carry;
            l1=l1.next;
            l2=l2.next;
        }
        else if (l1!=null && l2==null)
        {
            sum = l1.val +carry;
            l1=l1.next;
        }
        else if  (l1==null && l2!=null)
        {
            sum = l2.val +carry;
            l2=l2.next;
        }
        else
        {
            sum=carry;
        }

        /**
         * Handling carryforward
         */
        if(sum>9)
        {
            carry=1;
            sum=sum%10;
        }
        else
        {
            carry=0;
        }

        dummyHead.val = sum;

        sum=0;


       if (l3.val < 0) {
            l3 = dummyHead;
            temp = l3;
        }
        else
        {
            l3.next = dummyHead;
            l3=l3.next;
        }

        if(l1==null && l2==null && carry==0)
        {
            return temp;
        }

        return addTwoNumbers(l1,l2);

         }




    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode argl1 = l1;
        ListNode argl2 = l2;

        l1.next= new ListNode(5);
        l1=l1.next;

        l2.next= new ListNode(7);
        l2=l2.next;

        l1.next= new ListNode(9);
        l1=l1.next;

        l2.next= new ListNode(8);
        l2=l2.next;

        AddTwoNumbers obj = new AddTwoNumbers();

        ListNode result = obj.addTwoNumbers(argl1,argl2);

        while(result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }
}
