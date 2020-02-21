package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {
	
		
	void method(){
		//일반적인 메서드 
	}

	//추상메서드 : 선언부만 있고 구현부는 없는 메소드    => 추상메서드를 하나라도 가지면 추상클래스여야 한다.
	abstract void abstractMethod();
	
}

class SampleAbstractChild extends SampleAbstractParent{
	//지금 상속받은 클래스를 추상클래스로 하던지 아니면 오버라이딩을 하던지
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	
}
