package e_oop;

public class ClassMaker2 {
	
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int var = 20;
	
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		for(int i =1; i <= 20; i++){
			var += i;
		}
	}
	
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int var){
		for(int i = 1; i <= 20; i++){
			this.var += i;
		}
	}
	
	
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	//클래스 명은 같고 파라미터의 갯수가 다름
	ClassMaker2(int var, int var2){
		for(int i = 1; i <= 20; i++){
			this.var += i;
		}
	}
	
	
	//클래스의 명은 같고 파라미터의 타입은 다름
	ClassMaker2(char var){
		for(int i = 1; i <= 20; i++){
			this.var += i;
		}
	}
	
	static String str = "홍길동";
	static {str = "이순신";}
	
	ClassMaker2(String str){
		this.str = str;
	}
	
	ClassMaker2(){
		this("세종대왕");
	}
	
		
	
	//초기화 순서 : 명시적 초기화 > 초기화 블럭 > 생성자
	

}
