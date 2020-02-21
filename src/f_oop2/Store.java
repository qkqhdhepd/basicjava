package f_oop2;

public class Store {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();		//손님을 만듬
		Product p = new Desktop();			//Desktop객체를 Product타입으로 생성함 (형변환이 생략되어있음)-원래 객체를 생성할 때는 타입이 같아야 함
		
		p.info();							//info()메서드를 객체를 통해서 호출함
		c.buy(p);							//buy()메서드를 객체를 통해서 호출함
		
		p = new TV();						//TV객체를 Product타입으로 생성함
		p.info();							//info()메서드를 객체를 통해서 호출함
		c.buy(p);							//buy()메서드를 객체를 통해서 호출함
		
		
		p = new SmartPhone();				//SmartPhone객체를 Product타입으로 생성함
		p.info();							//info()메서드를 객체를 통해서 호출함
		c.buy(p);							//buy()메서드를 객체를 통해서 호출함
		
		c.showItem();						//showItem()메서드를 객체를 통해서 호출함
	}
}
 

//부모클래스를 생성함과 동시에 전역변수를 선언함 
class Product{
	String name;
	int price;
	
	Product(String name, int price){					//전역변수에 파라미터가 String이고 int인 생성자를 만들어서 값을 넣어줌
		this.name = name;
		this.price = price;
	}
	
	void info(){										//부모클래스에 메서드를 만들어서 정보를 출력하기 위해 사용됨
		System.out.println("------------------------");
		System.out.println("상품명: "+name);
		System.out.println("금  액 : "+price + "원");
		System.out.println("------------------------");		
	}
}



//부모로 부터 상속받은 클래스들.....-------------------------------------
class Desktop extends Product{

	Desktop() {
		super("삼성 컴퓨터", 5000000);		//부모클래스의 생성자 호출
	}	
}

class TV extends Product{
	TV(){
		super("LG TV", 100000000);		//부모클래스의 생성자 호출
	}
}

class SmartPhone extends Product{
	SmartPhone(){
		super("갤럭시 폴드", 2300000);	//부모클래스의 생성자 호출
	}
}
//----------------------------------------------------------------



//손님이라는 클래스를 만들고 손님이 가지고 있어야할 기본적인 변수들을 선언하고 메서드를 (사기,아이템보기)를 생성했음
class Customer{
	
	int money = 999999999;
	Product[] item = new Product[10];	//장바구니
	
	
	//물건을 사기 위한 메서드
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족합니다.");
			return;										//그냥 메서드를 종료시키겠다는 뜻
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){						//for문을 돌리는데 배열의 길이까지 돌고
			if(item[i] == null){									//i의 인덱스가 비어있을 때 if문을 돈다
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했습니다.");
	}
	
	
	//장바구니를 보기 위한 메서드
	void showItem(){
		System.out.println("----------------------장바구니");				//장바구니를 보기위해 만든 메서드에서
		for(int i = 0; i < item.length; i++){							//for문을 돌리는데 범위가 만들어진 배열의 길이로
			if(item[i] != null){										//배열의 길이만큼 for문을 돌게되는데 조건절에서 i번째 인덱스가 
				System.out.println(i + 1 + "." + item[i].name);			//비어있지 않을 때 조건이 있을 때 if실행
			}
		}
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("남은 금액은 : "+money+"원");
		System.out.println("남은 돈으로 과자를 사서 드세요~");
		
	}
	
}








