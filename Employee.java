import java.io.*;
class emplyee{
  int salery=30000;
}
class engineer extends emplyee{
  int benefits = 48000;
}
class clg{
  public static void main (String[]args){
    engineer e= new engineer();
    System.out.println("salery:"+ e.salery
                       + "Benifits:"+e.benefits);
  }
}