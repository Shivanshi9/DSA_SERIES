package implemetation;
import java.util.*;


class QueueArray
{
	int size;
	int[] arr;
	//used as pointers in array
	int front;
	int rear;
	
	QueueArray(int size)
	{
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	
	//enqueue
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue overflow");
			return;
		}
		
		if(front==-1)
		{
			front = 0;
		}
		
		arr[++rear] = x;	 
	}
	
	//dequeue
	int dequeue()
	{
		if(isEmpty())
		{
			return -1;
		}
		
		int value = arr[front];
		 if (front == rear) {
	            front = rear = -1;
	        } else {
	            front++;
	        }

	        return value; 	
	}
	
	//peek
	int peek()
	{
		if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
 
        return arr[front];
	}
	
	//display
	void display()
	{
		  if (isEmpty()) {
	            System.out.println("Queue Empty");
	            return;
	        }

	        for (int i = front; i <= rear; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	}
	
	boolean isEmpty()
	{
		return front == -1;
	}
	
	boolean isFull()
	{ 
		return rear == size-1;
	}	
}


public class Queue_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		QueueArray qa = new QueueArray(size);
		System.out.println("enter elements: ");
		for(int i=0; i<size; i++)
		{
			int x = sc.nextInt();
			qa.enqueue(x);
		}

		qa.display();
		qa.dequeue();
		qa.display();
		
	}

}
