package kr.lim.test2;

import kr.lim.test2.object.Person;
import kr.lim.test2.calc.Calc;
import kr.lim.test2.calc.Add;
import kr.lim.test2.calc.Mul;
public class Main {
	
	public static void main(String[] args) {
			
		// CalcŸ�� ���� cal = Add ��ü
		//            Add ~> ����ü (interface [�߻�ü])
		
		Calc cal = new Add();
		Calc cal2 = new Mul();
		
		int[] numbers = new int[5];
		// [0] [0] [0] [0] [0]
		
		Calc[] cals = new Calc[2];
		// [Null] [Null]
		// NullPointerException ~> 1 
		// Null.??
		// Null check -> null �� ���� ����ó��
		
		try {
			// �õ� �� �ڵ�
			System.out.println(cals[0].cal(10,20));
		} catch(NullPointerException e) {
			// catch ���� ������ �߻����� �� ���� �� �ڵ�
		} finally {
			// try catch �� ������ �ݵ�� ���� �Ǿ� �� �ڵ�
		}
		
		System.out.println(cals[0].cal(10,20));
	}

}
