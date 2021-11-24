public class Ejercicio18 {
  public static void main(String[] args) {
  int[] num = new int[10];
  
  for (int i=0; i<10; i++) {
    System.out.printf("%3s ",i);
  }
  
  System.out.println();
  
  for (int i=0; i<10; i++) {
    num[i] = (int)(Math.random()*201);
    System.out.printf("%3s ",num[i]);
  }
  
  System.out.println("\nNueva tabla:");
  
  
  
  }
}
