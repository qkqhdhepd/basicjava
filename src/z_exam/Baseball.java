package z_exam;
import java.util.Arrays;
import java.util.Scanner;
public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임을 만들어주세요.
		
//		
//		int a = (int)(Math.random() *9)+1;
//		int b = 1;
//		int c = 1;
//		int tmp = 0;
//		int input = 0;
//		
//		while(a != (tmp = (int)(Math.random() *9)+1)){
//			b = tmp;
//		}
//		while(a != (tmp = (int)(Math.random() *9)+1) && b != tmp){
//			c = tmp;
//		}
//		int number = a*100 + b*10 + c;	
//		
//		System.out.println(number);
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		while( true ) {
//			int s1 = 0;
//			int b1 = 0;
//			int o1 = 0;
//			System.out.println("중복되지 않는 3자리수를 입력하세요:");
//			input = scanner.nextInt();
//			int x = input / 100;
//			int y = input % 100 / 10;
//			int z = input % 10;
//			if(x == a){
//				s1++;
//			}
//			if(y == b){
//				s1++;
//			}
//			if(z == c){
//				s1++;
//			}
//			if(x == b || x  == c){
//				b1++;
//			}else if(x == a && (x == b || x  == c)){
//				b1++;
//				
//			}
//			if(y == a || y  == c){
//				b1++;
//			}else if(y == b && (x == b || x  == c)){
//				b1++;
//				
//			}			
//			if(z == a || z  == b){
//				b1++;
//			}else if(z == c && (x == b || x  == c)){
//				b1++;
//				
//			}
//			if(s1 == 0 && b1 == 0){
//				o1 = 3;
//			}
//			System.out.println(s1 + "S, " + b1 + "B, " + o1 + "O");
//			if(s1 == 3){
//				System.out.println("쓰리 스트라이크 ! 잘 하셨습니다.");
//				break;
//			}
//		}
//		
//		-------------------------------------------------------------------
		//배열로  야구게임 만들기
//		
//
//		int[] com = new int[3];
//		int[] user = new int[3];
//		int tmp = 0;
//		int input = 0;
//		while(com[0] != (tmp = (int)(Math.random() *9)+1)){
//			com[1] = tmp;
//		}
//		while(com[0] != (tmp = (int)(Math.random() *9)+1) && com[1] != tmp){
//			com[2] = tmp;
//		}
//		int number = com[0]*100 + com[1]*10 + com[2];
//		
//		System.out.println(number);
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true){
//			int[] sbo = new int[3];
//			System.out.println("중복되지 않는 3자리수를 입력하세요.");
//			input = scanner.nextInt();
//			for(int i = 0; i<sbo.length; i++){
//				if(i == 0){
//					sbo[i] = input/100;
//				}else if(i == 1){
//					sbo[i] = input %100/10;
//				}else if(i == 2){
//					sbo[i] = input % 10;
//				}
//				
//			}
//			
//			for(int i = 1; i < 3; i++){
//				if(user[i] == com[i]){
//					sbo[0]++;
//				}
//				if(user[0] == com[1] || user[0] == com[2]){
//					sbo[1]++;
//				}else if(user[0] == com[0] && user[0] == com[1] || user[0] == com[1]){
//					sbo[1]++;
//				}
//				if(user[1] == com[0] || user[1] == com[2]){
//					sbo[1]++;
//				}else if(user[1] == com[0] && user[1] == com[2] || user[1] == com[2]){
//					sbo[1]++;
//				}if(user[2] == com[0] || user[2] == com[1]){
//					sbo[1]++;
//				}else if(user[2] == com[2] && user[2] == com[0] || user[2] == com[0]){
//					sbo[1]++;
//				}if(sbo[0] == 0 && sbo[1] ==0){
//					sbo[2] =3;
//				}
//				System.out.println(sbo[0] + "S, " + sbo[1] + "B, " + sbo[2] + "O");
//				if(sbo[0] == 3){
//					System.out.println(("쓰리 스트라이크 ! 잘 하셨습니다."));
//					break;
//				}
//			}
//		}
//		
//		
		
	//----------------------------------------------------------------	
//		완호
//		  Scanner s= new Scanner(System.in);
//	      
//	      int[] answer = new int[3]; 
//	      for(int i =0; i<answer.length;i++){
//	         answer[i] = (int)(Math.random()*9)+1;
//	         for(int j=0; j < i ;j++){
//	            if(answer[i]==answer[j]){
//	               i--;
//	               break;
//	            }
//	         }
//	      }
//	      
//	      System.out.println("정답: "+Arrays.toString(answer));
//
//	      while (true){
//	         //result배열에 숫자입력
//	         System.out.println("숫자를 3개를 입력해주세요 : ");
//	         int[] result = new int[3];
//	         for(int i=0; i<result.length;i++){
//	            result[i] = Integer.parseInt(s.nextLine());
//	         }
//	         
//	         int str = 0;
//	         int ball = 0;
//	         int out = 0;
//	         int count =0;
//	         System.out.println(Arrays.toString(result));
//	         
//	         for(int i=0; i<result.length; i++){
//	            for(int j=0;j<answer.length;j++){
//	               if(result[i]==answer[i]){
//	                  str++;
//	                  break;
//	               }else if(result[i] ==answer[j]){
//	                  ball++;
//	               }
//	            }
//	            count++;
//	         }
//	         System.out.println(count+"차 시도 "+"str: "+ str + " ball: "+ ball+" out: "+(3-str-ball));
//	      }
//		------------------------------------------------------------------------------------------
//		sem
		
		
				int[] answer = new int[3];
				int[] input = new int[answer.length];
				
				boolean isDuplicated;
				do{
					isDuplicated = false;
					
					for(int i = 0; i < answer.length; i++){
						answer[i] = (int)(Math.random() * 9) + 1;
					}
					
					for(int i = 0; i < answer.length; i++){
						for(int j = 0; j < answer.length; j++){
							if(i != j && answer[i] == answer[j]){
								isDuplicated = true;
							}
						}
					}
				}while(isDuplicated);
				
				Scanner s = new Scanner(System.in);
				int count = 0;
				while(true){
					System.out.println(answer.length + "자리 숫자를 입력해주세요>");
					int temp = Integer.parseInt(s.nextLine());
					
					int index = input.length - 1;
					while(0 < temp){
						input[index--] = temp % 10;
						temp /= 10;
					}
					
					int strike = 0;
					int ball = 0;
					int out = 0;
					
					for(int i = 0; i < answer.length; i++){
						for(int j = 0; j < input.length; j++){
							if(answer[i] == input[j]){
								if(i == j){
									strike++;
								}else{
									ball++;
								}
							}
						}
					}
					out = answer.length - strike - ball;
					
					System.out.println(++count + "차 시도"
							+ Arrays.toString(input).replace(", ", "") + " : "
							+ strike + "S " + ball + "B " + out + "O");
					System.out.println("-------------------------");
					if(strike == answer.length){
						System.out.println("정답입니다!!");
						break;
					}
				}
			

		














		
		
		
		
		
		
		
		
		
		
		//x,y,z input의 자리순서
		
		
		//a,b,c number의 자리
		//input의 자리순서를 위해서 대입이 필요
		
		
		/*
		 * input%10					//123%10 = 3			//셋째 자리
		 * number%10				//123%10 = 3
		 * input/10%10				//123/10%10 = 2			//둘째 자리
		 * number/10%10				//123/10%10 = 2
		 * input/100				//123/100 = 1			//첫째 자리
		 * number/100
		 * 
		 */
		/*
		 * 123
		 * 100
		 * 1s 0b 0o
		 * 
		 * ball
		 * 123
		 * 312
		 * 3b
		 * input자리의 첫째자리와 number에서 첫째자리랑 비교해서 스트라이크 여부
		 * 경우의 수중 일치 하지 않은것은 out처리되지만
		 * 비교한 값이 또다른 변수에 넣어서 값이 동일한지 비교
		 * a1 == a2	다름
		 * a1 == b2	같아
		 * a1 == c2	다름
		 * b2 == a2
		 * b2 == b2
		 * b2 == c2
		 * c3 == a2
		 * c4 == b2
		 * c5 == c2
		 * 위의 경우의 수에서 맞는 것이 없다면 out처리
		 * 9가지중 1가지가 있으면 1ball
		 * input자리와 number의 자리
		 * 
		 * 
		 * 
		 * 
		 * 2스트라이크 1볼인 경우
		 * a == x	같고
		 * a == y	
		 * a == z	(같고)
		 * b == x
		 * b == y	같고
		 * b == z	같고
		 * c == x
		 * c == y	
		 * c == z
		 */
//		
//		do {
//			
//			System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//			input = Integer.parseInt(s.nextLine());
//			int x = ;
//			int y = ;
//			int z = ;
//			
//			if(input/100 == number/100 && input/10%10 ==number/10%10){
//				System.out.println("2스트라이크");
//			}else if(input/100 == number/10%10 || input/100 == number%10 ){
//				System.out.print(" "+"1볼");
//			}
//		}while(input != number);
//		
//		System.out.println("3스트라이크 정답입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while(input != number){
//			if(input%10 == number%10 || input%10%10 == number%10%10 || input/100 == number/100){
//				System.out.println("원스트라이크 입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(input%10 == number%10 && input%10%10 == number%10%10){
//				System.out.println("투스트라이크 입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(input%10%10 == number%10%10 && input/100 == number/100){
//				System.out.println("투스트라이크 입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}
//			else if(){
//				System.out.println("원 볼입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(input){
//				System.out.println("투 볼입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(){
//				System.out.println("쓰리 볼입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(){
//				System.out.println("원 아웃입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(){
//				System.out.println("투 아웃입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}else if(){
//				System.out.println("쓰리 아웃입니다.");
//				System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//				input = Integer.parseInt(s.nextLine());
//			}
			
			
//		}System.out.println("정답입니다.나이스~");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while(input%10 == number%10 || input%10%10 == number%10%10 || input/100 == number/100){
//			System.out.println("원스트라이크 입니다.");
//			System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//		}
//		while(input%10 == number%10 && input%10%10 == number%10%10){
//			System.out.println("투스트라이크 입니다.");
//			System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//		}
//		while(input%10%10 == number%10%10 && input/100 == number/100){
//			System.out.println("투스트라이크 입니다.");
//			System.out.print("중복되지않는 세자리의 3자리의 번호를 입력하세요:");
//		}
//		while(input == number){
//			System.out.println("정답을 맞췄습니다.");
//			break;
//		}
		
		

	
	
//		if(number == input){
//			System.out.println("정답을 맞췄습니다.");
//		}else if(input%10 == input%10 || input%10%10 == input%10%10 || input/100 == input/100){											//백의자리구분하기
//			System.out.println("원스트라이크 입니다.");
//        }else if(input%10 == input%10 && input%10%10 == input%10%10){
//        	System.out.println("투스트라이크 입니다.");
//		}else if(input%10%10 == input%10%10 && input/100 == input/100){
//			System.out.println("투스트라이크 입니다.");
//		}
		
	
	
	
	
	
	}
}
