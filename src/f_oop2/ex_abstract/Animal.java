package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려간다~~~");
	}
	
	abstract void bark();
	
	
}

class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("월울울얼어얼우르~~");
		
	}
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("미야옹~~");
	}
}

class pigeon extends Animal{

	@Override
	void bark() {
		System.out.println("구구~~꾸꾸~");	
	}	
}

class pikachu extends Animal{

	@Override
	void bark() {
		System.out.println("삐까삐까~~츄우우우우우~");
	}
	
}