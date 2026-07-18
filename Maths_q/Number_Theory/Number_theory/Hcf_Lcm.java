package Number_theory;
import java.util.*;

public class Hcf_Lcm {

	
	public static int HCF(int a, int b)
	{
		while(b!=0)
		{
			int rem = a % b; 
			a = b;
			b = rem;
		}
		
		return a;
	}
	
	
	public static int LCM(int a, int b)
	{
		int x = a;
		int y = b;
		
		while(y!=0)
		{
			int rem = x%y;
			x = y;
			y = rem;
		}
		
		int hcf = x;
		int lcm = (a * b)/hcf;
		
		return lcm;
	}
	
	
	public static void main(String[] args) 
	{
		//Greatest Common Divisor/ Highest Common Factor
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(HCF(a,b));
		System.out.println(LCM(a,b));

	}

}

// leapyear , perfect square, factorial,count prime, majority element
