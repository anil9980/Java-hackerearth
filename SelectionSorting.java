package com.hackerth.learning.practice;

import java.util.Scanner;

public class SelectionSorting {
    void selectionSort(int a[]) {
    	int min,pos,temp;
    	for(int i=0;i<=a.length-2;i++) {
    		min=a[i];
    		pos=i;
    		for(int j=i+1;j<=a.length-1;j++) {
    			if(a[j]<min) {
    				min=a[j];
    				pos=j;
    			}else {
    				j++;
    			}
    		}
    		temp=a[i];
    		a[i]=a[pos];
    		a[pos]=temp;
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
	SelectionSorting s=new SelectionSorting();
	s.selectionSort(arr);
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
