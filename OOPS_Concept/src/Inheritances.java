class Animal{
	String name_animal;
	
	public void display() {
		name_animal="DOG";
		System.out.println("voice of animal :"+name_animal);
	}
	
}

class Dog extends Animal{
	public void voice() {
		System.out.println("boww bowww");
	}
}

/*class Cat extends Dog{
	public void  voice() {
		System.out.println("meww meww");
	}
}*/
class Cat extends Animal{
	public void  voice() {
		System.out.println("meww meww");
	}
}


public class Inheritances {
public static void main(String args[]) {
	/*Dog g=new Dog();
	g.display();
	g.voice();*/
	Cat c=new Cat();
	c.display();
	c.voice();
}
}
