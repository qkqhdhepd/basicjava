package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * <<논리 연산자>>
		 * - &&(AND)	:피연산자 둘다 true이면 true를 결과로 얻는다.
		 * - ||(OR)		:피연산자 중 하나라도 true이면 true를 결과로 얻는다.
		 * - !(NOT)		:피연산자가 true이면 false를 false이면 true를 결과로 얻는다.
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		
		int a = 6;
		//a가 0보다 크다.
		boolean b1 = 0 < a;
		//a가 10보다 작거나 같다.
		boolean b2 = a <= 10;
		
		//a가 0보다 크고 10보다 작거나 같다.
		boolean b = b1 && b2;
		b = 0 < a && a <= 10;
		
		//a가 2의 배수이거나 3의 배수인가?
		b = a % 2 == 0 || a % 3 == 0;
		System.out.println(b);
		
		//a가 2의 배수이거나 3의 배수이고 10이하인가?
		b =( a % 2 == 0 || a % 3 == 0 )&& a <= 10; //&&가 ||보다 먼저 수행되기 때문에 문제의 의도와 다르게 되므로 ()를 해준다.
		System.out.println(b);
		
		char c = 'l';
		//c는 숫자인가?
		b = '0' <= c && c <= '9';
		System.out.println(b);
		//c는 영문소문자인가?
		b = 'a' <= c && c <= 'z';
		System.out.println(b);
		
		//논리 연산자는 효율적인 연산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
	    b = true && true;
	    b = true && false;
	    b = false && true;
	    b = false && false;
	    
	    b = true || true;
	    b = true || false;
	    b = false || true;
	    b = false || false;
	    
	    int d = 10;
	    b = d < 10 && 0 < d++;
	    System.out.println(d); // 왼쪽이 false이기 때문에 오른쪽으로 수행을 하지 않는다. 그러므로 d++코드가 적용이 되지않아서 결과값이 10으로 나온다.
	    
	    
	    b = !b;
	    b = !(10 < 20);
	    
	    
	    int x = 1, y = 2;
	    b = x + 3 * y > y - 2 || x < 3 && y >= 5;  //산술 비교 논리 모두 있을 때 산술먼저 되고 비교 되고 논리가 된다.(우선순위 산술>비교>논리)
	    
	    //다음의 문장들을 코드로 작성해주세요.
	    //x가 0보다 크거나 같고 10보다 작다.
	    b = x >=0 && x <10;
	    //x가 2의 배수이거나 3의 배수이고 20이하이다.
	    b =( x % 2 == 0 || x % 3 == 0 ) && x <= 20;
	}

}
