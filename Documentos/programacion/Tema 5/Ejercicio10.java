public class Ejercicio10 {
  public static void main(String[] args) {
  int x;
  float y=0, z=0;
  
  System.out.print("¿Cuántos números vas a introducir? ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce los numeros: ");
  
  for (int i=1; i<=x; i++) {
    y = Float.parseFloat(System.console().readLine());
    z = z + y;
  }
  
  System.out.println("La media es: "+z/x);
  
  }
}
