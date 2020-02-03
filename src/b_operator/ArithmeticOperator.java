package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<산술 연산자>>
		 *  - + : 더하기
		 *  - - : 빼기
		 *  - * : 곱하기
		 *  - / : 나누기
		 *  - % : 나머지
		 *  - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		// *, /, % 연산자가  + , -보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d = 10 + 20.3;
		System.out.println(d);
		//피연산의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short c = 20; 
		
		a = c - b;
		System.out.println(a);
		
		//c = c - b;  가 되면 에러발생
		//4byte보다 작은 정수 타입은 4byte(int)로 형변환 후 연산이 수행된다.
		
		long e1 = 1000000 * 1000000;
		System.out.println(e1);
		//overflow가 발생해서 -값이 나온거임
		//1000000은 int 타입이기 때문에 int*int는 int로 연산하려고 하기 때문에 오버플로우 생김
		
		long e2 = 1000000 * 1000000L;
		System.out.println(e2);
		//long타입으로 형변환을 해서 연산했기때문에 int가 long타입으로 따르게 됨(오버플로우 없이 계산이 됨)
		
		double f1 = 10 / 4;
		System.out.println(f1);
		//둘다 int타입이기 때문에 둘중에 하나는 double타입이어야 연산이 된다.
		double f2 = 10 / 4.0;
		System.out.println(f2);
		int f3 = 10 % 4;
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
//		int g1 = 10 / 0;
		//컴파일 에러 (빨간줄은 발생하지 않지만 ) 실행을 하게 되면 런타임에어가 뜬다.
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//		at b_operator.ArithmeticOperator.main(ArithmeticOperator.java:53)
		float g2 = 10.0f / 0;
		System.out.println(g2);
		float g3 = 0 / 0f;
		System.out.println(g3); //NaN : Not a Number
		
		int h1 = 'A' + 1;
		System.out.println(h1);
		
		int h2 = 'D' -'A';
		System.out.println(h2);
		
		int h3 = '5' - '0';
		System.out.println(h3);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		i = i + 1;
		i += 1; //복합연산자라고 함
		
		i = i -1;
		i -= 1;
		
		i = i *2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i); //출력을 하기 전 1이 증가되어 출력됨.
		i = 0;
		System.out.println("i++ = " + i++); //출력을 하고 나서 1이 증가되어 있다.
		System.out.println(i);
		
		//반올림을 하기위해 0.5를 더하고 소수점을 없애기 위해 int로 형변환 한다.
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		System.out.println(Math.round(round));  //소수점 첫째자리에서 반올림을 해주는 메서드
		//만약에 소수점 두번째 자리에서 반올림을 하려면 이 메서드를 사용할 수 없다.
		double round2 = 50.56;
		System.out.println((int)(round2 *10 + 0.5) /10.0);
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 +654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
//		long z = 0;
//		z = 123456 + 654321;
//		System.out.println(z);
//		z *= 123456;
//		System.out.println(z);
//		z /= 123456;
//		System.out.println(z);
//		z -= 654321;
//		System.out.println(z);
//		z %= 123456;
//		System.out.println(z);
		
		//3개의 int형 변수를 선언 및  초기화 후 합계와 평균을 구해주세요.
		//평균은 소수점 두재짜리에서 반올림 해주세요.
		
		int t1 = 15;
		int t2 = 38;
		int t3 = 87;
		int sum = t1 + t2 + t3;
		double avg =(int)((sum/3.0) *10 + 0.5) /10.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
}
