public class Ejercicio11 {
  public static void main(String[] args) {
  int x;
  
  System.out.print("Introduce un número: ");
  x = Integer.parseInt(System.console().readLine());
  
  for (int i=x; i<x+5; i++) {
    System.out.printf("%-10s%-10s%-10s\n",i,i*i,i*i*i);
  }
  
  }
}
