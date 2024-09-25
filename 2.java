class Penn {
    String color; // Attribute to store pen color
    String type;  // Attribute to store pen type

    // Method to display a message
    public void display() {
        System.out.println("something writing");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    // Method to print student information
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class hlo {
    public static void main(String[] args) {
        // Creating and using a Student object
        Student s1 = new Student();
        s1.name = "Nilesh";
        s1.age = 24;
        s1.printInfo(); // This will print the student's name and age

       
    }
}
