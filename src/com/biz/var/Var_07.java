package com.biz.var;

public class Var_07 {

	public static void main(String[] args) {
		
		//0부터 9까지 ASCII 코드
		for(int i = '0' ; i <= '9' ; i++) {
			
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i);
			
		}
		
	    // 대문자 A부터 Z까지 ASCII코드 값	
		for(int i = 'A'; i <= 'Z'; i++ ) {
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i);
		}
		
		// ASCII 코드 0부터 255까지(8bit)의 모든 값
		for (int i = 0; i < 256; i++) {
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i);
		}
		
	}

}
