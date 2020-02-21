package z_exam;

public class Test_7_ex {

}

class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("상품이름 :" + name);
		System.out.println("상품가격 :" + price);
	}
}

class Desktop extends Product{
	Desktop(){
		super("삼성컴퓨터", 500);
	}
}

class TV extends Product{
	TV(){
		super("LG TV", 200);
	}
}

class Customer{
	int money = 100000;
	Product[] baguni = new Product[10];
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족합니다.");				
			return;
		}
		money -= p.price;
		
		for(int i = 0; i < baguni.length; i++){
			if(baguni[i] == null){
				baguni[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했습니다.");
	}
	
	
	void showItem(){
		for(int i = 0; i < baguni.length; i++){
			if(baguni[i] != null){
				System.out.println(baguni[i].name);
			}
		}
	}
	
	
}

class Store{
	public static void main(String[] args){
		Customer c = new Customer();
		Product p = new Desktop();

		p.info();							
		c.buy(p);
		
		p = new TV();						
		p.info();							
		c.buy(p);
		
		c.showItem();
	}
}
