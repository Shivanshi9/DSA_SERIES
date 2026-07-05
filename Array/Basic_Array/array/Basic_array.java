package array;
import java.util.*;

public class Basic_array 
{

	public static int smallestElement(int[] arr)
	{
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest = arr[i];
			}
		}
		return smallest;
	}
	
	public static int LargestElement(int[] arr)
	{
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest = arr[i];
			}
		}
		return largest;
	}
	
	
	public static void q3(int N,int B)
	{
		for(int i=1 ; i<=N ; i++)
		{
			System.out.println("Employee "+i+": "+i*B);
		}
	}
	
	public static int[] SecLargestandSmallest(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int secmax = Integer.MIN_VALUE;
		int secmin = Integer.MAX_VALUE;
		
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				secmax = max;
				max = arr[i];
			}
			else if(arr[i] > secmax && arr[i]!=max)
			{
				secmax = arr[i];
			}
			
			if(arr[i] < min)
			{
				secmin = min;
				min = arr[i];
			}
			else if(arr[i] < secmin && arr[i]!=min)
			{
				secmin = arr[i];
			}
		}	
		return  new int[] {secmax , secmin};
	}
	
	
	
	public static void q4(int N,int K)
	{
		for(int i=1; i<=N; i++)
		{
			System.out.println("Employee "+i+": "+((i-1)/K + 1));
		}
	}
	
	public static int[] revrse(int[] arr)
	{
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			 arr[arr.length-1-i] = temp;
		}
		return arr;
	}
	
	//clockwise rotation
	public static void reverse(int[] arr, int s, int e)
	{
		 while(s < e)
		    {
		        int temp = arr[s];
		        arr[s] = arr[e];
		        arr[e] = temp;

		        s++;
		        e--;
		    }
	}
	
	
	public static void q7(int[] arr,int K)
	{
		int n = arr.length;
		K = K % n;
		
		reverse(arr,0,n-1);
		
		reverse(arr,0,K-1);
		
		reverse(arr,K,n-1);
	}
	
	//anticlockwise 
	public static void q8(int[] arr,int K)
	{
		int n = arr.length;
		K = K % n;
		
		reverse(arr,0,K-1);
		
		reverse(arr,K,n-1);
		
		reverse(arr,0,n-1);
	}
	
	public static void main(String[] args) 
	{
		//Smallest Element
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Size of array: ");
//			int size = sc.nextInt();
//			System.out.println("Enter elements of array: ");
//			int[] arr = new int[size];
//			for(int i=0; i<size;i++)
//			{
//				arr[i] = sc.nextInt();
//			}
//			System.out.println("Smallest Element is: "+smallestElement(arr));

		//Largest Element
//			Scanner sc1 = new Scanner(System.in);
//			System.out.println("Enter size of an array: ");
//			int n = sc1.nextInt();
//			System.out.println("Enter elements of an array: ");
//			int[] arrr = new int[n];
//			for(int i=0;i<n;i++)
//			{
//				arrr[i] = sc1.nextInt();
//			}
//			System.out.println("Largest element is: "+LargestElement(arrr));
		
		//q3
//		Problem Statement: Mike has started a new company and wants to print a salary table for his 
//		N employees. The salary of employee number i is computed as i × base_salary. The manager wants 
//		a neat table printed from employee 1 to N showing each employee’s number and their calculated salary.
//		Given N employees and a base salary B, print the salary of each employee from 1 to N.
//
//		Constraints:
//		1 ≤ N ≤ 100
//		1 ≤ B ≤ 10000
//		
//		Input Format:
//		First line  → Integer N
//		Second line → Integer B (base salary)
//		
//		Output Format:
//		N lines in format: "Employee <i>: <i*B>"
//			
//		Sample Input 1:
//		4
//		500
//		
//		Sample Output 1:
//		Employee 1: 500
//		Employee 2: 1000
//		Employee 3: 1500
//		Employee 4: 2000
		
//			Scanner sc = new Scanner(System.in);
//			int N = sc.nextInt();
//			int B = sc.nextInt();
//			q3(N,B);
		
		//q4
//		Input: [1, 2, 4, 7, 7, 5]  
//		Output:	  
//			Second Smallest : 2  
//			Second Largest : 5
//				
//				Scanner sc = new Scanner(System.in);
//				
//				System.out.println("Enter elements of an array: ");
//				String input = sc.nextLine();
//				
//				String[] temp = input.split(" ");
//				
//				int[] arr = new int[temp.length];
//				
//				for(int i=0; i<temp.length; i++)
//				{
//					arr[i] = Integer.parseInt(temp[i]);
//				}
//				
//				 int[] ans = SecLargestandSmallest(arr);
//		
//			        System.out.println("Second Largest: " + ans[0]);
//			        System.out.println("Second Smallest: " + ans[1]);
//		
//			        sc.close();
		
		//q5
//		Problem Statement: Mike has arranged a small party for the inauguration of his new startup.
//		He has invited N employees indexed 1 to N. He wants to seat everyone at tables of size K 
//		(each table holds exactly K people). All employees must sit in index order continuously —
//		employee 1 to K at table 1, K+1 to 2K at table 2, and so on. If the last table has fewer 
//		than K people, they still sit there.
//		Given N employees and table size K, print the table number for each employee.
//
//		Constraints:
//		1 ≤ N ≤ 1000
//		1 ≤ K ≤ N
		
//		Input Format:
//		First line  → Integer N
//		Second line → Integer K
		
//		Output Format:
//		N lines in format: "Employee <i> → Table <table_number>"
		
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("Enter the no of employees: ");
		//		int N = sc.nextInt();
		//		System.out.println("Enter the size of table: ");
		//		int K = sc.nextInt();
		//		q4(N,K);
//		
		//q6 -> reverse an array
		
//		Input: N = 5, arr[] = {5,4,3,2,1}
//		Output: {1,2,3,4,5}
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the size of array: ");
//				int N = sc.nextInt();
//				System.out.println("Enter the elements of array: ");
//				int[] arr = new int[N];
//				for(int i=0; i<N; i++)
//				{
//					arr[i] = sc.nextInt();
//				}
//				revrse(arr);
//				System.out.println("Reversed Array:");
//				for(int i = 0; i < arr.length; i++)
//				{
//				    System.out.print(arr[i] + " ");
//				}
		
		//q7 -> rotate array clockwise
//		Input: N = 5, arr[] = {1,2,3,4,5}
//		Output: [5, 1, 2, 3, 4]
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the size of an array: ");
//			int N = sc.nextInt();
//			System.out.println("Rotated by: ");
//			int K = sc.nextInt();
//			System.out .println("Enter the elements of array");
//			int[] arr = new int[N];
//			for(int i=0; i<N; i++)
//			{
//				arr[i] = sc.nextInt();
//			}
//			q7(arr , K);
//			for(int i=0; i<N ; i++)
//			{
//				System.out.print(arr[i]+" ");
//			}
		
		//q8-> anticlockwise
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the size of an array: ");
//				int N = sc.nextInt();
//				System.out.println("Rotated by: ");
//				int K = sc.nextInt();
//				System.out .println("Enter the elements of array");
//				int[] arr = new int[N];
//				for(int i=0; i<N; i++)
//				{
//					arr[i] = sc.nextInt();
//				}
//				q8(arr , K);
//				for(int i=0; i<N ; i++)
//				{
//					System.out.print(arr[i]+" ");
//				}
		
		
		// \u000d System.out.println("Rotated by: ");
	}
	
	
}
