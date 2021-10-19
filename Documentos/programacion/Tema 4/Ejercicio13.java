public class Ejercicio13 {
  public static void main(String[] args) {
  int a,b,c;
  int aux;
  
  System.out.println("Introduce tres numeros para ordenarlos: ");
  System.out.print("a: ");
  a = Integer.parseInt (System.console().readLine());
  System.out.print("b: ");
  b = Integer.parseInt (System.console().readLine());
  System.out.print("c: ");
  c = Integer.parseInt (System.console().readLine());
  
  if (a>c) {
    aux = a;
    a = c;
    c = aux;
  }
  if (a>b) {
    aux = a;
    a = b;
    b = aux;
  }
  if (b>c) {
    aux = b;
    b = c;
    c = aux;
  }
  System.out.print("El orden es: "+a +" < " +b +" < " +c);
  
  }
}
