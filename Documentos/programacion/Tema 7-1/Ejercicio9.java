public class Ejercicio9 {
  public static void main(String[] args) {
  int[] num = new int[8];
  
  System.out.println("Introduce 8 enteros:");
  
  for (int i=0; i<8; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
  }
  
  System.out.println("Mosttrando pares e impares:");
  
  for (int i=0; i<8; i++) {
    if (num[i]%2==0) {
      System.out.println(num[i] + " par");
    } else {
      System.out.println(num[i] + " impar");
    }
  }
  
  }
}
