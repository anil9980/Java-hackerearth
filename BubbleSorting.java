package com.hackerth.learning.practice;

import java.util.Scanner;

public class BubbleSorting {
void bubbleSort(int a[]) {
	int temp;
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of array");
	int l=sc.nextInt();
	int arr[]=new int[l];
	System.out.println("enter the "+l+ " elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("array before sorting");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	BubbleSorting b=new BubbleSorting();
	b.bubbleSort(arr);
	System.out.println("array asecending order");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("array desending order");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
}
