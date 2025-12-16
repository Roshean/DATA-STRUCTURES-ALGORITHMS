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

public class QueueStackPopFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1.add(x);

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }

        System.out.println("Pushed: " + x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly stack = new QueueStackPopFriendly();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        System.out.println("Popped: " + stack.pop());
    }
}
