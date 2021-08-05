package com.hackerth.learning.practice;

import java.util.Scanner;

public class InsertionSorting {
	void insertionSort(int a[]) {
		int item;
		for(int i=0;i<=a.length-1;i++) {
			item=a[i];
			int j=i-1;
			while(j>=0 && a[j]>item) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=item;
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
		InsertionSorting is=new InsertionSorting();
		is.insertionSort(arr);
		System.out.println("array after sorting");
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
