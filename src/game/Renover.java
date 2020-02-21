package game;

import java.util.Scanner;

public class Renover extends Town{
	//npc(String)
			String[] npc_Re = {
					"전설의 마셀란",
					"다크 아칸",
					"하이템플러"
			};
			
			//
			void Renever_JJANG() throws InterruptedException{
				System.out.println(npc_Re[0]+" : "+"용사여 깨어났는가..");
				System.out.println(npc_Re[0]+" : "+"이곳은 레노버왕국");
				System.out.println(npc_Re[0]+" : "+"준비가 되었는가...");
				
				do{
					
					System.out.println("1.다크 드래곤을 물리치기 위한 방법은?");
					System.out.println("2.당신은 누구인가요?");
					System.out.println("3.나간다.");
					answer = Integer.parseInt(s.nextLine());
					
					 if(answer == 1){
						System.out.println(character.name + " : " + "다크 드래곤을 물리치기 위한 방법은?");
						System.out.print(npc_Re[0]+" : " +"크흠");
						for(int i=0; i < 2; i++){
							
						    Thread.sleep(1300);
						    System.out.print(".");
						}System.out.println(npc_Re[0]+"다크 드래곤의 약점은 끈기 일세...그 점을 공략하세..");
						for(int i=0; i < 2; i++){
							
						    Thread.sleep(1000);
						}
						System.out.println(npc_Re[0]+" : " +"당신이 가진 스킬이라면 꼭 제국를 구할 수 있을 게야...");
						System.out.println(npc_Re[0]+" : " +"포션상점을 이용하여 충분한 포션을 구입하고 준비를 탄탄히 하게나...");
						
						continue;
					}else if(answer == 2){
						System.out.println(character.name + " : " + "당신은 누구인가요?");
						System.out.println(npc_Re[0]+" : " +"나는 제국의 영웅 전설의 마셀란일세...");
						System.out.println(npc_Re[0]+" : " +"특별히 네게 줄 선물이 있다네....");
						character.skill[3] = "매대스 소울의 한방";
						System.out.println("스킬을 획득했습니다.(매대스 소울의 한방)");
						continue;
					}else if(answer == 3){
						break;
					}else{
						
						break;
					}
						
						
				}while(true);
			
			}
			
			
			
			
			
			void Renever_1() throws InterruptedException{
				do {
					System.out.println(npc_Re[1]+" : "+"그 얘기 들었어?");
					System.out.print("1.말을 건다.");
					System.out.print("2.말을 걸지 않는다.");
					answer = Integer.parseInt(s.nextLine());
					
					if(answer == 1) {
						System.out.println(character.name+" : "+"무슨 얘기요??");
						Thread.sleep(1300);
						System.out.println(npc_Re[1]+" : "+"ㅁㅅ 공주님은 용사님을 기다리고 있다는 얘기...");
						Thread.sleep(1300);
						System.out.println(npc_Re[1]+" : "+"어느덧 100년 동안 공주님께서 이 제국을 지키고 있지만 힘이 약해지고 있다고 하더라고...");
						Thread.sleep(1300);
						System.out.println(npc_Re[1]+" : "+"너는 100년전 잠들었던 용사라지??");
						Thread.sleep(1300);
						System.out.println(npc_Re[1]+" : "+"꼭 우리 제국을 구해주길 바래");
						Thread.sleep(1300);
						System.out.println(character.name+" : "+"네!! 반드시 구하겠습니다. ");
						Town.map[3] = "베리우스 던전";
						System.out.println("베리우스 던전 맵을 획득했습니다.");
						break;
					}else {
						break;
					}
				}while(true);
			}

		public static void main(String[] args) throws InterruptedException {
			int answer_main = 0;
			//객체 생성
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			Town tw = new Town();
			Renover Re = new Renover();
			do{
				Town.map[2] = "레노버 마을";
				System.out.println("레노버 마을에 오셨습니다.");
				System.out.println("1.npc만나러 가기");
				System.out.println("2.무기 상점으로 가기");
				System.out.println("3.방어구 상점으로 가기");
				System.out.println("4.포션 상점으로 가기");
				System.out.println("5.워프하기");
				answer_main = Integer.parseInt(sc.nextLine());
				if(answer_main == 1){
					System.out.println("npc를 만나러 갑니다. 누구를 만나시겠습니까?");
					System.out.println("1. 전설의 마셀란");
					System.out.println("2. 다크아칸");
					System.out.println("3. 나간다.");
					
					answer_main = Integer.parseInt(sc.nextLine());
					if(answer_main == 1){
						Re.Renever_JJANG();
						continue;
					}else if(answer_main == 2){
						Re.Renever_1();
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
						Lishangu.main(args);
						//리스항구로 워프
						break;
					}else if(answer_main == 2){
						Seriok.main(args);
						//세리오크로 워프
						break;
					}else if(answer_main == 3){
						main(args);
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
