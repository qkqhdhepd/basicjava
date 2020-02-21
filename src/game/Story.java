package game;

import java.util.Scanner;

public class Story {
	
	
	public static void main(String[] args) throws InterruptedException{
		
			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("ㅁㅅ의 전설");
		System.out.println("간단한 조작방법 : 숫자를 이용한 대답형식으로 진행됩니다.");
		
		System.out.println();
		System.out.println("게임을 시작하겠습니다.");
		character.answer1 = sc.nextLine();
		System.out.println("chapter1	잠든 용사");
		Thread.sleep(1800);
		System.out.print("용사여");
	       
		for(int i=0; i < 3; i++){
			Thread.sleep(1300);
		    System.out.print(".");  
		}
		System.out.println("깨어나라!!");
		character.answer1 = sc.nextLine();
		System.out.println(character.name + " : " + "여긴 어디지........");
		character.answer1 = sc.nextLine();
		System.out.println(character.sub + " : " + "그대를 믿을게......");
		character.answer1 = sc.nextLine();
		System.out.print("로딩중");
		for(int i=0; i < 3; i++){
			Thread.sleep(1200);
		    System.out.print(".");  
		}
		System.out.println("(리스항구)");//리스항구 챕터 시작
		character.answer1 = sc.nextLine();
		System.out.println(character.name + " : " +"(내가 누군지..그리고 여기는 어디인거야....)");
		character.answer1 = sc.nextLine();
		System.out.println("마을을 둘러보자");
		System.out.println("마을에는 기본적으로 무기를 파는 상점과, 방어구상점, 포션상점, 그리고 npc들로 이루어져 있습니다.");
		
		
		//리스항구 로 처음 시작
		Lishangu.main(args);
		
		for(int i=0; i < 3; i++){
			Thread.sleep(1200);
		    System.out.println(".");  
		}
		System.out.println(character.sub + " : " + "저는 쭈욱 지켜보고 있었습니다.");
		Thread.sleep(1200);
		System.out.println(character.sub + " : " + "당신의 운명, 고난...그리고 싸움도...");
		Thread.sleep(1200);
		System.out.println(character.sub + " : " + "그래서 전 ...믿고 있었답니다...");
		Thread.sleep(1200);
		System.out.println(character.sub + " : " + "당신이 반드시 다크 드래곤을 물리쳐 줄거라고...");
		Thread.sleep(1200);
		System.out.println(character.sub + " : " + "고마워요.." +"  " +character.name+"!!");
		Thread.sleep(1200);
		System.out.println(character.sub + " : " + "저를...");
		for(int i=0; i < 3; i++){
			Thread.sleep(1200);
		    System.out.println(".");  
		}
		System.out.println(character.sub + " : " + "기억하시나요...");
		
		Thread.sleep(1200);Thread.sleep(1200);Thread.sleep(1200);
		System.out.println("플레이 해주셔서 감사합니다.");

	
		
		
//		System.out.println("조작법을 익히겠습니다.");
//		System.out.println("i를 눌러주세요.");
//		character.answer1 = sc.nextLine();
//		if(character.answer1.equals("i")){
//			System.out.println("i를 누르면 현재 보유중인 아이템을 볼 수 있습니다.");
//			character.baguni();	
//		}
//		System.out.println("s를 눌러주세요.");
//		character.answer1 = sc.nextLine();
//		if(character.answer1.equals("s")){
//			System.out.println("s를 누르면 현재 보유중인 스킬을 볼 수 있습니다.");
//			character.skill();	
//		}
//		System.out.println("m를 눌러주세요.");
//		character.answer1 = sc.nextLine();
//		if(character.answer1.equals("m")){
//			System.out.println("m를 누르면 현재 밝혀진 맵을 볼 수 있습니다.");
//			Town.Map();	
//		}
//		character.answer1 = sc.nextLine();
	}
	
	
}
