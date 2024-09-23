class A { 
    int a;
    String name;

    // Constructor to initialize instance variables
    A() {
        a = 0;  // Initializing instance variable 'a'
        name = null;  // Initializing instance variable 'name'
    }

    // Method to display values of instance variables
    void show() {
        System.out.print(a + " " + name);
    }
}

public class Main {  // 'Main' class is public and matches the filename
    public static void main(String[] args) {
        A ref = new A();  // Creating an object of class A
        ref.show();  // Calling the 'show' method to display values
    }
}
