package Lec_02;
import java.util.*;
public class Nth_Fibo_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		while(i<=n)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			i++;
		}
		System.out.println();
		System.out.println(a);
	}

}
