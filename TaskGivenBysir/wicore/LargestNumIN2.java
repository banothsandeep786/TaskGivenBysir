package com.TaskGivenBysir.wicore;

import java.util.Scanner;

public class LargestNumIN2 {
	public static void main(String[] args) {
		Scanner b=new Scanner (System.in);
		int n1=b.nextInt();
		int n2=b.nextInt();
		if(n1>n2) {
			System.out.println("largest number is:--"+ n1);
		}else {
			System.out.println("largest number is:--"+ n2);
		}
	}

}
