package z_exam;

public class Exam03 {

//	[3-1] 다음 연산의 결과를 적으시오.

//	public static void main(String[] args) {
//		int x = 2;
//		int y = 5;
//		char c = 'A';
//		
//
//		System.out.println(y >= 5 || x < 0 && x > 2); 	//true		//x가 0보다 작고 x가 2보다 크거나 y가 5이상이다.
//		System.out.println(y += 10 - x++); 				//13		//y에 10을 더해서 x를 빼고 증가시켜라 (++x : 3)가되면 12가 나옴
//		System.out.println(x+=2); 						//5			//2+3 = 5
//		System.out.println( !('A' <= c && c <='Z') );   //false		//c변수가 대문자 알파벳이 아닐 때
//		System.out.println('C'-c); 						//2			//67(C)-65(A)
//		System.out.println('5'-'0'); 					//5			//53('5')-48('0') 
//		System.out.println(c+1); 						//66		//65(A)+1
//		System.out.println(++c); 						//B			//c변수를 1증가 시켜라(전위형 : 변수가 참조되기전 수행)
//		System.out.println(c++); 						//B			//c변수를 1증가 시켜라(후위형 : 변수가 참조된 후 수행)
//		System.out.println(c);							//C
//
//	}

//	[3-2]아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일 사과의 수가
//		123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
//	public static void main(String[] args) { 
//		int numOfApples = 123;
//		int sizeOfBucket = 10;
//		int numOfBucket = ((int)(((numOfApples/(float)(sizeOfBucket))+0.9f)));
//		System.out.println("필요한 바구니의 수:"+numOfBucket);
//		
		//나머지가 0이 아닌경우 그냥 나누고 0이 아닌경우 1을 더해줘라
//	}
	
//	[3-3]아래는 변수 의 값에 따라 num 양수 음수 을 ‘ ’, ‘ ’, ‘0’ 출력하는 코드이다 삼항 연산자를 이용해서 에 알맞은 코드를 넣으시오
//	[Hint] 삼항 연산자를 두 번 사용하라.         //삼항연산자란 조건식 ? 반환값1 : 반환값2   //물음표 앞의 조건식에 따라 결괏값이 참이면 반환값1을 반환하고 거짓이면 반환값2를 반환

//	public static void main(String[] args) {
//		int num = 10;
//		System.out.println(num > 0 ? "양수":(num < 0 ? "음수" : "0"));
//
//	}

//	[3-4]아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다 . 만일 변수 num 의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다.
//	알맞은 코드를 넣으시오.
//	
//	public static void main(String[] args) { 
//		int num = 456; 
//		System.out.println( num/100*100 ); 
//		}
//
//	[3-5]아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수의  num 값이  333 이라면 331 이 되고, 777 이라면  771이 된다.
//	알맞은 코드를 넣으시오 . 
	
//	public static void main(String[] args) {
//		int num = 333;
//		System.out.println(num/10*10+1); 
//		}

//	[3-6]아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 마너지를 구하는 코드이다. 예를 들어, 24의 크면서도
//	가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
//	알맞은 코드를 넣으시오.
//	[hint]나머지 연산자를 사용하라.
//	public static void main(String[] args) {
//		int num = 20;
//		System.out.println(10 - num%10);   //10 - num%10 
//		}

//	[3-7]아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C = 5/9 * (F-32)'라고 할때, (1)에 알맞은 코드를 넣으시오.
//	단 변환 경과값은 소수점 셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
	
//	public static void main(String[] args) {
//		int fahrenheit = 100;
//		float celcius = ((int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f ); 
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
//	//변환공식에서 5/9는 변환시키는 소수점 인자이기 때문에 float(실수형)으로 바꾸어야 한다.
//	//변환공식으로 계산을 하면 37.7778이라는 실수값을 얻는데 이를 소수점 셋째자리에서 반올림 하려면 소수점 둘째자리까지 살려야 하므로 100을 곱하고 0.5라는 인자를 사용하여
//	//올릴것인지 내릴것인지 결정하게 된다. 그다음 (int)화 시켜서 소수점 이하를 버리고 마지막으로 100을 나누어 줄때 float화 시켜서 100f로 나누어 준다.
//	}
	
//	[3-8]아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
	
//	public static void main(String[] args) {
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b);           		//형변환
//		char ch = 'A';
//		ch = (char)(ch + 2);					//형변환
//		float f = 3f / 2f;						//f를 붙여서 타입을 맞춤(하나만 f해도됨)
//		long l = 3000L * 3000L * 3000L;			//L을 붙여서 롱타입으로(//)
//		float f2 = 0.1f;
//		double d = 0.1;
//		boolean result = (float)d==f2;			//(float)d해서 더블타입을 float로 
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
//		}

//	[3-9]다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.
//	알맞은 코드를 넣으시오.
	
//	public static void main(String[] args) {
//		char ch = 'z'; 
//		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
//		System.out.println(b);
//		}
	//       ('a'<= ch && ch <='z')||('A' <= ch && ch <= 'Z')||('0' <= ch && ch <='9')
	//첫항은 'a'보다 크고 'z'보다 작은 
	//둘째항은 'A'보다 크고 'Z'보다 작은
	//셋째 항은 '0'보다 크고 '9'보다 작은

//	[3-10]다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
//	문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고 'a'의 코드는 97이다. 
//	(1)~(2)에 알맞은 코드를 넣으시오.
	
//	public static void main(String[] args) {
//		char ch = 'A';
//		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
//	}

		//'A'보다 크고 'Z'보다 작다면 (char)(ch+32)을  가져오고 아니면 ch를 가져온다
		//대문자일 경우에 ch값에 32를 더해서 소문자로 만들어라 라는 뜻
}


