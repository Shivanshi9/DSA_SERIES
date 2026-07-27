package july;
import java.util.*;

public class July_27 
{
	
	public static int[] rotate(int[] arr, int k)
	{
		int n = arr.length;
		
		 k = k % n;  //i forget this
		 
		 
		reverse(0,n-1,arr);
		reverse(0,k-1,arr);
		reverse(k,n-1,arr);
		
		return arr;
		
	}
	
	public static int[] reverse(int s, int e,int[] arr)
	{
		while(s<e)
		{
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		
		return arr;
	}
	

	public static void main(String[] args) 
	{
//		Q1. Rotate Array (Important Pattern: Reversal Technique)
//		Difficulty: Easy-Medium
//		Given an integer array nums and an integer k, rotate the array to the right by k steps.
//		Example
//		Input:
//		nums = [1,2,3,4,5,6,7]
//		k = 3
//		Output:
//		[5,6,7,1,2,3,4]
//
//		Follow-up: Solve it in O(1) extra space.
//		Why it's important: Tests array manipulation, index calculation, and the reversal algorithm—a classic interview pattern.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		rotate(arr,k);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
//		Q2. Find First and Last Position of Element in Sorted Array
//		Difficulty: Medium
//		Given a sorted array of integers and a target value, return the starting and ending index of the target.
//		If the target is not found, return [-1, -1].
//		Example
//		Input:
//		nums = [5,7,7,8,8,10]
//		target = 8
//		Output:
//		[3,4]
//		Constraint: Time complexity must be O(log n).
//		Why it's important: A common binary search variation that checks whether you truly understand binary
//		search rather than just memorising it.
		
		
		
		
		
	}

}
