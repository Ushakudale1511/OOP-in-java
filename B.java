interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Sparrow implements Animal, Bird {
    
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class B {  // Public class with correct naming
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();
        s.fly();
    }
}
