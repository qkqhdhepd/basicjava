package z_exam;
import java.util.Scanner;
import java.util.*; 
public class Exam05 {

	public static void main(String[] args) {
		

//		[5-1] 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명 .
//		하시오.
//		a. int[] arr[];
//		b. int[] arr = {1,2,3,};
//		c. int[] arr = new int[5];
//		d. int[] arr = new int[5]{1,2,3,4,5};			//[5]를 []로 교체
//		e. int arr[5];									//[5]를 []로 교체
//		f. int[] arr[] = new int[3][];			
		
		
		
		
		
//		[5-2] 다음과 같은 배열이 있을 때 의 값은 얼마인가 , arr[3].length ?
//				int[][] arr = {												//int형의 2차원 배열 arr을 생성하는 부분
//				{ 5, 5, 5, 5, 5},											//arr[0]의 주소에 저장된 값	{ 5, 5, 5, 5, 5}
//				{ 10, 10, 10},												//arr[1]의 주소에 저장된 값     { 10, 10, 10}
//				{ 20, 20, 20, 20},											//arr[2]의 주소에 저장된 값	{ 20, 20, 20, 20}
//				{ 30, 30}													//arr[3]의 주소에 저장된 값	{ 30, 30}
//				};															//};
		//arr[3].length의 길이는 2
		
		
//		[5-3] 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오
//		
//		int[] arr = {10, 20, 30, 40, 50};									//int형의 1차원 arr을 생성하고 그 값을 {10,20,30,40,50}이라고 초기화
//		int sum = 0;														//int타입의 sum이라는 변수에 0의 값을 초기화
//		
//		for(int i = 0; i<arr.length; i++){									//for을 돌리면서 i = 0부터 i < arr.length까지 i++증가하는 범위를 가짐
//			sum += arr[i];													//위에서 선언한 sum에 값에 모든 값을 더해서 대입하기 위한 += 연산자를 사용
//		}																	//for문의 끝맺음을 맺는 중괄호를 해줌
//		
//		System.out.println("sum="+sum);										//for문으로 계산된 sum의 값을 출력해주기 위해 써짐
		
//		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
//		int[][] arr = {														//int타입의 2차원 arr배열을 생성
//				{ 5, 5, 5, 5, 5},											//arr[0]의 주소에 저장된 값
//				{10,10,10,10,10},											//arr[1]의 주소에 저장된 값
//				{20,20,20,20,20},											//arr[2]의 주소에 저장된 값
//				{30,30,30,30,30}											//arr[3]의 주소에 저장된 값
//				};															//arr배열에 지정한 중괄호의 끝 맺음임
//				int total = 0;												//int타입의 total이라는 0의 값으로 초기화 시킴
//				float average = 0;											//float타입의 average라는 변수이름에 0의 값으로 초기화 시킴
//				
//				for(int i = 0; i < arr.length; i++){						//for문을 돌리는데 i = 0 에서 부터 i < arr.length까지 i++증가시키며 만듬
//					for( int j = 0; j < arr[i].length; j++){				//중첩 for문을 돌리기 위해서 j를 선언하고 0~arr[i].length까지 j++증가시킴
//						total += arr[i][j];									//total += arr[i][j];를 선언하여 모든 배열값의 합을 for문을 이용해 적용
//					} 														//안쪽 for문의 끝맺음 알리는 }가 들어감
//				}															//바깥쪽 for문의 끝맺음을 알리는 }가 들어감
//				average = total/(float)(arr.length*arr[i].length);			//average를 구하기 위해서 total을 분자에 넣고 분모에 arr.length*arr[i].length를 넣음 타입을 (float)로 변환
//				System.out.println("total="+total);							//total을 출력하기 위한 코드
//				System.out.println("average="+average);						//average를 출력하기 위한 코드
		
//		[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프 
//		로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오 . (이해)
//		
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};								//int타입의 ballArr이라는 배열을 생성함과 동시에 {1,2,3,4,5,6,7,8,9}의 값을 초기화시킴
//		int[] ball3 = new int[3];											//int타입의 ball3 라는 배열을 길이가 [3]만큼 생성되게 선언함
//		
//		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
//		for(int i=0; i< ballArr.length;i++) {								//for문을 돌리는데 i값이 0~ballArr.length까지 돌게 만들고 i++시킴
//			int j = (int)(Math.random() * ballArr.length);					//int타입의 j변수를 선언하고 랜덤한 숫자를 넣는데 그 범위가 ballArr.length까지 생성하게 Math.random으로 만듬
//			int tmp = 0;													//int타입의 tmp의 변수를 선언하고 0의 값을 초기화 시킴
//			
//			tmp = ballArr[i];												//초기화 시킨 tmp값에 ballArr[i]의 값을 대입시킴
//			ballArr[i] = ballArr[j];										//다시 ballArr[i]의 값에 ballArr[j]의 값을 대입시킴
//			ballArr[j] = tmp;												//ballArr[j]에 tmp의 값을 대입시킴으로서 서로의 값을 바꾸는 역할을 함
//				
//		}																	//for문을 돌리는데 끝맺음을 하기 위해 }를 사용함
//		
//		// ballArr 3 ball3 . 배열 의 앞에서 개의 수를 배열 로 복사한다
//		System.arraycopy(ballArr,0, ball3,0,3);								//계산된 (ballArr, 0, ball3, 0 , 3)을 출력시킴
//		
//		for(int i=0;i<ball3.length;i++) {									//출력함에 있어서 ball3[i]를 수월하게 출력하기 위해 for문을 사용함. 범위는 0~ball3.length까지 이고 i++시킴
//		System.out.print(ball3[i]);											//for문 안에 출력하는 코드를 입력함 sysout (ball3[i]
//		}																	//for문의 끝맺음

//		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 
//		 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//		프로그램을 완성하시오.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
//		int[] coinUnit = {500, 100, 50, 10};								//int타입의 이름이 coinUnit인 배열을 선언함과 동시에 {500,100,50,10}의 값을 초기화 시킴
//		int money = 2680;													//int타입의 money라는 변수를 선언하고 2680이라는 값을 초기화 시킴
//		System.out.println("money="+money);									//초기화 된 money값을 출력하기 위해 "money=" + money를 씀
//		for(int i=0;i<coinUnit.length;i++) {								//이문제의 동전의 수를 알기위해 for문을 돌리고 범위는 0~coinUnit.length까지 돌리고 i++시킴
//			int result = 0;													//for문 안에 새로운 변수를 만들기 위해 int타입의 result라는 이름으로 0을 초기화 시킴
//			result = money/coinUnit[i];										//result라는 변수에 money/coinUnit[i]라는 공식을 넣어서 money값에 초기화된 값으로 동전의 단위를 나누어줌
//			money -= (result*coinUnit[i]);									//그리고 money의 값에 (result*coinUnit[i])을 빼면서 넣어줌 그래야 처음의 500단위를 지나서 for문이 두번째로 돌 때 가능한 조건이 됨
//			System.out.println(coinUnit[i]+"원 :" + result );				//마지막으로 coinUnit[i]을 출력하면서 + "원 : " + result의 값을 출력함
//			
//		}																	//for문의 마지막 끝맺음을 하기위해서 }을 사용함

//		[5-7] 문제 5-6  에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//		금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//		돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면 거스름돈을 지불
//		한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣어서 
//		프로그램을 완성하시오.
//
//		
//		if(args.length!=1) {												//if문을 돌리고 (args.length!=1)이라는 조건을 둠
//			System.out.println("USAGE: java Exercise5_7 3120");				//"USAGE: java Exercise5_7 3120"을 출력을함
//			System.exit(0);													//System.exit(0)으로 프로그램을 종료시킴
//			}																//if문의 끝맺음을 }로 함
//		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.				
//		int money = Integer.parseInt(args[0]);								//int형의 money라는 변수를 선언하고 Integer.parseInt(args[0]);을 초기화 시킴
//		
//		System.out.println("money="+money);									//초기화된 money의 값을 보여주는 출력코드를 씀
//		
//		int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위					//동전단위를 나타내주는 int형 배열을 선언하고 변수의 이름 coinUnit이고 값은 {500,100,50,10}을 넣음
//		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수							//단위별 동전의 개수를 나타내주기 위해서 int형 배열을 선언하고 변수의 이름은 coin이고 값은 {5,5,5,5}을 넣음
//		
//		for(int i=0;i<coinUnit.length;i++) {								//for문을 생성하면서 범위는 0에서 부터 coinUnit.length까지 돌림(i++)
//			int coinNum = 0;												//int형 변수를 선언(coinNUM)그리고 0으로 초기화 시킴 (이유는 for이 돌면서 사용하게 될 임의의 변수임)
//		
//			// 1. 금액(money) 동전단위로 나눠서 필요한 동전의 개수 (coinNum) 를 구한다.
//			coinNum = money/coinUnit[i];				////				//coinNum = money/coinUnit[i]; : 금액을 동전단위로 나워서 필요한 동전의 개수(coinNum)를 구한 것 
//			
//			// 2. coin coinNum . 배열 에서 만큼의 동전을 뺀다
//			// ( coin .) 만일 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다			
//			if(coin[i] >= coinNum) {                 	////				//if(조건절)을 사용해서 coin[i]>=coinNum일 때의 상황을 설명함
//				coin[i] -= coinNum;						////				//그 상황에서는 coin[i] -= coinNum이어야 단위별 동전의 개수에 남은 동전의 수를 알수가 있음 
//			} else {									////				//else를 이용하여 나머지 상황을 설명함
//				coinNum = coin[i];						////				//coinNum에다가 coin[i]를 넣어줌으로서 마지막에 for이 돌 때 한계 까지 계산을 하고 남은 값을 넘겨줄수 있음
//				coin[i] = 0;							////				coin[i]값에다가 0을 집어넣어서 단위별 동전에는 남아있는 동전이 없다고 말해줌
//			}																//else구문의 마지막 끝맺음으로 }를 이용
//			
//			// 3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다
//			money -= coinNum*coinUnit[i];   ///////////						//for문이 다 돌고 두번째 for이 돌아갈 때 금액을 빼주면서 넘겨줌 money -= coinNum*coinUnit[i];
//			
//			System.out.println(coinUnit[i]+"원 : "+coinNum); 				//coinUnit[i]+"원 : "+coinNum을 출력을 함
//		}																	//for문의 끝맺음으로 }사용함
//			
//		if(money > 0) {														//출력할 때의 결과를 구분하기 위해서 if문을 생성하고 money값이 0보다 큰경우를 생성함
//			System.out.println("거스름돈이 부족합니다 .");						//"거스름돈이 부족합니다."라고 출력함 
//			System.exit(0); // . 프로그램을 종료한다								//System.exit(0);프로그램을 종료시키는 코드
//		}																	//출력할 때 쓰인 if 의 마지막 끝맺음 } 사용
//			
//		System.out.println("=남은 동전의 개수 ="); 								//"=남은 동전의 개수="를 출력함
//		
//		for(int i=0;i<coinUnit.length;i++) {								//for문을 생성하여 남은 동전의 개수를 배열로서 표현 (범위는 0에서 부터 coinUnit.length 까지 i++)
//				System.out.println(coinUnit[i]+"원 :"+coin[i]); 				//배열과 for문은 상호관계가 좋은 것을 활용하여 coinUnit[i]+"원 :"+coin[i]이라고 출력함
//			}																//남은 동전 개수를 for으로 표현했는데 그 for문의 끝맺음을 }이라고 씀

		
//		[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//		을 찍어서 그래프를 그리는 프로그램이다 에 알맞은 코드를 넣어서 완성하시오 . (1)~(2) .
//	
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };							//int형의 answer이라는 이름으로 배열을 선언함과 동시에 {1,4,4,3,1,4,4,2,1,3,2}라고 초기화 시킴
//		int[] counter = new int[4];											//int형의 counter이라는 이름으로 배열을 선언하고 배열의 길이가 4인 배열을 만듬
//		for(int i=0; i < answer.length;i++) {								//생성된 배열을 이용하기 위해서 for문을 이용하고 범위는(0~anser.length까지 i++)로 지정함
//			counter[answer[i] - 1]++;										//for문 안에 counter[answer[i] -1]++;을 함으로서 answer의 배열 길이에서 -1한것 만큼 counter배열을 증가시킴
//		}																	//생성된 for문의 끝맺음을 하기 위해 }를 사용함
//		for(int i=0; i < counter.length;i++) {								//for문을 하나더 돌려서 범위는 (0에서 부터 counter.length까지 이며 i++)로 지정함
//			System.out.println(counter[i]);									//counter[i]를 출력하기 위한 코드
//			for(int j = 0; j < counter[i]; j++){							//중첩for문을 이용하여 범위는(0에서 부터 counter[i]까지 ㅑ++로 지정함
//				System.out.print("*");										//중첩for문에서 안쪽 for문에다가 "*"을 출력(print)하게 함
//			}																//안쪽 for문의 끝맺음}
//					
//			System.out.println();											//출력된 결과를 줄을 바꾸기 위해서 sysout을 함
//		}																	//바깥쪽 for문의 끝맺음을 }함
		
		
//		[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
//
//		char[][] star = {													//주어진 문제가 '*'을 출력하는 문제이기에 char타입의 2차원 배열을 생성하고 이름은 star이라고 함
//				{'*','*',' ',' ',' '},										//star[0]에다가 {'*','*','','',''}을 집어넣음
//				{'*','*',' ',' ',' '},										//star[1]에다가 {'*','*','','',''}을 집어넣음
//				{'*','*','*','*','*'},										//star[2]에다가 {'*','*','*','*','*'}을 집어넣음
//				{'*','*','*','*','*'}										//star[3]에다가 {'*','*','*','*','*'}을 집어넣음
//				};															//char형 2차원 배열에 끝맺음}
//				
//		char[][] result = new char[star[0].length][star.length];            //char타입의 2차원 배열 result를 선언하고 new char[star[0].length][star.length]; 을 함
//				for(int i=0; i < star.length;i++) {							//중첩for문을 돌리기 위해서 바깥쪽 for문의 범위를 지정함(범위는 0~star.length까지 i++
//					for(int j=0; j < star[i].length;j++) {					//안쪽 for문을 돌리면서 범위는 0~star[i].length까지 j++시킴
//						System.out.print(star[i][j]);						//star[i][j]를 출력하기위해 코드를 씀 (print)
//					}														//안쪽 for문을 끝맺음을 지음}
//					System.out.println();									//바깥쪽 for문 영역에서 줄바꿈을 해주기 위해서 sysout함
//				}															//바깥쪽 for문을 끝맺음 짓기 위해 }를 사용함
//				System.out.println();										//for문은 위에서 끝났고 줄바꿈을 해주기 위해서 sysout을 함
//				for(int i=0; i < star.length;i++) {							//새로운 중첩for문을 만들기 위해 범위는 (0에서 부터 star.length까지 i++)지정함
//					for(int j=0; j < star[i].length;j++) {					//안쪽 for문의 범위를 0에서 부터 star[i].length까지 j++ 지정함
//						int a = j;											//문제를 돌리기 위해서 새로운 int타입의 a 변수를 선언하고 j값으로 초기화 시킴
//						int b = star.length-1-i;							//int타입의 b 변수를 선언하고 star.length-1-i를 초기화 시킴
//						result[a][b]=star[i][j];							//result[a][b]에다가 star[i][j]를 대입 시킴
//					}														//안쪽 for문의 끝맺음
//				}															//바깥쪽 for문의 끝맺음
//				for(int i=0; i < result.length;i++) {						//또다른 for문을 생성하고 범위는 0에서부터 result.length까지이며 i++시킴
//					for(int j=0; j < result[i].length;j++) {				//안쪽 for문을 생성하고 범위는 0에서 부터 result[i].length까지이며 j++시킴
//						System.out.print(result[i][j]);						//result[i][j]값을 출력하기위해 쓰인 문장 print
//					}														//안쪽 for문의 끝맺음 } 
//					System.out.println();									//sysout으로 줄바꿈을 실행함
//				}															//바깥쪽 for문을 끝맺음 짓기 위해 }

//		[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//		(1)에 알맞은 코드를 넣어서 완성하시오. 
//
//		char[] abcCode =													//char의 이름이 abcCode인 배열을 생성함
//			{ '`','~','!','@','#','$','%','^','&','*',						//배열에 직접 값을 넣기 위해서 {를 열고 {'`','~','!','@','#','$','%','^','&','*',를 함
//			'(',')','-','_','+','=','|','[',']','{',						//'(',')','-','_','+','=','|','[',']','{',
//			'}',';',':',',','.','/'};										//'}',';',':',',','.','/'};
//			// 0 1 2 3 4 5 6 7 8 9											
//			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};		//char타입의 numCode 배열을 선언함과 동시에{'q','w','e','r','t','y','u','i','o','p'};를 대입함
//			String src = "abc123";											//String 타입의 src를 선언하고 "abc123"을 대입시킴
//			String result = "";												//String 타입의 result를 선언하고 ""값으로 초기화 시킴
//			// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장		
//			for(int i=0; i < src.length();i++) {							//문제를 풀기 위해서 for문을 생성하는데 범위가 0에서부터 src.length()이며 i++을 함
//				char ch = src.charAt(i);									//char타입의 ch라는 이름에 src.charAt(i)를 함 : 이유는 for문을 돌려서 나오는 index값을 추출하기 위함
//				if('a' <= ch && ch <= 'z'){									//조건절 if문을 거는데 조건으로 소문자 a부터 소문자 z 까지 임
//					result += abcCode[ch - 'a'];							//result의 값에 abcCode[ch - 'a']값을 더해서 대입함
//				}else{														//else 조건을 거는데 이는 위의 if문과 반대되는 조건이 실행됨
//					result += numCode[ch - '0'];							//result값에 numCode[ch - '0']값을 더해서 대입함
//				}															//else문의 끝맺음
//			}																//for문의 끝맺음}
//			System.out.println("src:"+src);									//sysout으로 src를 출력시킴
//			System.out.println("result:"+result);							//sysout으로 result를 출력시킴

//		[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열  
//		의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
//		에 알맞은 코드를 넣어서 완성하시오.
//
//		int[][] score = {													//int타입의 score라는 이름으로 2차원 배열을 생성함
//				{100, 100, 100}												//int[0]에 {100, 100, 100}
//				, {20, 20, 20}												//int[0]에 {20, 20, 20}
//				, {30, 30, 30}												//int[0]에 {30, 30, 30}
//				, {40, 40, 40}												//int[0]에 {40, 40, 40}
//				, {50, 50, 50}												//int[0]에 {50, 50, 50}
//				};															//int[][]에 마지막 끝맺음};
//		int[][] result = new int[score.length+1][score[0].length+1];		//int타입의 result라는 2차원 배열을 선언함과 동시에 길이를[score.length+1][score[0].length+1] 해줌
//			for(int i=0; i < score.length;i++) {							//for문을 생성하는데 범위는 0에서 부터 score.length까지이고 i++해줌
//				for(int j=0; j < score[i].length;j++) {						//중첩 for문을 생성하기 위해서 만들고 범위는 0에서 부터 score[i].length까지이며 j++임
//					result[i][j] = score[i][j]; 							//result[i][j]값에 score[i][j]값을 대입시킴
//					result[i][score[0].length] += result[i][j];				//result[i][score[0].length]값에 result[i][j];를 더해서 대입시킴
//					result[score.length][j] += result[i][j];				//result[score.length][j]값에 result[i][j];를 더해서 대입시킴
//					result[score.length][score[0].length] += result[i][j];	//result[score.length][score[0].length]값에 result[i][j];를 더해서 대입시킴
//				}															//안쪽 for문의 끝맺음
//			}																//바깥쪽 for문의 끝맺음
//			for(int i=0; i < result.length;i++) {							//또다른 for문을 생성해서 출력하기 위해서 범위는(0에서 부터 result.length까지 i++)
//				for(int j=0; j < result[i].length;j++) {					//또다른 안쪽 for문을 생성하기 위한(범위는 0에서 부터 result[i].length까지 j++)
//					System.out.printf("%4d",result[i][j]);					//"%4d",result[i][j]를 printf로 출력함
//				}															//안쪽 for문의 끝맺음
//				System.out.println();										//sysout으로 줄을 바꿈
//			}																//바깥쪽 for문의 끝맺음}

//		[5-12] 예제 5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
//
//		Q1. chair의 뜻은 ? dmlwk 
//		틀렸습니다 정답은 의자입니다 .
//		Q2. computer의 뜻은 ?  컴퓨터
//		정답입니다.
//		Q3. integer의 뜻은 ?  정수
//		정답입니다.
//		전체 문제 3중 2문제 맞추셨습니다 .
			
//		String[][] words = {														//String타입의 2차원 배열을 생성하고 words라는 이름을 선언
//							{"chair"," "}, // words[0][0], words[0][1] 의자			//{"chair"," "}     words[0][0], words[0][1] 의자
//							{"computer"," "}, // words[1][0], words[1][1] 컴퓨터		//{"computer"," "}  words[1][0], words[1][1] 컴퓨터
//							{"integer"," "} // words[2][0], words[2][1] 정수			//{"integer"," "}    words[2][0], words[2][1] 정수
//							};
//		int score = 0; // 맞춘 문제의 수를 저장하기 위한 변수									//맞춘 문제의 수를 저장하기 위한 변수 score를 int형으로 선언하고 초기화 시킴
//		
//		Scanner scanner = new Scanner(System.in);									//Scanner를 사용하기 위해Scanner scanner = new Scanner(System.in);
//		
//		for(int i=0;i<words.length;i++) {											//for문을 생성하고 범위는 (0에서 부터 words.length까지 이며 i++임)
//			
//			System.out.printf("Q%d. %s의 뜻은 ?", i+1, words[i][0]); 					//printf로 "Q%d. %s의 뜻은 ?", i+1, words[i][0]을 출력
//			
//			String tmp = scanner.nextLine();										//String 타입의 tmp를 선언하고 scanner.nextLine()을 대입함
//			
//			if(tmp.equals(words[i][1])) {											//if의 조건절을 이용하여 tmp.equals(words[i][1])  tmp와 words[i][1]이 같다면 이라고 조건함
//				System.out.printf("정답입니다 .%n%n"); 								//printf로 "정답입니다 .%n%n"
//				score++;															//위치는 if문의 안쪽이고 score++로 score의 개수를 증가시킴
//			}else {																	//else를 이용하여 
//				System.out.printf("틀렸습니다.정답은 %s입니다.%n%n",words[i][1]); 		//나머지 경우를 printf"틀렸습니다.정답은 %s입니다.%n%n",words[i][1]로 출력시킴
//			}																		//else구문의 끝맺음
//		} // for																	//for문의 끝맺음
//		
//		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.%n", words.length, score);		//printf를 이용해서 "전체 %d문제 중 %d문제 맞추셨습니다.%n", words.length, score를 출력시킴
				

		
		
		

//		[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와 .
//		같이 동작하도록 예제의 빈 곳을 채우시오.
//		
//		String[] word = { "television", "computer", "mouse", "phone" };				//String타입의 word라는 이름으로 배열을 선언하고 { "television", "computer", "mouse", "phone" };값으로 초기화함
//		Scanner s = new Scanner(System.in);											//Scanner s = new Scanner(System.in);
//		for(int i=0;i<word.length;i++) {											//for문을 생성하고 범위는 0에서 부터 word.length까지 i++임
//			char[] question = word[i].toCharArray(); // String char[] 을 로 변환		//char형 question배열을 생성함과 동시에 word[i].toCharArray(); : String 을 char[]로 변환
//			for(int j=0;j<question.length;j++) {									//중첩for문(안쪽for문)을 생성하는데 범위는 0에서 부터 question.length까지 이며 j++ 
//				int idx = (int)(Math.random() * question.length);					//int형 idx라는 변수를 선언함과 동시에 랜덤한 값을 넣어주기 위해서 (int)(Math.random() * question.length);
//				char tmp = question[i];												//char타입의 tmp변수를 선언하고  question[i];를 대입함
//				question[i] = question[idx];										//question[i]에다가 question[idx]의 값을 대입함
//				question[idx] = tmp;												//question[idx]에다가 다시 tmp를 넣어서 결국에 서로의 값을 바꾸는 역할을 함
//			}																		//중첩 for문 중 안쪽 for문의 끝맺음 }
//			System.out.printf("Q%d. %s의 정답을 입력하세요.>", 							//정답을 입력하라는 것을 결과로 출력해주기 위해서 printf로 "Q%d. %s의 정답을 입력하세요.>", i+1, new String(question) 
//			i+1, new String(question));												//위의 내용
//			String answer = scanner.nextLine();										//String타입의 answer를 선언하고 scanner.nextLine()을 넣어줌 이는 사용자가 입력한 값을 넣기 위함임
//			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
//			if(word[i].equals(answer.trim()))										//if조건절을 사용하여 맞았음을 표현해주는 조건인 (word[i].equals(answer.trim())가 들어감
//				System.out.printf("맞았습니다.%n%n"); 									//맞았다는 것을 출력해주기 위해서 printf로 System.out.printf("맞았습니다.%n%n");
//			else{																	//else를 이용해서 틀렸음을 표현해주기 위해서 {을 시작하고
//				System.out.printf("틀렸습니다.%n%n"); 									//System.out.printf로 "틀렸습니다.%n%n"를 출력하고 %n%n으로 공백을 만들어줌
//			}																		//else구문이 끝맺을 하는 }
//		}																			//for문이 끝맺음을 하는 }
		
		
	}

}
