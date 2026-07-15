package string;
import java.util.*;

public class inputs {

	public static void main(String[] args) 
	{
//		q1-> Given a number, print its square.
//		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();		
//		System.out.println(N*N);
		
		
		
//		q2-> Given a person's name, print:
//		Welcome <Name>
//		
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		System.out.println("Welcome "+name);
		
		
//		q3-> Given a sentence, count the number of words present in it.
//		Sample Input
//		I Love Programming
//		Sample Output
//		3
//		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String[] arr = s.split(" ");
//		System.out.println(arr.length);
		
		
//		q4-> A teacher has entered marks of N students. 
//		Print the average marks.
//		Sample Input
//		5
//		70 80 90 60 100
//		Sample Output
//		80.0
//
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] marks = new int[N];
//		for(int i=0; i<N; i++)
//		{
//			marks[i] = sc.nextInt();
//		}
//		double sum =0;
//		for(int i=0; i<N; i++)
//		{
//			sum = sum+marks[i];
//		}
//		double avg = 0;
//		avg = sum/N;
//		System.out.println(avg);
		
//		q5-> Given a word, determine whether it is a palindrome.
//		Print YES if it is, otherwise print NO.	
//		Sample Input
//		madam
//		
//		Scanner sc = new Scanner(System.in);
//		String word = sc.next();
//		int n = word.length();
//		int left =0;
//		int right = n-1;
//		while(left<right)
//		{
//			if(word.charAt(left)!=word.charAt(right))
//			{
//				System.out.println("No");
//				return;
//			}
//			left++;
//			right--;
//		}
//		System.out.println("YES");
		
		
		
		
//		q6-> Given a matrix, print the sum of the diagonal elements.
//		Sample Input
//		3
//		1 2 3
//		4 5 6
//		7 8 9
//		Sample Output
//		15
//
//		Scanner sc = new Scanner(System.in);
//		int r = sc.nextInt();
//		int c = r;
//		int[][] m = new int[r][c];
//		for(int i=0; i<r; i++)
//		{
//			for(int j=0; j<c; j++)
//			{
//				m[i][j] = sc.nextInt();
//			}
//		}
//		int sum =0;
//		for(int i=0; i<r; i++)
//		{
//			for(int j=0; j<c; j++)
//			{
//				if(i==j)
//				{
//					sum = sum + m[i][j];
//				}
//			}
//		}
//		System.out.println(sum);
		
		
//		q7-> A company stores employee details in the following order:
//		Employee ID
//		Employee Name
//		Salary
//		Print the details in the following format:	
//		ID : <id>
//		Name : <name>
//		Salary : <salary>
//		Sample Input
//		101
//		Rahul Sharma
//		45000
//		Sample Output
//		ID : 101
//		Name : Rahul Sharma
//		Salary : 45000
//		
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		sc.nextLine();
//		String name = sc.nextLine();
//		int salary = sc.nextInt();	
//		System.out.println("ID : "+id);
//		System.out.println("Name : "+name);
//		System.out.println("Salary : "+salary);
		
		
		
//		q9-> Second largest number print
//		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		for(int i=0; i<N; i++)
//		{
//			arr[i] = sc.nextInt();
//		}	
//		int largest = Integer.MIN_VALUE;
//		int slargest = Integer.MIN_VALUE;		
//		for(int i=0; i<N ; i++)
//		{
//			if(arr[i] > largest)
//			{
//				slargest = largest;
//				largest = arr[i];				
//			}
//			else if(arr[i]!=largest && arr[i]>slargest)
//			{
//				slargest = arr[i];
//			}
//		}		
//		if(slargest==Integer.MIN_VALUE)
//		{
//			System.out.println("-1");
//		}
//		else
//		{
//			System.out.println(slargest);
//		}
		
//		q10-> Given two words, determine whether they are anagrams.
//		Print YES if they are anagrams, otherwise print NO.
//		Sample Input
//		listen
//		silent
//		Sample Output
//		YES
//
//		//m-1
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		String b = sc.next();	
//		if(a.length()!=b.length())
//		{
//			System.out.println("NO");
//			return;
//		}	
//		char[] a1 = a.toCharArray();
//		char[] b1 = b.toCharArray();
//		Arrays.sort(a1);
//		Arrays.sort(b1);
//		if(Arrays.equals(a1, b1))
//		{
//			  System.out.println("YES");
//		}
//	    else
//        {
//        	System.out.println("NO");
//        }
//            
//		//m-2
//		Scanner sc = new Scanner(System.in);
//		String s1 = sc.next();
//		String s2 = sc.next();
//		if(s1.length() != s2.length())
//		{
//		    System.out.println("NO");
//		    return;
//		}
//
//		int[] freq = new int[26];
//
//		for(int i = 0; i < s1.length(); i++)
//		{
//		    freq[s1.charAt(i) - 'a']++;
//		    freq[s2.charAt(i) - 'a']--;
//		}
//
//		for(int i = 0; i < 26; i++)
//		{
//		    if(freq[i] != 0)
//		    {
//		        System.out.println("NO");
//		        return;
//		    }
//		}
//
//		System.out.println("YES");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
