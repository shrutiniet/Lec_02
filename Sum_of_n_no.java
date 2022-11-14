package Lec_02;
import java.util.*;
public class Sum_of_n_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("Sum of n no. ="+sum);
	}

}
