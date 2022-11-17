class Animal {
    String color = "black";
}

class Dog extends Animal {
    String color = "white";

    public void display() {
        System.out.println("color of Dog : " + color);
        System.out.println(super.color);
    }
}

public class Demo {
    public static void main(String[] args) {
        Dog g = new Dog();
        g.display();
    }
}
