package offer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Test03 {
    public static void main(String[] args) {
        ListNode a = new ListNode(123);
        ListNode b = new ListNode(123);
        ListNode c = new ListNode(123);
        a.next=b;
        b.next=c;

        List list = printListFromTailToHead(a);
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }


    /**
     *
     * 运行时间：21ms
     * 占用内存：9328k
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //借用辅助栈
        ArrayList<Integer> list = new  ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }


       public static class ListNode {
           int val;
           ListNode next = null;

           ListNode(int val) {
               this.val = val;
           }
       }
}
