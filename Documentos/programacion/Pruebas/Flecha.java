/*
 *                                *
 *     *                   *********
 * ******         *        **********
 * *******    ******       ***********
 * ******         *        **********
 *     *                   *********
 *                                *
 */

public class Flecha {
  public static void main(String[] args) {
  int ancho, alto, relleno;
  
  System.out.print("Introduce el ancho de la flecha: ");
  ancho = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el alto de la flecha: ");
  alto = Integer.parseInt(System.console().readLine());
  
  while ((alto%2==0) || (alto<3)) {
      System.out.println("Numero incorrecto, ha de introducir una altura impar y mayor que 3.");
      System.out.print("Introduce el alto de la flecha: ");
      alto = Integer.parseInt(System.console().readLine());
    }
  
  relleno=ancho-(alto/2+1);
  
  for (int i=0; i<alto; i++) {
    for (int j=0; j<relleno; j++) {
      if ((i==0) || (i==alto-1)) {
        System.out.print(" ");
      } else {
        System.out.print("*");
      }
    }
    System.out.print("*");
    if (i<alto/2) {
      relleno++;
    } else {
      relleno--;
    }
    System.out.println();
  }
  
  }
}
