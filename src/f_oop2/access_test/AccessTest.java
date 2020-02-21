package f_oop2.access_test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	
	
	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();

		                                                                                                       
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
		System.out.println();
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.publicVar);
		at.publicMethod();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
//		System.out.println(at.defaultVar);
//		at.defaeltMethod();
//		
//		System.out.println(at.privateVar);
//		at.privateMethod();
		
		
		
		
		
		
	}
	
}
