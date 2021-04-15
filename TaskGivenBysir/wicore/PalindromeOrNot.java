package com.TaskGivenBysir.wicore;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int n=121;
		int temp=n;
		int sum=0;
		while(n>0) {
			sum=sum*10+(n%10);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("given number is polindrome");
		}
		else {
			System.out.println("given number is not polindrom");
		}
	}

}
