class Penn{
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

class hlo {
    public static void main(String[] args) {
        // Creating an object of the Pen class
        Penn Penn1 = new Penn();
        
        // Setting object properties for pen1
        Penn1.color = "blue";
        Penn1.type = "gel";
        
        Penn Penn2 = new Penn();
        // Setting object properties for pen2
        Penn2.color = "yellow"; 

        // Calling methods to print the colors
        Penn1.printColor(); // This will print "blue"
        Penn2.printColor(); // This will print "yellow"
    }
}
