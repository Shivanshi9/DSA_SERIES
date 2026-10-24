package random;
import java.util.*;

public class Quick_sort 
{

	
	public static void quicksort(int[] arr, int s, int e)
	{
		if(s>=e) return;
		
		int pivot = index(arr,s,e);
		quicksort(arr,s,pivot-1);
		quicksort(arr,pivot+1,e);
	}
	
	public static int index(int[] arr, int s, int e)
	{
		int pivot = arr[e];
		int idx = s-1;
		
		for(int i=s; i<e; i++)
		{
			if(arr[i]<pivot)
			{
				idx++;
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
			}
		}
		
		idx++;
		int temp = arr[e];
		arr[e] = arr[idx];
		arr[idx] = temp;
		
		return idx;
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		quicksort(arr,0,n-1);
		
		for(int x: arr)
		{
			System.out.print(x+" ");
		}

	}

}
