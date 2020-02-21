package f_oop2;

public class SampleChild extends SampleParent{
	
	void ChildMethod(){
		//상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		int result = method(7,13); //상속받은 메소드
		System.out.println(result);
	}
	


	public static void main(String[] args){
		SampleChild sc = new SampleChild();		//메모리에 올리기 위해 객체를 생성
		System.out.println(sc.var);				//생성된 객체를 통해 변수 호출
		int result = sc.method(7, 13);			//생성된 객체를 통해 메소드 호출 및 변수에 저장
		System.out.println(result);				
	}

	//오버라이딩 : 상속받은 메소드 내용을 재정의 하는 것.
	@Override //어노테이션 : 어떤기능을 하냐면 이 메서드가 오버라이딩 된 메서드면 인트타입이랑 변수갯수가 같아야 하는데 실수로 메서드 이름을 잘못입력을 하면
	//얼핏보면 헷갈릴수 있다. 이 때 어노테이션이 없으면 컴파일 에러가 발생을 하지 않아서 모르지만 붙여주면 컴파일 에러를 발생시켜 구분하기가 용이하다.
	int method(int a, int b){
		return a * b;
	}
	//오버라이딩을 하면 부모클래스에 있는 메서드가 덮어써지기 때문에 무시된다. 
	
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수가 우선적으로 출력
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	
	//this()는 내 클래스의 생성자를 호출하는 것이고 super()는 부모 생성자를 호출하는 것이다.
	//자식객체를 생성할 때 부모객체도 자동으로 생성한다.
	//만약에 부모 생성자에 파라미터 있다면 자동으로 호출이 안되겠죠~파라미터에 뭐를 넣을지 모르니깐~
	SampleChild(){
		super();
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
	
	
	
}