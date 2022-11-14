package Lec_02;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int divisor=a;
		int divident=b;
		while(divisor!=0)
		{
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("HCF="+ divident);
		System.out.println("LCM="+(a*b)/(divident));

	}

}
