package com.TaskGivenBysir.wicore;

public class FibonicSeries {
	public static void main(String[] args) {
		int n=5;
		int f1=0;
		int f2=1;
		int n2;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0;i<=n;i++) {
			n2=f1+f2;
			System.out.println(n2);
			f1=f2;
			f2=n2;
		}
	}

}
