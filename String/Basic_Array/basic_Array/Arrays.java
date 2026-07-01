package basic_Array;
import java.util.Scanner;

public class Arrays 
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
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		q3(N,B);
	}

}
