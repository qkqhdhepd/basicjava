package z_exam;

public class Exam06 {

}	
//		[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard 클래스를 정의하시오.
//		타 입 		변수명 				설 명
//		int 		num 		카드의 숫자 (1~10사이의 정수 . )							
//		boolean 	isKwang 	광 이면 true 아니면 false 		
	
	
//	class SutdaCard {															//class를 선언하기 위하여 class + SutdaCard를 쓰고 중괄호를 넣었다.
//		int num;																//타입이 int이면서 변수명이 num 이기때문에 선언함
//		boolean isKwang;														//타입이 boolean이고 변수명이 isKwang이다.
//	}																			//클래스의 끝맺음을 맺는 중괄호이다.
	
	//1번 문제는 SutdaCard클래스를 만드는 문제이다. int 타입의 num을 변수명으로 하는 것을 선언해주고
	//boolean타입의 isKwang이라는 변수명으로 선언을 해주면 간단하게 클래스가 정의되는 문제이다.
		
//		[6-2] 문제 6-1에서 SutdaCard클래스에 두개의 생성자와 info()를 추가해서 실행
//		결과와 같은 결과를 얻도록 하시오.
		
//	class Exercise6_2 {
//		public static void main(String args[]) {
//			SutdaCard card1 = new SutdaCard(3, false);
//			SutdaCard card2 = new SutdaCard();
//			System.out.println(card1.info());
//			System.out.println(card2.info());
//		}
//	}
//	
//	class SutdaCard {															//class를 생성하기 위해 클래스와 클래스명을 적고 중괄호를 열어준다
//		int num;																//int타입의 num을 생성한다.
//		boolean isKwang;														//boolean타입의 isKwang을 생성한다.
//		
//		SutdaCard(int num, boolean isKwang){									//섯다 생성자를 생성하는데 파라미터가 2개가 있는 생성자를 만든다.
//			this.num = num;
//			this.isKwang = isKwang;
//		}
//		
//		SutdaCard(){
//			this(1,true);
//		}
//		
//		String info(){
//			return num + (isKwang?"K" : "");
//		}
//		
//	}

	//2번 문제는 만들어진 섯다 클래스를 가지고 card1에 3,false를 대입하고 card2를 통해1,true를 넣어서 생성자를 만들고 String 타입의 info()를 만드는 문제이다. 
	//매개변수가 없는 기본 생성자를 정의할 때 this를 활용하여 호출하는 것이 좋다.
	//재사용성을 높이고 코드를 수정할 때도 유리하기 때문이다.

	
//		[6-3]다음과 같은 멤버 변수를 갖는 Student클래스를 정의하시오
	
//	class Student{
//		String name;	//학생이름
//		int ban;		//반
//		int no;			//번호
//		int kor;		//국어점수
//		int eng;		//영어점수
//		int math;		//수학점수
//	}

	//3번의 문제는 Student 클래스를 생성하고 전역변수를 선언하는 문제이다.
	//매우 쉬운 문제이지만 중요하게 생각해야 할것은 name이 String 타입이고 나머지가 int타입이라는 것이다.


//		[6-4]문제 6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
//		getTotal()과 getAverage()를 추가하시오.
//
//		1.메서드명 : getTotal
//		    기능 : 국어(kor),영어(eng),수학(math)의 점수를 모두 더해서 반환한다.
//		    반환타입 : int
//		    매개변수 : 없음
//
//		2.메서드명 : getAverage
//		    기능 : 총점(국어점수 + 영어점수 + 수학점수)을 과목수로 나눈 평균을 구한다.
//				소수점 둘째자리에서 반올림 할 것.
//		    반환타입 : float
//		    매개변수 : 없음


//	public static void main(String args[]) {
//		Student s = new Student();
//		s.name = "홍길동"; 
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("이름 :"+s.name); 
//		System.out.println("총점 :"+s.getTotal()); 
//		System.out.println("평균 :"+s.getAverage()); 
//	}
//	
//	class Student {
//		String name;	//학생이름
//		int ban;		//반
//		int no;			//번호
//		int kor;		//국어점수
//		int eng;		//영어점수
//		int math;		//수학점수
//		
//		int getTotal(){
//			int getTotal = kor + eng + math;
//		}
//		float getAverage(){
//			float getAverage = ((getTotal()/3f)*100)/100f;
//		}
//	}

	//4번 문제는 선언이 된 전역변수를 활용하여 메서드를 생성해서 총합과 평균을 구하면 되는 문제이다.
	//메서드를 생성할 때는 변환해주는 타입이 int인가 float인가를 생각하여 생성을 해주는것이 바른 예이다.

//		[6-5]다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오
		
//	public static void main(String args[]){
//			Student s = new Student("홍길동",1,1,100,60,76);
//			
//			System.out.println(s.info());
//	}
//		
//		class Student {
//			String name;	//학생이름
//			int ban;		//반
//			int no;			//번호
//			int kor;		//국어점수
//			int eng;		//영어점수
//			int math;		//수학점수
//			
//			int getTotal(){
//				int getTotal = kor + eng + math;
//			}
//			float getAverage(){
//				float getAverage = ((int)(getTotal()/3f)*10 + 0.5f)/10f;
//			}
//			
//			Student(String name, int ban, int no, int kor, int eng, int math){
//				this.name = name;
//				this.ban = ban;
//				this.no = no;
//				this.kor = kor;
//				this.eng = eng;
//				this.math = math;
//			}
//			
//			String info(){
//				return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+getAverage();
//			}
	
	//5번 문제는 내가 푼 문제인데, 4번에서 생성한 메서드를 활용하고 최종적으로 info메서드를 생성하여 출력하는 문제이다.
	//여기서 주의할 점은 메인 메서드에서 받은 파라미터를 이용해야 하기 때문에 파라미터에 맞는 생성자를 생성하는 것이 중요하다.
	//그 생성자를 만들고 나서 입력이 되는 파라미터들이 선언이 되어있는 전역변수에 들어가야 하기 때문에, this를 이용하여 초기화 시켜준다.


//		[6-6]두 점의 거리를 계산하는 getDistance()를 완성하시오.
//			[hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.

		// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
//	class Exercise6_6{
//		
//	
//		static double getDistance(int x, int y, int x1, int y1){
//			double getDistance = Math.sqrt((double)((x1-x)*(x1-x) + (y1-y)*(y1-y)));
//			return getDistance;
//		}
//		
//		public static void main(String args[]){
//			System.out.println(getDistance(1,1,2,2));
//		}
//
//	}

	//6번 문제는 두지점 사이의 거리를 구하는 문제로서 우리가 알아야 할 수학적 지식은 피타고라스 라는 것이다.
	//피타고라스의 정의는 x좌표와 y좌표가 있을 때 한 각 이 90도인 삼각형을 만들게 되면  c^2 = a^2 * b^2이라는 것을 정의하는 것이다.
	//자바에서는 Math.sqrt라는 제곱근의 함수를 사용하여 두 점 사이의 거리를 구할 수 있게 된다.

//		[6-7]문제 6-6 에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
//
//	class MyPoint {
//		int x;
//		int y;
//		MyPoint(int x, int y) {
//			this.x = x;
//			this.y = y;
//		}
//		
//		double getDistance(int x1, int y1){
//			double getDistance = Math.sqrt((double)((x1-x)*(x1-x) + (y1-y)*(y1-y)));
//			return getDistance;
//		}
//		
//	}

	//7번 문제는 6번에서 작성이 된 메서드를 인스턴스화 시키는 문제인데. 중요한것은 메서드가 인스턴스가 되기 위해서는
	//static이 빠져야 되는 것이며 안에 들어가는 변수들또한 static변수가 아닌 인스턴스 변수를 선언해주어야 한다.

//	class Exercise6_7 {
//		public static void main(String args[]) {
//			MyPoint p = new MyPoint(1,1);
//			// p 와 의 거리를 구한다(2,2).  
//			System.out.println(p.getDistance(2,2));
//		}
//	}

//		[6-8]다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.

//	class PlayingCard {
//		int kind;
//		int num;
//		static int width;
//		static int height;
//		PlayingCard(int k, int n) {
//			kind = k;
//			num = n;
//		}
//		public static void main(String args[]) {
//			PlayingCard card = new PlayingCard(1,1);
//		}
//	}
//
//	//클래스변수(static변수) : width, height
//	//인스턴스 변수 : kind, num
//	//지역 변수 : card, k, n
	
	//8번 문제는 다음의 코드에 정의된 변수들을 구분하는 문제인데 클래스변수는 static이 붙은 변수를 말하고
	//인스턴스 변수는 static이 붙지 않은 변수들을 의미한다. 또한 지역 변수는 메서드 안에서 사용되는 변수들을 의미한다.

//		[6-9]다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버  
//		중에 을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가 ?
//		(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

//	class Marine {
//		int x=0, y=0; // Marine (x,y) 의 위치좌표
//		int hp = 60; // 현재 체력
//		int weapon = 6; // 공격력
//		int armor = 0; // 방어력
//		void weaponUp() {
//			weapon++;
//		}
//		void armorUp() {
//			armor++;
//		}
//		void move(int x, int y) {
//			this.x = x;
//			this.y = y;
//		}
//	}
//	//static int weapon;, static int armor y;
//	//static void weaponUp,static void armornUp(붙여주면 좋다.)

	//9번 문제는 마린의 스탯을 나타내는 문제인데 여기서 조건으로 모든 병사의 공격력과 방어력은 같아야 된다는 조건이 있으므로
	//두가지의 변수들을 클래스 변수로 만들어 주어야 한다. (static)을 붙여야 한다는 것이다.

//		[6-10]다음 중 생성자에 대한 설명으로 옳지 않은 것은 모두 고르시오 ?
//			a.  모든 생성자의 이름은 클래스의 이름과 동일해야한다.
//			b.  생성자는 객체를 생성하기 위한 것이다.
//			c.  클래스에는 생성자가 반드시 하나 이상 있어야 한다.
//			d.  생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
//			e. 	생성자는 오버로딩 할 수 없다.

		//정답은 b , e

	//10문제에서 b는 생성자가 객체를 생성할 때 사용되기는 하지만, 객체를 초기화할 목적으로 사용되는 것이다
	//e는 생성자도 오버로딩이 가능해서 하나의 클래스에 여러 개의 생성자를 정의 할수 있다.

//		[6-11]다음 중 에 this대한 설명으로 맞지 않은 것은 모두 고르시오  ? 
//			a.  객체 자신을 가리키는 참조변수이다.
//			b.  클래스 내에서라면 어디서든 사용할 수 있다.
//			c.  지역변수와 인스턴스변수를 구별할 때 사용한다.
//			d.  클래스 메서드 내에서는 사용할 수 없다.

		//정답은 b
	
	//11번 문제에서 b는 클래스 멤버에는 사용할 수 없기 때문에 답이 b이다.
	//this는 인스턴스 자신의 주소를 저장하고 있으며, 모든 인스턴스메서드에 숨겨진 채로 존재하는 지역변수이다.
	//그래서 인스턴스메서드 내에서만 사용할 수 있다.

//		[6-12]다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은 모두 고르시오 ? ( )
//			a.  메서드의 이름이 같아야 한다.
//			b.  매개변수의 개수나 타입이 달라야 한다.
//			c.  리턴타입이 달라야 한다.
//			d.  매개변수의 이름이 달라야 한다.
		//정답은 c , d

	//12번 문제에서 c는 오버로딩을 하는 조건이기 때문에 리턴타입을 달라도 되고 같아도 된다.
	//d는 매개변수의 이름이 달라도 되고 같아도 오버로딩을 성립한다.

//		[6-13]다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은?
//			long add(int a, int b) { return a+b;}
//			a. long add(int x, int y) { return x+y;}
//			b. long add(long a, long b) { return a+b;}
//			c. int add(byte a, byte b) { return a+b;}
//			d. int add(long a, int b) { return (int)(a+b);}
		//정답은 b , c, d

	//13번 문제는 올바르게 오버로딩이 되는 것을 고르는 것인데, 12번문제에서 언급된 것이므로 생략하겠다.
	
//		[6-14]다음 중 초기화에 대한 설명으로 옳지 않은 것은?
//			a.  멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
//			b.  지역변수는 사용하기 전에 반드시 초기화해야 한다.
//			c.  초기화 블럭보다 생성자가 먼저 수행된다.
//			d.  명시적 초기화를 제일 우선적으로 고려해야 한다.
//			e.  클래스변수보다 인스턴스 변수가 먼저 초기화 된다.
		//정답은 c , e

	//14번은 초기화에 대한 설명인데 c는 초기화블럭이 생성자 보다 먼저 수행되기 때문에 틀린 설명이 되는 것이고
	//e는클래스 변수는 인스턴스 변수가 먼저 초기화 되기 때문에 틀린 설명이 되는 것이다.

//		[6-15]다음중 인스턴스변수의 초기화 순서가 올바른 것은?
//			a. 기본값 - 명시적초기화 - 초기화블럭 - 생성자
//			b. 기본값 - 명시적초기화 - 생성자 - 초기화블럭
//			c. 기본값 - 초기화블럭 - 명시적초기화 - 생성자
//			d. 기본값 - 초기화블럭 - 생성자 - 명시적초기화
		//정답은  a

	//변수의 초기화 순서는 다음과 같다.
	//클래스 변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
	//인스턴스변수의 초기화 시점 : 인스턴스가 생성될 때 마다 각 인스턴스별로 초기화가 이루어진다.
	//클래스변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
	//인스턴스변수의 초기화 순서 :ㅣ 기본값 => 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자

//		[6-16]다음 중 지역변수에 대한 설명으로 옳지 않은 것은?
//			a.  자동 초기화되므로 별도의 초기화가 필요없다.
//			b.  지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
//			c.  매서드의 매개변수로 선언된 변수도 지역변수이다.
//			d.  클래스변수나 인스턴스변수보다 메모리 부담이 적다.
//			e. 	힙(heap) 영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
		//정답은 a , e

	//해설> 지역변수는 자동 초기화 되지 않기 때문에 사용하기 전에 반드시 적절한 값으로 초기화를 해주어야 한다.
 	//지역변수는 자신이 선언된 블럭이나 메서드가 종료되면 소멸되므로 메모리 부담이 적다.
    //힙영역에는 인스턴스가 생성되는 영역이며, 지역변수는 호출스택에 생성이 된다.

//		[6-17]호출스택이 다음과 같은 상황일 때 옳지 않은 설명은?
//				｜println｜
//				｜method1｜
//				｜method2｜
//				｜main	 ｜
//				￣￣￣￣￣￣￣
//			a. 제일 먼저 호출스택에 저장된 것은 main메서드이다 . 
//			b. println 메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다. //대기
//			c. method2 메서드를 호출한 것은 main메서드이다.
//			d. println 메서드가 종료되면 method1메서드가 수행을 재개한다.    
//			e. main-method2-method1-println의 순서로 호출되었다. 
//			f. 현재 실행중인 메서드는 println 뿐이다.
		//정답은  b

	//17번 문제는 호출스택의 제일 위에 있는 메서드가 현대 수행중인 메서드 이며, 호출스택 안의 나머지 메서드들은 대기상태이다.


//		[6-18]다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
//
//	class MemberCall {
//		static int iv = 10;
//		static int cv = 20;
//		int iv2 = cv;
//		static int cv2 = iv; // A 라인				//static 변수에 넣을 때는 static변수여야 한다.
//		
//		static void staticMethod1() {
//			System.out.println(cv);
//			System.out.println(iv); // B 라인		//static 변수여야 한다.		
//	}
//	static void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // C 라인
//	}
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // D 라인				//static 변수여야 한다.
//	}
//	void instanceMethod2() {
//		staticMethod1(); // E 라인
//		instanceMethod1();
//	}
//	}

	//18번 문제는 컴파일할 때 발생되는 에러를 수정하는 것인데 static을 붙인 메서드에 있는 변수들은 static변수여야지 에러가 발생을 안한다.
	//A라인에서 발생하는 에러는 iv가 static이 아니었기 때문에 발생하는 에러이고
	//B라인에서는 마찬가지로 atatic이 아니었기 때문에 발생하는 에러이다.
	

//		[6-19]다음 코드의 실행 결과를 예측하여 적으시오.
//	class Exercise6_19{
//		public static void change(String str){
//			str += "456";
//		}
//		public static void main(String[] args){
//			String str = "ABC123";
//			System.out.println(str);
//			change(str);
//			System.out.println("After change:"+str);
//		}
//	}
	
	//	ABC123
	//	After change:ABC123
	// 가비지 컬렉터에서 메모리를 관리해준다.
	//change 메서드의 매개변수가 참조형인데도 왜? main메서드의 문자열 str에 변경한 내용이 반영되지 않은 것일 까?
	//많은 사람들이 매개변수가 참조형이라는 것만 보고 main메서드의 문자열 str이 변경 될 것이라고 쉽게 생각한다.
	//누구라도 실수하기 쉬운 부분이므로 주의하길 바라는 마음에서 이 문제를 만들었다고 한다.
	//그림과 함께 단계 별로 설명하면 어렵지 않게 이해할 수 있을 것이다.
	//처음에 문자열을 참조변수 str에 저장하면 아래와 같은 그림이 된다.
	//그 다음에 메서드 change를 호출하면서 참조변수 str을 넘겨주면, 메서드 change의 지역변수str에 주소값0x100이 저장된다.
	//이제 메서드 change의 지역변수 str도 문자열 "ABC123"을 참조하게 된다. 이 두 이름은 같지만 분명히 다른 변수 이다.
	//서로 다른 영역에 존재하기 때문에 이름이 같아도 상관없는 것이다.
	//메서드 change에서는 넘겨받은 문자열의 뒤에 456을 붙인다. 문자열은 내용을 변경할 수 없기 때문에 덧셈연산을 하면 새로운 
	//문자열이 생성되고 새로운 문자열의 주소가 변수 str에 저장이 된다.
	//이제 change메서드는 종료되고, 작업에 사용하던 메모리를 반환하므로 change메서드의 지역변수인 str역시 메모리에서 제거된다.
	//다시 main메서드로 돌아와서 문자열 str의 값을 출력하면 처음의 값과 변함없는 값이 출력된다. 문자열"ABC123456"은 참조하는 변수가 
	//하나도 없으므로 적절한 시기에 가비지컬렉터에 의해 제거된다.


//		[6-20]다음과 같이 정의 된 메서드를 작성하고 테스트하시오.
//			[hint] Math.random()을 사용하는 경우 실행경과와 다를 수 있다.
//		
//		메서드명 : shuffle
//		기	능  : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//				처리한 배열을 반환한다.
//		반환타입 : int[]
//		매개변수 : int[] arr - 정수값이 담긴 배열
//	class Exercise6_20{
//		
//		public static int[] shuffle(int[] arr){
//			if(arr ==null || arr.length == 0)
//				return arr;
//			
//			for(int i = 0; i < arr.length; i++){
//				int j = (int)(Math.random()*arr.length;
//				
//				int tmp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = tmp;
//			}
//			return arr;
//			
//		}
//			
//		public static void main(String[] args){
//			int[] original = {1,2,3,4,5,6,7,8,9};
//			System.out.println(java.util.Arrays.toString(original));
//			int[] result = shuffle(original);
//			System.out.println(java.util.Arrays.toString(result));
//		}
//	}

	//20번 해설
	//int배열을 매개변수로 받아서 배열에 저장된 각 요소들의 위치를 여러번 바꿔서 섞은 다음 반환하는 메서드이다.
	//매개변수로 어떤 값이 넘어올지 모르기 때문에 작업을 시작하기 전에 값의 유효성 체크는 반드시 해야 한다. 
	//아래의 코드는 넘겨받은 배열이 null이거나 크기가 0이면 그대로 반환한다.
	//		if(arr == null || arr.length == 0){return arr;}
	//반복문을 이용해서 반복적으로 배열의 임의의 두 요소의 값을 바꾼다.
	//		for(int i = 0; i <  arr.length; i++){int j = (int)(Math.random()*arr.length);
	//			int tmp = arr[i];	arr[i] = arrp[j];	arr[j] = tmp;}
	//Math.random()을 사용하는 방법이나 두 변수의 값을 바꾸는 것에 대한 설명은 이전 문제 등에서 했으므로 생략한다.
//		[6-21]TV 클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과와
//			와 일치하는지 확인하라.
//			[참고]코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
//
//	class MyTv {
//		boolean isPowerOn;
//		int channel;
//		int volume;
//		final int MAX_VOLUME = 100;
//		final int MIN_VOLUME = 0;
//		final int MAX_CHANNEL = 100;
//		final int MIN_CHANNEL = 1;
//		void turnOnOff() {
//			isPowerOn = !isPowerOn;
//			// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
//		}
//		void volumeUp() {
//			if(volume < MAX_VOLUME){
//				volume++;
//			}
//			// (2) volume의 값이 MAX_VOLUME 보다 작을 때만 값을 1 증가시킨다 .  
//		}
//		void volumeDown() {
//			if(volume > MIN_VOLUME){
//				volume--;
//			}
//			// (3) volume MIN_VOLUME 1 . 의 값이 보다 클 때만 값을 감소시킨다
//		}
//		void channelUp() {
//			channel++;
//			if(channel == MAX_CHANNEL){
//				channel = MIN_CHANNEL;
//			}else{
//				channel++;
//			}
//			// (4) channel 1 . 의 값을 증가시킨다
//			// channel MAX_CHANNEL , channel MIN_CHANNEL . 만일 이 이면 의 값을 로 바꾼다
//		}
//		void channelDown() {
//			channel--;
//			if(channel == MIN_CHANNEL){
//				channel = MAX_CHANNEL;
//			}else{
//				channel++;
//			}
//			// (5) channel 1 . 의 값을 감소시킨다
//			// channel MIN_CHANNEL , channel MAX_CHANNEL . 만일 이 이면 의 값을 로 바꾼다
//		}
//	} // class MyTv
//	class Exercise6_21 {
//		public static void main(String args[]) {
//			MyTv t = new MyTv();
//			t.channel = 100;
//			t.volume = 0;
//			System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//			t.channelDown();
//			t.volumeDown();
//			System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//			t.volume = 100;
//			t.channelUp();
//			t.volumeUp();
//			System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//		}
//	}

//		[6-22]다음과 같이 정의된 메서드를 작성하고 테스트 하시오.
//
//		메서드 : IsNumber
//		기	능: 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다.
//				모두 숫자로만 이루어져 있으면 true를 반환하고,
//				그렇지 않으면 false를 반환한다.
//				만일 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
//		반환타입 : boolean
//		매개변수 : String str - 검사할 문자열
//
//		String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위취한 문자를 얻을 수 있다.

//		class Exercise6_22 {
//			
//			public static boolean isNumber(String str){
//					if(str==null || str.equals("")) 
//						return false;
//					
//					for(int i=0; i< str.length();i++) {
//						char ch = str.charAt(i);
//						if(ch < '0' || ch > '9') {
//							return false;
//							}
//						} // for return true;
//					return true;
//			} 
//
//
//				
//			
//			public static void main(String[] args) {
//				String str = "123";
//				System.out.println(str+"는 숫자입니까 ? "+isNumber(str)); 
//				str = "1234o";
//				System.out.println(str+"는 숫자입니까 ? "+isNumber(str)); 
//			}
//		}

	//매개변수로 어떤 값이 넘어올지 모르기 때문에 값의 작업을 시작하기 전에 유효성 체크는 반드시 해야 한다
	//아래의 코드는 넘겨받은 문자열 (str) 이 null이거나 빈 문자열  ("")이면 false 를 반환한다. 
	//반복문과 charAt(int i )을 이용해서 문자열에서 한 문자씩 차례대로 읽어와 char타입의 변수 ch에 저장한다.
	//읽어온 문자가 숫자가 아니면 false를 반환한다.
//		[6-23]다음과 같이 정의된 메서드를 작성하고 테스트 하시오.

//		메서드명 : max
//		기	능 : 주어진 int형 배열의 값ㅇ 중에서 제일 큰 값을 반환한다.
//				만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//		반환타입 : int
//		매개변수 : int[] arr - 최대값을 구할 배열

//		class Exercise6_23{
//			
//			public static int max(int[]arr){
//				if(arr==null || arr.length==0)
//					return -999999;
//				
//				int max = arr[0]; // .
//				for(int i=1; i< arr.length;i++) {
//					if(arr[i] > max) max = arr[i];
//					}
//				return max;
//			}
//			
//			public static void main(String[] args){
//				int[] data = {3,2,9,4,7};
//				System.out.println(java.util.Arrays.toString(data));
//				System.out.println("최대값 :"+max(data)); 
//				System.out.println("최대값 :"+max(null)); 
//				System.out.println(" 최대값:"+max(new int[]{})); 
//			}
//		}

	//매개변수로 넘겨받은 배열 arr이 null이거나 크기가 0이면 -999999을 반환하다.
	//배열의 첫 번째 요소(arr[0])로 최대값을 초기화 한다.
	//최대값을 배열의 첫 번째 값으로 초기화 했으므로 첫번째값은 비교할 필요가 없다.
	//그래서 두번 째 값부터 비교한다. 비교해서 최대값보다 크면 그 값을 변수max에 저장한다.
	//반복문을 다 돌고 나면, max에는 배열의 요소 중 가장 큰 값이 저장되어 있을 것이다. 이 값을 반환한다.

//		[6-24]다음과 같이 정의된 메서드를 작성하고 테스트 하시오.
//		메서드명 : abs
//		기	능 : 주어진 값의 절대값을 반환한다.
//		변환타입 : int
//		매개변수 : int value
//
//	class Exercise6_24{
//	
//		static int abs(int value){
//			final int c = -1;
//			int result = 0;
//			if(value < 0){
//				result = value * c;
//			}else{
//				result = value;
//			}
//			return result;
//		}
//		
//		public static void main(String[] args){
//			int value = 5;
//			System.out.println(value+"의 절대값 :"+abs(value)); 
//			value = -10;
//			System.out.println(value+"의 절대값 :"+abs(value)); 
//		}
//	}
	
	// value의 값이 양수이면 그대로 반환하고, 음수이면 부호를 바꿔서 반환하면 된다.
	//여기서는 final을 붙여서 상수를 사용하여 -1의 값을 저장하였고 
	//조건절을 사용하여 음수이면 -1을 곱해주는 형태로 코드를 짯다.






