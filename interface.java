package bank;

interface animall{
 public void walk();
}
 class horse implements animall {
    public void walk(){
        System.out.println("horse is walking: ");
    }
    
}
class interfacee{
    public static void main(String[] args) {
        horse h =new horse();
        h.walk();
    }
}
