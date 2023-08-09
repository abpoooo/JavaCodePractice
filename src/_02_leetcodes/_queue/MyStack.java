package _02_leetcodes._queue;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/description/
public class MyStack {
    // use two queues for a stack
    // when the data has value, if the size > 1 means pop each value to help queue
    // then pop the last one (top one) only one value remain to poll and swap each time to give the values
    // to help stack, so each time we pop the one of the last in the queue in data
    // which means it is a stack pattern
    Queue<Integer> data;
    Queue<Integer> help;
    public MyStack() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    public void push(int x) {
        data.offer(x);
    }

    public int pop() {
        while (data.size() > 1) help.offer(data.poll());
        Integer poll = data.poll();

        swap();

        return poll;
    }

    // top is get the top value not means pop out the value, so it will get back and be offered to help again
    public int top() {
        while (data.size() > 1) help.offer(data.poll());
        Integer poll = data.poll();
        help.offer(poll);
        return poll;
    }

    public boolean empty() {
        return data.isEmpty() && help.isEmpty();
    }

    private void swap(){
        Queue<Integer> temp = help;
        help = data;
        data = temp;
    }
}
