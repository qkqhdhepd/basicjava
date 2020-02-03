package a_variable;

import java.util.Scanner;

//Ctrl + Shift +o
//import java.util.Scanner;                //스캐너는 다른 패키지에 위치한 클래스이기 때문에 그 위치를 알려주어야 함

public class Variable {

	int a; //전역변수
	
	public static void main(String[] args) {
		
        /*
		*<< 변수 >>
		* - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		* - 타입(데이터의 종류)과 변수명(변수의 이름)으로 변수를 만들 수 있다.
		*
		*<< 사용 가능한 기본형 데이터의 종류 >>--기본형 타입(타입종류와 크기 암기)
		* - 정수: byte(1byte), short(2byte), int(4byte), long(8byte)
		* - 실수: float(4byte), double(8byte)
		* - 문자: char(2byte)	
		* - 논리: boolean(1byte)
		*
		*<< 명명 규칙 >>
		* - 블럭안에서 변수명은 중복될 수 없다.
		* - 영문 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.(한국 사용은 자제하자)
		* - 대소문자가 구분되며 길이에 제한이 없다.
		* - 숫자로 시작할 수 없다.
		* - 예약어는 사용할 수 없다.
		* - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		* - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)]
		* - [클래스명의 첫글자는 대문자로 한다.]
		* - [패키지명은 모두 소문자로 한다.]
		*/
	
		//변수 선언 방법: 데이터 타입  + 변수 이름
		
		byte _byte;                                            //지역변수
		char _char;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		boolean _boolean;
	
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
//		System.out.println(_byte);//컴파일 에러 발생(문법이 틀렸다)
	
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.(오른쪽먼저 연산)
		_byte = 10; //타입에 맞는 값을 저장해야 한다.
		_short = 20;
		_int = 30;
		_long = 40L; 	//L이라는 접미사를 붙여야함
		_float = 3.14f;	//f라는 접미사를 붙여야함
		_double = 3.14;	//double은 접미사를 생략가능(d)
		_char = '가';	//''로 묶여진것이 문자이며 한글자여야만 한다.
		_boolean = true;//false와 true만 가능하다.
		//초기화 : 변수에 처음으로 값을 저장하는 것
		
		/*System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);*/
		
		System.out.println(_int);
		//Ctrl + F11 : 프로그램 실행
		//F11 : 디브그 실행
		
		_int = 100;
		System.out.println(_int);
		_int = 100 + 200;
		System.out.println(_int);
		
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		_short = 50;
		System.out.println(_short);
		_short = 50+20;
		System.out.println(_short);
		
		_long = 150L;
		System.out.println(_long);
		_long = 150L + 250L;
		System.out.println(_long);
		
		_char = '나';
		System.out.println(_char);
		
		_float=3.41f;
		System.out.println(_float);
		
		_double=3.41;
		System.out.println(_double);
		
		_boolean = false;
		System.out.println(_boolean);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		//자주사용되다보니까 쉽게 제공이 되고있다.
		
		_String = "1234";
		System.out.println(_String);
		
		 /*
		 * << 리터럴의 종류 >>
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자: '가', 'a', 'o', ' '
		 * 문자열: "가나다", "abc", "123", "  ", ""
		 * 그외 : true, false, null(값이 없다)
		 * 
		 * <<참조형 타입>>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스) --why?(값이 변수에 직접 저장이 안되고 그 값이 가지고 있는 주소를 저장함)
		 * - ex) String, AboutClass, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값
		//전역변수란 main메서드안에서 변수를 만들었는데 이는 지역변수라고 하고 
		//메서드 밖에서 만드는 변수를 전역변수라고 한다.
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0.0d;
		_char = '\u0000'; //  역슬레쉬u 는 유니코드라는 의미를 가진다.
		_boolean = false;
		_String = null;
		
		//대문자A는 65라는 10진수를 가지고 특유의 유니코드를 가지고 있다.
		//컴퓨터는 문자를 표현하는 방식이 한개의 문자와 한개의 숫자를 매치시켜서 그 숫자와 일치하는 문자를 대신 표현해준다.
		//컴퓨터는 0과1밖에 모른다.
		
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int = 128;
		_byte = (byte)_int; //형변환: 데이터 타입을 변환하는 것   int타입을 byte타입으로 변환
		System.out.println(_byte);
		//오버플로우
		//-128이라고 출력이되는데 왜그러냐면 바이트 타입이 표현할수있는 범위가 -128부터 127까지이기 때문이다.
		//즉, 범위를 벗어난것을 표현하려고 하니 데이터가 손실이 잃어났다. 1만큼 벗어났기 때문에 범위를 벗어난 -128이 표현됨
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte);
		//언더플로우
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		//바이트는 -128이 가장 작은 값이지만 그보다 더 작은 -129를 표현하기위해서 바이트 범위의 가장 큰 범위로 가서 계산되어 표현됨
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int);
		//더블타입을 인트타입으로 형변환함
		//더블타입은 실수타입이고 굉장히 큰 표현범위를 가지고 있다.(int타입은 20억정도)
		//출력결과는 소수점이 사라진다.
		
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변화을 생략할 수 있다.
		
		// byte<short<int<long<float<double
		//char는 음수를 표현할 필요가 없기에 0부터 65535까지
//-------------------------------------------------------------------------------------------------------------		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요.(3번)
		_int = (int)_long;
		_long = (long)_float;
		_float = (float)_short;
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요.(3번)
		_long = (int)_long;
		_long = (byte)_long;
		_double = (int)_long;
		_double = (float)_double;
		_long = _byte;
		_short=_byte;
		_long = _short;
		_float = _long;
		_float = _int;
//-------------------------------------------------------------------------------------------------------------		
		/*
		 * <<상수>>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		*/
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100;
//========================================================================================================		
		//콘솔창에서 입력받는 방법
//		Scanner s = new Scanner(System.in);
		
//		System.out.println("문자열을 입력해주세요.");
//		String input1 = s.nextLine();
//		System.out.println("입력받은 문자열 : " + input1);
//========================================================================================================		
		//숫자를 입력 받아보세요.
		
//		System.out.println("숫자를 입력해주세요.");
//		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 문자열 : " + input2);
		
//========================================================================================================		
//		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
//		
//		System.out.println("문자열을 입력해주세요.");
//		String munza = s.nextLine();
//		System.out.println("입력받은 문자열: "+ munza);
//		
//		//숫자를 입력받고 입력받은 숫자를 출력해주세요.
//		//
//		System.out.println("숫자열을 입력해주세요.");
//		int susza = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 문자열: " +susza);
//		
//		//위에서 입력받은 문자열과 숫자를 더해서 출력해주세요.
//		System.out.println(munza + susza);
		
		
//		String input = munza + susza;        //문자열(스트링)과 숫자를 더하면 스트링이된다.
//		System.out.println(input);

//========================================================================================================
		
//		Scanner s = new Scanner(System.in);
		//3개의 숫자를 입력받고 그 숫자들을 더한 결과를 출력해주세요.
		
//		System.out.println("숫자를 입력해주세요.");
//		int input1 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 문자열 : " +input1);
//		System.out.println("숫자를 입력해주세요.");
//		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 문자열 : " +input2);
//		System.out.println("숫자를 입력해주세요.");
//		int input3 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 문자열 : " +input3);
//		
//		System.out.println(input1 +input2+ input3);       출력 표현을 더한 코드
//
//		int sum = input1+ input2 + input3;
//		System.out.println("3개를 합친 총합은 :" + sum);       //입력값을 수학적으로 더한 코드
		
		
//========================================================================================================		
		Scanner s = new Scanner(System.in);
				
		//아이디, 비밀번호, 이름, 전화번호, 이메일을 입력받고 
		//마지막에 입력받은 내용 전체를 출력해주세요.
		
		System.out.println("아이디를 입력해주세요.");
		String id = s.nextLine();
		System.out.println("입력받은 문자열: "+ id);
		
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = s.nextLine();
		System.out.println("입력받은 문자열: "+ pwd);
		
		System.out.println("이름을 입력해주세요.");
		String name = s.nextLine();
		System.out.println("입력받은 문자열: "+ name);
		
		System.out.println("이메일을 입력해주세요.");
		String email = s.nextLine();
		System.out.println("입력받은 문자열: "+ email);
		
		System.out.println(id+pwd+name+email);
		
		
		
	}

}
