public class Ejercicio3 {
  public static void main(String[] args) {
  int[] num;
  num = new int[10];
  
  System.out.println("Introduce 10 enteros:");
  
  for (int i=0; i<10; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
  }
  
  System.out.println("Números introducidos al revés:");
  
  for (int i=9; i>=0; i--) {
    System.out.print(num[i]+" ");
  }
  
  }
}
