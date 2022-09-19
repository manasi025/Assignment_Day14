package day14_LL;

import java.util.Scanner;

public class DataStructure 
{
	public static void main(String[] args) 
	{
        System.out.println("Welcome message on the master branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to Add element at the start");
        System.out.println("Press '2' to Peek the element");
        System.out.println("Press '3' to Pop the element");
        System.out.println("Press '4' to Add element in the queue");
        System.out.println("Press '5' to DeQueue element ");
        
        switch (sc.nextInt()) 
        {
            case 1:
                createStack();
                break;
            case 2:
                peakTheNode();
                break;
            case 3:
                pop();
                break;
            case 4:
                enQueueElement();
                break;
                
            case 5:
                deQueueElement();
                break;
            default:
                System.out.println("Press Valid Key");
        }
    }

    private static void deQueueElement() 
    {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myStack.enqueue(myFirstNode);
        myStack.enqueue(mySecondNode);
        myStack.enqueue(myThirdNode);
        myStack.myLinkedList.printMyNode();

        myStack.deQueue();
        myStack.myLinkedList.printMyNode();

    }

    private static void enQueueElement() 
    {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myStack.enqueue(myFirstNode);
        myStack.enqueue(mySecondNode);
        myStack.enqueue(myThirdNode);
        myStack.myLinkedList.printMyNode();
    }

    private static void pop() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.myLinkedList.printMyNode();
        myStack.pop();
        myStack.myLinkedList.printMyNode();

    }

    private static void peakTheNode() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.myLinkedList.printMyNode();
        myStack.peek();
    }

    private static void createStack() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.myLinkedList.printMyNode();
    }
}
