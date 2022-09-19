package day14_LL;

public class MyStack 
{
	MyLinkedList myLinkedList = new MyLinkedList();

    public void push(INode myNode){
        myLinkedList.add(myNode);
    }

    public INode peek(){
        return myLinkedList.head;
    }

    public INode pop(){
        return myLinkedList.pop();
    }

    public INode enqueue(MyNode<Integer> myenqueueNode) {
        return myLinkedList.enqueue(myenqueueNode);
    }

    public INode deQueue() {
        return myLinkedList.dequeue();
    }
}
