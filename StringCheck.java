package com.hackerth.learning.practice;

import java.util.Scanner;

public class StringCheck {
	Scanner sc=new Scanner(System.in);
boolean checkS(String str) {
	char ch[]=str.toCharArray();
	/*
	  System.out.println("enter a char");
	  String ch1=sc.nextLine();
	  char ch2[]=ch1.toCharArray();
	  int j=ch2.length-1;
	  
	  */
	for(int i=0;i<=ch.length-1;i++) {
		if(ch[i]=='S'|ch[i]=='s') {
			return true;
		}
		
	}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String st=sc.nextLine();
	StringCheck sch=new StringCheck();
	boolean res=sch.checkS(st);
	System.out.println(res);
}
}
