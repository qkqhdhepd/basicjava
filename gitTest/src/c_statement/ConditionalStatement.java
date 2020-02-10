package c_statement;

import java.util.*;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * << if 문 >>
		 *  - if	  :조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 *  - else if :다수의 조건이 필요할 때 if 뒤에 추가한다.
		 *  - else 	  : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		
//		int a = 10;
//		if(a < 100){
//			System.out.println("조건식의 연산결과가 true이면 수행된다.");
//		}
//		
//		if (a < 10){
//			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
//		}
		
		//주민등록번호 앞자리에 따른 성별확인 코드 (if문)
		int regNo = 1; // 주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo ==1){
			gender = "남자";
		}else if (regNo ==2){ //if블럭 뒤에 else if로 조건을 추가할 수 있다.
			gender = "여자";
		}else if (regNo ==3){
			gender = "남자";
		}else if (regNo ==4){
			gender = "여자";
		}else{//true인 조건식이 하나도 없을 때 수행된다.
			gender = "확인불가";
		}
		
		System.out.println("당신의 성별은" + gender +" 입니다.");
		
		
		regNo = 1;
		gender = null;
		//수행할 내용이 동일한 경우 논리 연산자를 사용해 조건식을 결합할 수 있다.
		if(regNo ==1 || regNo == 3)//수행할 내용이 한문장일 경우 블럭을 생햑할 수 있다.
			gender = "남자";
		else if (regNo == 2 || regNo == 4)
			gender = "여자";
		else
			gender = "확인불가";
		
		System.out.println("당신의 성별은" + gender +" 입니다.");
		
		//성적에 등급을 부여하는 프로그램
				
		int score =80;
		String grade = null;
		if (score >= 90){
			grade = "A";
		}else if (score >= 80){
			grade = "B";
		}else if (score >= 70){
			grade = "C";
		}else if (score >= 60){
			grade = "D";
		}else {
			grade = "F";		}
		System.out.println("당신의 학점은 " +grade+ "입니다");
		
		score = 77;
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if (97<= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if (score >= 80){
			grade = "B";
			if (87<= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if (score >= 70){
			grade = "C";
			if (77<= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if (score >= 60){
			grade = "D";
			if (67<= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else {
			grade = "F";
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
		
	
	/*
	 * <<swith 문>>
	 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
	 * - 조건식의 결과는 정수와 문자열만(JDK 1.7부터 문자열 허용)허용한다.
	 */

		regNo = 3;
		gender = null;
		//주민번호로 성별구분하기switch
		
		switch(regNo){
			case 1 : case 3 :
				gender = "남자";
				break; //break문을 만나면 switch문을 빠져나간다.
			case 2 : case 4 :
				gender = "여자";
				break;
			default : //IF문의 else와 같은 역할을 한다.
				gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender+ "입니다."); 
		
		score = 100;
		grade = null;
		switch(score / 10){
			case 10 : case 9 :
				grade = "A";
				break;
			case 8 :
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			default :
				grade = "F";
		}
		System.out.println("당신의 학점은 " +grade+"입니다.");
		
		
	//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		System.out.println("숫자를 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		//int num = Integer.parseInt(s.nextLine());
//		switch (num){
//			case 0 :
//				System.out.println("입력한 숫자는 0입니다.");
//				break;
//			default :
//				System.out.println("입력한 숫자는 0이 아닙니다.");
//		}
//		
	//숫자를 입력받아 그 숫자가 홀수 인지 짝수인지 출력해주세요. 		
	
//		System.out.println("숫자를 입력하세요.");
//		Scanner s = new Scanner(System.in);
//		int num1 = Integer.parseInt(s.nextLine());
//		if(num1 % 2 == 0){
//			System.out.println("입력한 숫자는 짝수 입니다.");
//		}else{
//			System.out.println("입력한 숫자는 홀수 입니다.");
//		}
		
		//두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요.
//		Scanner s = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요");
//		int num1 = Integer.parseInt(s.nextLine());
//		System.out.println("두번째 숫자를 입력하세요");
//		int num2 = Integer.parseInt(s.nextLine());
//		if(num1 > num2){
//			System.out.println("두가지 숫자 중 더 큰 숫자는" + num1 +"입니다.");
//		}else{
//			System.out.println("두가지 숫자 중 더 큰 숫자는" + num2 +"입니다.");
//		}
		
		//세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = Integer.parseInt(s.nextLine());
		System.out.println("세번째 숫자를 입력하세요");
		int num3 = Integer.parseInt(s.nextLine());
		if(num1 > num2 && num1 > num3){
			System.out.println("세가지 숫자 중 가장 큰 숫자는" + num1 +"입니다.");
		}else if(num2 > num1 && num2 > num3){
			System.out.println("세가지 숫자 중 가장 큰 숫자는" + num2 +"입니다.");
		}else{
			System.out.println("세가지 숫자 중 가장 큰 숫자는" + num3 + "입니다.");
		}
		
		
		
		
		
		
		
	}
}
