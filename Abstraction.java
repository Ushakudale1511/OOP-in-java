package bank;

// Abstract class Animal
abstract class Animal {
    abstract void walk();
}

// Dog class extends Animal
class Dog extends Animal {
    public void walk() {
        System.out.println("Dog is walking on 4 legs");
    }
}

// Chicken class extends Animal
class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken is walking on 2 legs");
    }
}

// Main class to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk(); // Dog walks on 4 legs

        Chicken chicken = new Chicken();
        chicken.walk(); // Chicken walks on 2 legs
    }
}
