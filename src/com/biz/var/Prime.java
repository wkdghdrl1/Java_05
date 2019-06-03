package com.biz.var;

public class Prime {

	public static void main(String[] args) {
		
		

		
		
		for(int i = 2; i <= 100; i++) {
			int j = 0;
			for( j = 2; j < i; j++) {
				// index가 3이 되는 경우
				// 9 % 3 == 0의 조건문이 true가 되고
				// 9 % 4 이후는 계산할 필요가 없다.
				if (i % j == 0 ) {
					break;
				}
			} // break 이후 실행되는 곳
			  // i값이 소수이면
			  //  index >= i
			  // i값이 소수가 아니면
			  //  index < i
			if(j >=  i){
					System.out.println("소수는 : " + i);
			
					
			}
		}
		
	
	}

}
