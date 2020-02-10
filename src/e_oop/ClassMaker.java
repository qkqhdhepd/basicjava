package e_oop;

public class ClassMaker {

	
	//전역변수 하나를 선언 및 초기화 해주세요.
	int test = 0;
	//리턴타입과 파라미터가 없는 메소드 하나를 만들어주세요.
	void method(){
		System.out.println(test);
		
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메소드 하나를 만들어주세요.
	int method1(){
		int result = 100;
		return result;
	}	
	//리턴타입은 없고 파라미터가 있는 메소드 하나를 만들어주세요.
		//메소드 안에서 파라미터를 출력해주세요.
	
	void method2(int a){
		System.out.println("a는 "+a);
	}
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메소드 하나를 만들어주세요.
	//메소드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int method3(int a, int b){
		return a * b;
		
	}
	
	
//	-------------------------------sem------------------------------
	String var = "abcd";
	void me1(){
		System.out.println(var);
	}
	
	String method2(){
		return var;
	}
	
	void method3(int param){
		System.out.println(param);
	}
	
	int method4(int a,int b){
		return a * b;
	}
}
