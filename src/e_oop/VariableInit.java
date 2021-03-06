package e_oop;

public class VariableInit {

	//전역변수를 초기화하는 3가지 방법
	
	//명시적 초기화
	int var = 10;
	
	//초기화 블럭 : 여러 문장이 필요한 초기화를 해야할 때 사용한다.
	{
		for(int i = 1; i<=10; i++){
			var +=i;
		}
	}
	
	
	/*
	 * <<생성자>>
	 *- 클래스와 같은 이름의 메소드
	 *-	객체를 생성하면서 필요한 작업이 있을 때 사용된다.(인스턴스 변수 초기화)
	 *- 파라미터를 받아서 초기화 하고 싶을 때 사용한다.
	 *- 클래스에 생성자는 반드시 하나 이상 존재해야 한다.
	 *- 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	 *- 생성자는 리턴타입이 없다.
	 */
	
	//클래스명과 동일한 이름을 가진 메소드
	VariableInit(int var){
		for(int i = 1; i <= var; i++){
			this.var += i;
		}
		//this : 클래스의 인스턴스 주소가 저장된 변수
		//인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 인스턴스 변수 앞에 붙여서 사용한다.
	}
	//var라는 변수를 호출했을 때 지역변수를 먼저 호출하기 때문에 전역변수를 호출하고 싶을 때 this를 붙여서 호출한다.
	//this를 붙이는 경우는 지역변수와 전역변수의 이름이 같아 혼동이 될 때 구분짓기 위해 붙인다.
	
	
	//오버로딩 : 같은 이름의 메소드를 정의하는 것
	//파라미터의 갯수나 타입이 달라야 한다.
	//조건 : 메소드를 구분하기 위해 파라미터의 갯수나 타입이 달라야 하며 생성자의 이름은 클래스의 이름과 같아햐 한다.
	VariableInit(){
//		for(int i = 1; i <= 100; i++){
//			this.var += i;
//		}
		this(100);
		//this() : 생성자에서 다른 생성자를 호출할 때 사용한다.
		//this()이전의 코드가 의미 없는 코드가 될 수 있기 때문에 this()는 생성자의 첫줄에서만 사용할 수 있다.
	}
	
	
}
