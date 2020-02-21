package h_useful;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할때 사용하는 클래스
		 * 
		 * boolean	:Boolean
		 * char		:Character
		 * byte		:Byte
		 * short	:Short
		 * int 		:Integer
		 * long		:Long
		 * float	:Float
		 * double	:Double
		 */
		
		int i = 10;						//기본형 타입
		Integer iw = new Integer(20);	//참조형 타입

		System.out.println(i+iw);		//기본형 + 참조형 (계산됨)-Wrapper라서 가능
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		System.out.println(i+Integer.parseInt("20"));
		
		System.out.println(i + String.valueOf(20));
		
		System.out.println(i+Integer.valueOf("20"));
		
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(10);	//오토박싱 : 기본형타입이 wrapper 클래스로 자동 변환
		
		Integer integer = list.get(0);
		int i2 = list.get(0);	//언박싱 : wrapper 클래스가 기본형 타입으로 자동 변환
		
		
	}

}
