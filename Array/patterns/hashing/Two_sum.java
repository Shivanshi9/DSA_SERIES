package hashing;
import java.util.*;


public class Two_sum {

	
	public static int[] two_sum(int[] arr, int target)
	{
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for ( int i =0; i< arr.length; i++) 
		{
			int value = target - arr[i];
			
			if(map.containsKey(value))
			{
				return new int[] {map.get(value) , i};
			}
			
			map.put(arr[i],i);
		}	
		
		return new int[] {-1,-1};
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of array: ");
		String input = sc.nextLine();
		String[] split = input.split(" ");
		int[] arr = new int[split.length];
		for(int i=0; i<split.length; i++)
		{
			arr[i] = Integer.parseInt(split[i]);
		}
		System.out.println("Enter target: ");
		int target = sc.nextInt();
		int[] ans = two_sum(arr, target);
		if(ans[0] == -1)
		{
		    System.out.println("No pair found");
		}
		else
		{
		    System.out.println("Indices: " + ans[0] + " " + ans[1]);
		}
	}

}
