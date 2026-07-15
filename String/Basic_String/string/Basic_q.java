package string;

import java.util.*;

public class Basic_q
{
	public static void main(String[] args)
	{
//		q1->Reverse Words in a String
//		Scanner sc = new Scanner(System.in);
//		String sen = sc.nextLine();
//		sen = sen.trim();
//		if (sen.isEmpty()) {
//		    return;
//		}
//		String[] arr = sen.split("\\s+");
//		for(int i=arr.length-1; i>=0; i--)
//		{
//			System.out.print(arr[i]);
//			if(i!=0)
//			{
//				System.out.print(" ");
//			}
//		}
//		sc.close();
		
		
//		q2-> Reverse String
		//m-1
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int n = s.length();
//		char[] arr = s.toCharArray();
//		for(int i=arr.length-1; i>=0; i--)
//		{
//			System.out.print(arr[i]);
//		}
//		
//		//m-2
//		 Scanner sc = new Scanner(System.in);
//
//	        String s = sc.nextLine();
//
//	        char[] arr = s.toCharArray();
//
//	        int left = 0;
//	        int right = arr.length - 1;
//
//	        while(left < right)
//	        {
//	            char temp = arr[left];
//	            arr[left] = arr[right];
//	            arr[right] = temp;
//
//	            left++;
//	            right--;
//	        }
//
//	        System.out.println(new String(arr))
		
		
		
//		q3-> Palindrome String
//		Sample Input 1
//		A man, a plan, a canal: Panama
//		Sample Output 1
//		YES
//		Sample Input 2
//		hello
//		Sample Output 2
//		NO
//		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		s = s.trim();
//		int left =0;
//		int right = s.length()-1;
//		boolean palindrome = true;
//		while(left<right)
//		{
//			while(left<right && !Character.isLetter(s.charAt(left)))
//			{
//				left++;
//			}
//			while(left<right && !Character.isLetter(s.charAt(right)))
//			{
//				right--;
//			}
//			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
//			{
//				palindrome = false;
//				break;
//			}
//			left++;
//			right--;
//		}	
//		 if(palindrome)
//	            System.out.println("YES");
//	        else
//	            System.out.println("NO");
//
//	        sc.close();
		
		
//		q4-> Longest Common Prefix
//		Sample Input 1
//		3
//		flower
//		flow
//		flight
//		Sample Output 1
//		fl
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//sc.nextLine();
		String[] arr = new String[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.next();
		} 
		String prefix = arr[0];
		for( int i=1; i<arr.length; i++)
		{
			while(!arr[i].startsWith(prefix))
			{
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.length()<1)
				{
					System.out.println("-1");
					break;
				}
			}
		}
		
		System.out.println(prefix);
		
		
		
		
		
		
	}
}
