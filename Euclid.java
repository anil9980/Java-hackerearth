package com.hackerth.learning.practice;

import java.util.Scanner;

public class Euclid {
  int findGCD(int m,int n) {
	  while(n!=0) {
		  int rem=m%n;
		  m=n;
		  n=rem;
	  }
	  int gcd=m;
	  return gcd;
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Euclid ea=new Euclid();
	int res=ea.findGCD(a, b);
	System.out.println(res);
}
}
