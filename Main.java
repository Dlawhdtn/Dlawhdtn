package kr.lim.test2;

import kr.lim.test2.object.Person;
import kr.lim.test2.calc.Calc;
import kr.lim.test2.calc.Add;
import kr.lim.test2.calc.Mul;
public class Main {
	
	public static void main(String[] args) {
			
		// Calc타입 변수 cal = Add 객체
		//            Add ~> 구현체 (interface [추상객체])
		
		Calc cal = new Add();
		Calc cal2 = new Mul();
		
		int[] numbers = new int[5];
		// [0] [0] [0] [0] [0]
		
		Calc[] cals = new Calc[2];
		// [Null] [Null]
		// NullPointerException ~> 1 
		// Null.??
		// Null check -> null 에 대한 예외처리
		
		try {
			// 시도 할 코드
			System.out.println(cals[0].cal(10,20));
		} catch(NullPointerException e) {
			// catch 잡은 에러가 발생했을 때 실행 할 코드
		} finally {
			// try catch 가 끝나고 반드시 실행 되야 할 코드
		}
		
		System.out.println(cals[0].cal(10,20));
	}

}
