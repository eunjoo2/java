package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려~달려~~");
	}
	
	abstract void bark();
	
}

class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍--");
	}
	
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("야!옹!");
	}
}
class Tiger extends Animal{

	@Override
	void bark() {
		System.out.println("어흥--");
	}
	
}