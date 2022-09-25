package Lec_02;
import java.util.*;
public class PrimeNO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int fact=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				fact++;
		}
		if(fact<=2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	
}
