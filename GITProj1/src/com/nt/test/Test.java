package com.nt.test;

import com.nt.beans.RealTimeDBTest;

public class Test {

	public static void main(String[] args) {
		RealTimeDBTest t= new RealTimeDBTest();
		System.out.println(t.getClass().getName());
	}
	public void m1() {
		System.out.println("m2(-) is created...123");
		System.out.println("Ram is coming");

	}
	
	public void m3() {
		System.out.println("m3-()");
	}
	public void m2() {
		System.out.println("m2-()");
	}

}
