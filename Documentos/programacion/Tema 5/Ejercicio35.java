public class Ejercicio35 {
  public static void main(String[] args) {
  int altura, espacios, espacios2;
  
  System.out.print("Introduce la altura de la X: ");
  altura = Integer.parseInt(System.console().readLine());
  espacios = altura - 2;
  espacios2 = 1;
  
  if ((altura%2 == 0) || (altura<3)) {
    System.out.print("Altura inválida, ha de ser impar y mayor que 3.");
  } else {
    altura = altura/2;
    for (int i=0; i<altura; i++) {
      System.out.print("*");
      for (int j=0; j<espacios; j++) {
        System.out.print(" ");
      }
      espacios = espacios - 3;
      System.out.print("*");
      System.out.println();
      for (int k=0; k<espacios2; k++) {
        System.out.print(" ");
      }
      espacios++;
      espacios2++;
    }
  }
    System.out.print("*");
    System.out.println();
    espacios = espacios + 2;
    espacios2 = espacios2 - 2;
  for (int m=0; m<altura; m++) {
    for (int l=0; l<espacios2; l++) {
      System.out.print(" ");
    }
    System.out.print("*");
    espacios2--;
    for (int n=0; n<espacios; n++){
    System.out.print(" ");
    }
    espacios = espacios + 2;
    System.out.print("*");
    System.out.println();
  }
    
  }
}
