import java.io.*;
 class animal {
    public void eat(){
        System.out.println(" animal is eating");
    }
}
 class dog extends animal{
    public void bark(){
        System.out.println("dog is barking");
    } 
 }
 class main{
    public static void main(String[] args) {
        dog d =new dog();
        d.eat();
        d.bark();
    }
 }
