public class Ejercicio17 {
  public static void main(String[] args) {
  int x;
  int aux;
  
  System.out.print("Introduce un número: ");
  x = Integer.parseInt (System.console().readLine());
  
  aux = x/10;
  x = x - aux*10;
  
  System.out.print("El último número introducido fue: "+x);
  
  }
}
