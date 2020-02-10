package e_oop;

public class Static {

	public static void main(String[] args) {
		/*
		 * << Static>>
		 * - 객체 생성 없이 변수나 메소드를 사용하기 위해 붙인다.
		 * - 객체들간에 변수의 값을 공유하기 위해 붙인다.
		 * - static이 붙은것 : 클래스 멤버(클래스 변수, 클래스 메소드)
		 * - 클래스 멤버 : 메모리에 클래스가 저장할 때 같이 저장된다.
		 * - static 이 붙지 않은 것 : 인스턴스 멤버(인스턴스 변수, 인스턴스 메소드)
		 * - 인스턴스 멤버 : 메모리에 인스턴스가 저장될 때 같이 저장된다.
		 * 전역변수가 큰 의미이고 그 안에 클래스 변수, 인스턴스 변수로 나뉘는 것이다.
		 */
		
		
		//static이 붙은 메소드
		Math.random();
		System.out.println();
		
		
		//클래스 변수와 클래스 메소드 사용하기
		System.out.println(ClassMember.classVar);
		ClassMember.ClassMethod();
		
		//static이 붙지 않은 인스턴스 애들은 객체생성을 해야 접근 가능
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();
		
		//객체를 통해서도 클래스 멤버에 접근할 수 있지만 좋은 방법은 아니다.
		System.out.println(cm1.classVar);
		cm1.ClassMethod();
		
		
		//객체를 cm2생성하여 객체 두개의 값이 서로 고유하게 유지된다는 것을 보여주는 코드
		ClassMember cm2 = new ClassMember();
		System.out.println("변경 전");
		System.out.println("cm1 : " +cm1.instanceVar);
		System.out.println("cm2 : " +cm2.instanceVar);
		
		cm2.instanceVar = "인스턴스 변수 변경";
		
		System.out.println("변경 후");
		System.out.println("cm1 : " +cm1.instanceVar);
		System.out.println("cm2 : " +cm2.instanceVar);
		
		
		//static이 붙은 변수의 경우는 어떻게 될까?
		//인스턴스 변수와 다르게 고유하게 유지가 되지않는다 한 객체에서 바꾸면 나머지 객체들도 바뀌게 된다.(값을 공유하고 있음)
		System.out.println("변경 전");
		System.out.println("cm1 : " +cm1.classVar);
		System.out.println("cm2 : " +cm2.classVar);
		
		cm2.classVar = "클래스 변수 변경";
		
		System.out.println("변경 후");
		System.out.println("cm1 : " +cm1.classVar);
		System.out.println("cm2 : " +cm2.classVar);
		
		
		
		
		
	}

}
