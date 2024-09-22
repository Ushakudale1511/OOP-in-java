import java.io.*;

class One {
    public void usha() {
        System.out.println("usha");
    }
}

class Two extends One {
    public void Ramchandra() {
        System.out.println("Ramchandra");
    }
}

class Three extends Two {
    public void kudale() {
        System.out.println("kudale");
    }
}

 class Main {
    public static void main(String[] args) {
        // Create an object of class Three
        Three u = new Three();
        
        // Call methods from class One, Two, and Three
        u.usha();        // Method from class One
        u.Ramchandra();  // Method from class Two
        u.kudale();      // Method from class Three
    }
}
