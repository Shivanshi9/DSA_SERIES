package Number_theory;
import java.util.*;

public class Perfect_number 
{

	//perfect number -> 28 ->(factors of 28 except 28) 1+2+4+7+14 = 28 yes a perfect number
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1)
        {
            System.out.println("Not Perfect Number");
            return;
        }

		int sum = 1;
		for(int i=2 ; i*i<=n ; i++)
		{
			if(n % i == 0)
			{
				sum = sum +i;
				
				//to remove duplicate factors
			    if(i != n / i)
                {
                    sum += n / i;
                }
			}
		}
		
		if(sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");

        sc.close();
	}

}
