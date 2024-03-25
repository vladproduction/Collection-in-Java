package com.vladproduction.LinkedList;

import java.util.EmptyStackException;

/**
 * Created by vladproduction on 25-Mar-24
 */

public class MyPracticeLinkedList_5_stack_example {
    public static void main(String[] args) {
        /**3)Implement a stack using a linked list: Explore how a linked list can be used to create the
         functionalities of stacks (LIFO - Last In First Out) or queues (FIFO - First In First Out) data structures.*/

        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        class Stack {
            Node top; // Top pointer to keep track of the top element

            public void push(int data) {
                Node newNode = new Node(data);
                newNode.next = top; // New node points to the current top
                top = newNode; // Update the top to point to the new node
            }

            public int pop() {
                if (isEmpty()) {
                    throw new EmptyStackException(); // Handle empty stack case
                }
                int data = top.data;
                top = top.next; // Move the top pointer to the next node
                return data;
            }

            public boolean isEmpty() {
                return top == null;
            }

            public int peek() {
                if (isEmpty()) {
                    throw new EmptyStackException(); // Handle empty stack case
                }
                return top.data;
            }
        }

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
    }
}

/**Stack implementation:
 Uses a top pointer to keep track of the top element in the stack.
 push(int data):
 Creates a new node with the given data.
 Sets the next pointer of the new node to the current top.
 Updates the top pointer to point to the newly added node.
 pop():
 Checks for an empty stack and throws an EmptyStackException if so.
 Stores the data of the top element.
 Moves the top pointer to the next node (effectively removing the top element).
 Returns the stored data.
 isEmpty():
 Simply checks if the top pointer is null (indicating an empty stack).
 peek():
 Similar to pop(), but instead of removing the element, it just returns the data of the top element.*/
