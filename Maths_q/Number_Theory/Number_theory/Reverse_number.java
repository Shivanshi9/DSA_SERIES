package Number_theory;
import java.util.*;

public class Reverse_number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int reverse = 0;
		while(n>0)
		{
			int digit = n % 10; //remainder
			reverse = reverse * 10 + digit; //reversed number
			n = n / 10; // next n	
		}

		System.out.println(reverse);
		sc.close();
	}

}
