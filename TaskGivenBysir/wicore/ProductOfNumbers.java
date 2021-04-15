package com.TaskGivenBysir.wicore;

import java.util.Scanner;

public class ProductOfNumbers {
	
	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
		int n = b.nextInt();
		int sum=0;
		sum=(2*n*n*n)+(3*n*n)+n;
		sum=sum/6;
		System.out.println(sum);
	}

}
