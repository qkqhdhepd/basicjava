package game;

import java.util.*;

public class Town {

	
	static String[] map = new String[]{null,null,null,null};
	
	//퀘스트
	static int quest = 0;
	static int questItem = 1;
	static int sord = 0;
	
	
	//무기상점
	//기본적인 무기들(변수)
	String[] item_mugi = {
			"쓸만한 단검",
			"기사의 검",
			"롱소드"	
	};
	
	
	
	//방어구 상점
	//기본적인 방어구들(변수
	String[] item_bang = {
			"가죽조끼",
			"기사의 방패",
			"전쟁의 갑옷"	
	};
	
	//포션 상점
	//기본적인 포션들
	String[] item_portion = {
			"빨간약",
			"파란약",
			"속도의 영약"	
	};
	
	//마을회관
	//기본적인 옵션들(NPC, 기능)
	
	
	
	//scanner 메서드 호출
	Scanner s = new Scanner(System.in);
	//응답 변수
	int answer;
	
	
	
//	---------------------------------------------------------------------------------------------
	//무기 상점 메서드
	void mugi(){
		
		do{
			System.out.println("무기 상점에 오신 것을 환영합니다.");
			System.out.println("1. 판매물품을 확인한다.");
			System.out.println("2. 상점에서 나간다.");
			System.out.println("3. 대화를 한다.");
			System.out.println(("4. 물건을 판매한다."));
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				do{
					System.out.println("현재 잔액은 " + character.money + "입니다.");
					
					for(int i = 0; i < item_mugi.length; i++){
						System.out.println(i+1 + ". "+item_mugi[i]);
					}
					System.out.println("어떤 무기를 구매하시겠습니까?(1,2,3)");
					answer = Integer.parseInt(s.nextLine());
					if(answer == 1){
						int price = (answer-1)*1000+1000;						//가격 함수
						System.out.println(item_mugi[answer-1] + "을 구매하시겠습니까?(1,2)"+ "(가격 : "+price+")");   
						answer = Integer.parseInt(s.nextLine());															
						if(answer == 1 && character.money > price){
							System.out.println(item_mugi[answer-1] + "를 구매하셨습니다.");
							for(int i = 0; i < character.baguni.length; i++) {
								if(character.baguni[i] == null) {
									character.baguni[i] = item_mugi[answer-1];
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}
					}else if(answer == 2){
						int price = (answer-1)*1000+1000;
						System.out.println(item_mugi[answer-1] + "을 구매하시겠습니까?(1,2)" + "(가격 : "+price+")");
						answer = Integer.parseInt(s.nextLine());
						
						if(answer == 1 && character.money > price ){
							System.out.println(item_mugi[answer] + "를 구매하셨습니다.");
							for(int i = 0; i < character.baguni.length; i++) {
								if(character.baguni[i] == null) {
									character.baguni[i] = item_mugi[answer];			//answer의 숫자가 달라짐
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price ){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}
					}else if(answer == 3){
						int price = (answer-1)*1000+1000;
						System.out.println(item_mugi[answer-1] + "을 구매하시겠습니까?(1,2)"+ "(가격 : "+price+")");
						answer = Integer.parseInt(s.nextLine());						
						if(answer == 1 && character.money > price){
							System.out.println(item_mugi[answer+1] + "를 구매하셨습니다.");
							for(int i = 0; i < character.baguni.length; i++) {
								if(character.baguni[i] == null) {
									character.baguni[i] = item_mugi[answer+1];			//answer의 숫자가 달라짐
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}				
					}
				}while(true);
				
			}else if(answer == 2){
				System.out.println("언제든지 들려주게나~");
				break;
			}else if(answer == 3){
				System.out.println("이 무기 상점은 내가 물려받은 제산일세. 우리 가게는 최상급 물건만 상대한다고...");
				continue;
			}else if(answer == 4){
				for(int i = 1; i <= character.baguni.length; i++) {
					if(character.baguni[i] != null) {
						System.out.println(i+". "+character.baguni[i]);
					}
				}System.out.println("판매할 물건을 선택해주세요.(판매금액 = 1000원)");
				answer = Integer.parseInt(s.nextLine());
				character.baguni[answer-1] = null;
				System.out.println(character.baguni[answer-1] + "를 판매하였습니다." + "+1000원");
				character.money += 1000;
				for(int i = 0; i < character.baguni.length; i++) {
					if(character.baguni[i] == null) {
						System.out.println("판매할 물건이 없습니다.");
						break;
					}
				}
				
				
			}else{
				System.out.println("1,2,3,4 중에 입력해주세요.");
				continue;
			}
			
		}while(true);
		
		
	}
	
	//방어구 상점 메서드
	void bang(){
		
		do{
			System.out.println("방어구 상점에 오신 것을 환영합니다.");
			System.out.println("1. 판매물품을 확인한다.");
			System.out.println("2. 상점에서 나간다.");
			System.out.println("3. 대화를 한다.");
			System.out.println(("4. 물건을 판매한다."));
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				do{
					System.out.println("현재 잔액은 " + character.money + "입니다.");
					
					for(int i = 0; i < item_bang.length; i++){
						System.out.println(i+1 + ". "+item_bang[i]);
					}
					System.out.println("어떤 방어구를 구매하시겠습니까?(1,2,3)");
					answer = Integer.parseInt(s.nextLine());
					if(answer == 1){
						int price = (answer-1)*1000+1000;						//가격 함수
						System.out.println(item_bang[answer-1] + "을 구매하시겠습니까?(1,2)"+ "(가격 : "+price+")");   
						answer = Integer.parseInt(s.nextLine());															
						if(answer == 1 && character.money > price){
							System.out.println(item_bang[answer-1] + "를 구매하셨습니다.");
							for(int i = 0; i < character.baguni.length; i++) {
								if(character.baguni[i] == null) {
									character.baguni[i] = item_bang[answer-1];
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}
					}else if(answer == 2){
						int price = (answer-1)*1000+1000;
						System.out.println(item_bang[answer-1] + "을 구매하시겠습니까?(1,2)" + "(가격 : "+price+")");
						answer = Integer.parseInt(s.nextLine());
						
						if(answer == 1 && character.money > price ){
							System.out.println(item_bang[answer] + "를 구매하셨습니다.");
							for(int i = 0; i < character.baguni.length; i++) {
								if(character.baguni[i] == null) {
									character.baguni[i] = item_bang[answer];			//answer의 숫자가 달라짐
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price ){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}
					}else if(answer == 3){
						int price = (answer-1)*1000+1000;
						System.out.println(item_bang[answer-1] + "을 구매하시겠습니까?(1,2)"+ "(가격 : "+price+")");
						answer = Integer.parseInt(s.nextLine());						
						if(answer == 1 && character.money > price){
							System.out.println(item_bang[answer+1] + "를 구매하셨습니다.");
							for(int i = 0; i < character.baguni.length; i++) {
								if(character.baguni[i] == null) {
									character.baguni[i] = item_bang[answer+1];			//answer의 숫자가 달라짐
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}				
					}
				}while(true);
				
			}else if(answer == 2){
				System.out.println("언제든지 들려주게나~");
				break;
			}else if(answer == 3){
				System.out.println("방어구 상점을 운영한지 어언 40년 이제는 눈감고도 좋은 물건을 구별하지....");
				continue;
			}else if(answer == 4){
				for(int i = 1; i <= character.baguni.length; i++) {
					if(character.baguni[i] != null) {
						System.out.println(i+". "+character.baguni[i]);
					}
				}System.out.println("판매할 물건을 선택해주세요.(판매금액 = 1000원)");
				answer = Integer.parseInt(s.nextLine());
				character.baguni[answer-1] = null;
				System.out.println(character.baguni[answer-1] + "를 판매하였습니다." + "+1000원");
				character.money += 1000;
				for(int i = 0; i < character.baguni.length; i++) {
					if(character.baguni[i] == null) {
						System.out.println("판매할 물건이 없습니다.");
						break;
					}
				}
				
				
			}else{
				System.out.println("1,2,3,4 중에 입력해주세요.");
				continue;
			}
			
		}while(true);
		
	}
	
	///포션 상점 메서드
	void portion(){
		
		do{
			System.out.println("물약 상점에 오신 것을 환영합니다.");
			System.out.println("1. 판매물품을 확인한다.");
			System.out.println("2. 상점에서 나간다.");
			System.out.println("3. 대화를 한다.");
			System.out.println(("4. 물건을 판매한다."));
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				do{
					System.out.println("현재 잔액은 " + character.money + "입니다.");
					
					for(int i = 0; i < item_portion.length; i++){
						System.out.println(i+1 + ". "+item_portion[i]);
					}
					System.out.println("어떤 물약을 구매하시겠습니까?(1,2,3)");
					answer = Integer.parseInt(s.nextLine());
					if(answer == 1){
						int price = (answer-1)*1000+1000;						//가격 함수
						System.out.println(item_portion[answer-1] + "을 구매하시겠습니까?(1,2)"+ "(가격 : "+price+")");   
						answer = Integer.parseInt(s.nextLine());															
						if(answer == 1 && character.money > price){
							System.out.println(item_portion[answer-1] + "를 구매하셨습니다.");
							for(int i = 0; i < character.mul.length; i++) {
								if(character.mul[i] == null) {
									character.mul[i] = item_portion[answer-1];
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}
					}else if(answer == 2){
						int price = (answer-1)*1000+1000;
						System.out.println(item_portion[answer-1] + "을 구매하시겠습니까?(1,2)" + "(가격 : "+price+")");
						answer = Integer.parseInt(s.nextLine());
						
						if(answer == 1 && character.money > price ){
							System.out.println(item_portion[answer] + "를 구매하셨습니다.");
							for(int i = 0; i < character.mul.length; i++) {
								if(character.mul[i] == null) {
									character.mul[i] = item_portion[answer];			//answer의 숫자가 달라짐
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price ){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}
					}else if(answer == 3){
						int price = (answer-1)*1000+1000;
						System.out.println(item_portion[answer-1] + "을 구매하시겠습니까?(1,2)"+ "(가격 : "+price+")");
						answer = Integer.parseInt(s.nextLine());						
						if(answer == 1 && character.money > price){
							System.out.println(item_portion[answer+1] + "를 구매하셨습니다.");
							for(int i = 0; i < character.mul.length; i++) {
								if(character.mul[i] == null) {
									character.mul[i] = item_portion[answer+1];			//answer의 숫자가 달라짐
									break;
								}							
							}
							character.money -= price;
							break;
						}else if(answer == 1 && character.money < price){
							System.out.println("돈이 부족합니다.");
							break;
						}else{
							break;
						}				
					}
				}while(true);
				
			}else if(answer == 2){
				System.out.println("언제든지 들려주게나~");
				break;
			}else if(answer == 3){
				System.out.println("우리 가게는 최고의 마법사가 만든 물약들로 구성되어 있다구...");
				continue;
			}else if(answer == 4){
				for(int i = 1; i <= character.baguni.length; i++) {
					if(character.baguni[i] != null) {
						System.out.println(i+". "+character.baguni[i]);
					}
				}System.out.println("판매할 물건을 선택해주세요.(판매금액 = 1000원)");
				answer = Integer.parseInt(s.nextLine());
				character.baguni[answer-1] = null;
				System.out.println(character.baguni[answer-1] + "를 판매하였습니다." + "+1000원");
				character.money += 1000;
				for(int i = 0; i < character.baguni.length; i++) {
					if(character.baguni[i] == null) {
						System.out.println("판매할 물건이 없습니다.");
						break;
					}
				}
				
				
			}else{
				System.out.println("1,2,3,4 중에 입력해주세요.");
				continue;
			}
			
		}while(true);
		
	}
	
	//마을회관
	static void Map(){
		for(int i = 0; i < map.length; i++) {
			if(map[i] != null) {
				System.out.println(i+1 + ". "+map[i]);
			}else if(map[0] == null){
				System.out.println("현재 나타나는 맵이 없습니다.");
				break;
			}
		}
		
	}
	
	
	
	
	
}
