package com.xworkz.javaaptitude.main;

import java.util.Arrays;
import java.util.HashSet;

public class Aptitude {
    //String into another string
	public static  void main(String[] args) {

		StringBuffer sb=new StringBuffer("Computer Seience ");
		sb.append("Portal");
		System.out.println(sb);
		
		System.out.println("====================");
				
	
		//reverse order
		String[] name= {"getting","good","at","coading","needs","a","lot","of","practice"};
		
		for(int i=name.length-1;i>=0;i--) {
			System.out.println (name[i]);
		}
		System.out.println("====================");
		
		//without duplicate
		String s="abcabcbb";
		System.out.println(s.substring(0, 3));
		System.out.println(s.substring(0, 3).length());
		
		System.out.println("====================");
		
		//insertion of two array
		Integer[] a = { 1, 4, 5, 9, 10 };
		Integer[] b = { 2, 8, 6, 1, 7, 4 };

		HashSet<Integer> set = new HashSet<>();

		set.addAll(Arrays.asList(a));

		set.retainAll(Arrays.asList(b));

		Integer[] intersection = {};
		intersection = set.toArray(intersection);

		System.out.println(Arrays.toString(intersection));
		
		
		
		
		//star pattern
		int n=7;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=2;i<=n;i++) {
			
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}		    
		    
		       
		        
			
		
		
		
	

	
	


