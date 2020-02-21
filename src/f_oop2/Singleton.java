package f_oop2;


//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들간에 객체를 공유하기 위해 사용한다.
//자주 사용되는 디자인 패턴이다.
public class Singleton {

	//다른 클래스에서 호출을 할수 없고 해당 클래스에서만 사용가능
	//객체를 생성할 메서드 하나
	//생성한 객체를 저장하고 있는 변수 하나
	
	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	
	
	
}
