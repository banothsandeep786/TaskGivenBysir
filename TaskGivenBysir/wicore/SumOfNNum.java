package com.TaskGivenBysir.wicore;

import java.util.Scanner;

public class SumOfNNum {
	
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		int sum=0;
		//while(n>0) {
			sum=((n*n+n))/2;
			//n--;
		//}
		System.out.println(sum);
	}

}
