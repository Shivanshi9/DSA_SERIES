package implemetation;
import java.util.*;


class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class QueueLinkedList
{
	//used as refrence variable in linkedlist
	Node rear;
	Node front;
	
	//enqueue
	void enqueue(int x)
	{
		Node newNode = new Node(x); 
		
		if(rear == null) //if no element (Checking rear because used in enqueue function)
		{
			front = rear = newNode;  //first node
            return;
		}
		
		rear.next = newNode;
		rear = newNode;
	}
	
	//dequeue
	int dequeue()
	{
		if(isEmpty())
		{
			return -1; 
		}
		int value = front.data;
		front = front.next;
		
		if(front == null)
		{
			rear = null;
		}
		
		return value;
	}
	
	
	 // Peek
    int peek()
    {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return front.data;
    }
    
    
    // Display
    void display()
    {
        Node temp = front;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	 
	boolean isEmpty()
	{
		return front == null; //checking front because used in dequeue function
	}	
}






public class Queue_LinkedList 
{

	public static void main(String[] args)
	{
		QueueLinkedList ql = new QueueLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ql.enqueue(x);
        }
        
        ql.dequeue();
        ql.display();

	}

}
