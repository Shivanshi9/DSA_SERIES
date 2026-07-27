package implementation;
import java.util.*;

class MyStack 
{

    Queue<Integer> q = new LinkedList<>();

    void push(int x) 
    {

        q.offer(x);

        for(int i = 0; i < q.size() - 1; i++)
            q.offer(q.poll());
    }

    int pop() 
    {
        return q.poll();
    }
    
    void display() 
    {

        if (q.isEmpty()) 
        {
            System.out.println("Stack Empty");
            return;
        }

        for (int x : q) 
        {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    int top() 
    {
        return q.peek();
    }

    boolean empty() 
    {
        return q.isEmpty();
    }
}


public class Stack_usingQueue 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		MyStack stack = new MyStack();
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			stack.push(x);
		}

		stack.pop();
		stack.display();

	}

}
