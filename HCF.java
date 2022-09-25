package Lec_02;
import java.util.*;

public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=30;
		int b=16;
		int divisor=a;
		int divident=b;
		while(divisor!=0)
		{
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("HCF="+divident);
	}                                
}
