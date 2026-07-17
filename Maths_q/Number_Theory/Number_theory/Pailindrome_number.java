package Number_theory;
import java.util.*;

public class Pailindrome_number {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int orignal = n;
		int reverse = 0;
		
		while(n>0)
		{
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n/10;
		}

		if(orignal==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
