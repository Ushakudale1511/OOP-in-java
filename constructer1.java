class A {
    int a;
    String name;
    boolean status = true;  // Correct boolean declaration

    // Constructor to initialize instance variables
    A() {
        a = 0;              // Correct initialization of 'a'
        name = "usha";       // Correct string initialization with double quotes
    }

    // Method to display values of instance variables
    void disp() {
        System.out.print(a + " " + name + " " + status);
    }
}

public class Main {  // Class name should be capitalized
    public static void main(String[] args) {
        A r = new A();  // Creating an object of class A
        r.disp();       // Calling the 'disp' method to display values
    }
}
