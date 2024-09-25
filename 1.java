class pen {
    String color; // Attribute to store pen color
    String type;  // Attribute to store pen type

    // Method to display a message
    public void display() {
        System.out.println("something writing");
    }
}

public class oops {
    public static void main(String[] args) {
        // Creating an object of the pen class
        pen pen1 = new pen();
        
        // Setting object properties
        pen1.color = "blue";
        pen1.type = "gel";

        // Calling the display method
        pen1.display();
    }
}
