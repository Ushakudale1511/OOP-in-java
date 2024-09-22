class Animal{
    void eat(){
      System.out.println("Animal can eat");
    }
  }
  class dog extends Animal{
    void bark(){
      System.out.println(" dog is barking");
    }
  }
  class cat extends Animal{
    void meow(){
      System.out.println(" cat is meow");
    }
  }
  class main{
    public static void main (String args[]){
      dog d= new dog();
      d.eat();
      d.bark();
    
    cat c= new cat();
    c.eat();
  c.meow();
  }
}