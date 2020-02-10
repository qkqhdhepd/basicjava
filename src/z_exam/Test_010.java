package z_exam;

public class Test_010 {

	public static void main(String[] args) {
//		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 
//		 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//		프로그램을 완성하시오.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money="+money);
//		for(int i=0;i<coinUnit.length;i++) {
//			int result = 0;
//			result = money/coinUnit[i];
//			money -= (result*coinUnit[i]);
//			System.out.println(coinUnit[i]+"원 :" + result );
//			
//		}

//		[5-7] 문제 5-6  에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//		금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//		돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면 거스름돈을 지불
//		한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣어서 
//		프로그램을 완성하시오.
//
		
		if(args.length!=1) {
			System.out.println("USAGE: java Test_01 3120");    
			System.exit(0);
			}
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
		
			// 1. 금액(money) 동전단위로 나눠서 필요한 동전의 개수 (coinNum) 를 구한다.
			coinNum = money/coinUnit[i];				////
			
			// 2. coin coinNum . 배열 에서 만큼의 동전을 뺀다
			// ( coin .) 만일 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다
			if(coin[i] >= coinNum) {                 	////
				coin[i] -= coinNum;						////	
			} else {									////	
				coinNum = coin[i];						////
				coin[i] = 0;							////
			}
			
			// 3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다
			money -= coinNum*coinUnit[i];   ///////////
			
			System.out.println(coinUnit[i]+"원 : "+coinNum); 
		}
			
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다 ."); 
			System.exit(0); // . 프로그램을 종료한다
		}
			
		System.out.println("=남은 동전의 개수 ="); 
		
		for(int i=0;i<coinUnit.length;i++) {
				System.out.println(coinUnit[i]+"원 :"+coin[i]); 
		}
		
		
		
		
	}

}
