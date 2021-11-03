public class Ejercicio40 {
  public static void main(String[] args) {
  int altura, espacios, espacios2=1;
  
  System.out.print("Introduce la altura del rombo: ");
  altura = Integer.parseInt(System.console().readLine());
  
  if ((altura<3) || (altura%2==0)) {
    System.out.print("Número incorrecto, ha de ser impar y mayor que 3.");
  }
  
  espacios = altura/2;
  altura = altura/2+1;
  
  for (int i=0; i<altura; i++) {
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    System.out.print("*");
    for (int j=0; j<espacios2-2; j++) {
      System.out.print(" ");
    }
    if (espacios2>1) {
      System.out.print("*");
    }
    System.out.println();
    espacios--;
    espacios2 = espacios2+2;
  }
  altura--;
  espacios = espacios+2;
  espacios2 = espacios2-4;
  for (int i=0; i<altura; i++) {
    for (int j=0; j<espacios; j++) {
      System.out.print(" ");
    }
    System.out.print("*");
    for (int j=0; j<espacios2-2; j++) {
      System.out.print(" ");
    }
    if (espacios2>1) {
      System.out.print("*");
    }
    System.out.println();
    espacios++;
    espacios2 = espacios2-2;
  }
  
  }
}
