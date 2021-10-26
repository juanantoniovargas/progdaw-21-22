public class Ejercicio12 {
  public static void main(String[] args) {
  int x, y=0, z=1;
  
  System.out.print("Introduce cuantos números de la serie de Fibonacci quieres ver: ");
  x = Integer.parseInt(System.console().readLine());
  
  for (int i=0; i<=x; i++) {
    System.out.print(y + " ");
    y = y + z;
    z = y - z;
  }
  
  }
}
