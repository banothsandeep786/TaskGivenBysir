package com.TaskGivenBysir.wicore;

public class PrimeOrNOt {
	public static void main(String[] args) {
		int n=3;
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				c=c+1;
			}
		}
		if(c==0) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not a prime");
		}
	}

}
