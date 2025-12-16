/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Roshean Kavinda
 */
import java.util.Stack;

public class StackQueueEnqueueFriendly {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
        System.out.println("Enqueued: " + x);
    }

    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int dequeued = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly q = new StackQueueEnqueueFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
    }
}

