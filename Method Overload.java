class Poly {
    String name = "Usha";
    int age = 23;

    public void printInfo(String name) {
        System.out.println("Name: " + name); // Added space after "Name:"
    }

    public void printInfo(int age) {
        System.out.println("Age: " + age); // Added space after "Age:"
    }

    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age); // Added space and comma for clarity
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Poly s1 = new Poly();
        s1.printInfo(s1.name, s1.age); // Calling the method with two parameters
    }
}
