package e_oop;

import java.util.*;

public class OOP {

	public static void main(String[] args) {
		/*
		 * << OOP(Object Oriented Programming) : 객체 지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리 (Heap영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 * - 객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
//		String returnString = "명령 수행 후 결과물을 돌려주는 메소드";
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
	
		int a = sc.method4(10, 123);
		System.out.println(a);
		
		sc.flowTest1(); //호출했을 때 출력되는 문장에 번호를 붙여주세요.
		
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker xy = new ClassMaker();
		//객체가 저장된 변수를 통해 메소드들을 호출해주세요.
		//파라미터가 있는 메소드는 타입이 맞는 값을 넘겨주시고
		//리턴타입이 있는 메소드는 리턴받은 값을 출력해주세요.
		xy.method();                         //method를 호출
		
		int return_result = xy.method1();	//method1에 대한 파라미터는 없지만 반환값이 있는 메서드
		System.out.println(return_result);
		
		xy.method2(20);						//method2 : 파라미터는 있지만 반환값이 없는 메서드
		
		
		int return_result1 = xy.method3(2, 4);					//method3 : 파라미터랑 반환값이 있는 메서드
		System.out.println(return_result1);
		
		
//		----------sem-----------------
		ClassMaker cm = new ClassMaker();
		cm.method1();
		
		String str = cm.method2();
		System.out.println(str);
		
		cm.method3(100);
		
		cm.method4(10, 20);
		System.out.println(cm.method4(10, 20)); //리턴값을 반환할 때 4번의 경우 같은 타입의 변수에 저장을 할 수 있지만 바고 출력도 가능
		
		
		
		
		
		//더하기,빼기,곱하기,나누기,나머지
		Clculator cl = new Clculator();
		//1.123456+654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		double result = cl.plus(123456,654321);
		result = cl.times(result, 123456);
		result = cl.division(result, 123456);
		result = cl.minus(result, 654321);
		result = cl.remainder(result, 123456);
		System.out.println(result);
		
		
		
		
		
		System.out.println(cl.plus(123456, 654321));
		System.out.println(cl.times(cl.plus(123456, 654321), 123456));
		System.out.println(cl.division(cl.times(cl.plus(123456, 654321), 123456), 123456));
		System.out.println(cl.minus(cl.division(cl.times(cl.plus(123456, 654321), 123456), 123456), 654321));
		System.out.println(cl.remainder(cl.minus(cl.division(cl.times(cl.plus(123456, 654321), 123456), 123456), 654321), 123456));
		
		
		
		
		
		SimLiTest st = new SimLiTest();
		Scanner s = new Scanner(System.in);
	
		String answer = s.nextLine();
		
		System.out.println("연애 심리 테스트를 시작합니다");
//		
//		System.out.println(st.questions1(answer));
		
		
		
		
		
		
	}

}
