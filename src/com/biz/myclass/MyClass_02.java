package com.biz.myclass;

public class MyClass_02 {
	
	// MyClass_02의 멤버변수  
	public int num1 = 0;
	public int num2 = 0;
	
	//메서드
	public void add() {
		System.out.println(num1 + num2);
	}

	public String add(int num1, int num2) {
		//System.out.println(num1 + num2);
		return ""+ ( num1 + num2);
	}
	
	public String add(String s1, String s2) {
		return s1 + s2;
	}
	
	public float add(float f1,  float f2) {
		return f1 + f2;
		
	}
	
	public void times() {
		System.out.println(num1 * num2);
	
	}
	
	public void minus() {
		System.out.println(num1 - num2);
	}
}
