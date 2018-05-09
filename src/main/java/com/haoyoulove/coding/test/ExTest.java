package com.haoyoulove.coding.test;

import java.util.Collection;


public class ExTest {

//	private static int j = 0;
//
//	private static Boolean methodB(int k) {
//		j += k;
//		return true;
//	}
//
//	public static void methodA(int i) {
//		boolean b;
//		b = i < 10 | methodB(4);
//		b = i < 10 || methodB(8);
//
//	}
//
//	public static void main(String args[]) {
////		methodA(0);
////		System.out.println(j);
//		
//		String str = "abc";
//		System.out.println(str.hashCode());
//		
//		char c = str.charAt(0);
//		char c2 = str.charAt(1);
//		char c3 = str.charAt(2);
//		System.out.println(0+c);
//		System.out.println(97 * 31 +c2);
//		
//		System.out.println(3105 * 31 +c3);
//	}

	Node node = new Node();
			
	class Node{
		int a = 10;
	}
	
	public void test(){
		System.out.println(node.a);
		Node h = node;
		test1(h);
	}
	
	public void test1(Node node){
		node.a = 100;
	}
	
	public static void main(String[] args) {
//		ExTest et = new ExTest();
//		et.test();
//		System.out.println(et.node.a);
		
	}
	
}






















