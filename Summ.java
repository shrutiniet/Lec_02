package Lec_02;
import java.util.*;
public class Summ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		int n;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			total+=i;
		}
		System.out.println(total);
	}

}
