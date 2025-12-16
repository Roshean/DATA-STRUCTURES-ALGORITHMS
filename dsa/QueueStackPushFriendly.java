/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Roshean Kavinda
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push is easy
    public void push(int x) {
        q1.add(x);
        System.out.println("Pushed: " + x);
    }

    // Pop is costly
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int popped = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public static void main(String[] args) {
        QueueStackPushFriendly stack = new QueueStackPushFriendly();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
    }
}
