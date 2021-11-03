public class Ejercicio39 {
  public static void main(String[] args) {
  int num, resultado=1;
  
  System.out.print("Introduce un entero positivo: ");
  num = Integer.parseInt(System.console().readLine());
  
  for (int i=1; i<=num; i++) {
    resultado=resultado*i;
    System.out.println(i+"! = "+resultado);
  }
  
  }
}
