package Lec_02;
import java.util.*;

public class Fibo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int n=5;
		int i=1;
		while(i<=n)
		{
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
		
	}

}
