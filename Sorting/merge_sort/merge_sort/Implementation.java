package merge_sort;
import java.util.*;

public class Implementation {

	public static void mergesort(int[] arr, int s, int e)
	{
		if(s<e)
		{
			int mid = s +(e-s)/2;
			
			mergesort(arr,s,mid);
			mergesort(arr,mid+1,e);
			
			merge(arr,s,mid,e);
		}	
	}
	
	
	public static void merge(int[] arr, int s, int m , int e)
	{
		//size of two arrays
		int n1 = m-s+1; //0-based idx me +1 hota hi h
		int n2 = e-m;  //e-(m+1)+1 = e-s
		
		//temprary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//putting values in array
		for(int i=0; i<n1; i++)
		{
			L[i] = arr[s+i]; //s change hota rhe i k sath
		}
		for(int i=0; i<n2; i++)
		{
			R[i] = arr[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k =s;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
		
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

		mergesort(arr,0,n-1);
		
		   for(int x : arr)
	        {
	            System.out.print(x + " ");
	        }

	        sc.close();
	}

}
