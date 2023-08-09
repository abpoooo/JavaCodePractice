package _02_leetcodes._queue;

import java.util.Stack;

public class MyQueue {
    // use 2 stacks to create the functions of queue
    Stack<Integer> inStack;
    Stack<Integer> outStack;


    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (inStack.isEmpty() && outStack.isEmpty()) throw new RuntimeException("queue is empty");
        else if (outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public int peek() {
        if (inStack.isEmpty() && outStack.isEmpty()) throw new RuntimeException("queue is empty");
        else if(outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {


        return inStack.isEmpty() && outStack.isEmpty();
    }
}
