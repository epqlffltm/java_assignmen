package progect;

import java.util.Scanner;


public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int sum=0;
		
		double even=0;
		
		for(int i=0;i<num;i++)
		{
			int n=sc.nextInt();
			sum+=n;
		}
		System.out.println("합계: "+sum);
		
		even=(double)sum/num;
		
		System.out.println("평균: "+even);
	}

}
