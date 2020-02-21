package game;

import java.util.Scanner;

public class Seriok extends Town{
	//npc(String)
		String[] npc_Se = {
				"아쉴롬",
				"레오나르",
				"모데카이저"
			
		};
		
		//대표 집(메서드)
		void Seriok_JJANG () throws InterruptedException{
			System.out.println(npc_Se[0]+" : "+"세리오크 마을에 온것을 환영하네 ");
			System.out.println(npc_Se[0]+" : "+"우리마을은 샤인홀트제국의 최고의 전사들이 있는 곳.... ");
			System.out.println(npc_Se[0]+" : "+"나에게 질문할 것이 있는가?");
			
			do{
				System.out.println();
				System.out.println("1.전설의 검에 대해 묻는다.");
				System.out.println("2.용의 조각에 대해 묻늗다.");
				System.out.println("3.당신은 누구인가요?");
				System.out.println("4.나간다.");
				answer = Integer.parseInt(s.nextLine());
				if(answer == 1){
					System.out.println(character.name + " : " + "전설의 검이라고 있던데...");
					for(int i=0; i < 1; i++){
						Thread.sleep(1500);
					}
					System.out.println(npc_Se[0]+" : " +"전설의 검에 대해 묻는거로군...");
					System.out.println(npc_Se[0]+" : " +"그 검은 우리제국을 지키던 한 용사님의 검이었지..");
					System.out.println(npc_Se[0]+" : " +"우리 마을 뒷편에 살고 있었던 화이트 드래곤의 영혼이 깃든 검...");
					System.out.println(npc_Se[0]+" : " +"용사님께서 그 검을 뽑았을 때 뒷 산 저편에서 큰 빛이 쏟아지는 장면을 본 기억이 아주 뚜렷하게 기억난다네...");
					System.out.println(npc_Se[0]+" : " +"검을 뽑기 위해서는 용기와 패기가 있는 자만이 가질 능력이 된다고 하지...");
					System.out.println(npc_Se[0]+" : " +"내가 왕년에 전성기 시절이라면 그 검의 주인공이 되었을 수도 있었겠지...하하하하");
					
					continue;
				}else if(answer == 2){
					System.out.println(character.name + " : " + "용의 조각은 무엇이죠?");
					System.out.println(npc_Se[0]+" : " +"아!!!우리 마을의 수호신이었던 화이트 드래곤의 비늘을 말하는 것인가?...");
					System.out.println(npc_Se[0]+" : " +"용의 조각을 모으면 영혼이 깃든 검의 능력을 다시 되돌릴 수 있다는 말을 들은거 같기도 하고....");
					System.out.println(npc_Se[0]+" : " +"무튼 몬스터가 득실 거리는 베리우스 던전이라는 곳에서 구할 수 있다네...");
					
				}else if(answer == 3){
					System.out.println(character.name + " : " + "당신은 누구인가요?");
					System.out.println(npc_Se[0]+" : " +"나는 세리오크의 단장 아쉴롬이라고 하네...");
					System.out.println(npc_Se[0]+" : " +"수 많은 부하들을 지니고 있지 ....하하하하하!");
					System.out.println(npc_Se[0]+" : " +"특별히 네게 줄 선물이 있다네....");
					character.skill[2] = "세비지 블로우";
					System.out.println("스킬을 획득했습니다.(세비지 블로우)");
					continue;
				}else{
					break;
				}
			}while(true);
		
		}
		
		//레오나르
		void Seriok_1() throws InterruptedException{
			
			do {
				System.out.println(npc_Se[1]+" : "+"음하하하! 나는 최강의 전투사!!!!");
				System.out.print("1.말을 건다.");
				System.out.print("2.말을 걸지 않는다.");
				answer = Integer.parseInt(s.nextLine());
				
				if(answer == 1) {
					System.out.println(npc_Se[1]+" : "+"아주 빈약해 보이는 모험가인가!!!");
					Thread.sleep(1300);
					System.out.println(character.name + " : " + "당신은 얼마나 강하길래....");
					System.out.println(npc_Se[1]+" : "+"나는 세리오크 마을에서 팔씨름이 가장 쎈 레오나르라고 하지!!!!");
					Thread.sleep(1300);
					System.out.println(npc_Se[1]+" : "+"베리우스 던젼은 가 보았나...");
					Thread.sleep(1300);
					System.out.println(npc_Se[1]+" : "+"그 곳을 가면 힘을 기를 수 있다네 ....");
					Thread.sleep(1300);
					System.out.println(npc_Se[1]+" : "+"너도 도전을 하고 싶으면 가보세!!!");
					break;
				}else {
					break;
				}
				
			}while(true);
		}
		
		//모데카이저
		void Seriok_2() throws InterruptedException{
			do {
				System.out.println(npc_Se[2]+" : "+"음...하늘은 언제 맑아 지려나....");
				System.out.print("1.말을 건다.");
				System.out.print("2.말을 걸지 않는다.");
				answer = Integer.parseInt(s.nextLine());
				
				if(answer == 1) {
					System.out.println(npc_Se[2]+" : "+"자네도 걱정이 많은 표정을 짓고 있군...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"나는 제로이드 제국이 고향이라네....");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"지금은 고향으로 갈 수 없지만 말일세.....");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"자네는 무엇을 목표로 살고 있는겐가...");
					Thread.sleep(1300);
					System.out.println(character.name+" : "+"저는 제국을 구해야 합니다!");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"흠..제국이라...그렇지 나도 한 때 제국을 위해 몸을 썼을 때가 있지...");
					Thread.sleep(1300);
					System.out.println(character.name+" : "+"젊은 시절 얘기를 해주세요.");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"나는 젊은 시절 혹평받는 전사중 하나 였지...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"사실 난 알다바오트가 거느리는 제로이드 제국의 검사 였다네...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"허나 그녀의 넘치는 야망과 욕심들을 견디지 못해 반란을 일으켰지...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"그 당시 정직한 마음으로 제로이드 제국을 바르게 세우고 싶었지만..");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"헛된 생각이었지...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"그녀는 굉장한 힘을 가지고 있었거든...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"자네는 샤인홀트 제국을 구해야 한다고 하지 않았나??");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"아쉽지만 지금은 알다바오트가 지배하고 있지...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"헛된 생각은 하지 않는게 좋을 게야...");
					Thread.sleep(1300);
					System.out.println(npc_Se[2]+" : "+"그러니 레노버 왕국 근처는 얼씬도 하지 말게나...!");
					Town.map[2] = "레노버왕국";
					System.out.println("레노버 왕국 지도를 획득했습니다.");
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
		Seriok Se = new Seriok();
		do{
			Town.map[1] = "세리코 마을";
			System.out.println("세리코 마을에 오셨습니다.");
			System.out.println("1.npc만나러 가기");
			System.out.println("2.무기 상점으로 가기");
			System.out.println("3.방어구 상점으로 가기");
			System.out.println("4.포션 상점으로 가기");
			System.out.println("5.워프하기");
			answer_main = Integer.parseInt(sc.nextLine());
			if(answer_main == 1){
				System.out.println("npc를 만나러 갑니다. 누구를 만나시겠습니까?");
				System.out.println("1. 아쉴로");
				System.out.println("2. 레오나르");
				System.out.println("3. 모데카이저");
				
				answer_main = Integer.parseInt(sc.nextLine());
				if(answer_main == 1){
					Se.Seriok_JJANG();
				}else if(answer_main == 2){
					Se.Seriok_1();
					continue;
				}else if(answer_main == 3){
					Se.Seriok_2();
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
					Lishangu.main(args);;
					//리스항구로 워프
					break;
				}else if(answer_main == 2){
					main(args);
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
