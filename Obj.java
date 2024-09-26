class Simple {
    String name = "usha";
    int age = 21;

    public void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

public class OBJ {
    public static void main(String[] args) {
        Simple s1 = new Simple();
        s1.display(s1.name, s1.age); // Corrected order: name (String) first, age (int) second
    }
}

