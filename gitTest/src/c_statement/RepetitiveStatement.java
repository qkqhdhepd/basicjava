package c_statement;
import java.util.*;
public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * << for문 >>
		 * - for(int i = 1; i <= 10; i++){ }
		 * - for(1부터 10까지 1씩 증가하면서 반복){ }
		 */
		
		for(int i = 1; i <= 10; i++){
			//for(초기화; 조건식; 증감식){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i + "번째 반복"); //초기화한 변수를 블럭안에서 사용할 수 있다.
		}
		
		int sum = 0; //1부터 10까지 합계를 저장
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		
		for(int i = 1; i <= 100; i++){
			sum += i;				
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >=1; i--){
			sum += i;
		}
		System.out.println(sum);
		
		
		//1부터 100까지 짝수의 합을 구해보자.
		sum = 0;
		for(int i = 2; i <=100; i+= 2){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int i = 2; i <=100; i++){
			if(i % 2 ==0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		//1부터 100까지 홀수의 합을 구해보자.
		sum = 0;
		
		for(int i = 1; i <=100; i++){
			if(i % 2 != 0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <=100; i++){
			if(i % 2 == 0){
				
			}else{
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		//구구단 출력하기
		/*
		 *  2 * 1 = 2
		 *  2 * 2 = 4
		 *  2 * 3 = 6
		 */
		
		for(int i = 1; i<=9; i++){
			System.out.println("2 * " + i + " = " + i * 2);
		}
		
		//구구단 (5단 출력하기)
		for(int i = 1; i<=9; i++){
			System.out.println("5 * " + i + " = " + i * 5);
		}
		
		
		/*
		 * << 중첩 for문 >>
		 *  - for문안에 다른 for문을 포함시키는 것
		 *  - p.161
		 */
		//구구단 전체 출력하기
		
		for(int i = 1; i<=9; i++){
			for(int y = 1; y<=9; y++){
				System.out.println(i + " * " + y + " = " + i * y);
			}
		}
		
		//구구단 전체의 짝수단 홀수줄만 출력해주세요.
		for(int i = 2; i<=9; i+= 2){
			for(int y = 1; y<=9; y+=2){
				System.out.println(i + " * " + y + " = " + i * y);
			}
		}
		
		//구구단 전체를 가로로 출력해주세요.
		for(int y = 1; y<=9; y++){
			for(int i = 2; i<= 9; i++){
				System.out.print(i + " * " + y + " = " + i * y + "\t");
			}
			System.out.println();
		}
		
		//별을 나열한다.
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<= 10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//삼각형으로 별을 나열한다.
		for(int i = 1; i<=10; i++){
			for(int j = 1; j<= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//역삼각형으로 별을 나열한다.
		for(int i = 10; i>=1; i--){
			for(int j = 1; j<= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * << while문 >>
		 * - while(조건식){ }
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을 때 사용한다.
		 */
		
		//사용자가 입력한 단의 구구단을 출력하는 프로그램
//		Scanner s = new Scanner(System.in);
//		
//		while(true){
//			System.out.println("몇단을 출력할 까요?(0 : 종료)");
//			int dan = Integer.parseInt(s.nextLine());
//			
//			if(dan == 0){
//				System.out.println("종료되었습니다.");
//				break; //가까운 반복문 하나를 탈출한다.
//			}
//			
//			for(int i = 1; i <= 9; i++){
//				System.out.println(dan + "*" + i + " = " + dan * i);
//			}
//		}
		
		/*
		 * << do-while문 >>
		 * - do{ }while(조건식);
		 * - 최조한 한번의 수행을 보장한다.
		 */
		
		//숫자 맞추기 게임을 만들어 보자.
		
		
//		int	answer = (int)(Math.random() * 100) + 1;
//		int input = 0; 
//		Scanner S = new Scanner(System.in);
//		
//		do{
//			System.out.println("1 ~ 100 사이의 수를 입력해주세요>");
//			input = Integer.parseInt(S.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "보다 작습니다.");
//			}else if (input < answer){
//				System.out.println(input + "보다 큽니다.");
//			}else{
//				System.out.println("정답입니다.");
//			}
//		}while (input != answer);
		
		//이름붙은 반복문
		outer : for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				if( j == 5){
//					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; //outer라는 이름의 반복문을 빠져나간다.
//					continue; // 가장 가까운 반복문의 현재 반복회차를 빠져나간다.
					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
