public class Ejercicio54 {
  public static void main(String[] args) {
  int altura, espacios;
  
  System.out.print("Introduce la altura del triangulo: ");
  altura = Integer.parseInt(System.console().readLine());
  espacios = altura;
  
  for (int i=0; i<altura; i++) {
    System.out.print("*");
  }
  System.out.println();
  for (int i=0; i<altura-1; i++) {
    System.out.print("*");
    
    for (int j=0; j<espacios-3; j++){
      System.out.print(" ");
    }
    espacios--;
    if (espacios>1) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  }
}
