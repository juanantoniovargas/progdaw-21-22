public class Ejercicio6 {
  public static void main(String[] args) {
  int[] num = new int[15];
  
  System.out.println("Introduce 15 números:");
  
  for (int i=0; i<15; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
  }
  
  int aux = num[14];
  
  for (int i=14; i>=1; i--) {
    num[i]=num[i-1];
  }
  
  num[0] = aux;
  
  for (int i=0; i<15; i++) {
    System.out.print(num[i] + " ");
  }
  
  }
}
