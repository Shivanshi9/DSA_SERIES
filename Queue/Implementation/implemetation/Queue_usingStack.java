package implemetation;
import java.util.*;

//two stacks are used to build a queue
// stack 1 -> for enqueue operation, stack 2-> for dequeue this results from LIFO to FIFO
//Logic: push all elements in stack 1 then pop out elements from stack1 and push into stack 2 the pop out from stack 2


class QueueusingStack
{
	
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	//enqueue
	void enqueue(int x)
	{
//		Why didn't you check overflow?
//		Answer:	Because I used Java's built-in Stack, which is dynamically resizable. 
//		If I were implementing the stack using a fixed-size array, 
//		I would definitely check for overflow before pushing an element.
		s1.push(x);
	}
	
	//dequeue
	int dequeue()
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			return -1;
		}
		
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
			
		return s2.pop();
	}
	
	
	//peek
	int peek()
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			return -1;
		}
		
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		
		return s2.peek();
	}
	
	
	//display
	void display() {

	    if (s1.isEmpty() && s2.isEmpty()) {
	        System.out.println("Queue Empty");
	        return;
	    }

	    Stack<Integer> temp1 = new Stack<>();
	    Stack<Integer> temp2 = new Stack<>();

	    // Print S2 (Front part of Queue)
	    while (!s2.isEmpty()) 
	    {
	        int x = s2.pop();
	        System.out.print(x + " ");
	        temp2.push(x);
	    }

	    // Restore S2
	    while (!temp2.isEmpty())            
	    {
	        s2.push(temp2.pop());
	    }

	    // Reverse S1 into temp1
	    while (!s1.isEmpty()) 
	    {
	        temp1.push(s1.pop());
	    }

	    // Print S1 in correct order and restore it
	    while (!temp1.isEmpty()) 
	    {
	        int x = temp1.pop();
	        System.out.print(x + " ");
	        s1.push(x);
	    }
	    System.out.println();
	}
}


public class Queue_usingStack 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		QueueusingStack qs = new QueueusingStack();
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			qs.enqueue(x);
		}

		qs.dequeue();
		qs.display();
	}

}
