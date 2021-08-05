package com.hackerth.learning.practice;

import java.util.Scanner;

public class PrintSubString {
String subString(String str,int index) {
	char ch1[]=str.toCharArray();
	char ch2[]=new char[ch1.length-index+1];
	int j=0;
	for(int i=index;i<=ch1.length-1;i++) {
		ch2[j]=ch1[i];
		j++;
	}
	String res=new String(ch2);
	return res;
}
String subString(String str,int si,int li) {
	char ch1[]=str.toCharArray();
	char ch2[]=new char[li-si+1];
	int j=0;
	for(int i=si;i<=li;i++) {
		ch2[j]=ch1[i];
		j++;
	}
	String res1=new String(ch2);
	return res1;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	PrintSubString ps=new PrintSubString();
	System.out.println("enter a string");
	String s1=sc.nextLine();
	System.out.println("enter the index");
	int id=sc.nextInt();
	
	String ans1=ps.subString(s1,id);
	System.out.println(ans1);
	
	System.out.println("-------------------------------");
	PrintSubString ps1=new PrintSubString();
	System.out.println("enter a string");
	String s2=sc.nextLine();
	System.out.println("enter the si and li");
	int a=sc.nextInt();
	int b=sc.nextInt();
	String ans2=ps1.subString(s2, a, b);
	System.out.println(ans2);
}
}
