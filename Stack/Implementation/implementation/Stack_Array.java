package implementation;
import java.util.*;

class StackArray
{
	int[] arr;
	int size;
	int top;
	
	StackArray(int size)
	{
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	//push
	void push(int x)
	{
		//is_full
		if(isFull())
		{
			System.out.println("Stack Overflow");
			return ;
		}
		
		arr[++top] = x;
	}
	
	//pop
	int pop()
	{
		//is_empty
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		
		return arr[top--];
	}
	
	
	boolean isEmpty()
	{
		return top == -1;
	}
	
	
	boolean isFull()
	{
		return top == size-1;
	}
	
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("empty");
			return;
		}
		
		for(int i=top; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


public class Stack_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		StackArray s = new StackArray(size);
		
		for (int i = 0; i < size; i++) {
            int x = sc.nextInt();
            s.push(x);
        }

		s.display();
		System.out.print(s.pop());
		
	}

}
