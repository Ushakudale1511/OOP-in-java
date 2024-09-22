import java.io.*;

class Inheritance {
    int gear;
    int speed;

    // Constructor for the Inheritance class
    public Inheritance(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Method to apply brakes
    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    // Method to speed up
    public void speedUp(int increment) {
        speed += increment;
    }

    // toString method to display the details
    public String toString() {
        return "No of gears: " + gear + "\nSpeed: " + speed;
    }
}

// Subclass MountainBike that inherits from Inheritance
class MountainBike extends Inheritance {
    // Additional field specific to MountainBike
    public int seatHeight;

    // Constructor for MountainBike
    public MountainBike(int gear, int speed, int seatHeight) {
        // Calling the parent class constructor
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    // Method to set seat height
    public void setSeatHeight(int newHeight) {
        seatHeight = newHeight;
    }

    // Overriding the toString method to include seat height
    @Override
    public String toString() {
        return super.toString() + "\nSeat Height: " + seatHeight;
    }
}

// Main class to test the functionality
 class test {
    public static void main(String[] args) {
        // Creating an instance of MountainBike
        MountainBike bike = new MountainBike(5, 100, 25);

        // Displaying the initial state
        System.out.println(bike.toString());

        // Applying brakes and speeding up
        bike.applyBreak(10);
        bike.speedUp(20);

        // Displaying the updated state
        System.out.println("\nAfter applying brakes and speeding up:");
        System.out.println(bike.toString());
    }
}
