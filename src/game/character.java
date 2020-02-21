package game;

public class character {
	
	static String name = "링크";
	static String sub = "ㅁㅅ";
	static String answer1 = null;
	//바구니 타입을 결정해보자 //
	static String[] baguni = new String[]{"기본 검",null,null,null,null,null,null,null,null,null};
	static String[] mul = new String[]{"빨간포션",null};
	
	//스킬 타입을 결정해보자
	static String[] skill = new String[]{"기본공격",null,null,null};
	
	
	
	
	static int hp = 100;
	static int mp = 100;
	static int str = 50;
	static int mag = 10;
	static int money = 100000000;
	
	
	//equipment 변수
	
	
	
	
	
	
	//캐릭터 기본 능력치 생성자
	
	
	//현재 캐릭터의 상태를 나타내는 메서드
	String info(){
		return ("현재 hp = " + hp +
				"현재 mp = " + mp +
				"현재 str = " + str +
				"현재 mag = " + mag +
				
				"현재 money = "+ money);
	}
	
	//현재 캐릭터의 바구니를 나타내는 메서드
	static void baguni() {
		for(int i = 0; i < baguni.length; i++) {
			if(baguni[i] != null) {
				System.out.println(i+1 + ". "+baguni[i]);
			}else if(baguni[0] == null){
				System.out.println("현재 보유중인 아이템이 없습니다.");
				break;
			}
		}
	}
	//현재 스킬을 나타내는 메서드
	static void skill() {
		for(int i = 0; i < skill.length; i++) {
			if(skill[i] != null) {
				System.out.println(i+1 + ". "+skill[i]);
			}else if(skill[0] == null){
				System.out.println("현재 보유중인 스킬이 없습니다.");
				break;
			}
		}
	}
	
	//현재 물약 바구니를 나타내는 메서드
	static void mul() {
		for(int i = 0; i < mul.length; i++) {
			if(mul[i] != null) {
				System.out.println(i+1 + ". "+mul[i]);
			}else if(mul[0] == null){
				System.out.println("현재 보유중인 물약이 없습니다.");
				break;
			}
		}
	}
	
	//현재 캐릭터의 장비창 메서드
//	void equipment() {
//		
//	}
	
	
	
}



