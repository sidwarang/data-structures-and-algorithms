package Stack;
import LinkedList.ListNode;

/**
 * Created by Siddharth on 3/10/2015.
 */
public class LLStack {
    private ListNode head;
    public LLStack() {
        head = null;
    }

    public void push(Character data)
    {
        if (head == null) {
            head = new ListNode();
            head.setData(data);
            head.setNext(null);
        }
        else if (head.getData() == null || head.getData() == '\u0000')
            head.setData(data);
        else {
            ListNode node = new ListNode();
            node.setData(data);
            node.setNext(head);
            head=node;
        }
    }

    public Character top()
    {
        if (head == null)
        {
            System.out.println("Stack Empty!");
            return null;
        }
        else
            return head.getData();
    }

    public Character pop()
    {
        if (head == null)
        {
            System.out.println("Stack Empty!");
            return null;
        }
        else {
            Character data = head.getData();
            head = head.getNext();
            return data;
        }
    }
     public boolean isEmpty()
     {
         if (head == null)
         {
             return true;
         }
         else return false;
     }
}
