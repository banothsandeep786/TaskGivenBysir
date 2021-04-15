package com.TaskGivenBysir.wicore;

public class PerfectOrNot {
	public static void main(String[] args) {
		int n=28;
		int sum=0;
		int t=n;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
			sum=sum+i;
		}
		//System.out.println(sum);
		if(t==sum) {
			System.out.println("given number is perfectr number");
		}
		else {
			System.out.println("given number is not a perfect number");
		}
	}

}
