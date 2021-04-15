package com.TaskGivenBysir.wicore;

import java.util.Scanner;

public class LargestOf3Num {
     public static void main(String[] args) {
		Scanner b =new Scanner(System.in);
		int n1=b.nextInt();
		int n2=b.nextInt();
		int n3=b.nextInt();
	    int large;
	    large=n1;
	    if(n2>large) {
	    	large=n2;
	    }
	    if(n3>large) {
	    	large=n3;
	    }
	    System.out.println("largestest number:--"+large);
	}
}
