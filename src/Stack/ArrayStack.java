package Stack;

/**
 * Created by Siddharth on 3/10/2015.
 */
public class ArrayStack {
    private int top;
    private int capacity;
    private int [] stack;

    public ArrayStack(int cap)
    {
        capacity = cap;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }
    public void push(int x)
    {
        if(!isFull())
            stack[++top] = x;
        else
            System.out.println("Stack Full!");
    }
    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Empty!");
            return 0;
        }
        return stack[top--];

    }
    public void delete()
    {
        top = -1;
    }
    public boolean isFull()
    {
        return top == capacity-1;
    }
}
