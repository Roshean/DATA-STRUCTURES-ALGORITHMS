/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Roshean Kavinda
 */
public class UnboundedArrayStack {
    private int[] stack;
    private int top;

    public UnboundedArrayStack() {
        stack = new int[2];
        top = -1;
    }

    public void push(int x) {
        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }
        stack[++top] = x;
        System.out.println("Pushed: " + x);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top--];

        if (top > 0 && top == stack.length / 4) {
            resize(stack.length / 2);
        }

        return value;
    }

    private void resize(int newSize) {
        int[] newStack = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public static void main(String[] args) {
        UnboundedArrayStack s = new UnboundedArrayStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Popped: " + s.pop());
    }
}
