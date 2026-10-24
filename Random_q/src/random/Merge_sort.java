package random;
import java.util.*;

public class Merge_sort 
{

	public static void mergesort(int[] arr, int s, int e)
	{
		if(s>=e) return;
		
		int m = s + (e-s)/2;
		mergesort(arr,s,m);
		mergesort(arr,m+1,e);
		
		merge(arr,s,m,e);
	}
	
	public static void merge(int[] arr, int s, int m, int e)
	{
		
		int n1 = m-s+1;
		int n2 = e-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; i++)
		{
			L[i] = arr[s+i];
		}
		for(int i=0; i<n2; i++)
		{
			R[i] = arr[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=s;
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
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		mergesort(arr,0,size-1);
		
		for(int x: arr)
		{
			System.out.print(x+" ");
		}

	}

}
