package Number_theory;
import java.util.*;

//153 -> no of digits = 3, 1^3+5^3+3^3=153

public class Armstrong_number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 0)
		{
		    System.out.println("Armstrong");
		    return;
		}
		
		int original = n;
		int n1 = n;
		int count = 0;
		while(n>0)
		{
			n = n/10; 
			count++; //counted power
		}
		
		int sum = 0;
		for(int i=1; i<=count; i++)
		{                          // (3)^3 -> (5)^3 -> (1)^3
			sum = sum+ (int)Math.pow(n1 % 10, count); //sum calculated
			n1 = n1 / 10; //153 -> 15 -> 1 
		}

		if(original == sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
