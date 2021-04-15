package com.TaskGivenBysir.wicore;

public class LargestOFnumINArray {
	public static void main(String[] args) {
		
	int []a= {56,34,57,96,89,67,34,23};
	int large = 0;
	int j ,i;
	for(i=0;i<a.length;i++) {
		for(j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				large=a[i];
				a[i]=a[j];
				a[j]=large;
			}
		}
		}
		System.out.println(large);
}}
