package com.biz.myclass;

public class MyClass_03 {
	// static으로 선언된 method는 
	// 프로젝트가 시작됨과 동시에 생성되어
	// 메모리에 남아있다.
	// 너무 많은 static 메서드들을 선언하면
	// 메모리 낭비가 심해지므로 가급적 선언하여 쓰지 않는다.
	public static int add(int num1, int num2) {
		
		return num1 + num2;
	}
	

}
