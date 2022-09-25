package Lec_02;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=12345;
		int result=0;
		while(num!=0)
		{
			int digit=num%10;
			result=result*10+digit;
			num=num/10;			
		}
		System.out.println(result);		
	}
}
