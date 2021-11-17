public class Ejercicio13 {
  public static void main(String[] args) {
  int num1, num2;
  
  System.out.println("Tirada de 2 dados (el programa termina con dos tiradas iguales):");
  
  do {
    num1 = (int)(Math.random()*6)+1;
    num2 = (int)(Math.random()*6)+1;
    System.out.println(num1 + " " + num2);
  } while (num1!=num2);
  
  }
}
