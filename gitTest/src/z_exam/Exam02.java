package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		/*
		[2-1] 다음 표의 빈 칸에 개의 기본형 을 알맞은 자리에 넣으시오 8 (primitive type) .
			
		종 류	\크 기1 byte 2 byte 4 byte 8 byte
		논리형	boolean	
		문자형			char
		정수형	byte	short	int		long
		실수형					float	double
		*/
		
		/*
		[2-2] 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형  
		 *(data type) 을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		 * 초기화 하는 한 줄의 코드를 적으시오.
		 */
//		 String regNo = new String("9403221111111");
//		 System.out.println(regNo);
		 //long타입으로 해야함

		 /*
		[2-3] 다음의 문장에서 리터럴 변수 상수 키워드를 적으시오 . 
		int i = 100; 
		long l =100L; 
		final float PI = 3.14f;
		 리터럴 : 100,100L,3.14f
		 변수 : i, l
		 키워드 : int, long, float,final
		 상수 : PI
		  */
		 /*
		 [2-4] 다음 중 기본형 이 아닌 것은 (primitive type) ?
		  a. int 
		  b. Byte 
		  c. double 
		  d. boolean
		  정답은 b이다. byte는 기본형이지만, Byte는 클래스에 해당한다.(B가 대문자)
		  */
		 /*[2-5] 다음 문장들의 출력결과를 적으세요.
		   오류가 있는 문장의 경우 괄호 안에 '오류'라고 적으시오. 
		   System.out.println(“1” + “2”)→(12)  
		   System.out.println(true + “”)→(true) 
		   System.out.println('A' + 'B')→(131)  
		   System.out.println('1' + 2)→(51) //따옴표에 1은 숫자가 아닌 문자로 인식(49)
		   System.out.println('1' + '2')→(99)  //49+50
		   System.out.println('J' + "ava")→(Java)
		   System.out.println(true + null)→(오류)
		   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
				The operator + is undefined for the argument type(s) boolean, null

				at z_exam.Exam02.main(Exam02.java:58) 
		  */
		 System.out.println("1"+"2");
		 System.out.println(true + "");
		 System.out.println('A' + 'B');
		 System.out.println('1' + 2);
		 System.out.println('1' + '2');
		 System.out.println('J' + "ava");
//		 System.out.println(true + null);
		 
		 /*
		 [2-6] 다음 중 키워드가 아닌 것은 (모두 고르시오) ?
		 a. if 
		 b. True 
		 c. NULL 
		 d. Class 
		 e. System
			정답은 b,c,d,e
		  */		 
		 	
		 /*
		  [2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은 모두 고르시오 ?
		   a. $ystem 
		   b. channel#5 
		   c. 7eleven 
		   d. If 
		   e. 자바
		   f. new 
		   g. $MAX_NUM 
		   h. hello@com
			정답은 a,d,e,g
		  */
		
		 /*
		  [2-8] 참조형 변수 (reference type) 와 같은 크기의 기본형(primitive type) 은? (모두고르시오) 
		  a. int 
		  b. long 
		  c. short 
		  d. float 
		  e. double
			정답은 참조형변수의 크기는 4byte이므로 a,d이다.
		  */
		 
		 /*
		  [2-9] 다음 중 형변환을 생략할 수 있는 것은 모두 고르시오 ?
 			byte b = 10; 
 			char ch = 'A'; 
 			int i = 100; 
 			long l = 1000L;
			
			a. b = (byte)i;
			b. ch = (char)b; 
			c. short s = (short)ch; 
			d. float f = (float)l; 
			e. i = (int)ch;
			정답은 형변환을 생략가능한 경우는 표현범위가 작은 타입에서 큰 타입으로 변환할 때 가능하므로 오른쪽에 있는게 더 작을때
					d,e
					
		  */
		 	/*
		 	 [2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는 ? (10진수로 적으시오 )
		 	 정답은 0~65535
		 	 
		 	 */
 			
 			/*
 			 [2-11] 다음중 변수를 잘못 초기화 한 것은 모두 고르시오 ?
 			 a. byte b = 256; 			  
 			 b. char c = ''; 
 			 c. char answer = 'no'; 
 			 d. float f = 3.14 
 			 e. double d = 1.4e3f;
				정답은 a,b,c,d이다.
				a는 범위를 초과했다.
				b는 char는 반드시 한개의 문자를 지정해야함.
				c는 char는 문자를 두개 저장할 수 없다.
				d는 f생략을 했다.
			 */
		
		 	/*
		 	 [2-13] 다음 중 타입과 기본값이 잘못 연결된 것은 모두 고르시오 ?
		 	  a. boolean - false 
		 	  b. char - '\u0000' 
		 	  c. float - 0.0 
		 	  d. int - 0 
		 	  e. long - 0 
		 	  f. String - ""
		 	 정답은 c,e,f
		 		c는 기본값이 0.0f이다.
		 		e는 기본값이 0L이다.
		 		f는 기본값이 null이다.
		 	 */
	}

}
