package e_oop;

public class JVM_Memory {

	
	/*
	 * << JVM (JAVA VIRTUAL MACHINE) >>
	 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 * - 운영체제 -> JVM => 자바 프로그램
	 * - 장점 : 운영체제에 상관없이 실행 할 수 있다.
	 * - 단점 : 속도가 느리다.
	 * 
	 * <<JVM 메모기 구조>>
	 * - Method Area: 클래스가 저장된다.
	 * - Call Stack : 현재 호출되어 있는 메소드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 */
	
	
	/*
	 * << Method Area >>
	 * - ClassMember : classVar, classMethod
	 * - System : out
	 * - PrintStream : println()
	 * 
	 * << Call stack >>
	 * - println(cm1.instanceVar) : 다 실행되면 삭제
	 * - instanceMethod() : 다 실행되면 삭제
	 * - println(cm1.classVar) : 다 실행되면 삭제
	 * - cm1.ClassMethod() : 다 실행되면 삭제
	 * 
	 * << Heap >>
	 * cm1 = new ClassMember() : instanceVar, instanceMethod()
	 * cm2 = new ClassMember() : instanceVar, instanceMethod()
	 * 
	 */
	
	
	
}
