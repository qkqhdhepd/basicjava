package game;

import java.util.Scanner;

public class Dunjeon extends Town{
	//베리우스던전 부모
	//응답
	static Scanner s = new Scanner(System.in);
	static int answer;
	private static Scanner sc;
	
	static String name;
	static int hp;
	static int armor;
	static int str;
	static int mag;

	
	
	
	static void level1(){

		//잡몹 능력치
		name = "아크세데스";
		hp = 100;
		armor = 0;
		str = 10;
		mag = 0;
		System.out.println(name + "을(를) 만났다." + "hp : " + hp);
		do{
			if(hp <= 0){
				System.out.println("몬스터를 물리쳤습니다.(str +1)");
				character.str += 1;
				break;
			}
			int result = str/10;
			System.out.println(name + "의 현재 체력 : " + hp);
			System.out.println(character.name + "의 현재 체력 : "+character.hp);
			character.skill();
			System.out.println("번호를 선택하세요.(도망가기 : 0)(아이템 : 9)");
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 10;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 2){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 20;
				character.mp -=10;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 3){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 50;
				character.mp -=15;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 4){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -=100;
				character.mp -=20;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 9){
				character.mul();
				System.out.println("사용하고 싶은 아이템을 선택하세요.");
				answer = Integer.parseInt(s.nextLine());
				if(answer == 1){
					System.out.println("빨간 포션을 사용하셨습니다.");
					if(character.hp < 100){
						character.hp += 10;
					}else if(character.hp >= 100){
						System.out.println("포션을 쓰지 않아도 됩니다.");
					}
				}else if(answer == 2){
					System.out.println("파란 포션을 사용하셨습니다.");
					if(character.mp < 100){
						character.mp += 10;
					}else if(character.hp >= 100){
						System.out.println("포션을 쓰지 않아도 됩니다.");
					}
				}
			}else{
				System.out.println(name + "로 부터 도망쳤다.");
				character.hp = 100;
				character.mp = 100;
				break;
			}
		}while(true);
		
		
		
		
	
	}
		
	//중급 몹 몬스터 스탯 메서드		
	static void level2(){
		//베리우스 던전
		
		//몬스터 스탯
		name = "사악한 슬라임";
		hp = 200;
		armor = 10;
		str = 20;
		mag = 10;	
		System.out.println(name + "을(를) 만났다." + "hp : " + hp);
		do{
			if(hp <= 0){
				System.out.println("몬스터를 물리쳤습니다.(str +1)");
				character.str += 1;
				break;
			}
			int result = str/10;
			System.out.println(name + "의 현재 체력 : " + hp);
			System.out.println(character.name + "의 현재 체력 : "+character.hp);
			character.skill();
			System.out.println("번호를 선택하세요.(도망가기 : 0)(아이템 : 9)");
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 10;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 2){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 20;
				character.mp -=10;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 3){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 50;
				character.mp -=15;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 4){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -=100;
				character.mp -=20;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 9){
				character.mul();
				System.out.println("사용하고 싶은 아이템을 선택하세요.");
				answer = Integer.parseInt(s.nextLine());
				if(answer == 1){
					System.out.println("빨간 포션을 사용하셨습니다.");
					if(character.hp < 100){
						character.hp += 10;
					}else if(character.hp >= 100){
						System.out.println("포션을 쓰지 않아도 됩니다.");
					}
				}else if(answer == 2){
					System.out.println("파란 포션을 사용하셨습니다.");
					if(character.mp < 100){
						character.mp += 10;
					}else if(character.hp >= 100){
						System.out.println("포션을 쓰지 않아도 됩니다.");
					}
				}
			}else{
				System.out.println(name + "로 부터 도망쳤다.");
				character.hp = 100;
				character.mp = 100;
				break;
			}
		}while(true);
		
		
	}

	//고급 몹 몬스터 스탯 메서드
	static void level3(){
		//베리우스 던전
		
		//몬스터 스탯
		name = "스트로벨제부브";
		hp = 300;
		armor = 20;
		str = 30;
		mag = 20;	
		System.out.println(name + "을(를) 만났다." + "hp : " + hp);
		do{
			if(hp <= 0){
				System.out.println("몬스터를 물리쳤습니다.(str +1)");
				character.str += 1;
				questItem++;
				break;
			}
			int result = str/10;
			System.out.println(name + "의 현재 체력 : " + hp);
			System.out.println(character.name + "의 현재 체력 : "+character.hp);
			character.skill();
			System.out.println("번호를 선택하세요.(도망가기 : 0)(아이템 : 9)");
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 10;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 2){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 20;
				character.mp -=10;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 3){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -= 50;
				character.mp -=15;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 4){
				System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
				hp -=100;
				character.mp -=20;
				System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
				character.hp -= result;
			}else if(answer == 9){
				character.mul();
				System.out.println("사용하고 싶은 아이템을 선택하세요.");
				answer = Integer.parseInt(s.nextLine());
				if(answer == 1){
					System.out.println("빨간 포션을 사용하셨습니다.");
					if(character.hp < 100){
						character.hp += 10;
					}else if(character.hp >= 100){
						System.out.println("포션을 쓰지 않아도 됩니다.");
					}
				}else if(answer == 2){
					System.out.println("파란 포션을 사용하셨습니다.");
					if(character.mp < 100){
						character.mp += 10;
					}else if(character.hp >= 100){
						System.out.println("포션을 쓰지 않아도 됩니다.");
					}
				}
			}else{
				System.out.println(name + "로 부터 도망쳤다.");
				character.hp = 100;
				character.mp = 100;
				break;
			}
		}while(true);
		
		
	}
	
	//다크드래곤 몹 몬스터 스탯 메서드
	static void Boss(){
			
			name = "다크 드래곤";
			hp = 500;
			armor = 100;
			str = 100;
			mag = 30;
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■□□□□□□□□□□□□□■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■□□□■■■■■■■■■■■□□□■■■■■■■■■■■");
			System.out.println("■■■■■■■■■□□□■■■■■■■■■■■■■■■□□□■■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■■■■■■■■■■■■■■■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■■□□■■■■■■■□□■■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■□□□□■■■■■□□□□■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■□□□□□■■■□□□□□■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■□□□□□■■■□□□□□■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■■□□□■■■■■□□□■■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■■■■■■■■■■■■■■■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■□□■■■■■■■■□□□■■■■■■■■□□■■■■■■■■");
			System.out.println("■■■■■■■■■□□□■■■■■■■■■■■■■■□□□■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■□□□■■■■■■■■■■■□□□■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■□□□■■■■■■■■■■■□□□■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■□□□□□□□□□□□□□■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■□■■□□■■■□□■■□■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■□■■□□■■■□□■■□■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■□■■□□■■■□□■■□■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■■□□□□□□□□□□□■■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println();
			System.out.println(character.sub + " : " + "먼 옛날에 태어나 몇번이나 쓰러져도 부활을 되풀이 하는 증오와 원념의 화신");
			character.answer1 = sc.nextLine();
			System.out.println(character.sub + " : " + "부활을 포기 하지 않는 집념이 폭주해 버린 모습");
			character.answer1 = sc.nextLine();
			System.out.println(character.sub + " : " + "세상에 나오면 100년 전을 뛰어넘는 비극을 낳겠지요...");
			character.answer1 = sc.nextLine();
			System.out.println(character.name + " 는 (더 레전더리 화이트 드래곤 레볼루션 엑시노스 소드)를 꺼내 들었다.");
			character.answer1 = sc.nextLine();
			System.out.println();
			
			
			System.out.println(name + "을(를) 만났다." + "hp : " + hp);
			do{
				if(hp == 0){
					System.out.println("다크 드래곤을 물리쳤습니다.");
					break;
				}
				int result = str/10;
				System.out.println(name + "의 현재 체력 : " + hp);
				System.out.println(character.name + "의 현재 체력 : "+character.hp);
				character.skill();
				System.out.println("번호를 선택하세요.(아이템 : 9)");
				answer = Integer.parseInt(s.nextLine());
				if(answer == 1){
					System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
					hp -= 100;
					System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
					character.hp -= result;
				}else if(answer == 2){
					System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
					hp -= 20;
					character.mp -=10;
					System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
					character.hp -= result;
				}else if(answer == 3){
					System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
					hp -= 50;
					character.mp -=15;
					System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
					character.hp -= result;
				}else if(answer == 4){
					System.out.println(name + "에게 " + character.skill[answer-1] + "를 사용했다.");
					hp -=100;
					character.mp -=20;
					System.out.println(name + "의 피격을 " + result +"만큼 받았다.");
					character.hp -= result;
				}else if(answer == 9){
					character.mul();
					System.out.println("사용하고 싶은 아이템을 선택하세요.");
					answer = Integer.parseInt(s.nextLine());
					if(answer == 1){
						System.out.println("빨간 포션을 사용하셨습니다.");
						if(character.hp < 100){
							character.hp += 10;
						}else if(character.hp >= 100){
							System.out.println("포션을 쓰지 않아도 됩니다.");
						}
					}else if(answer == 2){
						System.out.println("파란 포션을 사용하셨습니다.");
						if(character.mp < 100){
							character.mp += 10;
						}else if(character.hp >= 100){
							System.out.println("포션을 쓰지 않아도 됩니다.");
						}
					}
				}else{
					continue;
				}
			}while(true);
		
		}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		int answer_main = 0;
		sc = new Scanner(System.in);
		Dunjeon Du = new Dunjeon();
		do{
			Town.map[3] = "베리우스 던전";
			System.out.println("베리우스 던전에 오셨습니다.");
			System.out.println("1.초급 몬스터와 싸우기");
			System.out.println("2.중급 몬스터와 싸우기");
			System.out.println("3.고급 몬스터와 싸우기");
			System.out.println("4.다크 드래곤에게 도전하기");
			System.out.println("5.워프하기");
			answer_main = Integer.parseInt(sc.nextLine());
			if(answer_main == 1){
				Dunjeon.level1();
				continue;
			}else if(answer_main == 2){		
				Dunjeon.level2();
				continue;
			}else if(answer_main == 3){
				Dunjeon.level3();
				continue;
			}else if(answer_main == 4){
				if(character.str >= 50 && sord >= 1){
					Dunjeon.Boss();
					break;
				}else{
					System.out.println(character.name + " : " + "아직 잡을 수 없을 거 같다.");
				}
				continue;
			}else if(answer_main == 5){
				System.out.println("워프를 선택하셨습니다.");
				System.out.println("맵을 확인합니다.");
				Town.Map();
				answer_main = Integer.parseInt(sc.nextLine());
				if(answer_main == 1){
					Lishangu.main(args);
					//리스항구로 워프
					break;
				}else if(answer_main == 2){
					try {
						Seriok.main(args);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//세리오크로 워프
					break;
				}else if(answer_main == 3){
					try {
						Renover.main(args);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//레노버왕국으로 워프
					break;
				}else if(answer_main == 4){
					Dunjeon.main(args);
					//베리우스 던전으로 워프
					break;
				}else{
					break;					
				}
			}
		}while(true);
	}
}
