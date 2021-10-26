public class Ejercicio15 {
  public static void main(String[] args) {
  double base, exponente, resultado;
  
  System.out.print("Introduzca la base: ");
  base = Double.parseDouble(System.console().readLine());
  
  System.out.print("Introduzca el exponente: ");
  exponente = Double.parseDouble(System.console().readLine());
  
  resultado = 1;
  
  for (int i=1; i<=exponente; i++) {
    resultado = 1;
    for (int j=0; j<i; j++) {
      resultado = resultado * base;
    }
    System.out.println(base + "^" + i + " = " + resultado);
    base = base + 1;
    
  }
  
  }
}
