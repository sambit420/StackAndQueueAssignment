//Use Case 1 is to create a Stack of 56-->30-->70 where 56 is at the top of Stack. (Use LinkedList to do the Stack operations)
//Use Case 2 is to peak and pop from the Stack till it is empty.

package com.stack.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {

    //Declaring Linked List
    private static LinkedList list = new LinkedList();

    //Creating stacks method
    public void push (Object data)
    {
        list.addFirst(data);
    }

    //Printing the top value
    public Object peak()
    {
        return list.getFirst();
    }

    //Removing the top value
    public Object pop()
    {
        return list.removeFirst();
    }

    //Printing the values of stack
    public void printStack()
    {
        System.out.println("Stacks values are printed below");
        if (!list.isEmpty())
        {
            Iterator it = list.iterator();
            while (it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
        }
        else
        {
            System.out.println("List is empty");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        //Adding values in stack
        s.push(70);
        s.push(30);
        s.push(56);

        //Printing the total stack
        System.out.println("Printing the original stack");
        s.printStack();

        //Printing top element and remove it from stack unless it is empty
        while (!list.isEmpty())
        {
            System.out.println("Top element present in Stack is : "+s.peak());
            System.out.println("Removing top element from Stock : "+s.pop());
            System.out.println("Printing the Stack");
            s.printStack();
            System.out.println();
        }

    }
}

