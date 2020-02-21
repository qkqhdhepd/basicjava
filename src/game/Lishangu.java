package game;

import java.util.Scanner;

public class Lishangu extends Town {
	
	
	
	
	//npc(String)
	String[] npc_Li = {
			"주먹대장 왈프",
			"떠돌이 연금술사",
			"카산드라",
			"스쿠루지",
			"조이"
	};
	private static Scanner sc;
	
	
	//대표 집(메서드)
	void Lishangu_JJANG () throws InterruptedException{
		System.out.println(npc_Li[0]+" : "+"우리마을에 온것을 환영하네 ");
		System.out.println(npc_Li[0]+" : "+"우리마을은 마법을 다루는 곳이지... ");
		System.out.println(npc_Li[0]+" : "+"무엇이 궁금한가...");
		
		do{
			System.out.println("1.ㅁㅅ은 누구인가요?");
			System.out.println("2.다크 드래곤의 정체는?");
			System.out.println("3.당신은 누구인가요?");
			System.out.println("4.나간다.");
			answer = Integer.parseInt(s.nextLine());
			if(answer == 1){
				System.out.println(character.name + " : " + "ㅁㅅ은 누구인가요?");
				for(int i=0; i < 1; i++){
					Thread.sleep(1500);
				}
				System.out.println(npc_Li[0]+" : " +"우리 샤인홀트제국의 공주님인 ㅁㅅ를 모른단 말인가?...");
				continue;
			}else if(answer == 2){
				System.out.println(character.name + " : " + "다크 드래곤의 정체는?");
				System.out.print(npc_Li[0]+" : " +"크흠");
				for(int i=0; i < 3; i++){
					
				    Thread.sleep(1300);
				    System.out.print(".");
				}System.out.println(npc_Li[0]+"우리 샤인홀트제국은 강력한 힘을 가지고 있었어...");
				for(int i=0; i < 3; i++){
					
				    Thread.sleep(1300);
				}
				System.out.println(npc_Li[0]+" : " +"아주 먼 옛날 용감한 용사가 있었지");
				System.out.println(npc_Li[0]+" : " +"그 용사는 제국을 침략하는 몬스터로부터 우리 마을 사람들을 지켜주는 용사였다네...");
				Thread.sleep(1300);
				System.out.println(npc_Li[0]+" : " +"그런데 어느날 파괴의 신 알다바오트의 힘에 휩쓸려 깊은 잠에 빠지게 되었지...");
				System.out.println(npc_Li[0]+" : " +"그 후 몬스터의 침략으로 우리 샤인홀트제국은 파괴의 신 부하인 다크 드래곤의 힘에 봉인되게 되었어....");
				Thread.sleep(1300);
				System.out.print(npc_Li[0]+" : " +"지금 제국의 중심인 레노버왕국은 드래곤의 힘에 맞서기 위해 공주님께서 힘을 쓰고 계시지만");
				for(int i=0; i < 3; i++){
					System.out.print(".");
				    Thread.sleep(1300);
				}
				System.out.println();
				System.out.println(npc_Li[0]+" : " +"그 힘을 언제까지 버틸 수 있을지...");
				character.answer1 = sc.nextLine();
				System.out.println();
				continue;
			}else if(answer == 3){
				System.out.println(character.name + " : " + "당신은 누구인가요?");
				System.out.println(npc_Li[0]+" : " +"나는 이 마을의 촌장 주먹대장 왈프라네...");
				System.out.println(npc_Li[0]+" : " +"특별히 네게 줄 선물이 있다네....");
				character.skill[1] = "마검의 일격";
				System.out.println("스킬을 획득했습니다.(마검의 일격)");
				continue;
			}else{
				break;
			}
				
				
		}while(true);
	
	}
	
	
	//떠돌이 연금술사
	void Lishangu_1() throws InterruptedException {
		
		do {
			System.out.println(npc_Li[1]+" : "+"너는 누구니?");
			System.out.print("1.말을 건다.");
			System.out.print("2.말을 걸지 않는다.");
			answer = Integer.parseInt(s.nextLine());
			
			if(answer == 1) {
				System.out.println(character.name + " : " + "나는 모험을 하고 있는 " + character.name + "이야..");
				System.out.println(character.name + " : " + "넌 누구야? ");
				System.out.println(npc_Li[1]+" : "+"나?");
				Thread.sleep(1300);
				System.out.println(npc_Li[1]+" : "+"그냥 이 마을에 사는...(알려주기 싫다)");
				System.out.println("1.무시한다.");
				System.out.println("2.무슨일 있냐며 다시 물어본다.");
				answer = Integer.parseInt(s.nextLine());
				if(answer == 1) {
					System.out.println("가볍게 무시했다.");
					continue;
				}else if(answer == 2) {
					System.out.println(character.name + " : " + "무슨일 있니?");
					Thread.sleep(1200);
					System.out.println(npc_Li[1]+" : "+"실은...");
					Thread.sleep(1200);
					System.out.println(npc_Li[1]+" : "+"난 연금술사야..");
					Thread.sleep(1500);
					System.out.println(npc_Li[1]+" : "+"레노버왕국에서 마법을 연마하는 일을 하곤 했었지...");
					Thread.sleep(1500);
					System.out.println(npc_Li[1]+" : "+"그 곳은 지옥이였지..어둠의 마법에 쌓여 모두가 초토화 되고 끔찍한 곳이 되어버렸어....");
					Thread.sleep(1500);
					System.out.println(npc_Li[1]+" : "+"알다바오트만 아니었으면 샤인홀트제국은 무사했을 텐데....");
					Thread.sleep(1200);
					System.out.println(npc_Li[1]+" : "+"그나저나 너는 나를 걱정해주는 사람이구나....");
					Thread.sleep(1200);
					System.out.println(npc_Li[1]+" : "+"나를 걱정 해준 건 니가 처음이야 ...");
					Thread.sleep(1200);
					System.out.println(npc_Li[1]+" : "+"보상으로 이걸 줄게...");
					Thread.sleep(1200);
					System.out.println("세리오크의 지도를 얻었다.");
					Town.map[1] = "세리오크";
					System.out.println("마을을 좀 더 조사해보자");
					break;
				}
				
			}else {
				break;
			}
			
		}while(true);
	}
	//카산드라
	void Lishangu_2() throws InterruptedException{
		
			do {
				System.out.println(npc_Li[2]+" : "+"마법의 힘을 길러야 겠어");
				System.out.print("1.말을 건다.");
				System.out.print("2.말을 걸지 않는다.");
				answer = Integer.parseInt(s.nextLine());
				
				if(answer == 1) {
					System.out.println(npc_Li[2]+" : "+"굉장히 아무것도 모르는 표정인걸??");
					Thread.sleep(1300);
					System.out.println(character.name + " : " + "무슨일 있니?");
					System.out.println(npc_Li[2]+" : "+"역시 그렇군...");
					Thread.sleep(1300);
					System.out.println(npc_Li[2]+" : "+"우리 제국은 위험에 처해 있다구...");
					Thread.sleep(1300);
					System.out.println(npc_Li[2]+" : "+"여유를 부릴 때가 아니야!");
					Thread.sleep(1300);
					System.out.println(npc_Li[2]+" : "+"나도 전해들은 얘긴데 레노버 왕국은 뒤죽박죽이 되었다는데?");
					Thread.sleep(1300);
					System.out.println(npc_Li[2]+" : "+"자세한 내용을 듣고 싶으면 스쿠루지를 찾아가봐~");
					break;
				}else {
					break;
				}
				
			}while(true);
		}
	
	//스쿠루지
	void Lishangu_3() throws InterruptedException{
		do {
			System.out.println(npc_Li[3]+" : "+"...............");
			System.out.print("1.말을 건다.");
			System.out.print("2.말을 걸지 않는다.");
			answer = Integer.parseInt(s.nextLine());
			
			if(answer == 1) {
				System.out.println(character.name + " : " + "...저....기...");
				Thread.sleep(1300);
				System.out.print(npc_Li[3]+" : "+".......?");
				Thread.sleep(1300);
				System.out.print(npc_Li[3]+" : "+"그대는 "+character.name+"용사님?");
				Thread.sleep(1200);
				System.out.println(character.name + " : " + "저를 아시나요?");
				Thread.sleep(1200);
				System.out.println(npc_Li[3]+" : "+"용사님...깨어나셨군요...");
				System.out.println(character.name + " : " + ".......??????");
				Thread.sleep(1200);
				System.out.println(npc_Li[3]+" : "+"소개가 늦었습니다. 저는 용사님의 부하 스쿠루지 입니다...! ");
				Thread.sleep(1500);
				System.out.println(character.name + " : " + ".......!!!!!!!!");
				Thread.sleep(1500);
				System.out.println(character.name + " : " + "저에게 설명좀 해주세요");
				Thread.sleep(1500);
				System.out.println();
				System.out.println(npc_Li[3]+" : "+"용사님은 100년전 마법에 휩쓸려 깊은 잠에 빠지셨습니다.");
				System.out.println(npc_Li[3]+" : "+"그 후 용사님께서 지키시던 레노버왕국은 초토화가 되었고");
				System.out.println(npc_Li[3]+" : "+"함께 있던 공주님께서는 다크 드래곤의 봉인에 힘에 눌려 왕국에 갖히게 되었습니다.");
				System.out.println(npc_Li[3]+" : "+"ㅠㅠ 그 때 지켰어야 했는데...");
				Thread.sleep(1500);
				System.out.println(character.name + " : " + "그럼 전 지금 부터 어떻게 해야 하죠?");
				Thread.sleep(1500);
				System.out.println(npc_Li[3]+" : "+"우선 강해지셔야 합니다. 다크 드래곤을 무찌를 수 있는 ");
				Thread.sleep(1500);
				System.out.println(npc_Li[3]+" : "+"전설의 검");
				for(int i=0; i < 3; i++){
					Thread.sleep(1500);
				    System.out.print(".");  
				}System.out.println("(화이트 드래곤 레볼루션 엑시노스 소드)를 구하셔야 합니다.");
				System.out.println();
				System.out.println("*전설의 검에 대해 조사가 필요합니다.*");
				break;
			}else {
				break;
			}
			
		}while(true);
	}
	
	//조이
		void Lishangu_4() throws InterruptedException{
			do {
				System.out.println(npc_Li[4]+" : "+"야이 깜짝이야!");
				System.out.print("1.말을 건다.");
				System.out.print("2.말을 걸지 않는다.");
				answer = Integer.parseInt(s.nextLine());
				if(quest == 1 && questItem == 1){
					System.out.println(npc_Li[4] + " : " +"헐 가지고 온거야?");
					System.out.println(npc_Li[4] + " : " +"우와~ 정말 고마웡 이제 딸기로 사탕만들어서 먹을 수 있겠다...보상이야~");
					System.out.println("(화이트 드래곤 레볼루션 엑시노스 소드를 얻었다.)");
					sord++;
					System.out.println("다크드래곤을 물리치고 공주를 구할수 있게 되었습니다.");
					break;
				}else if(quest == 1 && questItem == 0){
					System.out.println(npc_Li[4] + " : " + "뭐?? 딸기를 구해왔다구??");
					System.out.println(npc_Li[4] + " : " + "뭐야 왜 사기치는거야...빨리 딸기 구해와");
					System.out.println(npc_Li[4] + " : " + "레노버왕국 근처에서 구할 수 있다고 했어...");
					break;
				}
				if(answer == 1) {
					System.out.println(npc_Li[4] + " : " + "옆에서 뭐하는거야~~~");
					System.out.println(npc_Li[4] + " : " + "깜짝 놀래서 뒤로 자빠져서 시공간을 왔다갔다 할 뻔 했잖아~~~");
					Thread.sleep(1500);
					System.out.println(character.name + " : " + "..미안..그럴 의도는 없어..ㅆ..는데");
					System.out.println(npc_Li[4] + " : "+ "됐고 재수없으니까 꺼져!! ");
					System.out.println("1.꺼진다.");
					System.out.println("2.화제 전환을 한다.");
					answer = Integer.parseInt(s.nextLine());
					if(answer == 1) {
						break;
					}else if(answer == 2) {
						System.out.println(character.name + " : " + "근데 어제 저녁 뭐 먹었어?");
						for(int i=0; i < 3; i++){
							Thread.sleep(1200);
						    System.out.println(".");  
						}
						System.out.println(npc_Li[4] + " : " + "(Oh? 매력있는데?)");
						Thread.sleep(1300);
						System.out.println(npc_Li[4] + " : " + "됐고 ..난 레노버왕국 근처에서 자라는 레노버딸기로 만든 사탕밖에 안 먹는다구...그럼 안뇽~");
						System.out.println(npc_Li[4] + " : " + "아!!! 잠깐사탕 얘기하니까 배고프넹.. 레노버왕국 근처 던전에서 레노버 딸기 좀 1개만 갖다주라~");
						System.out.println("1.퀘스트를 수락한다.");	//-------------------------퀘스트
						System.out.println("2.퀘스트를 거절한다.");
						answer = Integer.parseInt(s.nextLine());	
							if(answer == 2){
								System.out.println(npc_Li[4] + " : " +"역시 넌 나쁜 아니구나?...");
								
							}else if(answer == 1){
								System.out.println(npc_Li[4] + " : " +"진짜루우??? 그럼 기대하고 있을 게!");
								quest++;
							}
						
						break;
						//조이를 만나면 객체생성해서 sysout추가
					}else {
						break;
					}
				}else {
					break;
				}
				
			}while(true);
		}
		
		
		//리스항구 메인메서드
		public static void main(String[] args) throws InterruptedException {
			int answer_main = 0;
			sc = new Scanner(System.in);
			Town tw = new Town();
			Lishangu Li = new Lishangu();
			do{
				Town.map[0] = "리스항구";
				System.out.println("리스항구에 오셨습니다.");
				System.out.println("1.npc만나러 가기");
				System.out.println("2.무기 상점으로 가기");
				System.out.println("3.방어구 상점으로 가기");
				System.out.println("4.포션 상점으로 가기");
				System.out.println("5.워프하기");
				answer_main = Integer.parseInt(sc.nextLine());
				if(answer_main == 1){
					System.out.println("npc를 만나러 갑니다. 누구를 만나시겠습니까?");
					System.out.println("1. 주먹대장 왈프");
					System.out.println("2. 떠돌이 연금술사");
					System.out.println("3. 카산드라");
					System.out.println("4. 스쿠루지");
					System.out.println("5. 조이");
					answer_main = Integer.parseInt(sc.nextLine());
					if(answer_main == 1){
						Li.Lishangu_JJANG();
					}else if(answer_main == 2){
						Li.Lishangu_1();
						continue;
					}else if(answer_main == 3){
						Li.Lishangu_2();
						continue;
					}else if(answer_main == 4){
						Li.Lishangu_3();
						continue;
					}else if(answer_main == 5){
						Li.Lishangu_4();
						continue;
					}else{
						continue;
					}
				}else if(answer_main == 2){		//큰 틀 2 무기상점으로
					tw.mugi();
					continue;
				}else if(answer_main == 3){
					tw.bang();
					continue;
				}else if(answer_main == 4){
					tw.portion();
					continue;
				}else if(answer_main == 5){
					System.out.println("워프를 선택하셨습니다.");
					System.out.println("맵을 확인합니다.");
					Town.Map();
					answer_main = Integer.parseInt(sc.nextLine());
					if(answer_main == 1){
						main(args);
						//리스항구로 워프
						break;
					}else if(answer_main == 2){
						Seriok.main(args);
						//세리오크로 워프
						break;
					}else if(answer_main == 3){
						Renover.main(args);
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
