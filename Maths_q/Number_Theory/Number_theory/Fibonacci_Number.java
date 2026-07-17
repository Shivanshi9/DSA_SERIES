package Number_theory;
import java.util.*;

//Given a positive integer N, print the Nth Fibonacci number.

public class Fibonacci_Number 
{
//	The Fibonacci sequence starts with:
//		0 1 1 2 3 5 8 ...
//		where each number is the sum of the previous two numbers.

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==0)
		{
			System.out.println(0);
		}
		else if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			int first = 0;
			int second = 1;
			int current = 0;
			
			for(int i=2; i<=n; i++)
			{
				current = first + second;
				first = second;
				second = current;
			}
			System.out.println(current);
		}

	
	}

}
