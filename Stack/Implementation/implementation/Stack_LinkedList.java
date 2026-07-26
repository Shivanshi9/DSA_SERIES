package implementation;
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

class StackLinkedList
{
	Node top;
	
	//push
	void push(int x)
	{
		//we can not check condition of overflow becz linked list never overflow
		Node newNode = new Node(x);
		newNode.next = top;
		top = newNode;
	}
	
	//pop
	int pop()
	{
		if(isEmpty())
		{
			return -1;
		}
		
		int value = top.data;
		top = top.next;
		
		return value;
	}
	
	//peek
	int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		
		return top.data;
	}
	
	
	//display
	void display()
	{
		Node temp = top;
		
		while(temp!=null)
		{
			 System.out.print(temp.data + " ");
	            temp = temp.next;
		}
	}
	
	boolean isEmpty()
	{ 
		return top == null;
	}
	
}

public class Stack_LinkedList
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StackLinkedList sl = new StackLinkedList();
		
		System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sl.push(x);
        }

        System.out.print("Stack: ");
        sl.display();

        System.out.println("Top Element: " + sl.peek());

        System.out.println("Popped Element: " + sl.pop());

        System.out.print("Stack after pop: ");
        sl.display();

        sc.close();

	}

}
