package quick_sort;
import java.util.*;

public class Implementation 
{
	
	
	public static void quicksort(int[] arr, int s, int e)
	{
		if(s>=e) return;
		
		int pivot = index(arr,s,e);
		quicksort(arr,s,pivot-1);
		quicksort(arr,pivot+1,e);

	}
	
	
	public static int index(int[] arr, int s , int e)
	{
		int pivot = arr[e];
		int idx = s-1;  //used for swapping pivot element
		
		for(int i=s; i<e ;i++)
		{
			if(arr[i]<pivot)
			{
				idx++; //-1 to 0
				
				//swap elements which are lesser the pivot to left side and greater element to right side
				
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
			}
		}
		//putting pivot in correct position with the help of idx
		idx++;
		int temp = arr[idx];
		arr[idx] = arr[e];
		arr[e] = temp;
		
		return idx;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
 
		quicksort(arr,0,n-1);
		
		 for(int x : arr)
	            System.out.print(x + " ");

	        sc.close();
	}

}
