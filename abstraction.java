package bank;

abstract class animal{
    abstract void walk();
}
class dog extends animal{
    public void walk(){
        System.out.println("Dog is walking in 4 legs");

    }
}
class Chiken extends animal{
    public void walk(){
        System.out.println("chicken is walking in 4 legs");

    }
}
public class abstraction {
    public static void main(String[] args) {
        dog dog =new dog();
        dog.walk();
        Chiken Chiken=new Chiken();
        Chiken.walk();
        
    }
}
