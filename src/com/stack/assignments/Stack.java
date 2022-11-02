

//Use Case 1 is to create a Stack of 56-->30-->70 where 56 is at the top of Stack. (Use LinkedList to do the Stack operations)

package com.stack.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {

    //Declaring Linked List
    private LinkedList list = new LinkedList();

    //Creating stacks method
    public void push (Object data)
    {
        list.addFirst(data);
    }

    //Printing the top value
    public Object peek()
    {
        return list.getFirst();
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
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        //Adding values in stack
        s.push(70);
        s.push(30);
        s.push(56);

        //Printing the top element of stack
        System.out.println("Top element of stack is : "+s.peek());

        //Printing the total stack
        s.printStack();

    }
}


